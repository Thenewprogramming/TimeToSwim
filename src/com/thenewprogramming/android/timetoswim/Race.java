package com.thenewprogramming.android.timetoswim;

public class Race {
	
	private Match Match;
	private int ResultTime; //Result time in seconds.
	private int id;
	private Racetype Type; //Example: 100m butterfly
	private boolean LimitReached;
	
	
	public Race(int id, Match match, int resulttime, Racetype type){
		this.id = id;
		Match = match;
		ResultTime = resulttime;
		Type = type;
	}
	
	public Race(int id) {
		this.id = id;
	}

	/**
	 * Gets the match this race is in
	 * @return The match this race is in
	 */
	public Match getMatch() {
		return Match;
	}

	/**
	 * Sets the match this race is in
	 * @param match The new race this match should be in
	 */
	public void setMatch(Match match) {
		Match = match;
	}

	/**
	 * Gets the result time of this race	
	 * @return The result time of this race in seconds
	 */
	public int getResultTime() {
		return ResultTime;
	}

	/**
	 * Sets the result time of this race
	 * @param resultTime The new result time in seconds of this race
	 */
	public void setResultTime(int resultTime) {
		ResultTime = resultTime;
	}

	/**
	 * Gets the type of this race
	 * @return The type of this race
	 */
	public Racetype getType() {
		return Type;
	}

	/**
	 * Sets the type of this race
	 * @param type The new type of this race
	 */
	public void setType(Racetype type) {
		this.Type = type;
	}

	/**
	 * Gets the id of this race
	 * @return The id of this race
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Checks if the limit is reached in this race
	 * @return True if the limit is reached,
	 * false if not
	 */
	public boolean isLimitReached() {
		LimitReached = Type.getLimit() >= ResultTime;
		return LimitReached;
	}

}
