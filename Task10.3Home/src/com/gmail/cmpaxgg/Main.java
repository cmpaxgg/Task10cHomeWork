package com.gmail.cmpaxgg;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] array = new Integer[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10 + 1);
			System.out.println(array[i]);
		}
		System.out.println(countReplay(array));
	}

	public static Map<Object, Integer> countReplay(Object[] array) {
		Map<Object, Integer> map = new HashMap<>();
		for (Object i : array) {
			map.merge(i, 1, (a, b) -> a + b);
		}
		return map;
	}

}
