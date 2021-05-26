/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai11;

/**
 *
 * @author kuxut
 */
public class EVWordClass implements Comparable
{
	private String word;	private String mean;
	private String type;	private String notes;

	public EVWordClass() 
	{
		this("","","","");
	}

	public EVWordClass(String word, String mean, String type, String notes) 
	{
		this.word = word;
		this.mean = mean;
		this.type = type;
		this.notes = notes;
	}

	public String getMean() 
	{
		return mean;
	}
	public void setMean(String mean) 
	{
		this.mean = mean;
	}
	public String getNotes() 
	{
		return notes;
	}
	public void setNotes(String notes) 
	{
		this.notes = notes;
	}
	public String getType() 
	{
		return type;
	}
	public void setType(String type) 
	{
		this.type = type;
	}
	public String getWord() {
		return word;
		
	}
	public void setWord(String word) {
		this.word = word;
	}

	public boolean equals(Object obj) 
	{
		EVWordClass w = (EVWordClass)obj;
		return word.equalsIgnoreCase(w.getWord());
	}

	public String toString() 
	{
		return word + "; " + type + "; " + mean + "; " + notes;
	}

	public int compareTo(Object o) 
	{
		return this.word.compareToIgnoreCase(((EVWordClass)o).getWord());
	}
}
