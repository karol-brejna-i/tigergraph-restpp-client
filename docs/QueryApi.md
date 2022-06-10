# QueryApi

All URIs are relative to *{protocol}://{host}:{port}*

Method | HTTP request | Description
------------- | ------------- | -------------
[**abortQueryGet**](QueryApi.md#abortQueryGet) | **GET** /abortquery/{graph_name} | Abort a query
[**abortQueryPost**](QueryApi.md#abortQueryPost) | **POST** /abortquery/{graph_name} | Abort a query
[**queryResult**](QueryApi.md#queryResult) | **GET** /query_result/{requestid} | Check query results (Detached Mode)
[**queryStatus**](QueryApi.md#queryStatus) | **GET** /query_status/{graph_name} | Check query status (Detached Mode)
[**runInstalledQueryGet**](QueryApi.md#runInstalledQueryGet) | **GET** /query/{graph_name}/{query_name} | Run an installed query
[**runInstalledQueryPost**](QueryApi.md#runInstalledQueryPost) | **POST** /query/{graph_name}/{query_name} | Run an installed query
[**showProcessListGet**](QueryApi.md#showProcessListGet) | **GET** /showprocesslist/{graph_name} | List running queries
[**showProcessListPost**](QueryApi.md#showProcessListPost) | **POST** /showprocesslist/{graph_name} | TODO XXX listed in /endpoints results, but not mentioned in the docs...

<a name="abortQueryGet"></a>
# **abortQueryGet**
> AbortQueryResponse abortQueryGet(graphName, requestid)

Abort a query

This endpoint safely aborts a selected query by ID or all queries of an endpoint by endpoint URL of a graph.  See: https://docs.tigergraph.com/tigergraph-server/current/api/built-in-endpoints#_abort_a_query 

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.QueryApi;


QueryApi apiInstance = new QueryApi();
String graphName = "graphName_example"; // String | The name of the graph (REQUIRED in case of multiple graph in the database).
String requestid = "requestid_example"; // String | The id of a query request.
try {
    AbortQueryResponse result = apiInstance.abortQueryGet(graphName, requestid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#abortQueryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **graphName** | **String**| The name of the graph (REQUIRED in case of multiple graph in the database). |
 **requestid** | **String**| The id of a query request. |

### Return type

[**AbortQueryResponse**](AbortQueryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="abortQueryPost"></a>
# **abortQueryPost**
> AbortQueryResponse abortQueryPost(graphName)

Abort a query

This endpoint safely aborts a selected query by ID or all queries of an endpoint by endpoint URL of a graph.  See: https://docs.tigergraph.com/tigergraph-server/current/api/built-in-endpoints#_abort_a_query 

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.QueryApi;


QueryApi apiInstance = new QueryApi();
String graphName = "graphName_example"; // String | The name of the graph (REQUIRED in case of multiple graph in the database).
try {
    AbortQueryResponse result = apiInstance.abortQueryPost(graphName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#abortQueryPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **graphName** | **String**| The name of the graph (REQUIRED in case of multiple graph in the database). |

### Return type

[**AbortQueryResponse**](AbortQueryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="queryResult"></a>
# **queryResult**
> QueryResultResponse queryResult(requestid)

Check query results (Detached Mode)

This endpoint allows you to check the results of queries run in Detached Mode if they have finished running. If the query is still running, the endpoint will respond with an error and a message saying \&quot;Unable to retrieve result for query &lt;requestid&gt;\&quot;. Ensure that the query is finished before checking its result.  See: https://docs.tigergraph.com/tigergraph-server/current/api/built-in-endpoints#_check_query_results_detached_mode 

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.QueryApi;


QueryApi apiInstance = new QueryApi();
String requestid = "requestid_example"; // String | The id of a query request.
try {
    QueryResultResponse result = apiInstance.queryResult(requestid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#queryResult");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestid** | **String**| The id of a query request. |

### Return type

[**QueryResultResponse**](QueryResultResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="queryStatus"></a>
# **queryStatus**
> QueryStatusResponse queryStatus(graphName, requestid)

Check query status (Detached Mode)

This endpoint allows you to check the status of a query run in detached mode.  https://docs.tigergraph.com/tigergraph-server/current/api/built-in-endpoints#_check_query_status_detached_modes 

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.QueryApi;


QueryApi apiInstance = new QueryApi();
String graphName = "graphName_example"; // String | The name of the graph (REQUIRED in case of multiple graph in the database).
List<String> requestid = Arrays.asList("requestid_example"); // List<String> | The id of a query request.
try {
    QueryStatusResponse result = apiInstance.queryStatus(graphName, requestid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#queryStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **graphName** | **String**| The name of the graph (REQUIRED in case of multiple graph in the database). |
 **requestid** | [**List&lt;String&gt;**](String.md)| The id of a query request. |

### Return type

[**QueryStatusResponse**](QueryStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="runInstalledQueryGet"></a>
# **runInstalledQueryGet**
> QueryResponse runInstalledQueryGet(graphName, queryName, GSQL_REPLICA, GSQL_THREAD_LIMIT, GSQL_TIMEOUT, GSQL_ASYNC, RESPONSE_LIMIT, readCommitted, params)

Run an installed query

Each time a new TigerGraph query is installed, a dynamic endpoint is generated. This new endpoint enables the user to run the new TigerGraph query through HTTP requests and giving the parameters in URL or in a data payload. In the case of a GET request, parameters should be passed in through the query string. 

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.QueryApi;


QueryApi apiInstance = new QueryApi();
String graphName = "graphName_example"; // String | Graph name
String queryName = "queryName_example"; // String | Query name
Integer GSQL_REPLICA = 56; // Integer | If you have a TigerGraph HA cluster, you can specify a query to run on a particular replica with the HTTP header GSQL-REPLICA. The value of the header needs to be an integer within the range one to the replication factor of the cluster. If you supply a invalid value for the header, the request will return an error. 
Integer GSQL_THREAD_LIMIT = 56; // Integer | When running a query through RESTPP, you can specify a limit on the number of threads that the query is allowed to use on each node. The number of threads used by a query means the number of vCPUs used by the query. By default, a query will use all threads that are available on a machine. 
Integer GSQL_TIMEOUT = 56; // Integer | By default, an HTTP request in the TigerGraph system times out after 16 seconds.  To customize this timeout limit for a particular query instance, you can set the GSQL-TIMEOUT parameter in the request header. The value is an integer in miliseconds. See: https://docs.tigergraph.com/tigergraph-server/current/api/intro#_gsql_query_timeout 
Boolean GSQL_ASYNC = false; // Boolean | Installed queries can run in Detached Mode. To do this, use the GSQL-ASYNCheader and set its value to true.  The results and status of the queries run in Detached Mode can be retrieved with a query ID,  which is returned immediately when queries are executed in Detached Mode. 
Integer RESPONSE_LIMIT = 56; // Integer | Allows for specyfing the response size limit (in bytes) of an HTTP request. If the response size is larger than the given limit, an error message will be returned instead of the actual query result.  See: https://docs.tigergraph.com/tigergraph-server/current/api/intro#_response_size 
Boolean readCommitted = true; // Boolean | Boolean value that indicates whether to use read-committed isolation level for the query. At the read committed level, it is guaranteed that any data read is committed at the moment it is read. By default, it is off. 
Map<String, String> params = new HashMap(); // Map<String, String> | When using a GET request to run an installed query, the query parameters are passed in through the query string of the URL. 
try {
    QueryResponse result = apiInstance.runInstalledQueryGet(graphName, queryName, GSQL_REPLICA, GSQL_THREAD_LIMIT, GSQL_TIMEOUT, GSQL_ASYNC, RESPONSE_LIMIT, readCommitted, params);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#runInstalledQueryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **graphName** | **String**| Graph name |
 **queryName** | **String**| Query name |
 **GSQL_REPLICA** | **Integer**| If you have a TigerGraph HA cluster, you can specify a query to run on a particular replica with the HTTP header GSQL-REPLICA. The value of the header needs to be an integer within the range one to the replication factor of the cluster. If you supply a invalid value for the header, the request will return an error.  | [optional]
 **GSQL_THREAD_LIMIT** | **Integer**| When running a query through RESTPP, you can specify a limit on the number of threads that the query is allowed to use on each node. The number of threads used by a query means the number of vCPUs used by the query. By default, a query will use all threads that are available on a machine.  | [optional]
 **GSQL_TIMEOUT** | **Integer**| By default, an HTTP request in the TigerGraph system times out after 16 seconds.  To customize this timeout limit for a particular query instance, you can set the GSQL-TIMEOUT parameter in the request header. The value is an integer in miliseconds. See: https://docs.tigergraph.com/tigergraph-server/current/api/intro#_gsql_query_timeout  | [optional]
 **GSQL_ASYNC** | **Boolean**| Installed queries can run in Detached Mode. To do this, use the GSQL-ASYNCheader and set its value to true.  The results and status of the queries run in Detached Mode can be retrieved with a query ID,  which is returned immediately when queries are executed in Detached Mode.  | [optional] [default to false]
 **RESPONSE_LIMIT** | **Integer**| Allows for specyfing the response size limit (in bytes) of an HTTP request. If the response size is larger than the given limit, an error message will be returned instead of the actual query result.  See: https://docs.tigergraph.com/tigergraph-server/current/api/intro#_response_size  | [optional]
 **readCommitted** | **Boolean**| Boolean value that indicates whether to use read-committed isolation level for the query. At the read committed level, it is guaranteed that any data read is committed at the moment it is read. By default, it is off.  | [optional]
 **params** | [**Map&lt;String, String&gt;**](String.md)| When using a GET request to run an installed query, the query parameters are passed in through the query string of the URL.  | [optional]

### Return type

[**QueryResponse**](QueryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="runInstalledQueryPost"></a>
# **runInstalledQueryPost**
> QueryResponse runInstalledQueryPost(graphName, queryName, body, GSQL_REPLICA, GSQL_THREAD_LIMIT, GSQL_TIMEOUT, GSQL_ASYNC, RESPONSE_LIMIT, readCommitted)

Run an installed query

Each time a new TigerGraph query is installed, a dynamic endpoint is generated. This new endpoint enables the user to run the new TigerGraph query through HTTP requests and giving the parameters in URL or in a data payload.  Users can run queries through a POST request, which allows them to pass query parameters in JSON. This is especially helpful when the query takes complex parameters. 

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.QueryApi;


QueryApi apiInstance = new QueryApi();
String graphName = "graphName_example"; // String | Graph name
String queryName = "queryName_example"; // String | Query name
Object body = null; // Object | Optional description in *Markdown*
Integer GSQL_REPLICA = 56; // Integer | If you have a TigerGraph HA cluster, you can specify a query to run on a particular replica with the HTTP header GSQL-REPLICA. The value of the header needs to be an integer within the range one to the replication factor of the cluster. If you supply a invalid value for the header, the request will return an error. 
Integer GSQL_THREAD_LIMIT = 56; // Integer | When running a query through RESTPP, you can specify a limit on the number of threads that the query is allowed to use on each node. The number of threads used by a query means the number of vCPUs used by the query. By default, a query will use all threads that are available on a machine. 
Integer GSQL_TIMEOUT = 56; // Integer | By default, an HTTP request in the TigerGraph system times out after 16 seconds.  To customize this timeout limit for a particular query instance, you can set the GSQL-TIMEOUT parameter in the request header. The value is an integer in miliseconds. See: https://docs.tigergraph.com/tigergraph-server/current/api/intro#_gsql_query_timeout 
Boolean GSQL_ASYNC = false; // Boolean | Installed queries can run in Detached Mode. To do this, use the GSQL-ASYNCheader and set its value to true.  The results and status of the queries run in Detached Mode can be retrieved with a query ID,  which is returned immediately when queries are executed in Detached Mode. 
Integer RESPONSE_LIMIT = 56; // Integer | Allows for specyfing the response size limit (in bytes) of an HTTP request. If the response size is larger than the given limit, an error message will be returned instead of the actual query result.  See: https://docs.tigergraph.com/tigergraph-server/current/api/intro#_response_size 
Boolean readCommitted = true; // Boolean | Boolean value that indicates whether to use read-committed isolation level for the query. At the read committed level, it is guaranteed that any data read is committed at the moment it is read. By default, it is off. 
try {
    QueryResponse result = apiInstance.runInstalledQueryPost(graphName, queryName, body, GSQL_REPLICA, GSQL_THREAD_LIMIT, GSQL_TIMEOUT, GSQL_ASYNC, RESPONSE_LIMIT, readCommitted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#runInstalledQueryPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **graphName** | **String**| Graph name |
 **queryName** | **String**| Query name |
 **body** | [**Object**](Object.md)| Optional description in *Markdown* | [optional]
 **GSQL_REPLICA** | **Integer**| If you have a TigerGraph HA cluster, you can specify a query to run on a particular replica with the HTTP header GSQL-REPLICA. The value of the header needs to be an integer within the range one to the replication factor of the cluster. If you supply a invalid value for the header, the request will return an error.  | [optional]
 **GSQL_THREAD_LIMIT** | **Integer**| When running a query through RESTPP, you can specify a limit on the number of threads that the query is allowed to use on each node. The number of threads used by a query means the number of vCPUs used by the query. By default, a query will use all threads that are available on a machine.  | [optional]
 **GSQL_TIMEOUT** | **Integer**| By default, an HTTP request in the TigerGraph system times out after 16 seconds.  To customize this timeout limit for a particular query instance, you can set the GSQL-TIMEOUT parameter in the request header. The value is an integer in miliseconds. See: https://docs.tigergraph.com/tigergraph-server/current/api/intro#_gsql_query_timeout  | [optional]
 **GSQL_ASYNC** | **Boolean**| Installed queries can run in Detached Mode. To do this, use the GSQL-ASYNCheader and set its value to true.  The results and status of the queries run in Detached Mode can be retrieved with a query ID,  which is returned immediately when queries are executed in Detached Mode.  | [optional] [default to false]
 **RESPONSE_LIMIT** | **Integer**| Allows for specyfing the response size limit (in bytes) of an HTTP request. If the response size is larger than the given limit, an error message will be returned instead of the actual query result.  See: https://docs.tigergraph.com/tigergraph-server/current/api/intro#_response_size  | [optional]
 **readCommitted** | **Boolean**| Boolean value that indicates whether to use read-committed isolation level for the query. At the read committed level, it is guaranteed that any data read is committed at the moment it is read. By default, it is off.  | [optional]

### Return type

[**QueryResponse**](QueryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showProcessListGet"></a>
# **showProcessListGet**
> ProcessListResponse showProcessListGet(graphName)

List running queries

This endpoint reports statistics of running queries of a graph: the query&#x27;s request ID, start time, expiration time, and the REST endpoint&#x27;s URL.  See: https://docs.tigergraph.com/tigergraph-server/current/api/built-in-endpoints#_list_running_queries 

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.QueryApi;


QueryApi apiInstance = new QueryApi();
String graphName = "graphName_example"; // String | The name of the graph (REQUIRED in case of multiple graph in the database).
try {
    ProcessListResponse result = apiInstance.showProcessListGet(graphName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#showProcessListGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **graphName** | **String**| The name of the graph (REQUIRED in case of multiple graph in the database). |

### Return type

[**ProcessListResponse**](ProcessListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="showProcessListPost"></a>
# **showProcessListPost**
> ProcessListResponse showProcessListPost(graphName)

TODO XXX listed in /endpoints results, but not mentioned in the docs...

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.QueryApi;


QueryApi apiInstance = new QueryApi();
String graphName = "graphName_example"; // String | The name of the graph (REQUIRED in case of multiple graph in the database).
try {
    ProcessListResponse result = apiInstance.showProcessListPost(graphName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#showProcessListPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **graphName** | **String**| The name of the graph (REQUIRED in case of multiple graph in the database). |

### Return type

[**ProcessListResponse**](ProcessListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

