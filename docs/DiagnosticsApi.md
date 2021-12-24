# DiagnosticsApi

All URIs are relative to *http://192.168.0.105:9000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**echoGet**](DiagnosticsApi.md#echoGet) | **GET** /echo/{graph_name} | Echo
[**echoPost**](DiagnosticsApi.md#echoPost) | **POST** /echo/{graph_name} | Echo
[**endpoints**](DiagnosticsApi.md#endpoints) | **GET** /endpoints/{graph_name} | List all endpoints
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
> HelloResponse endpoints(graphName, builtin, dynamic, _static)

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
    HelloResponse result = apiInstance.endpoints(graphName, builtin, dynamic, _static);
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

