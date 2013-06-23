package com.thenewprogramming.android.timetoswim;


import java.util.ArrayList;

public class RacetypeManager {
    ArrayList<Racetype> Racetypes;

    ArrayList<String> Strokes;


    public RacetypeManager(){
        Strokes.add(1, R.string.globals_vlinder);
        Strokes.add(2, R.string.globals_rug);
        Strokes.add(3, R.string.globals_school);
        Strokes.add(4, R.string.globals_vrij);
    }
}
