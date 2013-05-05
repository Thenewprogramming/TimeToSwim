package com.thenewprogramming.android.timetoswim;

import java.util.Calendar;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.widget.DatePicker;

public class DatePickerFragment extends DialogFragment {

private int Year = 1;
private int DayOfMonth;
private int MonthOfYear;

public DatePickerFragment(int year, int monthOfYear, int dayOfMonth){
	Year = year;
	MonthOfYear = monthOfYear;
	DayOfMonth = dayOfMonth;
}
public DatePickerFragment(){
	
}

@Override
public Dialog onCreateDialog(Bundle savedInstanceState) {
// Use the current date as the default date in the picker
final Calendar c = Calendar.getInstance();
int year = c.get(Calendar.YEAR);
int month = c.get(Calendar.MONTH);
int day = c.get(Calendar.DAY_OF_MONTH);

// Create a new instance of DatePickerDialog and return it
if(!(Year==1)){
	DatePickerDialog TheThingToReturn = new DatePickerDialog(getActivity(), new AddMatchActivity(), Year, MonthOfYear, DayOfMonth);
	TheThingToReturn.getDatePicker().setCalendarViewShown(true);
	TheThingToReturn.getDatePicker().setSpinnersShown(true);
	return TheThingToReturn;
}
else{
return new DatePickerDialog(getActivity(), new AddMatchActivity(), year, month, day);
}

}
		

}
