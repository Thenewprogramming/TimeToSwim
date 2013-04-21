package com.thenewprogramming.android.timetoswim;

public class MatchManger {
	
	private Race[] Races;
	private Match[] Matches;
	private Racetype[] Racetypes;
	
	
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
		int oldLengthOfRaces = Races.length;
		Race[] BackupOfRaces = Races.clone();
		Races = new Race[oldLengthOfRaces+1];
		
		for(int i = 0; i < oldLengthOfRaces; i++){
			Races[i] = BackupOfRaces[i];
		}
		Races[oldLengthOfRaces] = new Race(NextRaceId, match, resulttime, type);
		NextRaceId++;
		return Races[oldLengthOfRaces].getId();
	}
	
	
	public int addMatch(int[] date, String name, int[] races){
		int oldLengthOfMatches = Matches.length;
		Match[] BackupOfMatches = Matches.clone();
		Matches = new Match[oldLengthOfMatches+1];

		for(int i = 0; i < oldLengthOfMatches; i++){
			Matches[i] = BackupOfMatches[i];
		}
		
		Matches[oldLengthOfMatches] = new Match(NextMatchId, date, name, races);
		NextMatchId++;
		return Matches[oldLengthOfMatches].getId();
	}
	
	public int addRaceType(String name, int personalrecord, int limit, int stroke, int distance){
		int oldLengthOfRacetypes = Racetypes.length;
		Racetype[] BackupOfRaceTypes = Racetypes.clone();
		Racetypes = new Racetype[oldLengthOfRacetypes+1];

		for(int i = 0; i < oldLengthOfRacetypes; i++){
			Racetypes[i] = BackupOfRaceTypes[i];
		}
		
		Racetypes[oldLengthOfRacetypes] = new Racetype(NextRaceTypeId, name, personalrecord, stroke, distance);
		NextRaceTypeId++;
		return Racetypes[oldLengthOfRacetypes].getId();
	}
	
	public Race getRaceById(int id){
		Race race = null;
		int i = 0;
		
		
		while(race == null){
			
			if(Races[i].getId() == id){
				race = Races[i];
			}
			
			i++;
		}
		
		return race;
	}
	
	public Match getMatchById(int id){
		Match match = null;
		int i = 0;
		
		
		while(match == null){
			
			if(Matches[i].getId() == id){
				match = Matches[i];
			}
			
			i++;
		}
		
		return match;
	}
}
