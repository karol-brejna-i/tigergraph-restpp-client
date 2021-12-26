package io.github.karol_brejna_i.tigergraph.restppclient;


import com.squareup.okhttp.Call;
import io.github.karol_brejna_i.tigergraph.restppclient.api.DiagnosticsApi;
import io.github.karol_brejna_i.tigergraph.restppclient.api.QueryApi;
import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiCallback;
import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
import io.github.karol_brejna_i.tigergraph.restppclient.model.*;

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
public class Example {

//    private static final String graphName = "LDBC_SNB";
    private static final String graphName = "mygraph";

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
            result = apiInstance.runInstalledQueryGet(graphName, "interactiveComplex1", body);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#echoGraphNamePost");
            e.printStackTrace();
        }
        System.out.println(result);
    }

    public static void echo() {
        System.out.println("Echo get");
        DiagnosticsApi apiInstance = new DiagnosticsApi();
        try {
            HelloResponse result = apiInstance.echoGet(graphName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#echoGraphNamePost");
            e.printStackTrace();
        }
    }

    public static void endpoints() {
        System.out.println("Echo endpoints");
        DiagnosticsApi apiInstance = new DiagnosticsApi();
        try {
            AnyObject result = apiInstance.endpoints(graphName, false, false, false);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#echoGraphNamePost");
            e.printStackTrace();
        }
    }

    public static void statistics() {
        System.out.println("Echo statistics");
        DiagnosticsApi apiInstance = new DiagnosticsApi();
        try {
            StatisticsResponse result = apiInstance.statistics(graphName, 50, null);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#echoGraphNamePost");
            e.printStackTrace();
        }
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
            result = apiInstance.runInstalledQueryGet(graphName, queryName);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#runQueryGet");
            e.printStackTrace();
        }
        System.out.println(result);
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

                }

                @Override
                public void onSuccess(QueryResponse result, int statusCode, Map<String, List<String>> responseHeaders) {
                    System.out.println("Success!");
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
                    null, null, null, null, null,
                    null, cb);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#runQueryGet");
            e.printStackTrace();
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        queryGet();
        echo();
        endpoints();
        statistics();
        runQueryGetAsync(null);
        runQueryGet("aaa");
        runQueryGet("aa");
        runQueryGetAsync("a");
        listProcessGet();
        listProcessGet();
        listProcessGet();
    }
}