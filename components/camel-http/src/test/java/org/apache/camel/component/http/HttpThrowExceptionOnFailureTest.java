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
package org.apache.camel.component.http;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.component.http.handler.BasicValidationHandler;
import org.apache.camel.http.base.HttpOperationFailedException;
import org.apache.hc.core5.http.HttpStatus;
import org.apache.hc.core5.http.impl.bootstrap.HttpServer;
import org.apache.hc.core5.http.impl.bootstrap.ServerBootstrap;
import org.junit.jupiter.api.Test;

import static org.apache.camel.component.http.HttpMethods.GET;
import static org.apache.camel.test.junit5.TestSupport.assertIsInstanceOf;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class HttpThrowExceptionOnFailureTest extends BaseHttpTest {

    private HttpServer localServer;

    private String baseUrl;

    @Override
    public void setupResources() throws Exception {
        localServer = ServerBootstrap.bootstrap()
                .setCanonicalHostName("localhost").setHttpProcessor(getBasicHttpProcessor())
                .setConnectionReuseStrategy(getConnectionReuseStrategy()).setResponseFactory(getHttpResponseFactory())
                .setSslContext(getSSLContext())
                .register("/", new BasicValidationHandler(GET.name(), null, null, getExpectedContent())).create();
        localServer.start();

        baseUrl = "http://localhost:" + localServer.getLocalPort();
    }

    @Override
    public void cleanupResources() {
        if (localServer != null) {
            localServer.stop();
        }
    }

    @Test
    public void httpGetWhichReturnsHttp501() {
        Exchange exchange = template.request(baseUrl + "/XXX?throwExceptionOnFailure=false", exchange1 -> {
        });

        assertNotNull(exchange);

        Message out = exchange.getMessage();
        assertNotNull(out);

        Map<String, Object> headers = out.getHeaders();
        assertEquals(HttpStatus.SC_NOT_IMPLEMENTED, headers.get(Exchange.HTTP_RESPONSE_CODE));
        assertEquals("0", headers.get("Content-Length"));
    }

    @Test
    public void httpGetWhichReturnsHttp501ShouldThrowAnException() {
        Exchange reply = template.request(baseUrl + "/XXX?throwExceptionOnFailure=true", exchange -> {
        });

        Exception e = reply.getException();
        assertNotNull(e, "Should have thrown an exception");
        HttpOperationFailedException cause = assertIsInstanceOf(HttpOperationFailedException.class, e);
        assertEquals(501, cause.getStatusCode());

        Message out = reply.getMessage();
        assertNotNull(out);
        Map<String, Object> headers = out.getHeaders();
        assertEquals(HttpStatus.SC_NOT_IMPLEMENTED, headers.get(Exchange.HTTP_RESPONSE_CODE));
        assertEquals("Not Implemented", headers.get(Exchange.HTTP_RESPONSE_TEXT));
    }

    @Test
    public void httpGetWhichReturnsHttp501WithIgnoreResponseBody() {
        Exchange exchange
                = template.request(baseUrl + "/XXX?throwExceptionOnFailure=false&ignoreResponseBody=true", exchange1 -> {
                });

        assertNotNull(exchange);

        Message out = exchange.getMessage();
        assertNotNull(out);
        assertNull(out.getBody());

        Map<String, Object> headers = out.getHeaders();
        assertEquals(HttpStatus.SC_NOT_IMPLEMENTED, headers.get(Exchange.HTTP_RESPONSE_CODE));
        assertEquals("0", headers.get("Content-Length"));
    }

    @Test
    public void httpGetWhichReturnsHttp501ShouldThrowAnExceptionWithIgnoreResponseBody() {
        Exchange reply = template.request(baseUrl + "/XXX?throwExceptionOnFailure=true&ignoreResponseBody=true", exchange -> {
        });

        Exception e = reply.getException();
        assertNotNull(e, "Should have thrown an exception");
        HttpOperationFailedException cause = assertIsInstanceOf(HttpOperationFailedException.class, e);
        assertEquals(501, cause.getStatusCode());
    }

}
