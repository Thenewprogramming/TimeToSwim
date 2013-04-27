package com.thenewprogramming.android.timetoswim;

import java.util.ArrayList;
import java.util.Arrays;

public class Racetype {
	
	private int id;
	private String Name;
	private int PersonalRecord;
//	private int Limit;
	private int Stroke;
	private int Distance;
	private ArrayList<Integer> Distances = new ArrayList<Integer>() {{add(25); add(50); add(100); add(200); add(400); add(800); add(1500);}};
	private ArrayList<String> Strokes;
	
	
	public Racetype(int id, String name, int personalrecord, /*int limit,*/ int stroke, int distance) {
		this.id = id;
		Name = name;
		PersonalRecord = personalrecord;
//		Limit = limit;
		Stroke = stroke;
		Distance = distance;
		
		//Filling up the array of strokenames
		Strokes.add("Vlinderslag");Strokes.add("Rugslag");Strokes.add("Schoolslag");Strokes.add("Vrije Slag");
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
