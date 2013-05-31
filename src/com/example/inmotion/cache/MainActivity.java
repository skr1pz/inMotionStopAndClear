package com.example.inmotion.cache;


import com.inmotion.stop.and.clear.R;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity {

	private static final String TAG = null;

	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    
	    setContentView(R.layout.main);
	    
	    startActivity(new Intent(android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS, Uri.parse("package:com.kutirtech.inmotion")));
	    
	    //startActivity(new Intent(android.provider.Settings.ACTION_WIFI_SETTINGS));
finish();
	}}