# DiagnosticsApi

All URIs are relative to *http://192.168.0.105:9000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**echoGet**](DiagnosticsApi.md#echoGet) | **GET** /echo/{graph_name} | Echo
[**echoPost**](DiagnosticsApi.md#echoPost) | **POST** /echo/{graph_name} | Echo
[**endpoints**](DiagnosticsApi.md#endpoints) | **GET** /endpoints/{graph_name} | List all endpoints
[**rebuildnowGet**](DiagnosticsApi.md#rebuildnowGet) | **GET** /rebuildnow/{graph_name} | Rebuild graph engine
[**rebuildnowPost**](DiagnosticsApi.md#rebuildnowPost) | **POST** /rebuildnow/{graph_name} | Rebuild graph engine
[**statistics**](DiagnosticsApi.md#statistics) | **GET** /statistics/{graph_name} | Show query performance
[**version**](DiagnosticsApi.md#version) | **GET** /version/{graph_name} | Show component versions

<a name="echoGet"></a>
# **echoGet**
> HelloResponse echoGet(graphName)

Echo

A simple diagnostic utility. Expected response is {\&quot;message\&quot;: \&quot;Hello GSQL\&quot;}.  See: https://docs.tigergraph.com/tigergraph-server/current/api/built-in-endpoints#_echo 

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.DiagnosticsApi;


DiagnosticsApi apiInstance = new DiagnosticsApi();
String graphName = "graphName_example"; // String | The name of the graph (REQUIRED in case of multiple graph in the database).
try {
    HelloResponse result = apiInstance.echoGet(graphName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiagnosticsApi#echoGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **graphName** | **String**| The name of the graph (REQUIRED in case of multiple graph in the database). |

### Return type

[**HelloResponse**](HelloResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="echoPost"></a>
# **echoPost**
> HelloResponse echoPost(graphName)

Echo

A simple diagnostic utility. Expected response is {\&quot;message\&quot;: \&quot;Hello GSQL\&quot;}.  See: https://docs.tigergraph.com/tigergraph-server/current/api/built-in-endpoints#_echo 

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.DiagnosticsApi;


DiagnosticsApi apiInstance = new DiagnosticsApi();
String graphName = "graphName_example"; // String | The name of the graph (REQUIRED in case of multiple graph in the database).
try {
    HelloResponse result = apiInstance.echoPost(graphName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiagnosticsApi#echoPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **graphName** | **String**| The name of the graph (REQUIRED in case of multiple graph in the database). |

### Return type

[**HelloResponse**](HelloResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="endpoints"></a>
# **endpoints**
> AnyObject endpoints(graphName, builtin, dynamic, _static)

List all endpoints

This endpoint returns a list of the installed endpoints and their parameters. There are three types of endpoints, described in the table below.   * builtin - Endpoints presinstalled in TigerGraph (like this one)   * dynamic - Endpoints generated when installing GSQL queries   * static - User installed endpoints  To include one or more of the endpoint types in the output,  include the endpoint type in the parameter query string and set its value to true. If no type parameters are provided, all endpoints are returned.  See: https://docs.tigergraph.com/tigergraph-server/current/api/built-in-endpoints#_list_all_endpoints See: https://docs.tigergraph.com/tigergraph-server/current/api/json-catalog 

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.DiagnosticsApi;


DiagnosticsApi apiInstance = new DiagnosticsApi();
String graphName = "graphName_example"; // String | The name of the graph (REQUIRED in case of multiple graph in the database).
Boolean builtin = true; // Boolean | trueEndpoints presinstalled in TigerGraph (like this one).
Boolean dynamic = true; // Boolean | trueEndpoints generated when installing GSQL queries.
Boolean _static = true; // Boolean | trueUser installed endpoints.
try {
    AnyObject result = apiInstance.endpoints(graphName, builtin, dynamic, _static);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiagnosticsApi#endpoints");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **graphName** | **String**| The name of the graph (REQUIRED in case of multiple graph in the database). |
 **builtin** | **Boolean**| trueEndpoints presinstalled in TigerGraph (like this one). | [optional]
 **dynamic** | **Boolean**| trueEndpoints generated when installing GSQL queries. | [optional]
 **_static** | **Boolean**| trueUser installed endpoints. | [optional]

### Return type

[**AnyObject**](AnyObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rebuildnowGet"></a>
# **rebuildnowGet**
> HelloResponse rebuildnowGet(graphName, threadnum, vertextype, segid, path, force)

Rebuild graph engine

In TigerGraph, when new data is being loaded into the graph (such as new vertices or edges),  data is first stored in memory before it is saved to disk permanently.  TigerGraph runs a rebuild of the Graph Processing Engine (GPE) to commit the data in memory to disk  every 30 seconds, but you can also call this endpoint to trigger a rebuild immediately. 

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.DiagnosticsApi;


DiagnosticsApi apiInstance = new DiagnosticsApi();
String graphName = "graphName_example"; // String | The name of the graph (REQUIRED in case of multiple graph in the database).
Integer threadnum = 56; // Integer | Number of threads used to execute the rebuild. If not specified, the number specified in the .tg.cfg file  (\"RebuildThreadNumber\") in the home directory of the server on which TigerGraph  is running will be used; it is set to 3 by default.  The maximum value for this parameter is the number of vCPUs per node in your distributed system.  If you are running a single-node server, the maximum is the number of vCPUs on that node.  You can run lscpu in the command line of your Linux server and look in the CPU(s)  column to view the number of vCPUs. 
String vertextype = "vertextype_example"; // String | Vertex type to perform the rebuild for. If not provided, the rebuild will be run for all the vertex types. 
Integer segid = 56; // Integer | Segment ID of the segments to rebuild. If not provided, all segments will be rebuilt.  In general, it is recommended not to provide this parameter and rebuild all segments. 
String path = "path_example"; // String | Path to save the summary of the rebuild to. If not provided, the default path is /tmp/rebuildnow 
Boolean force = true; // Boolean | Boolean value that indicates whether to perform rebuilds for segments for which there are no records of new data.  Normally, a rebuild would skip such segments, but if force is set true, the segments will not be skipped. 
try {
    HelloResponse result = apiInstance.rebuildnowGet(graphName, threadnum, vertextype, segid, path, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiagnosticsApi#rebuildnowGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **graphName** | **String**| The name of the graph (REQUIRED in case of multiple graph in the database). |
 **threadnum** | **Integer**| Number of threads used to execute the rebuild. If not specified, the number specified in the .tg.cfg file  (\&quot;RebuildThreadNumber\&quot;) in the home directory of the server on which TigerGraph  is running will be used; it is set to 3 by default.  The maximum value for this parameter is the number of vCPUs per node in your distributed system.  If you are running a single-node server, the maximum is the number of vCPUs on that node.  You can run lscpu in the command line of your Linux server and look in the CPU(s)  column to view the number of vCPUs.  | [optional]
 **vertextype** | **String**| Vertex type to perform the rebuild for. If not provided, the rebuild will be run for all the vertex types.  | [optional]
 **segid** | **Integer**| Segment ID of the segments to rebuild. If not provided, all segments will be rebuilt.  In general, it is recommended not to provide this parameter and rebuild all segments.  | [optional]
 **path** | **String**| Path to save the summary of the rebuild to. If not provided, the default path is /tmp/rebuildnow  | [optional]
 **force** | **Boolean**| Boolean value that indicates whether to perform rebuilds for segments for which there are no records of new data.  Normally, a rebuild would skip such segments, but if force is set true, the segments will not be skipped.  | [optional]

### Return type

[**HelloResponse**](HelloResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rebuildnowPost"></a>
# **rebuildnowPost**
> HelloResponse rebuildnowPost(graphName, threadnum, vertextype, segid, path, force)

Rebuild graph engine

In TigerGraph, when new data is being loaded into the graph (such as new vertices or edges),  data is first stored in memory before it is saved to disk permanently.  TigerGraph runs a rebuild of the Graph Processing Engine (GPE) to commit the data in memory to disk  every 30 seconds, but you can also call this endpoint to trigger a rebuild immediately. 

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.DiagnosticsApi;


DiagnosticsApi apiInstance = new DiagnosticsApi();
String graphName = "graphName_example"; // String | The name of the graph (REQUIRED in case of multiple graph in the database).
Integer threadnum = 56; // Integer | Number of threads used to execute the rebuild. If not specified, the number specified in the .tg.cfg file  (\"RebuildThreadNumber\") in the home directory of the server on which TigerGraph  is running will be used; it is set to 3 by default.  The maximum value for this parameter is the number of vCPUs per node in your distributed system.  If you are running a single-node server, the maximum is the number of vCPUs on that node.  You can run lscpu in the command line of your Linux server and look in the CPU(s)  column to view the number of vCPUs. 
String vertextype = "vertextype_example"; // String | Vertex type to perform the rebuild for. If not provided, the rebuild will be run for all the vertex types. 
Integer segid = 56; // Integer | Segment ID of the segments to rebuild. If not provided, all segments will be rebuilt.  In general, it is recommended not to provide this parameter and rebuild all segments. 
String path = "path_example"; // String | Path to save the summary of the rebuild to. If not provided, the default path is /tmp/rebuildnow 
Boolean force = true; // Boolean | Boolean value that indicates whether to perform rebuilds for segments for which there are no records of new data.  Normally, a rebuild would skip such segments, but if force is set true, the segments will not be skipped. 
try {
    HelloResponse result = apiInstance.rebuildnowPost(graphName, threadnum, vertextype, segid, path, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiagnosticsApi#rebuildnowPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **graphName** | **String**| The name of the graph (REQUIRED in case of multiple graph in the database). |
 **threadnum** | **Integer**| Number of threads used to execute the rebuild. If not specified, the number specified in the .tg.cfg file  (\&quot;RebuildThreadNumber\&quot;) in the home directory of the server on which TigerGraph  is running will be used; it is set to 3 by default.  The maximum value for this parameter is the number of vCPUs per node in your distributed system.  If you are running a single-node server, the maximum is the number of vCPUs on that node.  You can run lscpu in the command line of your Linux server and look in the CPU(s)  column to view the number of vCPUs.  | [optional]
 **vertextype** | **String**| Vertex type to perform the rebuild for. If not provided, the rebuild will be run for all the vertex types.  | [optional]
 **segid** | **Integer**| Segment ID of the segments to rebuild. If not provided, all segments will be rebuilt.  In general, it is recommended not to provide this parameter and rebuild all segments.  | [optional]
 **path** | **String**| Path to save the summary of the rebuild to. If not provided, the default path is /tmp/rebuildnow  | [optional]
 **force** | **Boolean**| Boolean value that indicates whether to perform rebuilds for segments for which there are no records of new data.  Normally, a rebuild would skip such segments, but if force is set true, the segments will not be skipped.  | [optional]

### Return type

[**HelloResponse**](HelloResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="statistics"></a>
# **statistics**
> StatisticsResponse statistics(graphName, seconds, segments)

Show query performance

Returns real-time query performance statistics over the given time period, as specified by the **seconds** parameter.  See: https://docs.tigergraph.com/tigergraph-server/current/api/built-in-endpoints#_show_query_performance 

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.DiagnosticsApi;


DiagnosticsApi apiInstance = new DiagnosticsApi();
String graphName = "graphName_example"; // String | The name of the graph (REQUIRED in case of multiple graph in the database).
Integer seconds = 56; // Integer | Duration of statistics collection (1 ≤ n ≤ 60).
Integer segments = 56; // Integer | Integer that indicates the number of segments that LatencyPercentile array in the response will be split into. The value for this endpoint must be between 1 and 100 and has a default value of 10. 
try {
    StatisticsResponse result = apiInstance.statistics(graphName, seconds, segments);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiagnosticsApi#statistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **graphName** | **String**| The name of the graph (REQUIRED in case of multiple graph in the database). |
 **seconds** | **Integer**| Duration of statistics collection (1 ≤ n ≤ 60). |
 **segments** | **Integer**| Integer that indicates the number of segments that LatencyPercentile array in the response will be split into. The value for this endpoint must be between 1 and 100 and has a default value of 10.  | [optional]

### Return type

[**StatisticsResponse**](StatisticsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="version"></a>
# **version**
> HelloResponse version(graphName)

Show component versions

This endpoint returns the GIT versions of all components of the system.  See: https://docs.tigergraph.com/tigergraph-server/current/api/built-in-endpoints#_show_component_versions 

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.DiagnosticsApi;


DiagnosticsApi apiInstance = new DiagnosticsApi();
String graphName = "graphName_example"; // String | The name of the graph (REQUIRED in case of multiple graph in the database).
try {
    HelloResponse result = apiInstance.version(graphName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiagnosticsApi#version");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **graphName** | **String**| The name of the graph (REQUIRED in case of multiple graph in the database). |

### Return type

[**HelloResponse**](HelloResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

