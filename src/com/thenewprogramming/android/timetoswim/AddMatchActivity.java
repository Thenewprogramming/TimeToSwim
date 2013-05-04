package com.thenewprogramming.android.timetoswim;

import android.app.DatePickerDialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class AddMatchActivity extends FragmentActivity implements DatePickerDialog.OnDateSetListener{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_addmatch);

	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_addmatch, menu);
		return true;
	}
	
	public void ShowDatePickerDialog(View view) {
	    DialogFragment TheDatePickerDialog = new DatePickerFragment();
	    TheDatePickerDialog.show(getFragmentManager(), "Choose a date");
	}

	@Override
	public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
		String date = year + monthOfYear + dayOfMonth + "";
		
//		final Button buttonSetDate = (Button) findViewById(R.id.ButtonSetDate);
//		buttonSetDate.setText(date.subSequence(0, date.length()-1));
		
	}
	
	
	
	
}
