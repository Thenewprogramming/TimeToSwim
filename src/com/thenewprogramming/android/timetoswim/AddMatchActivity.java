package com.thenewprogramming.android.timetoswim;

import android.app.*;
import android.content.*;
import android.os.*;
import android.support.v4.app.*;
import android.view.*;
import android.widget.*;

public class AddMatchActivity extends FragmentActivity implements DatePickerDialog.OnDateSetListener{
	
	
	public static AddMatchActivity TheOnDateSetListener = new AddMatchActivity();
	
	private int Year;
	private int MonthOfYear;
	private int DayOfMonth;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_addmatch);
		getActionBar().setDisplayHomeAsUpEnabled(true);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present
		getMenuInflater().inflate(R.menu.activity_addmatch, menu);
		return true;
	}
	
	public void ShowDatePickerDialog() {
		
		DatePickerFragment TheDatePickerDialog = new DatePickerFragment();
		
	    TheDatePickerDialog.show(getFragmentManager(), "Choose a date");
		
	}

	@Override
	public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
		
		DatePickerFragment.setDate(view.getYear(), view.getMonth(), view.getDayOfMonth());
		
		Year = view.getYear();
		MonthOfYear = view.getMonth();
		DayOfMonth = view.getDayOfMonth();
		
	}
	
	public void SaveTheMatch(){
		int[] date = new int[3];
		date[1]=Year;date[2]=MonthOfYear;date[3]=DayOfMonth;
		
		EditText textfieldName = (EditText) findViewById(R.id.AddMatchActivity_TextFieldName);
		String name = textfieldName.getText().toString();
		
		
		MatchManager.addMatch(date, name, null);
		
		
	}
	
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    switch (item.getItemId()) {
	        case android.R.id.home:
	            Intent parentActivityIntent = new Intent(this, HomeActivity.class);
	            parentActivityIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
	            startActivity(parentActivityIntent);
	            finish();
	            return true;
	        case R.id.AddMatchActivity_MenuSave:
	        	SaveTheMatch();
				return true;
			default:
				return super.onOptionsItemSelected(item);	
	    }
	}

	
	public void OnButtonClicked(View view){
		switch (view.getId()){
			case R.id.AddMatchActivity_ButtonSetDate:
				ShowDatePickerDialog();
			case R.id.AddMatchActivity_ButtonDone:
				SaveTheMatch();
		}
	}
	
}
