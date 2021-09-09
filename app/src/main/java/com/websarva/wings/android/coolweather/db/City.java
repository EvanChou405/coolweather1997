package com.websarva.wings.android.coolweather.db;

import org.litepal.crud.LitePalSupport;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class City  extends LitePalSupport {

    private int id;

    private String cityName;

    private int cityCode;

    private int provinceId;

}
