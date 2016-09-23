package com.pb.locationintelligence.geotax;

import com.google.gson.Gson;
import com.pb.locationintelligence.geotax.model.*;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by MU001UP on 8/15/2016.
 */
public class GeoTaxRequestUtils {

    static 	public TaxRateLocationRequest getTaxRateLocationRequest(){
        TaxRateLocationRequest request=null;
        request= new TaxRateLocationRequest();

        Preferences preferences= new Preferences();
        preferences.setOutputCasing("M");
        preferences.setDistanceUnits("METERS");
        preferences.setReturnCensusFields("y");
        preferences.setReturnLatLongFields("Y");


        List<Locations> locations =new ArrayList<Locations>();
        Locations locations1= new Locations();




        locations.add(locations1);



        Geometry geometry = new Geometry();

        geometry.setType("point");

        locations1.setGeometry(geometry);

        Double coordinates[]= new Double[2];
        coordinates[0]=-101.2369835;
        coordinates[1]=45.0001134;
        geometry.setCoordinates(coordinates);


        request.setPreferences(preferences);
        request.setLocations(locations);



        return request;
    }


    public static void main(String[] args) {


        Gson gson= new Gson();
        System.out.println(gson.toJson(getTaxRateLocationRequest(),TaxRateLocationRequest.class));
        //gson.toJson(getTaxRateLocationRequest(),TaxRateLocationRequest.class);
    }

    static 	public TaxAddressRequest getTaxAddressRequest(){
        TaxAddressRequest request=null;

        request= new TaxAddressRequest();


        Preferences preferences= new Preferences();
        preferences.setOutputCasing("M");
        preferences.setDistanceUnits("METERS");
        preferences.setReturnCensusFields("y");
        preferences.setReturnLatLongFields("Y");
        preferences.setMaxReturnedCandidates("1");
        preferences.setReturnAllCandidateInfo(false);
        preferences.setFallbackToGeographic("true");
        preferences.setFallbackToPostal("true");
        preferences.setStreetOffset("7");
        preferences.setClientLocale("en_US");
        preferences.setClientCoordSysName("EPSG:4326");
        preferences.setMatchMode("STANDARD");

        TaxAddress address1= new TaxAddress();

        address1.setMainAddressLine("39 Sycamore Rd,Stafford 08050, USA");
        address1.setPurchaseAmount("10");


        List<TaxAddress> taxAddresses = new ArrayList<TaxAddress>();
        taxAddresses.add(address1);
        taxAddresses.add(address1);

        request.setPreferences(preferences);
        request.setTaxAddresses(taxAddresses);
        Gson gson= new Gson();
        System.out.println(gson.toJson(request, TaxAddressRequest.class));

        return request;
    }


    static 	public TaxLocationRequest getTaxLocationRequest(){
        TaxLocationRequest request=null;

        request= new TaxLocationRequest();

        Preferences preferences= new Preferences();
        preferences.setOutputCasing("M");
        preferences.setDistanceUnits("METERS");
        preferences.setReturnCensusFields("y");
        preferences.setReturnLatLongFields("Y");
        preferences.setMaxReturnedCandidates("1");



        List<Locations> locations =new ArrayList<Locations>();
        Locations locations1= new Locations();

        locations1.setPurchaseAmount("100");


        locations.add(locations1);



        Geometry geometry = new Geometry();

        geometry.setType("point");

        locations1.setGeometry(geometry);

        Double coordinates[]= new Double[2];
        coordinates[0]=-101.2369835;
        coordinates[1]=45.0001134;
        geometry.setCoordinates(coordinates);

        request.setPreferences(preferences);
        request.setLocations(locations);



        return request;
    }


    static 	public TaxRateAddressRequest getTaxRateAddressRequest(){
        TaxRateAddressRequest request=null;

        request= new TaxRateAddressRequest();

        Preferences preferences= new Preferences();
        preferences.setOutputCasing("M");
        preferences.setDistanceUnits("METERS");
        preferences.setReturnCensusFields("y");
        preferences.setReturnLatLongFields("Y");
        preferences.setMaxReturnedCandidates("1");
        preferences.setReturnAllCandidateInfo(false);
        preferences.setFallbackToGeographic("true");
        preferences.setFallbackToPostal("true");
        preferences.setStreetOffset("7");
        preferences.setClientLocale("en_US");
        preferences.setClientCoordSysName("EPSG:4326");
        preferences.setMatchMode("STANDARD");

        TaxRateAddress address = new TaxRateAddress();

        address.setMainAddressLine("39 Sycamore Rd,Stafford 08050, USA");

        List<TaxRateAddress> taxRateAddresses = new ArrayList<TaxRateAddress>();
        taxRateAddresses.add(address);
        taxRateAddresses.add(address);


        request.setPreferences(preferences);
        request.setTaxRateAddresses(taxRateAddresses);

        Gson gson= new Gson();

        System.out.println(gson.toJson(request,TaxRateAddressRequest.class));
        return  request;
    }


}
