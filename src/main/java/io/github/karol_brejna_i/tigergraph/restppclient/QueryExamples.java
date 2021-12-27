package io.github.karol_brejna_i.tigergraph.restppclient;


import com.squareup.okhttp.Call;
import io.github.karol_brejna_i.tigergraph.restppclient.api.QueryApi;
import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiCallback;
import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiClient;
import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
import io.github.karol_brejna_i.tigergraph.restppclient.invoker.Configuration;
import io.github.karol_brejna_i.tigergraph.restppclient.model.AbortQueryResponse;
import io.github.karol_brejna_i.tigergraph.restppclient.model.ProcessListResponse;
import io.github.karol_brejna_i.tigergraph.restppclient.model.QueryResponse;

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
        defaultApiClient.setBasePath("http://192.168.0.105:9000");
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
                    System.out.println("--------ERROR!");
                    System.out.println(e);
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
                    null, null, 100 * 1000, null, null, null,
                    null, cb);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#runQueryGet");
            e.printStackTrace();
        }
        System.out.println(result);
    }

    public static void dafd(String queryName) {
        System.out.println("dafd");
        QueryApi apiInstance = new QueryApi();

        AbortQueryResponse result = null;
        try {
            result = apiInstance.abortQueryGet(graphName, "all");
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#runQueryGet");
            e.printStackTrace();
        }
        System.out.println(result);
    }

    public static void zapchaj(int cnt) {
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
//        runQueryGetAsync(null);
//        runQueryGet("aaa");
//        runQueryGet("aa");
//        runQueryGetAsync("a");
//        runQueryGetAsync("a");
//        runQueryGetAsync("a");
//        listProcessGet();
//        listProcessGet();
//        listProcessGet();
        zapchaj(10);
    }
}