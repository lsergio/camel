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

package org.apache.camel.test.infra.cli.common;

public final class CliProperties {

    public static final String DOCKERFILE = "cli.service.docker.file";

    public static final String REPO = "cli.service.repo";

    public static final String BRANCH = "cli.service.branch";

    public static final String VERSION = "cli.service.version";

    public static final String DATA_FOLDER = "cli.service.data.folder";

    public static final String SSH_PASSWORD = "cli.service.ssh.password";

    public static final String FORCE_RUN_VERSION = "cli.service.execute.version";

    public static final String MVN_REPOS = "cli.service.mvn.repos";

    public static final String MVN_LOCAL_REPO = "cli.service.mvn.local";

    public static final String EXTRA_HOSTS = "cli.service.extra.hosts";

    public static final String TRUSTED_CERT_PATHS = "cli.service.trusted.paths";

    private CliProperties() {
    }
}
