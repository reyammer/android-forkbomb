package com.example.forkbomb;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button b1 = (Button) findViewById(R.id.button1);
		
		b1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Log.d("FORKBOMB", "forkbomb!");
				NativeLib.fb();
			}
		});
	}
}
