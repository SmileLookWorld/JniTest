package com.gisroad.jnitest;

public class Jni {
    static {
        System.loadLibrary("hello_jni");
    }
    public static native String getName(String name);
}
