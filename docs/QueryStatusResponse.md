# QueryStatusResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | [**Version**](Version.md) |  | 
**error** | **Boolean** |  | 
**message** | **String** |  | 
**results** | [**List&lt;QueryStatusItem&gt;**](QueryStatusItem.md) |  | 
**unknownRequestid** | **List&lt;String&gt;** | If one or more of the provided query IDs (requestid) are invalid, the return JSON will include an unknown_requestid field containing all the invalid query IDs. If a query ID is marked as unknown, it means either the query does not exist or that it was not run in Detached Mode.  |  [optional]
**code** | **String** |  | 
