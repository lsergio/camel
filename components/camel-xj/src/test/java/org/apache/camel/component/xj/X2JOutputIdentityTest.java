/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.camel.component.xj;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.junit.jupiter.api.Test;

public class X2JOutputIdentityTest extends CamelTestSupport {

    @Test
    public void testOutput() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedBodiesReceived("{\"#text\":\"world!\"}");
        mock.message(0).body().isInstanceOf(String.class);

        template.sendBody("direct:start", "<hello>world!</hello>");

        MockEndpoint.assertIsSatisfied(context);
    }

    @Test
    public void testOutputSourceHeader() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:sourceHeader");
        mock.expectedBodiesReceived("{\"#text\":\"world!\"}");
        mock.message(0).body().isInstanceOf(String.class);

        template.send("direct:sourceHeader", exchange -> {
            exchange.getIn().setHeader("xmlSource", "<hello>world!</hello>");
        });

        MockEndpoint.assertIsSatisfied(context);
    }

    @Test
    public void testOutputSourceVariable() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:sourceVariable");
        mock.expectedBodiesReceived("{\"#text\":\"world!\"}");
        mock.message(0).body().isInstanceOf(String.class);

        template.send("direct:sourceVariable", exchange -> {
            exchange.setVariable("xmlSource", "<hello>world!</hello>");
        });

        MockEndpoint.assertIsSatisfied(context);
    }

    @Test
    public void testOutputSourceProperty() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:sourceProperty");
        mock.expectedBodiesReceived("{\"#text\":\"world!\"}");
        mock.message(0).body().isInstanceOf(String.class);

        template.send("direct:sourceProperty", exchange -> {
            exchange.setProperty("xmlSource", "<hello>world!</hello>");
        });

        MockEndpoint.assertIsSatisfied(context);
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                from("direct:start")
                        .to("xj:identity?transformDirection=XML2JSON")
                        .to("mock:result");

                from("direct:sourceHeader")
                        .to("xj:identity?source=header:xmlSource&transformDirection=XML2JSON")
                        .to("mock:sourceHeader");

                from("direct:sourceVariable")
                        .to("xj:identity?source=variable:xmlSource&transformDirection=XML2JSON")
                        .to("mock:sourceVariable");

                from("direct:sourceProperty")
                        .to("xj:identity?source=property:xmlSource&transformDirection=XML2JSON")
                        .to("mock:sourceProperty");
            }
        };
    }
}
