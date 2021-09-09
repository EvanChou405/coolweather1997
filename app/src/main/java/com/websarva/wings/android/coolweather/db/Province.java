package com.websarva.wings.android.coolweather.db;


import org.litepal.crud.LitePalSupport;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Province  extends LitePalSupport {

    private int id;

    private String provinceName;

    private int provinceCode;



}
