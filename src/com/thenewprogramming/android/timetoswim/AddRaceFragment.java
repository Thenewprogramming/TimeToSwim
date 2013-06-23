package com.thenewprogramming.android.timetoswim;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class AddRaceFragment extends DialogFragment implements OnItemSelectedListener{

	public AddRaceFragment() {
		
	}
	
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		AlertDialog.Builder TheAddRaceDialog = new AlertDialog.Builder(getActivity());
		
		
		TheAddRaceDialog.setView(getActivity().getLayoutInflater().inflate(R.layout.add_race_dialog, null));
		Spinner StrokeSpinner = (Spinner) getActivity().findViewById(R.id.AddRaceDialog_StrokeSelector);
		StrokeSpinner.setOnItemSelectedListener(this);
		
		
		TheAddRaceDialog.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
	           public void onClick(DialogInterface dialog, int id) {
	               //TODO hier de method aanroepen van de activity die alle gegevens van deze race opslaat en de inhoud van de listview update.
	           }
	       });
        TheAddRaceDialog.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
            }
        });

        return TheAddRaceDialog.create();
	}

	@Override
	public void onItemSelected(AdapterView<?> parent, View view,  int pos, long id) {
		Spinner DistanceSpinner = (Spinner) getActivity().findViewById(R.id.AddRaceDialog_StrokeSelector);
		String SelectedtextView = (String) parent.getItemAtPosition(pos);
		/*if(SelectedtextView.getText().equals()){
			
		}*/
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(), R.array.Distances, android.R.layout.simple_spinner_item);
		
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		DistanceSpinner.setAdapter(adapter);
		
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		//Waarschijnlijk niks hier
		
	}

}
