package com.thenewprogramming.android.timetoswim;

public class Racetype {
	
	private int id;
	private String Name;
	private int PersonalRecord;
	/*private int Limit;*/
	private int Stroke;
	private int Distance;
	private int[] Distances = { 25, 50, 100, 200, 400, 800, 1500 };
	private String[] Strokes = { "Vlinderslag", "Rugslag", "Schoolslag", "Vrije slag" };
	
	
	public Racetype(int id, String name, int personalrecord, /*int limit,*/ int stroke, int distance) {
		this.id = id;
		Name = name;
		PersonalRecord = personalrecord;
		/*Limit = limit;*/
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

	/*public int getLimit() {
		return Limit;
	}

	public void setLimit(int limit) {
		Limit = limit;
	}*/

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
