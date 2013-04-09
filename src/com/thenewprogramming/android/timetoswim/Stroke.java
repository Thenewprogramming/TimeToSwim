package com.thenewprogramming.android.timetoswim;

public class Stroke {
	
	private int id;
	private String Name;
	
	
	public Stroke(int id, String name) {
		this.id = id;
		Name = name;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public int getId() {
		return id;
	}

}
