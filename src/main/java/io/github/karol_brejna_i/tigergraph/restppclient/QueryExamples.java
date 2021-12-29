package io.github.karol_brejna_i.tigergraph.restppclient;


import com.squareup.okhttp.Call;
import io.github.karol_brejna_i.tigergraph.restppclient.api.QueryApi;
import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiCallback;
import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiClient;
import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
import io.github.karol_brejna_i.tigergraph.restppclient.invoker.Configuration;
import io.github.karol_brejna_i.tigergraph.restppclient.model.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// CREATE QUERY a() FOR GRAPH mygraph {
//  INT iter = 0;
//  while true DO
//    iter = iter + 1;
//    if iter > 10000 then iter = 0; end;
//  END;
//  print "koniec";
// }
// CREATE QUERY aa() FOR GRAPH mygraph {
//  PRINT "aa works!";
// }
public class QueryExamples {

    private static final String graphName = "mygraph";

    static {
        ApiClient defaultApiClient = Configuration.getDefaultApiClient();
        defaultApiClient.setBasePath("http://172.28.101.214:9000");
        Configuration.setDefaultApiClient(defaultApiClient);
    }

    public static void queryGet() {
        System.out.println("query get");
        QueryApi apiInstance = new QueryApi();
        HashMap<String, String> personId = new HashMap<String, String>();
        personId.put("personId", "30786325583618");
        personId.put("type", "Person");

        HashMap<String, String> body = new HashMap<String, String>();
        body.put("firstName", "Chau");
        body.put("personId", "30786325583618");
        QueryResponse result = null;
        try {
            //    private static final String graphName = "LDBC_SNB";
            result = apiInstance.runInstalledQueryGet(graphName, "interactiveComplex1", body);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#echoGraphNamePost");
            e.printStackTrace();
        }
        System.out.println(result);
    }

    public static void listProcessGet() {
        System.out.println("listProcessGet");
        QueryApi apiInstance = new QueryApi();
        ProcessListResponse result = null;
        try {
            result = apiInstance.showProcessListGet(graphName);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#echoGraphNamePost");
            e.printStackTrace();
        }
        System.out.println(result);
    }

    public static void runQueryGet(String queryName) {
        System.out.println("runQueryGet");
        QueryApi apiInstance = new QueryApi();

        if (queryName == null) {
            queryName = "aa";
        }
        QueryResponse result = null;
        try {
            result = apiInstance.runInstalledQueryGet(graphName, queryName,
                    null, null, null, null, null, null, null);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#runQueryGet");
            e.printStackTrace();
        }
        System.out.println(result);
    }

    public static String runQueryDetachedGet(String queryName) {
        System.out.println("runQueryGet");
        QueryApi apiInstance = new QueryApi();

        if (queryName == null) {
            queryName = "aa";
        }
        QueryResponse result = null;
        try {
            result = apiInstance.runInstalledQueryGet(graphName, queryName,
                    null, null, null, true, null, null,
                    null);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#runQueryGet");
            e.printStackTrace();
        }
        System.out.println(result);
        String requestId = null;
        if (result != null) {
            requestId = result.getRequestId();
        }
        return requestId;
    }

    public static void runQueryGetAsync(String queryName) {
        System.out.println("runQueryGetAsync");
        QueryApi apiInstance = new QueryApi();

        if (queryName == null) {
            queryName = "aa";
        }
        Call result = null;
        try {
            ApiCallback<QueryResponse> cb = new ApiCallback<QueryResponse>() {
                @Override
                public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                    System.out.println("--------ERROR!");
                    System.out.println(e);
                }

                @Override
                public void onSuccess(QueryResponse result, int statusCode, Map<String, List<String>> responseHeaders) {
                    System.out.println("--------SUCCESS!");
                    System.out.println(result);
                }

                @Override
                public void onUploadProgress(long bytesWritten, long contentLength, boolean done) {
                }

                @Override
                public void onDownloadProgress(long bytesRead, long contentLength, boolean done) {
                }
            };

            result = apiInstance.runInstalledQueryGetAsync(graphName, queryName,
                    null, null, 100 * 1000, null, null, null,
                    null, cb);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#runQueryGet");
            e.printStackTrace();
        }
        System.out.println(result);
    }

    public static void abortQuery(String requestId) {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        QueryApi apiInstance = new QueryApi();
        AbortQueryResponse result = null;
        if (requestId == null) {
            requestId = "all";
        }
        try {
            result = apiInstance.abortQueryGet(graphName, requestId);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#abortQuery");
            e.printStackTrace();
        }
        System.out.println(result);
    }

    public static void queryStatus(String requestId) {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        QueryApi apiInstance = new QueryApi();

        if (requestId == null) {
            requestId = "all";
        }
        QueryStatusResponse result = null;
        try {
            result = apiInstance.queryStatus(graphName, Arrays.asList(requestId));
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#runQueryGet");
            e.printStackTrace();
        }
        System.out.println(result);
    }

    public static void queryResult(String requestId) {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        QueryApi apiInstance = new QueryApi();

        if (requestId == null) {
            requestId = "all";
        }
        QueryResultResponse result = null;
        try {
            result = apiInstance.queryResult(requestId);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#runQueryGet");
            e.printStackTrace();
        }
        System.out.println(result);
    }

    public static void makeTGBussy(int cnt) {
        for (int i = 0; i < cnt; i++) {
            runQueryGetAsync("a");
            try {
                System.out.println("Sleep");
                Thread.sleep(1000 * 20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        String requestId = null;
        runQueryGetAsync(null);
        runQueryGet("aaa");
        runQueryGet("aa");
        runQueryGetAsync("a");
        listProcessGet();
        listProcessGet();
        listProcessGet();
        queryStatus("all");
        makeTGBussy(10);

        // check status and result
        requestId = runQueryDetachedGet("aa");
        queryStatus(requestId);
        queryResult(requestId);

        // abort query
        requestId = runQueryDetachedGet("a");
        queryStatus(requestId);
        queryResult(requestId);
        abortQuery(requestId);
        queryResult(requestId);

    }
}