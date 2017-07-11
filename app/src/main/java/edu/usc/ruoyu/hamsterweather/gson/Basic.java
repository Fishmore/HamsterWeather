package edu.usc.ruoyu.hamsterweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ruoyu on 2017/7/11.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
