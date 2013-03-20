package com.thenewprogramming.android.timetoswim;

public class Racetype {
	
	private int id;
	private String Name;
	private int PersonalRecord;
	private int Limit;
	
	public Racetype() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPersonalRecord() {
		return PersonalRecord;
	}

	public void setPersonalRecord(int personalRecord) {
		PersonalRecord = personalRecord;
	}

	public int getLimit() {
		return Limit;
	}

	public void setLimit(int limit) {
		Limit = limit;
	}

	public int getId() {
		return id;
	}

}
