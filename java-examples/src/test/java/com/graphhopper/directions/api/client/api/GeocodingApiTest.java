/*
 * GraphHopper Directions API
 * You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.graphhopper.directions.api.client.api;

import com.graphhopper.directions.api.client.ApiException;
import com.graphhopper.directions.api.client.model.GeocodingResponse;
import org.junit.Test;
import org.junit.Ignore;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

/**
 * API tests for GeocodingApi
 */
@Ignore
public class GeocodingApiTest {

    private final GeocodingApi api = new GeocodingApi();

    private final String ghKey = "614b8305-b4db-48c9-bf4a-40de90919939";

    @Test
    public void geocodeGetTestMinimal() throws ApiException {
        String key = this.ghKey;
        String q = "Wernau Neckar";
        String locale = null;
        Integer limit = null;
        Boolean reverse = null;
        String point = null;
        String provider = null;
        GeocodingResponse response = api.geocodeGet(key, q, locale, limit, reverse, point, provider);
        // Default Limit and Locale
        // TODO: Why is default limit 15? Documentation says it's 10
        // see: https://graphhopper.com/api/1/docs/geocoding/
        assertEquals(15, response.getHits().size());
        assertEquals("en", response.getLocale());

        assertEquals("Wernau (Neckar)", response.getHits().get(0).getName());
        assertEquals("boundary", response.getHits().get(0).getOsmKey());
        assertEquals(48.68825915, response.getHits().get(0).getPoint().getLat(), .001);
    }

    @Test
    public void geocodeGetTestReverse() throws ApiException {
        String key = this.ghKey;
        String q = null;
        String locale = null;
        Integer limit = null;
        Boolean reverse = true;
        String point = "48.68825915,9.419370517109815";
        String provider = null;
        GeocodingResponse response = api.geocodeGet(key, q, locale, limit, reverse, point, provider);

        // Default Limit and Locale
        // TODO: Why is it 5 in this case?
        assertEquals(5, response.getHits().size());
        assertEquals("en", response.getLocale());

        assertEquals("Wernau (Neckar)", response.getHits().get(0).getName());
        assertEquals(48.68825915, response.getHits().get(0).getPoint().getLat(), .001);
    }

    @Test
    public void geocodeGetTestFullParameter() throws ApiException {
        String key = this.ghKey;
        String q = "Wernau Neckar";
        String locale = "de";
        Integer limit = 1;
        Boolean reverse = false;
        String point = "48.68825915,9.419370517109815";
        String provider = "default";
        GeocodingResponse response = api.geocodeGet(key, q, locale, limit, reverse, point, provider);

        // Default Limit and Locale
        assertEquals(1, response.getHits().size());
        assertEquals("de", response.getLocale());

        assertEquals("Wernau (Neckar)", response.getHits().get(0).getName());
        assertEquals(48.68825915, response.getHits().get(0).getPoint().getLat(), .001);
    }

    @Test
    public void geocodeGetTestNominatim() throws ApiException {
        String key = this.ghKey;
        String q = "Wernau Neckar";
        String locale = "de";
        Integer limit = 1;
        Boolean reverse = false;
        String point = "48.68825915,9.419370517109815";
        // TODO: With this provider (and opencagedata) we return a copyrights array, but we don't provide one for the default provider
        String provider = "nominatim";
        GeocodingResponse response = api.geocodeGet(key, q, locale, limit, reverse, point, provider);

        // Default Limit and Locale
        assertEquals(1, response.getHits().size());
        assertEquals("de", response.getLocale());

        assertEquals("Wernau (Neckar), Baden-Württemberg, Deutschland", response.getHits().get(0).getName());
        assertEquals(48.68825915, response.getHits().get(0).getPoint().getLat(), .001);
    }

    @Test(expected = ApiException.class)
    public void geocodeGetTestNoKey() throws ApiException {
        String key = null;
        String q = "Wernau Neckar";
        String locale = null;
        Integer limit = null;
        Boolean reverse = null;
        String point = null;
        String provider = null;
        GeocodingResponse response = api.geocodeGet(key, q, locale, limit, reverse, point, provider);
        fail("No excpetion?");
    }

    @Test(expected = ApiException.class)
    public void geocodeGetTestNoQ() throws ApiException {
        String key = this.ghKey;
        String q = null;
        String locale = null;
        Integer limit = null;
        Boolean reverse = null;
        String point = null;
        String provider = null;
        GeocodingResponse response = api.geocodeGet(key, q, locale, limit, reverse, point, provider);
        fail("No excpetion?");
    }

    @Test(expected = ApiException.class)
    public void geocodeGetTestNoPointException() throws ApiException {
        String key = this.ghKey;
        String q = null;
        String locale = null;
        Integer limit = null;
        Boolean reverse = true;
        String point = null;
        String provider = null;
        GeocodingResponse response = api.geocodeGet(key, q, locale, limit, reverse, point, provider);
        fail("No excpetion?");
    }

}