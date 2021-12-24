/*
 * TigerGraph REST++ API
 * Title
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.github.karol_brejna_i.tigergraph.restppclient.api;

import java.math.BigDecimal;
import io.github.karol_brejna_i.tigergraph.restppclient.model.QueryResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.Map;


/**
 * API tests for DoneApi
 */
@Ignore
public class DoneApiTest {

    private final DoneApi api = new DoneApi();

    /**
     * Run an installed query
     *
     * Each time a new TigerGraph query is installed, a dynamic endpoint is generated. This new endpoint enables the user to run the new TigerGraph query through HTTP requests and giving the parameters in URL or in a data payload. In the case of a GET request, parameters should be passed in through the query string. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void runInstalledQueryGetTest() throws Exception {
        String graphName = null;
        String queryName = null;
        BigDecimal GSQL_REPLICA = null;
        BigDecimal GSQL_THREAD_LIMIT = null;
        BigDecimal GSQL_TIMEOUT = null;
        BigDecimal RESPONSE_LIMIT = null;
        Boolean readCommitted = null;
        Map<String, String> params = null;
        QueryResponse response = api.runInstalledQueryGet(graphName, queryName, GSQL_REPLICA, GSQL_THREAD_LIMIT, GSQL_TIMEOUT, RESPONSE_LIMIT, readCommitted, params);

        // TODO: test validations
    }
    /**
     * Run an installed query
     *
     * Each time a new TigerGraph query is installed, a dynamic endpoint is generated. This new endpoint enables the user to run the new TigerGraph query through HTTP requests and giving the parameters in URL or in a data payload.  Users can run queries through a POST request, which allows them to pass query parameters in JSON. This is especially helpful when the query takes complex parameters. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void runInstalledQueryPostTest() throws Exception {
        String graphName = null;
        String queryName = null;
        Object body = null;
        BigDecimal GSQL_REPLICA = null;
        BigDecimal GSQL_THREAD_LIMIT = null;
        BigDecimal GSQL_TIMEOUT = null;
        BigDecimal RESPONSE_LIMIT = null;
        Boolean readCommitted = null;
        QueryResponse response = api.runInstalledQueryPost(graphName, queryName, body, GSQL_REPLICA, GSQL_THREAD_LIMIT, GSQL_TIMEOUT, RESPONSE_LIMIT, readCommitted);

        // TODO: test validations
    }
}