# DoneApi

All URIs are relative to *http://192.168.0.105:9000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**runInstalledQueryGet**](DoneApi.md#runInstalledQueryGet) | **GET** /query/{graph_name}/{query_name} | Run an installed query
[**runInstalledQueryPost**](DoneApi.md#runInstalledQueryPost) | **POST** /query/{graph_name}/{query_name} | Run an installed query

<a name="runInstalledQueryGet"></a>
# **runInstalledQueryGet**
> QueryResponse runInstalledQueryGet(graphName, queryName, GSQL_REPLICA, GSQL_THREAD_LIMIT, GSQL_TIMEOUT, RESPONSE_LIMIT, readCommitted, params)

Run an installed query

Each time a new TigerGraph query is installed, a dynamic endpoint is generated. This new endpoint enables the user to run the new TigerGraph query through HTTP requests and giving the parameters in URL or in a data payload. In the case of a GET request, parameters should be passed in through the query string. 

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.DoneApi;


DoneApi apiInstance = new DoneApi();
String graphName = "graphName_example"; // String | Graph name
String queryName = "queryName_example"; // String | Query name
BigDecimal GSQL_REPLICA = new BigDecimal(); // BigDecimal | f you have a TigerGraph HA cluster, you can specify a query to run on a particular replica with the HTTP header GSQL-REPLICA. The value of the header needs to be an integer within the range one to the replication factor of the cluster. If you supply a invalid value for the header, the request will return an error. 
BigDecimal GSQL_THREAD_LIMIT = new BigDecimal(); // BigDecimal | When running a query through RESTPP, you can specify a limit on the number of threads that the query is allowed to use on each node. The number of threads used by a query means the number of vCPUs used by the query. By default, a query will use all threads that are available on a machine. 
BigDecimal GSQL_TIMEOUT = new BigDecimal(); // BigDecimal | 
BigDecimal RESPONSE_LIMIT = new BigDecimal(); // BigDecimal | 
Boolean readCommitted = true; // Boolean | Boolean value that indicates whether to use read-committed isolation level for the query. At the read committed level, it is guaranteed that any data read is committed at the moment it is read. By default, it is off. 
Map<String, String> params = new HashMap(); // Map<String, String> | When using a GET request to run an installed query, the query parameters are passed in through the query string of the URL. 
try {
    QueryResponse result = apiInstance.runInstalledQueryGet(graphName, queryName, GSQL_REPLICA, GSQL_THREAD_LIMIT, GSQL_TIMEOUT, RESPONSE_LIMIT, readCommitted, params);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DoneApi#runInstalledQueryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **graphName** | **String**| Graph name |
 **queryName** | **String**| Query name |
 **GSQL_REPLICA** | **BigDecimal**| f you have a TigerGraph HA cluster, you can specify a query to run on a particular replica with the HTTP header GSQL-REPLICA. The value of the header needs to be an integer within the range one to the replication factor of the cluster. If you supply a invalid value for the header, the request will return an error.  | [optional]
 **GSQL_THREAD_LIMIT** | **BigDecimal**| When running a query through RESTPP, you can specify a limit on the number of threads that the query is allowed to use on each node. The number of threads used by a query means the number of vCPUs used by the query. By default, a query will use all threads that are available on a machine.  | [optional]
 **GSQL_TIMEOUT** | **BigDecimal**|  | [optional]
 **RESPONSE_LIMIT** | **BigDecimal**|  | [optional]
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
> QueryResponse runInstalledQueryPost(graphName, queryName, body, GSQL_REPLICA, GSQL_THREAD_LIMIT, GSQL_TIMEOUT, RESPONSE_LIMIT, readCommitted)

Run an installed query

Each time a new TigerGraph query is installed, a dynamic endpoint is generated. This new endpoint enables the user to run the new TigerGraph query through HTTP requests and giving the parameters in URL or in a data payload.  Users can run queries through a POST request, which allows them to pass query parameters in JSON. This is especially helpful when the query takes complex parameters. 

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.DoneApi;


DoneApi apiInstance = new DoneApi();
String graphName = "graphName_example"; // String | Graph name
String queryName = "queryName_example"; // String | Query name
Object body = null; // Object | Optional description in *Markdown*
BigDecimal GSQL_REPLICA = new BigDecimal(); // BigDecimal | f you have a TigerGraph HA cluster, you can specify a query to run on a particular replica with the HTTP header GSQL-REPLICA. The value of the header needs to be an integer within the range one to the replication factor of the cluster. If you supply a invalid value for the header, the request will return an error. 
BigDecimal GSQL_THREAD_LIMIT = new BigDecimal(); // BigDecimal | When running a query through RESTPP, you can specify a limit on the number of threads that the query is allowed to use on each node. The number of threads used by a query means the number of vCPUs used by the query. By default, a query will use all threads that are available on a machine. 
BigDecimal GSQL_TIMEOUT = new BigDecimal(); // BigDecimal | 
BigDecimal RESPONSE_LIMIT = new BigDecimal(); // BigDecimal | 
Boolean readCommitted = true; // Boolean | Boolean value that indicates whether to use read-committed isolation level for the query. At the read committed level, it is guaranteed that any data read is committed at the moment it is read. By default, it is off. 
try {
    QueryResponse result = apiInstance.runInstalledQueryPost(graphName, queryName, body, GSQL_REPLICA, GSQL_THREAD_LIMIT, GSQL_TIMEOUT, RESPONSE_LIMIT, readCommitted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DoneApi#runInstalledQueryPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **graphName** | **String**| Graph name |
 **queryName** | **String**| Query name |
 **body** | [**Object**](Object.md)| Optional description in *Markdown* | [optional]
 **GSQL_REPLICA** | **BigDecimal**| f you have a TigerGraph HA cluster, you can specify a query to run on a particular replica with the HTTP header GSQL-REPLICA. The value of the header needs to be an integer within the range one to the replication factor of the cluster. If you supply a invalid value for the header, the request will return an error.  | [optional]
 **GSQL_THREAD_LIMIT** | **BigDecimal**| When running a query through RESTPP, you can specify a limit on the number of threads that the query is allowed to use on each node. The number of threads used by a query means the number of vCPUs used by the query. By default, a query will use all threads that are available on a machine.  | [optional]
 **GSQL_TIMEOUT** | **BigDecimal**|  | [optional]
 **RESPONSE_LIMIT** | **BigDecimal**|  | [optional]
 **readCommitted** | **Boolean**| Boolean value that indicates whether to use read-committed isolation level for the query. At the read committed level, it is guaranteed that any data read is committed at the moment it is read. By default, it is off.  | [optional]

### Return type

[**QueryResponse**](QueryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

