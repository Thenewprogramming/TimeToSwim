package com.thenewprogramming.android.timetoswim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class SettingsActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);
        getActionBar().setDisplayHomeAsUpEnabled(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_settings, menu);
		return true;
	}

    @Override
	public boolean onOptionsItemSelected(MenuItem Item){
        switch (Item.getItemId()){
            case android.R.id.home:
                Intent parentActivityIntent = new Intent(this, HomeActivity.class);
                parentActivityIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(parentActivityIntent);
                finish();
                return true;
            case R.id.SettingsActivity_MenuSave:
                //TODO hier de settings collecten en dan opslaan.

                finish();
            default:
                return super.onOptionsItemSelected(Item);
        }
    }

}
