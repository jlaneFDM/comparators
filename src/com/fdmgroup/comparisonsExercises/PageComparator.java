package com.fdmgroup.comparisonsExercises;

import java.util.Comparator;

public class PageComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		Book b1 = o1;
		Book b2 = o2;

		if (b1.getNumberOfPages() == b2.getNumberOfPages()) {
			return 0;
			
		}else if(b1.getNumberOfPages() > b2.getNumberOfPages()) {
			return 1;
		}
		return -1;
	}
}
