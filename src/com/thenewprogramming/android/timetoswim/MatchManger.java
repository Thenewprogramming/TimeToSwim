package com.thenewprogramming.android.timetoswim;

public class MatchManger {
	
	private Race[] Races;
	private Racetype[] Racetypes;
	private Match[] Matches;
	
	//The id to be given to the next new race
	private int NextRaceId;
	//The id to be given to the next new match
	private int NextMatchId;
	
	
	
	public MatchManger() {
		
	}
	
	public void addRace(int id, Match match, int resulttime, Racetype type){
		int oldLengthOfRaces = Races.length;
		Race[] BackupOfRaces = Races.clone();
		
	}

}
