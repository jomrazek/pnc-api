/**
 * Copyright (C) 2015 Red Hat, Inc. (jbrazdil@redhat.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.pnc.api.causeway.dto.push;

import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import lombok.Data;
import lombok.NonNull;

/**
 *
 * @author Honza Brázdil &lt;janinko.g@gmail.com&gt;
 */
@Data
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@buildType")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonSubTypes({ @JsonSubTypes.Type(MavenBuild.class), @JsonSubTypes.Type(NpmBuild.class) })
public abstract class Build {

    @NonNull
    private final String buildName;
    private final String buildVersion;
    @NonNull
    private final String externalBuildSystem;
    private final String externalBuildID;
    @NonNull
    private final String externalBuildURL;
    @NonNull
    private final Date startTime;
    @NonNull
    private final Date endTime;
    @NonNull
    private final String scmURL;
    @NonNull
    private final String scmRevision;
    private final String scmTag;
    @NonNull
    private final BuildRoot buildRoot;
    @NonNull
    private final Set<Logfile> logs;
    @NonNull
    private final String sourcesURL;
    @NonNull
    private final Set<Dependency> dependencies;
    @NonNull
    private final Set<BuiltArtifact> builtArtifacts;
    @NonNull
    private final String tagPrefix;

}
