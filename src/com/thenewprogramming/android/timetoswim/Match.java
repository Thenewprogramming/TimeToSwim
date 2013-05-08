package com.thenewprogramming.android.timetoswim;

import java.util.ArrayList;

public class Match {
	
	private int id;
	
	private int Year;
	private int Month;
	private int Day;
	private int[] Date = new int[]{Year, Month, Day};
	
	private String Name;
	private ArrayList<Integer> Races = new ArrayList<Integer>();
	
	
	public Match(int id, int[] date, String name, int[] races) {
		this.id = id;
		Date = date;
		Name = name;
		for(int i = 0; i < races.length; i++){
			Races.add(races[i]);
		}
	}
	
	public Match(int id){
		this.id = id;
	}


	/**
	 * Gets the races of this match
	 * @return The races of this match
	 */
	public ArrayList<Integer> getRaces() {
		Race[] races = (Race[]) Races.toArray();
		ArrayList<Integer> TheIntArrayToReturn = new ArrayList<Integer>();
		for(int i = 0; i < races.length; i++){
			TheIntArrayToReturn.add(races[i].getId());
		}
		return TheIntArrayToReturn;
	}


	/**
	 * Sets the races of this match
	 * @param races The new races of this match
	 */
	public void setRaces(ArrayList<Integer> races) {
		Races = races;
	}

	/**
	 * Gets the name of this match
	 * @return The name of this match
	 */
	public String getName() {
		return Name;
	}

	/**
	 * Sets the name of this match
	 * @param name The new name of this match
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * Gets the id of this match
	 * @return The id of this match
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the year of this match
	 * @param year The new year of this match
	 */
	public void setYear(int year) {
		Year = year;
	}

	/**
	 * Sets the month of this match
	 * @param month The new month of this match
	 */
	public void setMonth(int month) {
		Month = month;
	}

	/**
	 * Sets the day of this match
	 * @param day The new day of this match
	 */
	public void setDay(int day) {
		Day = day;
	}

	/**
	 * Gets the current date of this match
	 * @return The date of this match
	 */
	public int[] getDate() {
		return Date;
	}
	
	public void setDate(int year, int monthOfYear, int dayOfMonth){
		
	}
	

}
