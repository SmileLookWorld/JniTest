//
// Created by Administrator on 2016/2/4.
//
#include "com_gisroad_jnitest_Jni.h"
#include <stdio.h>
#include <stdlib.h>
JNIEXPORT jstring JNICALL Java_com_gisroad_jnitest_Jni_getName
  (JNIEnv *env, jclass cls,jstring j_str){
    const char *c_str = 0;
    char buff[128] = {0};
    jboolean isCopy;
    c_str = env->GetStringUTFChars(j_str, &isCopy);
    printf("isCopy:%d\n",isCopy);
    if(c_str == NULL)
    {
        return NULL;
    }
    printf("C_str: %s \n", c_str);
    sprintf(buff, "hello %s", c_str);
    env->ReleaseStringUTFChars(j_str, c_str);
    return env->NewStringUTF(buff);
  }
