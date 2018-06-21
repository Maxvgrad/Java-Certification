package com.javacertification.logback.utils;

public class Utils {
    public static String getClassName() {
        StackTraceElement[] stEl = Thread.currentThread().getStackTrace();
        return stEl[stEl.length-1].getClassName();
    }
}
