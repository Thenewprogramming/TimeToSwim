package com.thenewprogramming.android.timetoswim;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;

public class HomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_home_alldevices);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_home, menu);
		
		return true;
	}
	
	public void ShowAddMatchActivity(){
		Intent AddMatchIntent = new Intent(this, AddMatchActivity.class);
		startActivity(AddMatchIntent);
		//System.out.println("Add Match is a working progress, please wait for the next update.");
	}
	
	public void ShowSettingsActivity(){
		Intent SettingsIntent = new Intent(this, SettingsActivity.class);
		startActivity(SettingsIntent);
	}
	
	public void OnButtonClicked(View view){
		
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		switch(item.getItemId()){
			case R.id.HomeActivity_MenuAddMatch:
				ShowAddMatchActivity();
				return true;
			case R.id.HomeActivity_MenuSettings:
				ShowSettingsActivity();
				return true;
			default:
				return super.onOptionsItemSelected(item);
		}
	}
	
}
