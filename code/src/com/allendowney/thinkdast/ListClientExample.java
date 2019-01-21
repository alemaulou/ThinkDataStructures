package com.allendowney.thinkdast;

import java.util.ArrayList;
import java.util.List;

public class ListClientExample {
	@SuppressWarnings("rawtypes")
	private List<Integer> list;

	@SuppressWarnings("rawtypes")
	public ListClientExample() {
	    // init list as new LinkedList 
		list = new ArrayList<Integer>();
	}

	@SuppressWarnings("rawtypes")
	public List<Integer> getList() {
	    // getter method refers to inner list object.
		return list;
	}

	public static void main(String[] args) {
		ListClientExample lce = new ListClientExample();
		@SuppressWarnings("rawtypes")
		List<Integer> list = lce.getList();
		System.out.println(list);
	}
}
