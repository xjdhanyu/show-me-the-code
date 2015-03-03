package com.test;

import java.util.ArrayList;
import java.util.List;

import com.util.RandomGUID;

public class KeyGenerator {
	

	public List<String> generate(int count){
		List<String> keys = new ArrayList<String>();
		
		for (int i = 0; i < count; i++) {
			RandomGUID guid = new RandomGUID();
			keys.add(guid.toString().replace("-", ""));
		}
		
		return keys;
	}
	
	public static void main(String[] args) {
		int count = 200;
		List<String> keys = new KeyGenerator().generate(count);
		
		int index = 1;
		for(String key : keys){
			System.out.println("第" + index + "个验证码:" + key);
			index++;
		}
	}
}
