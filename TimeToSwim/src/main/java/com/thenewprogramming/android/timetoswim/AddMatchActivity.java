package com.thenewprogramming.android.timetoswim;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class AddMatchActivity extends FragmentActivity implements DatePickerDialog.OnDateSetListener, DialogInterface.OnClickListener{


	public static AddMatchActivity TheOnDateSetListener = new AddMatchActivity();

	private int Year;
	private int MonthOfYear;
	private int DayOfMonth;

    private ArrayList<Integer> DisplayedRaces = null;

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
	
	public void ShowAddRaceDialog(){
		AddRaceFragment TheAddRaceDialog = new AddRaceFragment();
		
	    TheAddRaceDialog.show (getFragmentManager(), "Add Race");
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
				break;
			case R.id.AddMatchActivity_ButtonAddRace:
				ShowAddRaceDialog();
		}
	}

	@Override
	public void onClick(DialogInterface dialog, int id) {
		switch(id){
		
		}
		
	}

    public void OnRaceAdded(int racetypeid){
        if(DisplayedRaces!=null){
            ListView StrokeSelector = (ListView) findViewById(R.id.AddRaceDialog_StrokeSelector);
            ArrayList<String> DisplayedRacesNames = null;
            for (int i = 0; i<DisplayedRaces.size(); i++){
                DisplayedRacesNames.add(MatchManager.getRacetypeById(racetypeid).getName());
            }

            ArrayAdapter<String> TheArrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_addmatch);
            TheArrayAdapter.addAll(DisplayedRacesNames);

            StrokeSelector.setAdapter(TheArrayAdapter);
        }
    }
	
}
