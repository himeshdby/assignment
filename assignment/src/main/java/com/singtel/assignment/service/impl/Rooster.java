package com.singtel.assignment.service.impl;

import java.util.HashMap;
import java.util.Map;

public class Rooster extends Chicken {
	private static final Map<String, String> myLangMap;
    static
    {
        myLangMap = new HashMap<String, String>();
        myLangMap.put("English", "Cock-a-doodle-doo");
        myLangMap.put("Danish", "kykyliky");
        myLangMap.put("Dutch", "kukeleku");
        myLangMap.put("Finnish", "kukko kiekuu");
        myLangMap.put("French", "cocorico");
        myLangMap.put("German", "kikeriki");
        myLangMap.put("Greek", "kikiriki");
        myLangMap.put("Hebrew", "coo-koo-ri-koo");
        myLangMap.put("Hungarian", "kukuriku");
        myLangMap.put("Italian", "chicchirichi");
        myLangMap.put("Japanese", "ko-ke-kok-ko-o");
        myLangMap.put("Portuguese", "cucurucu");
        myLangMap.put("Russian", "kukareku");
        myLangMap.put("Swedish", "kuckeliku");
        myLangMap.put("Turkish", "kuk-kurri-kuuu");
        myLangMap.put("Urdu", "kuklooku");

    }
	public boolean fly() {
		System.out.println("I cannot fly");
		return false;
		}

	  public boolean sing(String language) {

		   if(null== language || language.isEmpty())
		   {
			   //default as english
		  System.out.println("Cock-a-doodle-doo");
		   }
		   else
		   {
			   System.out.println(myLangMap.get(language));
		   }
			   
		
		return true;
	}
}
