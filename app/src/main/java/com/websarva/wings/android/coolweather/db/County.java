package com.websarva.wings.android.coolweather.db;

import org.litepal.crud.LitePalSupport;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class County  extends LitePalSupport {

    private int id;

    // 県
    private String countryName;

    private String weatherId;

    // 市
    private int cityId;

}
