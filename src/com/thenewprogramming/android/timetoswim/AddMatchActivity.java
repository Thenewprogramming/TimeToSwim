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
	
	private Button buttonSetDate;
	private int Year = 1;
	private int MonthOfYear = 1;
	private int DayOfMonth = 1;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_addmatch);
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present
		getMenuInflater().inflate(R.menu.activity_addmatch, menu);
		return true;
	}
	
	public void ShowDatePickerDialog(View view) {
	    buttonSetDate = (Button) view;
		System.out.println(view.getId());
		DialogFragment TheDatePickerDialog = new DatePickerFragment();
		
		
		if(!(Year==1)){
			TheDatePickerDialog = new DatePickerFragment(Year, MonthOfYear, DayOfMonth);
		}
		
	    TheDatePickerDialog.show(getFragmentManager(), "Choose a date");
		
	}

	@Override
	public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
		String date = year + monthOfYear + dayOfMonth + "";
		
		try{
			//buttonSetDate.setText(date.subSequence(0, date.length()-1));
			buttonSetDate.setText("date");
		}
		catch(Exception e){
			System.out.println("Something went wrong " + e.getMessage());
		}
		
		Year = year;
		MonthOfYear = monthOfYear;
		DayOfMonth = dayOfMonth;
		
	}
	
	public void ButtonDoneClicked(View view){
		//view.setClickable(false);
		Button ButtonDone = (Button) view;
		ButtonDone.setText("hoi");
	}
	
	
	
	
}
