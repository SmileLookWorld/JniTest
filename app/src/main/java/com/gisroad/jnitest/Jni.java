package com.gisroad.jnitest;

/**
 * Jni 测试实例
 */
public class Jni {
    static {
        System.loadLibrary("hello_jni");
    }
    public static native String getName(String name);
}
