package com.gmail.klewzow;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Integer> listInt = new ArrayList<>() ;

		listInt.add(62);
		listInt.add(4);
		listInt.add(2000);
		listInt.add(306);
		listInt.add(55);
		listInt.add(10);
		listInt.add(99);

		MySortedList cl = new MySortedList(listInt);
		cl.getList().sort( cl::compare);
		
		for (Integer i : cl.getList()) {
			System.out.println(i);
		}

	}

}

 

 
