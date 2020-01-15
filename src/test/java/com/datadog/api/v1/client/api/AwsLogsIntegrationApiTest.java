/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.AWSAccountAndLambdaRequest;
import com.datadog.api.v1.client.model.AWSLogsAsyncResponse;
import com.datadog.api.v1.client.model.AWSLogsListResponse;
import com.datadog.api.v1.client.model.AWSLogsListServicesResponse;
import com.datadog.api.v1.client.model.AWSLogsServicesRequest;
import com.datadog.api.v1.client.model.Error400;
import com.datadog.api.v1.client.model.Error403;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AwsLogsIntegrationApi
 */
@Ignore
public class AwsLogsIntegrationApiTest {

    private final AwsLogsIntegrationApi api = new AwsLogsIntegrationApi();

    
    /**
     * Check function to see if a lambda_arn exists within an account.
     *
     * ### Overview Check function to see if a lambda_arn exists within an account. This sends a job on our side if it does not exist, then immediately returns the status of that job. Subsequent requests will always repeat the above, so this endpoint can be polled intermittently instead of blocking. - Returns a status of &#39;created&#39; when it&#39;s checking if the Lambda exists in the account. - Returns a status of &#39;waiting&#39; while checking. - Returns a status of &#39;checked and ok&#39; if the Lambda exists. - Returns a status of &#39;error&#39; if the Lambda does not exist. ### Arguments * **&#x60;account_id&#x60;** [*required*, *default* &#x3D; **None**]: Your AWS Account ID without dashes. * **&#x60;lambda_arn&#x60;** [*required*, *default* &#x3D; **None**]: ARN of the Lambda to be checked.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void aWSLogsCheckLambdaAsyncTest() throws ApiException {
        AWSAccountAndLambdaRequest body = null;
        AWSLogsAsyncResponse response = api.aWSLogsCheckLambdaAsync()
                .body(body)
                .execute();
        // TODO: test validations
    }
    
    /**
     * Asynchronous check for permissions for AWS log lambda config.
     *
     * ### Overview Test if permissions are present to add log-forwarding triggers for the given services + AWS account. Input is the same as for EnableAWSLogServices. Done async, so can be repeatedly polled in a non-blocking fashion until the async request completes - Returns a status of &#39;created&#39; when it&#39;s checking if the permissions exists in the AWS account. - Returns a status of &#39;waiting&#39; while checking. - Returns a status of &#39;checked and ok&#39; if the Lambda exists. - Returns a status of &#39;error&#39; if the Lambda does not exist. ### Arguments * **&#x60;account_id&#x60;** [*required*, *default* &#x3D; **None**]: Your AWS Account ID without dashes. * **&#x60;services&#x60;** [*required*, *default* &#x3D; **None**]: Array of services IDs set to enable automatic log collection. Discover the list of available services with the Get list of AWS log ready services API endpoint
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void aWSLogsCheckServicesAsyncTest() throws ApiException {
        AWSLogsServicesRequest body = null;
        AWSLogsAsyncResponse response = api.aWSLogsCheckServicesAsync()
                .body(body)
                .execute();
        // TODO: test validations
    }
    
    /**
     * List configured AWS log integrations.
     *
     * ### Overview List all Datadog-AWS Logs integrations configured in your Datadog account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void aWSLogsListTest() throws ApiException {
        List<AWSLogsListResponse> response = api.aWSLogsList()
                .execute();
        // TODO: test validations
    }
    
    /**
     * Get list of AWS log ready services.
     *
     * ### Overview Get the list of current AWS services that Datadog offers automatic log collection. Use returned service IDs with the services parameter for the Enable an AWS service log collection API endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void aWSLogsServicesListTest() throws ApiException {
        List<AWSLogsListServicesResponse> response = api.aWSLogsServicesList()
                .execute();
        // TODO: test validations
    }
    
    /**
     * Add a AWS Lambda ARN to your Datadog account.
     *
     * ### Overview Attach the Lambda ARN of the Lambda created for the Datadog-AWS log collection to your AWS account ID to enable log collection. ### Arguments * **&#x60;account_id&#x60;** [*required*, *default* &#x3D; **None**]: Your AWS Account ID without dashes. * **&#x60;lambda_arn&#x60;** [*required*, *default* &#x3D; **None**]: ARN of the Datadog Lambda created during the Datadog-Amazon Web services Log collection setup.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addAWSLambdaARNTest() throws ApiException {
        AWSAccountAndLambdaRequest body = null;
        Object response = api.addAWSLambdaARN()
                .body(body)
                .execute();
        // TODO: test validations
    }
    
    /**
     * Delete a AWS Lambda ARN from your Datadog account.
     *
     * ### Overview Delete a Lambda ARN of a Lambda created for the Datadog-AWS log collection in your Datadog account. ### Arguments * **&#x60;account_id&#x60;** [*required*, *default* &#x3D; **None**]: Your AWS Account ID without dashes. * **&#x60;lambda_arn&#x60;** [*required*, *default* &#x3D; **None**]: ARN of the Lambda to be deleted.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAWSLambdaARNTest() throws ApiException {
        AWSAccountAndLambdaRequest body = null;
        Object response = api.deleteAWSLambdaARN()
                .body(body)
                .execute();
        // TODO: test validations
    }
    
    /**
     * Enable Automatic Log collection for your AWS services.
     *
     * ### Overview Enable automatic log collection for a list of services. This should be run after running &#39;AddAWSLambdaARN&#39; to save the config. ### Arguments * **&#x60;account_id&#x60;** [*required*, *default* &#x3D; **None**]: Your AWS Account ID without dashes. * **&#x60;services&#x60;** [*required*, *default* &#x3D; **None**]: Array of services IDs set to enable automatic log collection. Discover the list of available services with the Get list of AWS log ready services API endpoint
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enableAWSLogServicesTest() throws ApiException {
        AWSLogsServicesRequest body = null;
        Object response = api.enableAWSLogServices()
                .body(body)
                .execute();
        // TODO: test validations
    }
    
}
