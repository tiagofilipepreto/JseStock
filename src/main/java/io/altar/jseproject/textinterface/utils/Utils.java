package io.altar.jseproject.textinterface.utils;


import java.util.ArrayList;
import java.util.Scanner;


public class Utils {
	private Scanner sc = new Scanner(System.in);

	public String getValue(String msg) {
		System.out.println(msg);
		String result = sc.nextLine();
		return result;
	}


	public int getInt(String msg) {
		while (true) {
			String value = getValue(msg);
			Scanner sc2 = new Scanner(value);
			if (value.equals("")) {
				return -1;
			}
			if (sc2.hasNextInt()) {
				return sc2.nextInt();
			} else {
				sc2.nextLine();
			}

			sc2.close();

		}
	}

	public int getValidInt(String msg, int[] values) {
		int value = getInt(msg);
		while (true) {

			for (int i = 0; i < values.length; i++) {
				if (value == values[i]) {
					return values[i];
				}
			}
			value = getInt("Tem de ser im valor de "+ values);
		}
	}
	public long getValidLong(String msg, long[] values) {
		long value = getInt(msg);
		
		while (true) {
			if (value==-1) {
				return -1;
			}
			for (int i = 0; i < values.length; i++) {
				if (value == values[i]) {
					return values[i];
				}
			}
			value = getInt("Tem de ser im valor de ");
		}
	
	}
	
	public long getValidLongList(String msg, ArrayList<Long> values) {
		long value = getInt(msg);
		
		while (true) {
			if (value==-1) {
				return -1;
			}
			for (int i = 0; i < values.size(); i++) {
				if (value == values.get(i)) {
					return values.get(i);
				}
			}
			value = getInt("Tem de ser im valor de ");
		}
	
	}

	public int getValidInt(String msg, int min, int max) {
		int value = getInt(msg);
		while (true) {
			if (value >= min && value <= max) {
				return value;
			}
			value = getInt("Entre "+min+" e "+ max);
		}

	}
	
	public long getValidLong(String msg, Long min, Long max) {
		long value = getInt(msg);
		while (true) {
			if (value >= min && value <= max) {
				return value;
			}
			value = getInt("Entre "+min+" e "+ max);
		}

	}
	public long getLong(String msg) {
		while (true) {
			String value = getValue(msg);
			Scanner sc2 = new Scanner(value);
			if (value.equals("")) {
				return -1;
			}
			if (sc2.hasNextLong()) {
				return sc2.nextLong();
			} 
			sc2.close();

		}
	}


public float getFloat(String msg, Boolean valid) {
	while (true) {
		String value = getValue(msg);
		Scanner sc2 = new Scanner(value);
		if (value.equals("") && valid == true) {
			return -1;
		}
		if (sc2.hasNextFloat()) {
			return sc2.nextFloat();
		}

		sc2.close();

	}
}}
