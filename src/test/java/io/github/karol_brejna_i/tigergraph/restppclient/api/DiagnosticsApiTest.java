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

import io.github.karol_brejna_i.tigergraph.restppclient.model.AnyObject;
import io.github.karol_brejna_i.tigergraph.restppclient.model.HelloResponse;
import io.github.karol_brejna_i.tigergraph.restppclient.model.StatisticsResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DiagnosticsApi
 */
@Ignore
public class DiagnosticsApiTest {

    private final DiagnosticsApi api = new DiagnosticsApi();

    /**
     * Echo
     *
     * A simple diagnostic utility. Expected response is {\&quot;message\&quot;: \&quot;Hello GSQL\&quot;}.  See: https://docs.tigergraph.com/tigergraph-server/current/api/built-in-endpoints#_echo 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void echoGetTest() throws Exception {
        String graphName = null;
        HelloResponse response = api.echoGet(graphName);

        // TODO: test validations
    }
    /**
     * Echo
     *
     * A simple diagnostic utility. Expected response is {\&quot;message\&quot;: \&quot;Hello GSQL\&quot;}.  See: https://docs.tigergraph.com/tigergraph-server/current/api/built-in-endpoints#_echo 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void echoPostTest() throws Exception {
        String graphName = null;
        HelloResponse response = api.echoPost(graphName);

        // TODO: test validations
    }
    /**
     * List all endpoints
     *
     * This endpoint returns a list of the installed endpoints and their parameters. There are three types of endpoints, described in the table below.   * builtin - Endpoints presinstalled in TigerGraph (like this one)   * dynamic - Endpoints generated when installing GSQL queries   * static - User installed endpoints  To include one or more of the endpoint types in the output,  include the endpoint type in the parameter query string and set its value to true. If no type parameters are provided, all endpoints are returned.  See: https://docs.tigergraph.com/tigergraph-server/current/api/built-in-endpoints#_list_all_endpoints See: https://docs.tigergraph.com/tigergraph-server/current/api/json-catalog 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void endpointsTest() throws Exception {
        String graphName = null;
        Boolean builtin = null;
        Boolean dynamic = null;
        Boolean _static = null;
        AnyObject response = api.endpoints(graphName, builtin, dynamic, _static);

        // TODO: test validations
    }
    /**
     * Rebuild graph engine
     *
     * In TigerGraph, when new data is being loaded into the graph (such as new vertices or edges),  data is first stored in memory before it is saved to disk permanently.  TigerGraph runs a rebuild of the Graph Processing Engine (GPE) to commit the data in memory to disk  every 30 seconds, but you can also call this endpoint to trigger a rebuild immediately. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void rebuildnowGetTest() throws Exception {
        String graphName = null;
        Integer threadnum = null;
        String vertextype = null;
        Integer segid = null;
        String path = null;
        Boolean force = null;
        HelloResponse response = api.rebuildnowGet(graphName, threadnum, vertextype, segid, path, force);

        // TODO: test validations
    }
    /**
     * Rebuild graph engine
     *
     * In TigerGraph, when new data is being loaded into the graph (such as new vertices or edges),  data is first stored in memory before it is saved to disk permanently.  TigerGraph runs a rebuild of the Graph Processing Engine (GPE) to commit the data in memory to disk  every 30 seconds, but you can also call this endpoint to trigger a rebuild immediately. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void rebuildnowPostTest() throws Exception {
        String graphName = null;
        Integer threadnum = null;
        String vertextype = null;
        Integer segid = null;
        String path = null;
        Boolean force = null;
        HelloResponse response = api.rebuildnowPost(graphName, threadnum, vertextype, segid, path, force);

        // TODO: test validations
    }
    /**
     * Show query performance
     *
     * Returns real-time query performance statistics over the given time period, as specified by the **seconds** parameter.  See: https://docs.tigergraph.com/tigergraph-server/current/api/built-in-endpoints#_show_query_performance 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void statisticsTest() throws Exception {
        String graphName = null;
        Integer seconds = null;
        Integer segments = null;
        StatisticsResponse response = api.statistics(graphName, seconds, segments);

        // TODO: test validations
    }
    /**
     * Show component versions
     *
     * This endpoint returns the GIT versions of all components of the system.  See: https://docs.tigergraph.com/tigergraph-server/current/api/built-in-endpoints#_show_component_versions 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void versionTest() throws Exception {
        String graphName = null;
        HelloResponse response = api.version(graphName);

        // TODO: test validations
    }
}
