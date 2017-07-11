package edu.usc.ruoyu.hamsterweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ruoyu on 2017/7/11.
 */

public class AQI {

    public AQICity city;

    public class AQICity {

        @SerializedName("aqi")
        public String aqi;

        @SerializedName("pm25")
        public String pm25;
    }
}
