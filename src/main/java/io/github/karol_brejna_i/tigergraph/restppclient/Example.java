package io.github.karol_brejna_i.tigergraph.restppclient;


import io.github.karol_brejna_i.tigergraph.restppclient.api.DiagnosticsApi;
import io.github.karol_brejna_i.tigergraph.restppclient.api.QueryApi;
import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiClient;
import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
import io.github.karol_brejna_i.tigergraph.restppclient.invoker.Configuration;
import io.github.karol_brejna_i.tigergraph.restppclient.model.*;

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

    static {
        ApiClient defaultApiClient = Configuration.getDefaultApiClient();
        defaultApiClient.setBasePath("http://192.168.0.105:9000");
        Configuration.setDefaultApiClient(defaultApiClient);
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
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
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
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
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
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
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

    public static void abortQuery(String requestId) {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        QueryApi apiInstance = new QueryApi();
        AbortQueryResponse result = null;
//        String requestId = "";
        try {
            result = apiInstance.abortQueryGet(graphName, requestId);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#abortQuery");
            e.printStackTrace();
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        echo();
        endpoints();
        statistics();
        listProcessGet();
        abortQuery("all");
//        abortQuery("16908295.RESTPP_1_1.1640621537660.N");

    }
}