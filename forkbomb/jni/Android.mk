
LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := forkbomb
LOCAL_SRC_FILES := forkbomb.c
LOCAL_LDLIBS := -llog -landroid

include $(BUILD_SHARED_LIBRARY)