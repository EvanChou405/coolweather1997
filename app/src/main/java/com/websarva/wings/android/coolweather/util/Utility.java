package com.websarva.wings.android.coolweather.util;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.text.TextUtils;

import com.websarva.wings.android.coolweather.db.City;
import com.websarva.wings.android.coolweather.db.County;
import com.websarva.wings.android.coolweather.db.Province;

public class Utility {

    public static boolean handleProvinceResponse(String response) {

        if (!TextUtils.isEmpty(response)) {

            try {

                JSONArray allProvinces = new JSONArray(response);

                for (int i=0; i< allProvinces.length(); i++) {

                    JSONObject provinceObject = allProvinces.getJSONObject(i);
                    Province province = new Province();

                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));

                    province.save();


                }

                return true;

            }catch (JSONException e) {
                e.printStackTrace();
            }

        }

        return false;
    }


    public static boolean handleCityResponse(String response, int provinceId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCity = new JSONArray(response);
                for (int i = 0; i < allCity.length(); i++) {
                    JSONObject object = allCity.getJSONObject(i);
                    City city = new City();
                    city.setCityName(object.getString("name"));
                    city.setCityCode(object.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return  false;
    }


    public static boolean handleCountyResponse(String response,int cityId) {

        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCity = new JSONArray(response);
                for (int i = 0; i < allCity.length(); i++) {
                    JSONObject object = allCity.getJSONObject(i);
                    County county = new County();
                    county.setCountryName(object.getString("name"));
                    county.setWeatherId(object.getString("WeatherId"));
                    county.setCityId(cityId);
                    county.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return  false;

    }





}
