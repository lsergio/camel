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
package org.apache.camel.component.platform.http.main;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.test.AvailablePortFinder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ManagementHttpServerTest {

    private CamelContext camelContext;

    private final int port = AvailablePortFinder.getNextAvailable();

    @Test
    public void statusIsNotSatisfied() throws IOException, InterruptedException {
        ManagementHttpServer server = new ManagementHttpServer();

        camelContext = new DefaultCamelContext();
        server.setCamelContext(camelContext);

        camelContext.getRegistry().bind("fake", new MainHttpFakeHealthCheck());

        server.setHost("0.0.0.0");
        server.setPort(port);
        server.setPath("/");

        server.setHealthCheckEnabled(true);
        server.setHealthPath("/q/health");
        server.start();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:" + port + "/q/health/ready"))
                .build();

        HttpResponse<String> response = HttpClient.newBuilder().build().send(request, HttpResponse.BodyHandlers.ofString());

        assertEquals(503, response.statusCode());

    }

}
