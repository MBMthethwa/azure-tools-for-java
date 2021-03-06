/**
 * Copyright (c) Microsoft Corporation
 *
 * All rights reserved.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and
 * to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of
 * the Software.
 *
 * THE SOFTWARE IS PROVIDED *AS IS*, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO
 * THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package com.microsoft.azure.hdinsight.sdk.rest.azure.datalake.analytics.job.models;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Data Lake Analytics job execution statistics.
 */
public class JobStatistics {
    /**
     * the last update time for the statistics.
     */
    @JsonProperty(value = "lastUpdateTimeUtc", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastUpdateTimeUtc;

    /**
     * the job finalizing start time.
     */
    @JsonProperty(value = "finalizingTimeUtc", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime finalizingTimeUtc;

    /**
     * the list of stages for the job.
     */
    @JsonProperty(value = "stages", access = JsonProperty.Access.WRITE_ONLY)
    private List<JobStatisticsVertexStage> stages;

    /**
     * Get the lastUpdateTimeUtc value.
     *
     * @return the lastUpdateTimeUtc value
     */
    public DateTime lastUpdateTimeUtc() {
        return this.lastUpdateTimeUtc;
    }

    /**
     * Get the finalizingTimeUtc value.
     *
     * @return the finalizingTimeUtc value
     */
    public DateTime finalizingTimeUtc() {
        return this.finalizingTimeUtc;
    }

    /**
     * Get the stages value.
     *
     * @return the stages value
     */
    public List<JobStatisticsVertexStage> stages() {
        return this.stages;
    }

}
