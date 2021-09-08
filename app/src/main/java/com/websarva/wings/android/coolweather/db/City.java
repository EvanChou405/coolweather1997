package com.websarva.wings.android.coolweather.db;

import lombok.Data;

@Data
public class City {

    private int id;

    private String cityName;

    private int cityCode;

    private int provinceId;

}
