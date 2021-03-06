package com.thenewprogramming.android.timetoswim;

import java.util.ArrayList;

public class MatchManager {
	
	private static ArrayList<Race> Races;
	private static ArrayList<Match> Matches;
	private static ArrayList<Racetype> Racetypes;

    private ArrayList<String> Strokes;
    private ArrayList<Integer> Distances;
	
	private static int NextRaceId;
	private static int NextMatchId;
	private static int NextRaceTypeId;

	
	
	/**
	 * @param nextmatchid The id to be given to the next newly created match
	 * @param nextraceid The id to be given to the next newly created race
	 * @param nextracetypeid The id to be given to the next newly created racetype
     * @param strokenames The names of the strokes, this will be of the correct language but cannot be asked from here because of static errors
	 */
	public MatchManager(int nextmatchid, int nextraceid, int nextracetypeid, String[] strokenames){
		NextMatchId = nextmatchid;
        NextRaceId = nextraceid;
        NextRaceTypeId = nextracetypeid;

        //Filling up the Strokes array, this will fill it up with the names of the correct language.
        Strokes.add(1, strokenames[0]);
        Strokes.add(2, strokenames[1]);
        Strokes.add(3, strokenames[2]);
        Strokes.add(4, strokenames[3]);
	}
	
	
	/**
	 * @param match The id of the match this race is in.
	 * @param resultTime The result of this race, this should be 0 if there is no result yet
	 * @param racetype The id of the racetype this race will be
	 * @return The id of the newly created Race
	 */
	public static int addRace(int match, int resultTime, int racetype){
		Races.add(new Race(NextRaceId, match, resultTime, racetype));
		return Races.get(Races.size()-1).getId();
	}
	
	
	/**
	 * @param date The date for the new match. This is should be array with a length of 3, where the first one is the year, the second one is the month and the third one is the day
	 * @param name The name for this new match
	 * @param races The races that are in this match. This is formated in an array of ints, where every int is an id of a race
	 * @return The id of the newly created Match
	 */
	public static int addMatch(int[] date, String name, int[] races){
		Matches.add(new Match(NextMatchId, date, name, races));
		return Matches.get(Races.size()-1).getId();
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

	
	/**
	 * @param id The id of the race you want to get by calling this method
	 * @return The race with the id you passed in with this method
	 */
	public static Race getRaceById(int id){
		Race race = null;
		int i = 0;
		
		while(race == null){
			if(Races.get(i).getId() == id){
				race = Races.get(i);
			}
			i++;
		}
		return race;
	}
	
	/**
	 * @param id The id of the match you want to get by calling this method
	 * @return The match with the id you passed in with this method
	 */
	public static Match getMatchById(int id){
		Match match = null;
		int i = 0;
		
		while(match == null){
			if(Matches.get(i).getId() == id){
				match = Matches.get(i);
			}
			i++;
		}
		return match;
	}
	
	/**
	 * @param id The id of the racetype you want to get by calling this method
	 * @return The racetype with the id you passed in with this method
	 */
	public static Racetype getRacetypeById(int id){
		Racetype racetype = null;
		int i = 0;
		
		while(racetype == null){
			if(Racetypes.get(i).getId() == id){
				racetype = Racetypes.get(i);
			}
			i++;
		}
		return racetype;
	}
}
