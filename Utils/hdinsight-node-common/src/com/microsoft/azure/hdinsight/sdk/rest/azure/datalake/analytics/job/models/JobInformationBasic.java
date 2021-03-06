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

import java.util.UUID;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The common Data Lake Analytics job information properties.
 */
public class JobInformationBasic {
    /**
     * the job's unique identifier (a GUID).
     */
    @JsonProperty(value = "jobId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID jobId;

    /**
     * the friendly name of the job.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * the job type of the current job (Hive or USql). Possible values include: 'USql', 'Hive'.
     */
    @JsonProperty(value = "type", required = true)
    private JobType type;

    /**
     * the user or account that submitted the job.
     */
    @JsonProperty(value = "submitter", access = JsonProperty.Access.WRITE_ONLY)
    private String submitter;

    /**
     * the degree of parallelism used for this job. This must be greater than 0, if set to less than 0 it will default
     * to 1.
     */
    @JsonProperty(value = "degreeOfParallelism")
    private Integer degreeOfParallelism;

    /**
     * the priority value for the current job. Lower numbers have a higher priority. By default, a job has a priority
     * of 1000. This must be greater than 0.
     */
    @JsonProperty(value = "priority")
    private Integer priority;

    /**
     * the time the job was submitted to the service.
     */
    @JsonProperty(value = "submitTime", access = JsonProperty.Access.WRITE_ONLY)
    private String submitTime;

    /**
     * the start time of the job.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private String startTime;

    /**
     * the completion time of the job.
     */
    @JsonProperty(value = "endTime", access = JsonProperty.Access.WRITE_ONLY)
    private String endTime;

    /**
     * the job state. When the job is in the Ended state, refer to Result and ErrorMessage for details. Possible values
     * include: 'Accepted', 'Compiling', 'Ended', 'New', 'Queued', 'Running', 'Scheduling', 'Starting', 'Paused',
     * 'WaitingForCapacity'.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private JobState state;

    /**
     * the result of job execution or the current result of the running job. Possible values include: 'None',
     * 'Succeeded', 'Cancelled', 'Failed'.
     */
    @JsonProperty(value = "result", access = JsonProperty.Access.WRITE_ONLY)
    private JobResult result;

    /**
     * the log folder path to use in the following format:
     * adl://&lt;accountName&gt;.azuredatalakestore.net/system/jobservice/jobs/Usql/2016/03/13/17/18/5fe51957-93bc-4de0-8ddc-c5a4753b068b/logs/.
     */
    @JsonProperty(value = "logFolder", access = JsonProperty.Access.WRITE_ONLY)
    private String logFolder;

    /**
     * the list of log file name patterns to find in the logFolder. '*' is the only matching character allowed. Example
     * format: jobExecution*.log or *mylog*.txt.
     */
    @JsonProperty(value = "logFilePatterns")
    private List<String> logFilePatterns;

    /**
     * the recurring job relationship information properties.
     */
    @JsonProperty(value = "related")
    private JobRelationshipProperties related;

    /**
     * Get the jobId value.
     *
     * @return the jobId value
     */
    public UUID jobId() {
        return this.jobId;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the JobInformationBasic object itself.
     */
    public JobInformationBasic withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public JobType type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the JobInformationBasic object itself.
     */
    public JobInformationBasic withType(JobType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the submitter value.
     *
     * @return the submitter value
     */
    public String submitter() {
        return this.submitter;
    }

    /**
     * Get the degreeOfParallelism value.
     *
     * @return the degreeOfParallelism value
     */
    public Integer degreeOfParallelism() {
        return this.degreeOfParallelism;
    }

    /**
     * Set the degreeOfParallelism value.
     *
     * @param degreeOfParallelism the degreeOfParallelism value to set
     * @return the JobInformationBasic object itself.
     */
    public JobInformationBasic withDegreeOfParallelism(Integer degreeOfParallelism) {
        this.degreeOfParallelism = degreeOfParallelism;
        return this;
    }

    /**
     * Get the priority value.
     *
     * @return the priority value
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set the priority value.
     *
     * @param priority the priority value to set
     * @return the JobInformationBasic object itself.
     */
    public JobInformationBasic withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the submitTime value.
     *
     * @return the submitTime value
     */
    public String submitTime() {
        return this.submitTime;
    }

    /**
     * Get the startTime value.
     *
     * @return the startTime value
     */
    public String startTime() {
        return this.startTime;
    }

    /**
     * Get the endTime value.
     *
     * @return the endTime value
     */
    public String endTime() {
        return this.endTime;
    }

    /**
     * Get the state value.
     *
     * @return the state value
     */
    public JobState state() {
        return this.state;
    }

    /**
     * Get the result value.
     *
     * @return the result value
     */
    public JobResult result() {
        return this.result;
    }

    /**
     * Get the logFolder value.
     *
     * @return the logFolder value
     */
    public String logFolder() {
        return this.logFolder;
    }

    /**
     * Get the logFilePatterns value.
     *
     * @return the logFilePatterns value
     */
    public List<String> logFilePatterns() {
        return this.logFilePatterns;
    }

    /**
     * Set the logFilePatterns value.
     *
     * @param logFilePatterns the logFilePatterns value to set
     * @return the JobInformationBasic object itself.
     */
    public JobInformationBasic withLogFilePatterns(List<String> logFilePatterns) {
        this.logFilePatterns = logFilePatterns;
        return this;
    }

    /**
     * Get the related value.
     *
     * @return the related value
     */
    public JobRelationshipProperties related() {
        return this.related;
    }

    /**
     * Set the related value.
     *
     * @param related the related value to set
     * @return the JobInformationBasic object itself.
     */
    public JobInformationBasic withRelated(JobRelationshipProperties related) {
        this.related = related;
        return this;
    }

}
