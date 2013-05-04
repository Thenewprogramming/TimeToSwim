package com.thenewprogramming.android.timetoswim;

import java.util.ArrayList;

public class MatchManger {
	
	private ArrayList<Race> Races;
	private ArrayList<Match> Matches;
	private ArrayList<Racetype> Racetypes;
	
	
	//The id to be given to the next new race
	private int NextRaceId;
	//The id to be given to the next new match
	private int NextMatchId;
	//The id to be given to the next new racetype
	private int NextRaceTypeId;
	//The id to be given to the next new stroke
	private int NextStrokeId;
	
	
	public MatchManger(int nextmatchid, int nextraceid, int nextracetypeid, int nextstrokeid){
		NextMatchId = nextmatchid;
		NextRaceId = nextraceid;
		NextRaceTypeId = nextracetypeid;
		NextStrokeId = nextstrokeid;
	}
	
	public int addRace(Match match, int resulttime, Racetype type){
		Races.add(new Race(NextRaceId, match, resulttime, type));
		return Races.get(Races.size()-1).getId();
	}
	
	
	public int addMatch(int[] date, String name, int[] races){
		Matches.add(new Match(NextMatchId, date, name, races));
		return Matches.get(Races.size()-1).getId();
	}
	

	public int addRaceType(String name, int personalrecord, int limit, int stroke, int distance){
		Racetypes.add(new Racetype(NextRaceTypeId, name, personalrecord, stroke, distance));
		return Matches.get(Races.size()-1).getId();
	}
	
	public Race getRaceById(int id){
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
	
	public Match getMatchById(int id){
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
}
