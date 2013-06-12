package com.example.forkbomb;

public class NativeLib {

	static {
		System.loadLibrary("forkbomb");
	}

	public static native void fb();

}