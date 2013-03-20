package com.thenewprogramming.android.timetoswim;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;

public class HomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		System.out.println(getRequestedOrientation());
		setContentView(R.layout.activity_home_nexus7_landscape);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_home, menu);
		return true;
	}
	
	public void MenuItemAddMatchClicked(MenuItem item){
		Intent AddMatchIntent = new Intent(this, AddMatchActivity.class);
		startActivity(AddMatchIntent);
		//System.out.println("Add Match is a working progress, please wait for the next update.");
	}
	
	public void MenuItemSettingsClicked(MenuItem item){
		Intent SettingsIntent = new Intent(this, SettingsActivity.class);
		startActivity(SettingsIntent);
	}
	
}
