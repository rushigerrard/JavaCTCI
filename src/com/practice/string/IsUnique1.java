package com.practice.string;

import java.util.Arrays;
import java.util.HashSet;

public class IsUnique1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsUnique1 isUnique = new IsUnique1();
		String a = "hello";
		System.out.println(isUnique.isUnique(a));
		System.out.println(isUnique.identifyWoDataStructure(a));
	}

	private boolean identifyWoDataStructure(String a) {
		if(a.length() == 1)
			return true;
		char[] arr = a.toCharArray();
		Arrays.sort(arr);
		for(int i = 0; i < arr.length - 1; i++){
			if(arr[i] == arr[i + 1])
				return false;
		}
		return true;
	}

	private boolean isUnique(String a) {
		HashSet<Character> hs = new HashSet<>();
		for(char c : a.toCharArray()){
			if(hs.add(c) == false)
				return false;
		}
		return true;
	}

}
