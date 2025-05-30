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
package org.apache.camel.support.scan;

import org.apache.camel.spi.PackageScanFilter;

/**
 * Package scan filter for inverting the match result of a subfilter. If the subfilter would match and return
 * <tt>true</tt> this filter will invert that match and return <tt>false</tt>.
 */
public class InvertingPackageScanFilter implements PackageScanFilter {

    private final PackageScanFilter filter;

    public InvertingPackageScanFilter(PackageScanFilter filter) {
        this.filter = filter;
    }

    @Override
    public boolean matches(Class<?> type) {
        return !filter.matches(type);
    }

    @Override
    public String toString() {
        return "![" + filter.toString() + "]";
    }

}
