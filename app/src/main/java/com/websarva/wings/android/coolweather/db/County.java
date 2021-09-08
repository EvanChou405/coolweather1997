package com.websarva.wings.android.coolweather.db;

import lombok.Data;

@Data
public class County {

    private int id;

    // 県
    private String countryName;

    private String weatherId;

    // 市
    private int cityId;

}
