/*
 * BitMEX API
 * ## REST API for the BitMEX Trading Platform  [View Changelog](/app/apiChangelog)    #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  *All* table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  *This is only a small subset of what is available, to get you started.*  Fill in the parameters and click the `Try it out!` button to try any of these queries.  * [Pricing Data](#!/Quote/Quote_get)  * [Trade Data](#!/Trade/Trade_get)  * [OrderBook Data](#!/OrderBook/OrderBook_getL2)  * [Settlement Data](#!/Settlement/Settlement_get)  * [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)    ## All API Endpoints  Click to expand a section. 
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import java.math.BigDecimal;
import io.swagger.client.model.Error;
import io.swagger.client.model.IndexComposite;
import io.swagger.client.model.Instrument;
import io.swagger.client.model.InstrumentInterval;
import org.threeten.bp.OffsetDateTime;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InstrumentApi
 */
@Ignore
public class InstrumentApiTest {

    private final InstrumentApi api = new InstrumentApi();

    
    /**
     * Get instruments.
     *
     * This returns all instruments and indices, including those that have settled or are unlisted. Use this endpoint if you want to query for individual instruments or use a complex filter. Use &#x60;/instrument/active&#x60; to return active instruments, or use a filter like &#x60;{\&quot;state\&quot;: \&quot;Open\&quot;}&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void instrumentGetTest() throws ApiException {
        String symbol = null;
        String filter = null;
        String columns = null;
        BigDecimal count = null;
        BigDecimal start = null;
        Boolean reverse = null;
        OffsetDateTime startTime = null;
        OffsetDateTime endTime = null;
        List<Instrument> response = api.instrumentGet(symbol, filter, columns, count, start, reverse, startTime, endTime);

        // TODO: test validations
    }
    
    /**
     * Get all active instruments and instruments that have expired in &lt;24hrs.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void instrumentGetActiveTest() throws ApiException {
        List<Instrument> response = api.instrumentGetActive();

        // TODO: test validations
    }
    
    /**
     * Helper method. Gets all active instruments and all indices. This is a join of the result of /indices and /active.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void instrumentGetActiveAndIndicesTest() throws ApiException {
        List<Instrument> response = api.instrumentGetActiveAndIndices();

        // TODO: test validations
    }
    
    /**
     * Return all active contract series and interval pairs.
     *
     * This endpoint is useful for determining which pairs are live. It returns two arrays of   strings. The first is intervals, such as &#x60;[\&quot;XBT:perpetual\&quot;, \&quot;XBT:monthly\&quot;, \&quot;XBT:quarterly\&quot;, \&quot;ETH:monthly\&quot;, ...]&#x60;. These identifiers are usable in any query&#39;s &#x60;symbol&#x60; param. The second array is the current resolution of these intervals. Results are mapped at the same index.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void instrumentGetActiveIntervalsTest() throws ApiException {
        InstrumentInterval response = api.instrumentGetActiveIntervals();

        // TODO: test validations
    }
    
    /**
     * Show constituent parts of an index.
     *
     * Composite indices are built from multiple external price sources.  Use this endpoint to get the underlying prices of an index. For example, send a &#x60;symbol&#x60; of &#x60;.XBT&#x60; to get the ticks and weights of the constituent exchanges that build the \&quot;.XBT\&quot; index.  A tick with reference &#x60;\&quot;BMI\&quot;&#x60; and weight &#x60;null&#x60; is the composite index tick. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void instrumentGetCompositeIndexTest() throws ApiException {
        Double account = null;
        String symbol = null;
        String filter = null;
        String columns = null;
        BigDecimal count = null;
        BigDecimal start = null;
        Boolean reverse = null;
        OffsetDateTime startTime = null;
        OffsetDateTime endTime = null;
        List<IndexComposite> response = api.instrumentGetCompositeIndex(account, symbol, filter, columns, count, start, reverse, startTime, endTime);

        // TODO: test validations
    }
    
    /**
     * Get all price indices.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void instrumentGetIndicesTest() throws ApiException {
        List<Instrument> response = api.instrumentGetIndices();

        // TODO: test validations
    }
    
}
