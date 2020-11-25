package com.labinf.poc.mongo.pocmongo.resources.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import static java.net.URLDecoder.*;

public class URL {
    public static String decodeParam(String text){
        try {
            return decode(text, "UTF8");
        } catch (UnsupportedEncodingException e) {
           return "";
        }
    }
}
