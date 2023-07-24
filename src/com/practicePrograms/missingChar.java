package com.practicePrograms;
import java.util.*;
import java.lang.*;
public class missingChar {
	
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		String str = "My name is Bhaskar Roy.";
		char s[] = str.toCharArray();
		int c[] = new int [26];
		for(int i=0;i<s.length;i++) {
			if(s[i]!=' ') {
				c[s[i]-'a']++;
			}
		}
		String s2="";
		for(int i=0;i<26;i++) {
			if(c[i]==0) {
				s2=s2+(char)(i+'a');
			}
		}
		System.out.println(s2);
		
	}

}
