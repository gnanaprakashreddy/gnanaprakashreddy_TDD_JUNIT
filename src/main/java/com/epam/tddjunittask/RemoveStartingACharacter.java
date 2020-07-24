package com.epam.tddjunittask;

public class RemoveStartingACharacter {

	public String remove(String string) {
		String result = string;
		if((string.length()==1 && string.charAt(0)=='A') || (string.length()==2 && string.charAt(0)=='A' && string.charAt(1)=='A'))
			result = "";
		else if(string.length()>0){
			if(string.charAt(1)=='A')
				string = "" + string.charAt(0) + string.substring(2,string.length());
			if(string.charAt(0)=='A')
				string = "" + string.substring(1,string.length());
			result = string;
		}
		return result;
	}
}
