package com.thenewprogramming.android.timetoswim;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class AddRaceFragment extends DialogFragment{

	public AddRaceFragment() {
		
	}
	
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		AlertDialog.Builder TheAddRaceDialog = new AlertDialog.Builder(getActivity());
		
		
		TheAddRaceDialog.setView(getActivity().getLayoutInflater().inflate(R.layout.add_race_dialog, null));
		Spinner StrokeSpinner = (Spinner) getActivity().findViewById(R.id.AddRaceDialog_StrokeSelector);

		
		TheAddRaceDialog.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
	           public void onClick(DialogInterface dialog, int id) {
	               //TODO hier de method aanroepen van de activity die alle gegevens van deze race opslaat en de inhoud van de listview update.
	           }
	       });
        TheAddRaceDialog.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                //Waarschijnlijk hoeven we hier niks te doen.
            }
        });

        return TheAddRaceDialog.create();
	}

}
