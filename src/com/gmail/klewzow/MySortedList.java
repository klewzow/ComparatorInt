package com.gmail.klewzow;

import java.util.Comparator;
import java.util.List;

public class MySortedList implements Comparator<Integer> {
	private List<Integer> list;

	public MySortedList(List<Integer> list) {
		super();
		this.list = list;
	}

	public MySortedList() {
		super();
	}

	/**
	 * @return the list
	 */
	public List<Integer> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(List<Integer> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "MySortedList [list=" + list + "]";
	}

	@Override
	public int compare(Integer o1, Integer o2) {
		StringBuilder sb = new StringBuilder();

		int obj1 = o1 < 10 ? o1
				: Integer.parseInt(sb.append(o1).substring(0, 1).toString())
						+ Integer.parseInt(sb.append(o1).substring(sb.length() - 1).toString());

		sb = new StringBuilder().append(o2);

		int obj2 = o2 < 10 ? o2
				: Integer.parseInt(sb.append(o2).substring(0, 1).toString())
						+ Integer.parseInt(sb.append(o2).substring(sb.length() - 1).toString());

		return obj1 - obj2;
	}

}
