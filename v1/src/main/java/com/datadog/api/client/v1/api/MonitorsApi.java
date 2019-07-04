/*
 * (C) Datadog, Inc. 2019
 * All rights reserved
 * Licensed under a 3-clause BSD style license (see LICENSE)
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.client.v1.api;

import com.datadog.api.client.v1.ApiCallback;
import com.datadog.api.client.v1.ApiClient;
import com.datadog.api.client.v1.ApiException;
import com.datadog.api.client.v1.ApiResponse;
import com.datadog.api.client.v1.Configuration;
import com.datadog.api.client.v1.Pair;
import com.datadog.api.client.v1.ProgressRequestBody;
import com.datadog.api.client.v1.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.datadog.api.client.v1.model.Error400;
import com.datadog.api.client.v1.model.Error401;
import com.datadog.api.client.v1.model.Error403;
import com.datadog.api.client.v1.model.Error404;
import com.datadog.api.client.v1.model.Monitor;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MonitorsApi {
    private ApiClient localVarApiClient;

    public MonitorsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MonitorsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for deleteMonitor
     * @param monitorId The id of the monitor (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Item not found error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteMonitorCall(Long monitorId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/api/v1/monitor/{monitor_id}"
            .replaceAll("\\{" + "monitor_id" + "\\}", localVarApiClient.escapeString(monitorId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteMonitorValidateBeforeCall(Long monitorId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'monitorId' is set
        if (monitorId == null) {
            throw new ApiException("Missing the required parameter 'monitorId' when calling deleteMonitor(Async)");
        }
        

        okhttp3.Call localVarCall = deleteMonitorCall(monitorId, _callback);
        return localVarCall;

    }

    /**
     * Delete the specified monitor.
     * ### Overview Delete the specified monitor ### Arguments * **&#x60;monitor_id&#x60;** [*required*]: The id of the monitor.
     * @param monitorId The id of the monitor (required)
     * @return Map&lt;String, Long&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Item not found error </td><td>  -  </td></tr>
     </table>
     */
    public Map<String, Long> deleteMonitor(Long monitorId) throws ApiException {
        ApiResponse<Map<String, Long>> localVarResp = deleteMonitorWithHttpInfo(monitorId);
        return localVarResp.getData();
    }

    /**
     * Delete the specified monitor.
     * ### Overview Delete the specified monitor ### Arguments * **&#x60;monitor_id&#x60;** [*required*]: The id of the monitor.
     * @param monitorId The id of the monitor (required)
     * @return ApiResponse&lt;Map&lt;String, Long&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Item not found error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Map<String, Long>> deleteMonitorWithHttpInfo(Long monitorId) throws ApiException {
        okhttp3.Call localVarCall = deleteMonitorValidateBeforeCall(monitorId, null);
        Type localVarReturnType = new TypeToken<Map<String, Long>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete the specified monitor. (asynchronously)
     * ### Overview Delete the specified monitor ### Arguments * **&#x60;monitor_id&#x60;** [*required*]: The id of the monitor.
     * @param monitorId The id of the monitor (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Item not found error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteMonitorAsync(Long monitorId, final ApiCallback<Map<String, Long>> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteMonitorValidateBeforeCall(monitorId, _callback);
        Type localVarReturnType = new TypeToken<Map<String, Long>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for editMonitor
     * @param monitorId The id of the monitor (required)
     * @param monitor Monitor request object (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Monitor Not Found error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call editMonitorCall(Long monitorId, Monitor monitor, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = monitor;

        // create path and map variables
        String localVarPath = "/api/v1/monitor/{monitor_id}"
            .replaceAll("\\{" + "monitor_id" + "\\}", localVarApiClient.escapeString(monitorId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call editMonitorValidateBeforeCall(Long monitorId, Monitor monitor, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'monitorId' is set
        if (monitorId == null) {
            throw new ApiException("Missing the required parameter 'monitorId' when calling editMonitor(Async)");
        }
        
        // verify the required parameter 'monitor' is set
        if (monitor == null) {
            throw new ApiException("Missing the required parameter 'monitor' when calling editMonitor(Async)");
        }
        

        okhttp3.Call localVarCall = editMonitorCall(monitorId, monitor, _callback);
        return localVarCall;

    }

    /**
     * Edit the specified monitor
     * ### Overview Edit the specified monitor. ### Arguments * **&#x60;monitor_id&#x60;** [*required*]: The id of the monitor.
     * @param monitorId The id of the monitor (required)
     * @param monitor Monitor request object (required)
     * @return Monitor
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Monitor Not Found error </td><td>  -  </td></tr>
     </table>
     */
    public Monitor editMonitor(Long monitorId, Monitor monitor) throws ApiException {
        ApiResponse<Monitor> localVarResp = editMonitorWithHttpInfo(monitorId, monitor);
        return localVarResp.getData();
    }

    /**
     * Edit the specified monitor
     * ### Overview Edit the specified monitor. ### Arguments * **&#x60;monitor_id&#x60;** [*required*]: The id of the monitor.
     * @param monitorId The id of the monitor (required)
     * @param monitor Monitor request object (required)
     * @return ApiResponse&lt;Monitor&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Monitor Not Found error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Monitor> editMonitorWithHttpInfo(Long monitorId, Monitor monitor) throws ApiException {
        okhttp3.Call localVarCall = editMonitorValidateBeforeCall(monitorId, monitor, null);
        Type localVarReturnType = new TypeToken<Monitor>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Edit the specified monitor (asynchronously)
     * ### Overview Edit the specified monitor. ### Arguments * **&#x60;monitor_id&#x60;** [*required*]: The id of the monitor.
     * @param monitorId The id of the monitor (required)
     * @param monitor Monitor request object (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Monitor Not Found error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call editMonitorAsync(Long monitorId, Monitor monitor, final ApiCallback<Monitor> _callback) throws ApiException {

        okhttp3.Call localVarCall = editMonitorValidateBeforeCall(monitorId, monitor, _callback);
        Type localVarReturnType = new TypeToken<Monitor>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getMonitor
     * @param monitorId The id of the monitor (required)
     * @param groupStates When specified, shows additional information about the group states. Choose one or more from &#x60;all&#x60;, &#x60;alert&#x60;, &#x60;warn&#x60;, and &#x60;no data&#x60;. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getMonitorCall(Long monitorId, String groupStates, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/api/v1/monitor/{monitor_id}"
            .replaceAll("\\{" + "monitor_id" + "\\}", localVarApiClient.escapeString(monitorId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (groupStates != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("group_states", groupStates));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getMonitorValidateBeforeCall(Long monitorId, String groupStates, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'monitorId' is set
        if (monitorId == null) {
            throw new ApiException("Missing the required parameter 'monitorId' when calling getMonitor(Async)");
        }
        

        okhttp3.Call localVarCall = getMonitorCall(monitorId, groupStates, _callback);
        return localVarCall;

    }

    /**
     * Get details about the specified monitor.
     * ### Overview Get details about the specified monitor from your organization. ### Arguments * **&#x60;monitor_id&#x60;** [*required*]: The id of the monitor. * **&#x60;group_states&#x60;** [*optional* *default*&#x3D;**None**] If this argument is set, the returned data includes additional information (if available) regarding the specified group states, including the last notification timestamp, last resolution timestamp and details about the last time the monitor was triggered. The argument should include a string list indicating what, if any, group states to include. Choose one or more from all, alert, warn, or no data. Example &#39;alert,warn&#39;
     * @param monitorId The id of the monitor (required)
     * @param groupStates When specified, shows additional information about the group states. Choose one or more from &#x60;all&#x60;, &#x60;alert&#x60;, &#x60;warn&#x60;, and &#x60;no data&#x60;. (optional)
     * @return Monitor
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
     </table>
     */
    public Monitor getMonitor(Long monitorId, String groupStates) throws ApiException {
        ApiResponse<Monitor> localVarResp = getMonitorWithHttpInfo(monitorId, groupStates);
        return localVarResp.getData();
    }

    /**
     * Get details about the specified monitor.
     * ### Overview Get details about the specified monitor from your organization. ### Arguments * **&#x60;monitor_id&#x60;** [*required*]: The id of the monitor. * **&#x60;group_states&#x60;** [*optional* *default*&#x3D;**None**] If this argument is set, the returned data includes additional information (if available) regarding the specified group states, including the last notification timestamp, last resolution timestamp and details about the last time the monitor was triggered. The argument should include a string list indicating what, if any, group states to include. Choose one or more from all, alert, warn, or no data. Example &#39;alert,warn&#39;
     * @param monitorId The id of the monitor (required)
     * @param groupStates When specified, shows additional information about the group states. Choose one or more from &#x60;all&#x60;, &#x60;alert&#x60;, &#x60;warn&#x60;, and &#x60;no data&#x60;. (optional)
     * @return ApiResponse&lt;Monitor&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Monitor> getMonitorWithHttpInfo(Long monitorId, String groupStates) throws ApiException {
        okhttp3.Call localVarCall = getMonitorValidateBeforeCall(monitorId, groupStates, null);
        Type localVarReturnType = new TypeToken<Monitor>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get details about the specified monitor. (asynchronously)
     * ### Overview Get details about the specified monitor from your organization. ### Arguments * **&#x60;monitor_id&#x60;** [*required*]: The id of the monitor. * **&#x60;group_states&#x60;** [*optional* *default*&#x3D;**None**] If this argument is set, the returned data includes additional information (if available) regarding the specified group states, including the last notification timestamp, last resolution timestamp and details about the last time the monitor was triggered. The argument should include a string list indicating what, if any, group states to include. Choose one or more from all, alert, warn, or no data. Example &#39;alert,warn&#39;
     * @param monitorId The id of the monitor (required)
     * @param groupStates When specified, shows additional information about the group states. Choose one or more from &#x60;all&#x60;, &#x60;alert&#x60;, &#x60;warn&#x60;, and &#x60;no data&#x60;. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getMonitorAsync(Long monitorId, String groupStates, final ApiCallback<Monitor> _callback) throws ApiException {

        okhttp3.Call localVarCall = getMonitorValidateBeforeCall(monitorId, groupStates, _callback);
        Type localVarReturnType = new TypeToken<Monitor>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for validateMonitor
     * @param monitor Monitor request object (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid JSON </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call validateMonitorCall(Monitor monitor, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = monitor;

        // create path and map variables
        String localVarPath = "/api/v1/monitor/validate";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call validateMonitorValidateBeforeCall(Monitor monitor, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'monitor' is set
        if (monitor == null) {
            throw new ApiException("Missing the required parameter 'monitor' when calling validateMonitor(Async)");
        }
        

        okhttp3.Call localVarCall = validateMonitorCall(monitor, _callback);
        return localVarCall;

    }

    /**
     * 
     * ### Overview Validate the monitor provided in the request ### Arguments * **&#x60;Monitor&#x60;** [*required*] The Monitor Object to validate summary: Validate the provided monitor
     * @param monitor Monitor request object (required)
     * @return Monitor
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid JSON </td><td>  -  </td></tr>
     </table>
     */
    public Monitor validateMonitor(Monitor monitor) throws ApiException {
        ApiResponse<Monitor> localVarResp = validateMonitorWithHttpInfo(monitor);
        return localVarResp.getData();
    }

    /**
     * 
     * ### Overview Validate the monitor provided in the request ### Arguments * **&#x60;Monitor&#x60;** [*required*] The Monitor Object to validate summary: Validate the provided monitor
     * @param monitor Monitor request object (required)
     * @return ApiResponse&lt;Monitor&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid JSON </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Monitor> validateMonitorWithHttpInfo(Monitor monitor) throws ApiException {
        okhttp3.Call localVarCall = validateMonitorValidateBeforeCall(monitor, null);
        Type localVarReturnType = new TypeToken<Monitor>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * ### Overview Validate the monitor provided in the request ### Arguments * **&#x60;Monitor&#x60;** [*required*] The Monitor Object to validate summary: Validate the provided monitor
     * @param monitor Monitor request object (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid JSON </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call validateMonitorAsync(Monitor monitor, final ApiCallback<Monitor> _callback) throws ApiException {

        okhttp3.Call localVarCall = validateMonitorValidateBeforeCall(monitor, _callback);
        Type localVarReturnType = new TypeToken<Monitor>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
