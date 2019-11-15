package com.example.usmansh.livemobtracking;

/**
 * Created by Usman Sh on 6/22/2018.
 */

class Tracking {

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    String lat,lang;

    public Tracking(String lat, String lang) {

        this.lat = lat;
        this.lang = lang;
    }
}
