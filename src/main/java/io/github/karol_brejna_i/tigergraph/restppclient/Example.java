package io.github.karol_brejna_i.tigergraph.restppclient;


import io.github.karol_brejna_i.tigergraph.restppclient.api.DefaultApi;
import io.github.karol_brejna_i.tigergraph.restppclient.api.QueryApi;
import io.github.karol_brejna_i.tigergraph.restppclient.invoker.ApiException;
import io.github.karol_brejna_i.tigergraph.restppclient.model.HelloResponse;
import io.github.karol_brejna_i.tigergraph.restppclient.model.QueryResponse;

import java.util.HashMap;

public class Example {

    private static String graphName = "LDBC_SNB";

    public static void queryComplexGet()  {
        System.out.println("complex get");
        QueryApi apiInstance = new QueryApi();
        HashMap<String, String> personId = new HashMap<String, String>();
        personId.put("personId", "30786325583618");
        personId.put("type", "Person");

        HashMap<String, String> body = new HashMap<String, String>();
        body.put("firstName", "Chau");
        body.put("personId","30786325583618");
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
        DefaultApi apiInstance = new DefaultApi();
        try {
            HelloResponse result = apiInstance.echoGraphNamePost(graphName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#echoGraphNamePost");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        queryComplexGet();

    }
}