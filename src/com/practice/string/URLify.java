package com.practice.string;

public class URLify {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(URLify("Mr  John  Smith   "));
	}

	

	private static String URLify(String url) {
		url = url.trim();
		char[] arr = url.toCharArray();
		boolean flag = true;
		StringBuilder s = new StringBuilder();
		for(int i = 0; i < url.length(); i++){
			if(arr[i] == ' '){
				if(flag){
					flag = false;
					s.append("%20");
				}
					
			}
			else{
				s.append(arr[i]);
				flag = true;
			}
		}
		return s.toString();
	}

}
