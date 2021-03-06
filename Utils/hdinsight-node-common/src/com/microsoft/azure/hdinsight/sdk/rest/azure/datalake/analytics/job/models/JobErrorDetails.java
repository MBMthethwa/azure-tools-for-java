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

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Data Lake Analytics job error details.
 */
public class JobErrorDetails {
    /**
     * the error message description.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * the details of the error message.
     */
    @JsonProperty(value = "details", access = JsonProperty.Access.WRITE_ONLY)
    private String details;

    /**
     * the end offset in the job where the error was found.
     */
    @JsonProperty(value = "endOffset", access = JsonProperty.Access.WRITE_ONLY)
    private Integer endOffset;

    /**
     * the specific identifier for the type of error encountered in the job.
     */
    @JsonProperty(value = "errorId", access = JsonProperty.Access.WRITE_ONLY)
    private String errorId;

    /**
     * the path to any supplemental error files, if any.
     */
    @JsonProperty(value = "filePath", access = JsonProperty.Access.WRITE_ONLY)
    private String filePath;

    /**
     * the link to MSDN or Azure help for this type of error, if any.
     */
    @JsonProperty(value = "helpLink", access = JsonProperty.Access.WRITE_ONLY)
    private String helpLink;

    /**
     * the internal diagnostic stack trace if the user requesting the job error details has sufficient permissions it
     * will be retrieved, otherwise it will be empty.
     */
    @JsonProperty(value = "internalDiagnostics", access = JsonProperty.Access.WRITE_ONLY)
    private String internalDiagnostics;

    /**
     * the specific line number in the job where the error occured.
     */
    @JsonProperty(value = "lineNumber", access = JsonProperty.Access.WRITE_ONLY)
    private Integer lineNumber;

    /**
     * the user friendly error message for the failure.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * the recommended resolution for the failure, if any.
     */
    @JsonProperty(value = "resolution", access = JsonProperty.Access.WRITE_ONLY)
    private String resolution;

    /**
     * the inner error of this specific job error message, if any.
     */
    @JsonProperty(value = "innerError", access = JsonProperty.Access.WRITE_ONLY)
    private JobInnerError innerError;

    /**
     * the severity level of the failure. Possible values include: 'Warning', 'Error', 'Info', 'SevereWarning',
     * 'Deprecated', 'UserWarning'.
     */
    @JsonProperty(value = "severity", access = JsonProperty.Access.WRITE_ONLY)
    private SeverityTypes severity;

    /**
     * the ultimate source of the failure (usually either SYSTEM or USER).
     */
    @JsonProperty(value = "source", access = JsonProperty.Access.WRITE_ONLY)
    private String source;

    /**
     * the start offset in the job where the error was found.
     */
    @JsonProperty(value = "startOffset", access = JsonProperty.Access.WRITE_ONLY)
    private Integer startOffset;

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the details value.
     *
     * @return the details value
     */
    public String details() {
        return this.details;
    }

    /**
     * Get the endOffset value.
     *
     * @return the endOffset value
     */
    public Integer endOffset() {
        return this.endOffset;
    }

    /**
     * Get the errorId value.
     *
     * @return the errorId value
     */
    public String errorId() {
        return this.errorId;
    }

    /**
     * Get the filePath value.
     *
     * @return the filePath value
     */
    public String filePath() {
        return this.filePath;
    }

    /**
     * Get the helpLink value.
     *
     * @return the helpLink value
     */
    public String helpLink() {
        return this.helpLink;
    }

    /**
     * Get the internalDiagnostics value.
     *
     * @return the internalDiagnostics value
     */
    public String internalDiagnostics() {
        return this.internalDiagnostics;
    }

    /**
     * Get the lineNumber value.
     *
     * @return the lineNumber value
     */
    public Integer lineNumber() {
        return this.lineNumber;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the resolution value.
     *
     * @return the resolution value
     */
    public String resolution() {
        return this.resolution;
    }

    /**
     * Get the innerError value.
     *
     * @return the innerError value
     */
    public JobInnerError innerError() {
        return this.innerError;
    }

    /**
     * Get the severity value.
     *
     * @return the severity value
     */
    public SeverityTypes severity() {
        return this.severity;
    }

    /**
     * Get the source value.
     *
     * @return the source value
     */
    public String source() {
        return this.source;
    }

    /**
     * Get the startOffset value.
     *
     * @return the startOffset value
     */
    public Integer startOffset() {
        return this.startOffset;
    }

}
