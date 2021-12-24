package io.github.karol_brejna_i.tigergraph.restppclient;


import io.github.karol_brejna_i.tigergraph.restppclient.api.DiagnosticsApi;
import io.github.karol_brejna_i.tigergraph.restppclient.api.QueryApi;
import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
import io.github.karol_brejna_i.tigergraph.restppclient.model.AnyObject;
import io.github.karol_brejna_i.tigergraph.restppclient.model.HelloResponse;
import io.github.karol_brejna_i.tigergraph.restppclient.model.QueryResponse;
import io.github.karol_brejna_i.tigergraph.restppclient.model.StatisticsResponse;

import java.util.HashMap;

public class Example {

    private static String graphName = "LDBC_SNB";

    public static void queryComplexGet() {
        System.out.println("complex get");
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
    public static void main(String[] args) {
        queryComplexGet();
        echo();
        endpoints();
        statistics();
    }
}