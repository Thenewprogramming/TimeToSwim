package com.thenewprogramming.android.timetoswim;


public class Racetype {
	
	private int id;
	private String Name;
	private int PersonalRecord;
	private int Stroke;
	private int Distance;


	public Racetype(int id, String name, int personalrecord, int stroke, int distance) {
		this.id = id;
		Name = name;
		PersonalRecord = personalrecord;
		Stroke = stroke;
		Distance = distance;
		
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

	public int getStroke() {
		return Stroke;
	}

	public void setStroke(int stroke) {
		Stroke = stroke;
	}

	public int getId() {
		return id;
	}

}
