package com.labinf.poc.mongo.pocmongo.resources.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import static java.net.URLDecoder.*;

public class URL {
    public static String decodeParam(String text){
        try {
            return decode(text, "UTF8");
        } catch (UnsupportedEncodingException e) {
           return "";
        }
    }

    public static Date convertDate(String date, Date defaultvalue){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        try {
            return sdf.parse(date);
        } catch (ParseException e) {
           return defaultvalue;
        }
    }
}
