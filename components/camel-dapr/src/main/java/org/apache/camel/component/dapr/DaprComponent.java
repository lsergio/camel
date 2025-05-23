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
package org.apache.camel.component.dapr;

import java.util.Map;

import org.apache.camel.Endpoint;
import org.apache.camel.spi.Metadata;
import org.apache.camel.spi.annotations.Component;
import org.apache.camel.support.DefaultComponent;

@Component("dapr")
public class DaprComponent extends DefaultComponent {

    @Metadata
    private DaprConfiguration configuration = new DaprConfiguration();

    protected Endpoint createEndpoint(String uri, String remaining, Map<String, Object> parameters) throws Exception {
        if (remaining == null || remaining.isBlank()) {
            throw new IllegalArgumentException("Operation name must be specified.");
        }

        final DaprConfiguration config = this.configuration != null ? this.configuration.copy() : new DaprConfiguration();
        config.setOperation(DaprOperation.valueOf(remaining));

        Endpoint endpoint = new DaprEndpoint(uri, this, config);
        setProperties(endpoint, parameters);

        return endpoint;
    }

    /**
     * The component configurations
     */
    public DaprConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(DaprConfiguration configuration) {
        this.configuration = configuration;
    }
}
