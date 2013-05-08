package com.thenewprogramming.android.timetoswim;

import java.util.Calendar;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;

@SuppressLint("ValidFragment")
public class DatePickerFragment extends DialogFragment {

	private static int Year;
	private static int DayOfMonth;
	private static int MonthOfYear;
	private static boolean dateChanged;

	public DatePickerFragment(){

	}

	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		// Use the current date as the default date in the picker
		final Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);

		
		if(dateChanged){
			DatePickerDialog TheThingToReturn = new DatePickerDialog(getActivity(), AddMatchActivity.TheOnDateSetListener, Year, MonthOfYear, DayOfMonth);
			TheThingToReturn.getDatePicker().setCalendarViewShown(true);
			TheThingToReturn.getDatePicker().setSpinnersShown(true);
			return TheThingToReturn;
		}
		else{
			return new DatePickerDialog(getActivity(), AddMatchActivity.TheOnDateSetListener, year, month, day);
		}

	}
	
	public static void setDate(int year, int month, int day){
		Year = year;
		MonthOfYear = month;
		DayOfMonth = day;
		dateChanged = true;
	}


}
