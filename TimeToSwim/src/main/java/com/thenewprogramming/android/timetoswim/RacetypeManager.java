package com.thenewprogramming.android.timetoswim;

import java.util.ArrayList;

public class RacetypeManager {
    private static ArrayList<Racetype> Racetypes;
    private static int NextRaceTypeId;

    private ArrayList<String> Strokes;
    private ArrayList<Integer> Distances;

    public RacetypeManager(String vlindername, String rugname, String schoolname, String vrijname){


        //Filling up the Strokes array, this will fill it up with the names of the correct language.
        Strokes.add(1, vlindername);
        Strokes.add(2, rugname);
        Strokes.add(3, schoolname);
        Strokes.add(4, vrijname);

    }

    /**
     * @param name The name for the racetype that will be created
     * @param personalrecord The personal record for the new racetype, this can be null.
     * @param stroke The stroke the new racetype should be.
     * @param distance The distance of the new racetype.
     * @return The id of this racetype from which you can get the racetype by using "getRacetypeById(id)".
     */
    public static int addRaceType(String name, int personalrecord, int stroke, int distance){
        if(!(name == null)){

            Racetypes.add(new Racetype(NextRaceTypeId, name, personalrecord, stroke, distance));
        }
        return Racetypes.get(Racetypes.size()-1).getId();
    }

}
