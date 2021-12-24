# DefaultApi

All URIs are relative to *http://192.168.0.105:9000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**abortqueryGraphNameGet**](DefaultApi.md#abortqueryGraphNameGet) | **GET** /abortquery/{graph_name} | TBD
[**abortqueryGraphNamePost**](DefaultApi.md#abortqueryGraphNamePost) | **POST** /abortquery/{graph_name} | TBD
[**allpathsGraphNameGet**](DefaultApi.md#allpathsGraphNameGet) | **GET** /allpaths/{graph_name} | TBD
[**allpathsGraphNamePost**](DefaultApi.md#allpathsGraphNamePost) | **POST** /allpaths/{graph_name} | TBD
[**builtinsGraphNamePost**](DefaultApi.md#builtinsGraphNamePost) | **POST** /builtins/{graph_name} | TBD
[**ddlGraphNamePost**](DefaultApi.md#ddlGraphNamePost) | **POST** /ddl/{graph_name} | TBD
[**deletedVertexCheckGraphNameGet**](DefaultApi.md#deletedVertexCheckGraphNameGet) | **GET** /deleted_vertex_check/{graph_name} | TBD
[**deletedVertexCheckGraphNamePost**](DefaultApi.md#deletedVertexCheckGraphNamePost) | **POST** /deleted_vertex_check/{graph_name} | TBD
[**graphDeleteByTypeVerticesVertexTypeDelete**](DefaultApi.md#graphDeleteByTypeVerticesVertexTypeDelete) | **DELETE** /graph/delete_by_type/vertices/{vertex_type}/ | TBD
[**graphEdgesSourceVertexTypeSourceVertexIdEdgeTypeTargetVertexTypeTargetVertexIdDelete**](DefaultApi.md#graphEdgesSourceVertexTypeSourceVertexIdEdgeTypeTargetVertexTypeTargetVertexIdDelete) | **DELETE** /graph/edges/{source_vertex_type}/{source_vertex_id}/{edge_type}/{target_vertex_type}/{target_vertex_id} | TBD
[**graphEdgesSourceVertexTypeSourceVertexIdEdgeTypeTargetVertexTypeTargetVertexIdGet**](DefaultApi.md#graphEdgesSourceVertexTypeSourceVertexIdEdgeTypeTargetVertexTypeTargetVertexIdGet) | **GET** /graph/edges/{source_vertex_type}/{source_vertex_id}/{edge_type}/{target_vertex_type}/{target_vertex_id} | TBD
[**graphGraphNameDeleteByTypeVerticesVertexTypeDelete**](DefaultApi.md#graphGraphNameDeleteByTypeVerticesVertexTypeDelete) | **DELETE** /graph/{graph_name}/delete_by_type/vertices/{vertex_type}/ | TBD
[**graphGraphNameEdgesSourceVertexTypeSourceVertexIdEdgeTypeTargetVertexTypeTargetVertexIdDelete**](DefaultApi.md#graphGraphNameEdgesSourceVertexTypeSourceVertexIdEdgeTypeTargetVertexTypeTargetVertexIdDelete) | **DELETE** /graph/{graph_name}/edges/{source_vertex_type}/{source_vertex_id}/{edge_type}/{target_vertex_type}/{target_vertex_id} | TBD
[**graphGraphNameEdgesSourceVertexTypeSourceVertexIdEdgeTypeTargetVertexTypeTargetVertexIdGet**](DefaultApi.md#graphGraphNameEdgesSourceVertexTypeSourceVertexIdEdgeTypeTargetVertexTypeTargetVertexIdGet) | **GET** /graph/{graph_name}/edges/{source_vertex_type}/{source_vertex_id}/{edge_type}/{target_vertex_type}/{target_vertex_id} | TBD
[**graphGraphNamePost**](DefaultApi.md#graphGraphNamePost) | **POST** /graph/{graph_name} | TBD
[**graphGraphNameVerticesVertexTypeVertexIdDelete**](DefaultApi.md#graphGraphNameVerticesVertexTypeVertexIdDelete) | **DELETE** /graph/{graph_name}/vertices/{vertex_type}/{vertex_id} | TBD
[**graphGraphNameVerticesVertexTypeVertexIdGet**](DefaultApi.md#graphGraphNameVerticesVertexTypeVertexIdGet) | **GET** /graph/{graph_name}/vertices/{vertex_type}/{vertex_id} | TBD
[**graphVerticesVertexTypeVertexIdDelete**](DefaultApi.md#graphVerticesVertexTypeVertexIdDelete) | **DELETE** /graph/vertices/{vertex_type}/{vertex_id} | TBD
[**graphVerticesVertexTypeVertexIdGet**](DefaultApi.md#graphVerticesVertexTypeVertexIdGet) | **GET** /graph/vertices/{vertex_type}/{vertex_id} | TBD
[**queryResultRequestidGet**](DefaultApi.md#queryResultRequestidGet) | **GET** /query_result/{requestid} | TBD
[**queryStatusGraphNameGet**](DefaultApi.md#queryStatusGraphNameGet) | **GET** /query_status/{graph_name} | TBD
[**restpploaderGraphNamePost**](DefaultApi.md#restpploaderGraphNamePost) | **POST** /restpploader/{graph_name} | TBD
[**shortestpathGraphNameGet**](DefaultApi.md#shortestpathGraphNameGet) | **GET** /shortestpath/{graph_name} | TBD
[**shortestpathGraphNamePost**](DefaultApi.md#shortestpathGraphNamePost) | **POST** /shortestpath/{graph_name} | TBD
[**showlicenseinfoGraphNameGet**](DefaultApi.md#showlicenseinfoGraphNameGet) | **GET** /showlicenseinfo/{graph_name} | TBD
[**showprocesslistGraphNameGet**](DefaultApi.md#showprocesslistGraphNameGet) | **GET** /showprocesslist/{graph_name} | TBD
[**showprocesslistGraphNamePost**](DefaultApi.md#showprocesslistGraphNamePost) | **POST** /showprocesslist/{graph_name} | TBD

<a name="abortqueryGraphNameGet"></a>
# **abortqueryGraphNameGet**
> HelloResponse abortqueryGraphNameGet(graphName)

TBD

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String graphName = "graphName_example"; // String | The name of the graph (REQUIRED in case of multiple graph in the database).
try {
    HelloResponse result = apiInstance.abortqueryGraphNameGet(graphName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#abortqueryGraphNameGet");
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

<a name="abortqueryGraphNamePost"></a>
# **abortqueryGraphNamePost**
> HelloResponse abortqueryGraphNamePost(graphName)

TBD

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String graphName = "graphName_example"; // String | The name of the graph (REQUIRED in case of multiple graph in the database).
try {
    HelloResponse result = apiInstance.abortqueryGraphNamePost(graphName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#abortqueryGraphNamePost");
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

<a name="allpathsGraphNameGet"></a>
# **allpathsGraphNameGet**
> HelloResponse allpathsGraphNameGet(graphName)

TBD

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String graphName = "graphName_example"; // String | The name of the graph (REQUIRED in case of multiple graph in the database).
try {
    HelloResponse result = apiInstance.allpathsGraphNameGet(graphName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#allpathsGraphNameGet");
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

<a name="allpathsGraphNamePost"></a>
# **allpathsGraphNamePost**
> HelloResponse allpathsGraphNamePost(graphName)

TBD

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String graphName = "graphName_example"; // String | The name of the graph (REQUIRED in case of multiple graph in the database).
try {
    HelloResponse result = apiInstance.allpathsGraphNamePost(graphName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#allpathsGraphNamePost");
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

<a name="builtinsGraphNamePost"></a>
# **builtinsGraphNamePost**
> HelloResponse builtinsGraphNamePost(graphName)

TBD

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String graphName = "graphName_example"; // String | The name of the graph (REQUIRED in case of multiple graph in the database).
try {
    HelloResponse result = apiInstance.builtinsGraphNamePost(graphName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#builtinsGraphNamePost");
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

<a name="ddlGraphNamePost"></a>
# **ddlGraphNamePost**
> HelloResponse ddlGraphNamePost(graphName)

TBD

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String graphName = "graphName_example"; // String | The name of the graph (REQUIRED in case of multiple graph in the database).
try {
    HelloResponse result = apiInstance.ddlGraphNamePost(graphName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ddlGraphNamePost");
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

<a name="deletedVertexCheckGraphNameGet"></a>
# **deletedVertexCheckGraphNameGet**
> HelloResponse deletedVertexCheckGraphNameGet(graphName)

TBD

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String graphName = "graphName_example"; // String | The name of the graph (REQUIRED in case of multiple graph in the database).
try {
    HelloResponse result = apiInstance.deletedVertexCheckGraphNameGet(graphName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deletedVertexCheckGraphNameGet");
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

<a name="deletedVertexCheckGraphNamePost"></a>
# **deletedVertexCheckGraphNamePost**
> HelloResponse deletedVertexCheckGraphNamePost(graphName)

TBD

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String graphName = "graphName_example"; // String | The name of the graph (REQUIRED in case of multiple graph in the database).
try {
    HelloResponse result = apiInstance.deletedVertexCheckGraphNamePost(graphName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deletedVertexCheckGraphNamePost");
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

<a name="graphDeleteByTypeVerticesVertexTypeDelete"></a>
# **graphDeleteByTypeVerticesVertexTypeDelete**
> HelloResponse graphDeleteByTypeVerticesVertexTypeDelete(vertexType)

TBD

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String vertexType = "vertexType_example"; // String | The type of vertex.
try {
    HelloResponse result = apiInstance.graphDeleteByTypeVerticesVertexTypeDelete(vertexType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#graphDeleteByTypeVerticesVertexTypeDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vertexType** | **String**| The type of vertex. |

### Return type

[**HelloResponse**](HelloResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="graphEdgesSourceVertexTypeSourceVertexIdEdgeTypeTargetVertexTypeTargetVertexIdDelete"></a>
# **graphEdgesSourceVertexTypeSourceVertexIdEdgeTypeTargetVertexTypeTargetVertexIdDelete**
> HelloResponse graphEdgesSourceVertexTypeSourceVertexIdEdgeTypeTargetVertexTypeTargetVertexIdDelete(sourceVertexType, edgeType, targetVertexType, sourceVertexId, targetVertexId)

TBD

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String sourceVertexType = "sourceVertexType_example"; // String | The type of vertex.
String edgeType = "edgeType_example"; // String | The type name of the edges.  *Note:* Use \"_\" for edge_type in the URL to permit any edge type. 
String targetVertexType = "targetVertexType_example"; // String | The type of vertex.
String sourceVertexId = "sourceVertexId_example"; // String | The ID of the vertex.
String targetVertexId = "targetVertexId_example"; // String | The ID of the vertex.
try {
    HelloResponse result = apiInstance.graphEdgesSourceVertexTypeSourceVertexIdEdgeTypeTargetVertexTypeTargetVertexIdDelete(sourceVertexType, edgeType, targetVertexType, sourceVertexId, targetVertexId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#graphEdgesSourceVertexTypeSourceVertexIdEdgeTypeTargetVertexTypeTargetVertexIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sourceVertexType** | **String**| The type of vertex. |
 **edgeType** | **String**| The type name of the edges.  *Note:* Use \&quot;_\&quot; for edge_type in the URL to permit any edge type.  |
 **targetVertexType** | **String**| The type of vertex. |
 **sourceVertexId** | **String**| The ID of the vertex. |
 **targetVertexId** | **String**| The ID of the vertex. |

### Return type

[**HelloResponse**](HelloResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="graphEdgesSourceVertexTypeSourceVertexIdEdgeTypeTargetVertexTypeTargetVertexIdGet"></a>
# **graphEdgesSourceVertexTypeSourceVertexIdEdgeTypeTargetVertexTypeTargetVertexIdGet**
> HelloResponse graphEdgesSourceVertexTypeSourceVertexIdEdgeTypeTargetVertexTypeTargetVertexIdGet(sourceVertexType, edgeType, targetVertexType, sourceVertexId, targetVertexId)

TBD

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String sourceVertexType = "sourceVertexType_example"; // String | The type of vertex.
String edgeType = "edgeType_example"; // String | The type name of the edges.  *Note:* Use \"_\" for edge_type in the URL to permit any edge type. 
String targetVertexType = "targetVertexType_example"; // String | The type of vertex.
String sourceVertexId = "sourceVertexId_example"; // String | The ID of the vertex.
String targetVertexId = "targetVertexId_example"; // String | The ID of the vertex.
try {
    HelloResponse result = apiInstance.graphEdgesSourceVertexTypeSourceVertexIdEdgeTypeTargetVertexTypeTargetVertexIdGet(sourceVertexType, edgeType, targetVertexType, sourceVertexId, targetVertexId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#graphEdgesSourceVertexTypeSourceVertexIdEdgeTypeTargetVertexTypeTargetVertexIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sourceVertexType** | **String**| The type of vertex. |
 **edgeType** | **String**| The type name of the edges.  *Note:* Use \&quot;_\&quot; for edge_type in the URL to permit any edge type.  |
 **targetVertexType** | **String**| The type of vertex. |
 **sourceVertexId** | **String**| The ID of the vertex. |
 **targetVertexId** | **String**| The ID of the vertex. |

### Return type

[**HelloResponse**](HelloResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="graphGraphNameDeleteByTypeVerticesVertexTypeDelete"></a>
# **graphGraphNameDeleteByTypeVerticesVertexTypeDelete**
> HelloResponse graphGraphNameDeleteByTypeVerticesVertexTypeDelete(graphName, vertexType)

TBD

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String graphName = "graphName_example"; // String | The name of the graph (REQUIRED in case of multiple graph in the database).
String vertexType = "vertexType_example"; // String | The type of vertex.
try {
    HelloResponse result = apiInstance.graphGraphNameDeleteByTypeVerticesVertexTypeDelete(graphName, vertexType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#graphGraphNameDeleteByTypeVerticesVertexTypeDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **graphName** | **String**| The name of the graph (REQUIRED in case of multiple graph in the database). |
 **vertexType** | **String**| The type of vertex. |

### Return type

[**HelloResponse**](HelloResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="graphGraphNameEdgesSourceVertexTypeSourceVertexIdEdgeTypeTargetVertexTypeTargetVertexIdDelete"></a>
# **graphGraphNameEdgesSourceVertexTypeSourceVertexIdEdgeTypeTargetVertexTypeTargetVertexIdDelete**
> HelloResponse graphGraphNameEdgesSourceVertexTypeSourceVertexIdEdgeTypeTargetVertexTypeTargetVertexIdDelete(graphName, edgeType, targetVertexType, sourceVertexType, sourceVertexId, targetVertexId)

TBD

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String graphName = "graphName_example"; // String | The name of the graph (REQUIRED in case of multiple graph in the database).
String edgeType = "edgeType_example"; // String | The type name of the edges.  *Note:* Use \"_\" for edge_type in the URL to permit any edge type. 
String targetVertexType = "targetVertexType_example"; // String | The type of vertex.
String sourceVertexType = "sourceVertexType_example"; // String | The type of vertex.
String sourceVertexId = "sourceVertexId_example"; // String | The ID of the vertex.
String targetVertexId = "targetVertexId_example"; // String | The ID of the vertex.
try {
    HelloResponse result = apiInstance.graphGraphNameEdgesSourceVertexTypeSourceVertexIdEdgeTypeTargetVertexTypeTargetVertexIdDelete(graphName, edgeType, targetVertexType, sourceVertexType, sourceVertexId, targetVertexId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#graphGraphNameEdgesSourceVertexTypeSourceVertexIdEdgeTypeTargetVertexTypeTargetVertexIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **graphName** | **String**| The name of the graph (REQUIRED in case of multiple graph in the database). |
 **edgeType** | **String**| The type name of the edges.  *Note:* Use \&quot;_\&quot; for edge_type in the URL to permit any edge type.  |
 **targetVertexType** | **String**| The type of vertex. |
 **sourceVertexType** | **String**| The type of vertex. |
 **sourceVertexId** | **String**| The ID of the vertex. |
 **targetVertexId** | **String**| The ID of the vertex. |

### Return type

[**HelloResponse**](HelloResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="graphGraphNameEdgesSourceVertexTypeSourceVertexIdEdgeTypeTargetVertexTypeTargetVertexIdGet"></a>
# **graphGraphNameEdgesSourceVertexTypeSourceVertexIdEdgeTypeTargetVertexTypeTargetVertexIdGet**
> HelloResponse graphGraphNameEdgesSourceVertexTypeSourceVertexIdEdgeTypeTargetVertexTypeTargetVertexIdGet(graphName, edgeType, targetVertexType, sourceVertexType, sourceVertexId, targetVertexId)

TBD

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String graphName = "graphName_example"; // String | The name of the graph (REQUIRED in case of multiple graph in the database).
String edgeType = "edgeType_example"; // String | The type name of the edges.  *Note:* Use \"_\" for edge_type in the URL to permit any edge type. 
String targetVertexType = "targetVertexType_example"; // String | The type of vertex.
String sourceVertexType = "sourceVertexType_example"; // String | The type of vertex.
String sourceVertexId = "sourceVertexId_example"; // String | The ID of the vertex.
String targetVertexId = "targetVertexId_example"; // String | The ID of the vertex.
try {
    HelloResponse result = apiInstance.graphGraphNameEdgesSourceVertexTypeSourceVertexIdEdgeTypeTargetVertexTypeTargetVertexIdGet(graphName, edgeType, targetVertexType, sourceVertexType, sourceVertexId, targetVertexId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#graphGraphNameEdgesSourceVertexTypeSourceVertexIdEdgeTypeTargetVertexTypeTargetVertexIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **graphName** | **String**| The name of the graph (REQUIRED in case of multiple graph in the database). |
 **edgeType** | **String**| The type name of the edges.  *Note:* Use \&quot;_\&quot; for edge_type in the URL to permit any edge type.  |
 **targetVertexType** | **String**| The type of vertex. |
 **sourceVertexType** | **String**| The type of vertex. |
 **sourceVertexId** | **String**| The ID of the vertex. |
 **targetVertexId** | **String**| The ID of the vertex. |

### Return type

[**HelloResponse**](HelloResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="graphGraphNamePost"></a>
# **graphGraphNamePost**
> HelloResponse graphGraphNamePost(graphName)

TBD

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String graphName = "graphName_example"; // String | The name of the graph (REQUIRED in case of multiple graph in the database).
try {
    HelloResponse result = apiInstance.graphGraphNamePost(graphName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#graphGraphNamePost");
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

<a name="graphGraphNameVerticesVertexTypeVertexIdDelete"></a>
# **graphGraphNameVerticesVertexTypeVertexIdDelete**
> HelloResponse graphGraphNameVerticesVertexTypeVertexIdDelete(graphName, vertexType, vertexId)

TBD

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String graphName = "graphName_example"; // String | The name of the graph (REQUIRED in case of multiple graph in the database).
String vertexType = "vertexType_example"; // String | The type of vertex.
String vertexId = "vertexId_example"; // String | The ID of the vertex.
try {
    HelloResponse result = apiInstance.graphGraphNameVerticesVertexTypeVertexIdDelete(graphName, vertexType, vertexId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#graphGraphNameVerticesVertexTypeVertexIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **graphName** | **String**| The name of the graph (REQUIRED in case of multiple graph in the database). |
 **vertexType** | **String**| The type of vertex. |
 **vertexId** | **String**| The ID of the vertex. |

### Return type

[**HelloResponse**](HelloResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="graphGraphNameVerticesVertexTypeVertexIdGet"></a>
# **graphGraphNameVerticesVertexTypeVertexIdGet**
> HelloResponse graphGraphNameVerticesVertexTypeVertexIdGet(graphName, vertexType, vertexId)

TBD

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String graphName = "graphName_example"; // String | The name of the graph (REQUIRED in case of multiple graph in the database).
String vertexType = "vertexType_example"; // String | The type of vertex.
String vertexId = "vertexId_example"; // String | The ID of the vertex.
try {
    HelloResponse result = apiInstance.graphGraphNameVerticesVertexTypeVertexIdGet(graphName, vertexType, vertexId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#graphGraphNameVerticesVertexTypeVertexIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **graphName** | **String**| The name of the graph (REQUIRED in case of multiple graph in the database). |
 **vertexType** | **String**| The type of vertex. |
 **vertexId** | **String**| The ID of the vertex. |

### Return type

[**HelloResponse**](HelloResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="graphVerticesVertexTypeVertexIdDelete"></a>
# **graphVerticesVertexTypeVertexIdDelete**
> HelloResponse graphVerticesVertexTypeVertexIdDelete(vertexType, vertexId)

TBD

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String vertexType = "vertexType_example"; // String | The type of vertex.
String vertexId = "vertexId_example"; // String | The ID of the vertex.
try {
    HelloResponse result = apiInstance.graphVerticesVertexTypeVertexIdDelete(vertexType, vertexId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#graphVerticesVertexTypeVertexIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vertexType** | **String**| The type of vertex. |
 **vertexId** | **String**| The ID of the vertex. |

### Return type

[**HelloResponse**](HelloResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="graphVerticesVertexTypeVertexIdGet"></a>
# **graphVerticesVertexTypeVertexIdGet**
> HelloResponse graphVerticesVertexTypeVertexIdGet(vertexType, vertexId)

TBD

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String vertexType = "vertexType_example"; // String | The type of vertex.
String vertexId = "vertexId_example"; // String | The ID of the vertex.
try {
    HelloResponse result = apiInstance.graphVerticesVertexTypeVertexIdGet(vertexType, vertexId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#graphVerticesVertexTypeVertexIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vertexType** | **String**| The type of vertex. |
 **vertexId** | **String**| The ID of the vertex. |

### Return type

[**HelloResponse**](HelloResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="queryResultRequestidGet"></a>
# **queryResultRequestidGet**
> HelloResponse queryResultRequestidGet(requestid)

TBD

This endpoint allows you to check the results of queries run in Detached Mode if they have finished running. If the query is still running, the endpoint will respond with an error and a message saying \&quot;Unable to retrieve result for query &lt;requestid&gt;\&quot;. Ensure that the query is finished before checking its result. 

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String requestid = "requestid_example"; // String | The id of a query request.
try {
    HelloResponse result = apiInstance.queryResultRequestidGet(requestid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#queryResultRequestidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestid** | **String**| The id of a query request. |

### Return type

[**HelloResponse**](HelloResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="queryStatusGraphNameGet"></a>
# **queryStatusGraphNameGet**
> HelloResponse queryStatusGraphNameGet(graphName)

TBD

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String graphName = "graphName_example"; // String | The name of the graph (REQUIRED in case of multiple graph in the database).
try {
    HelloResponse result = apiInstance.queryStatusGraphNameGet(graphName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#queryStatusGraphNameGet");
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

<a name="restpploaderGraphNamePost"></a>
# **restpploaderGraphNamePost**
> HelloResponse restpploaderGraphNamePost(graphName)

TBD

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String graphName = "graphName_example"; // String | The name of the graph (REQUIRED in case of multiple graph in the database).
try {
    HelloResponse result = apiInstance.restpploaderGraphNamePost(graphName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#restpploaderGraphNamePost");
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

<a name="shortestpathGraphNameGet"></a>
# **shortestpathGraphNameGet**
> HelloResponse shortestpathGraphNameGet(graphName)

TBD

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String graphName = "graphName_example"; // String | The name of the graph (REQUIRED in case of multiple graph in the database).
try {
    HelloResponse result = apiInstance.shortestpathGraphNameGet(graphName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#shortestpathGraphNameGet");
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

<a name="shortestpathGraphNamePost"></a>
# **shortestpathGraphNamePost**
> HelloResponse shortestpathGraphNamePost(graphName)

TBD

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String graphName = "graphName_example"; // String | The name of the graph (REQUIRED in case of multiple graph in the database).
try {
    HelloResponse result = apiInstance.shortestpathGraphNamePost(graphName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#shortestpathGraphNamePost");
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

<a name="showlicenseinfoGraphNameGet"></a>
# **showlicenseinfoGraphNameGet**
> HelloResponse showlicenseinfoGraphNameGet(graphName)

TBD

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String graphName = "graphName_example"; // String | The name of the graph (REQUIRED in case of multiple graph in the database).
try {
    HelloResponse result = apiInstance.showlicenseinfoGraphNameGet(graphName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#showlicenseinfoGraphNameGet");
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

<a name="showprocesslistGraphNameGet"></a>
# **showprocesslistGraphNameGet**
> HelloResponse showprocesslistGraphNameGet(graphName)

TBD

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String graphName = "graphName_example"; // String | The name of the graph (REQUIRED in case of multiple graph in the database).
try {
    HelloResponse result = apiInstance.showprocesslistGraphNameGet(graphName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#showprocesslistGraphNameGet");
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

<a name="showprocesslistGraphNamePost"></a>
# **showprocesslistGraphNamePost**
> HelloResponse showprocesslistGraphNamePost(graphName)

TBD

### Example
```java
// Import classes:
//import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
//import io.github.karol_brejna_i.tigergraph.restppclient.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String graphName = "graphName_example"; // String | The name of the graph (REQUIRED in case of multiple graph in the database).
try {
    HelloResponse result = apiInstance.showprocesslistGraphNamePost(graphName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#showprocesslistGraphNamePost");
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

