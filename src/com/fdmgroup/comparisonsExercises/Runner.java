package com.fdmgroup.comparisonsExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Runner {

	public static void main(String[] args) {
		
		Book learnJava = new Book("Learn Java", 45678, 19.99, 500, 4.3);
		Book learnUnix = new Book("Learn UNIX", 65432, 17.5, 650, 3.9);
		Book learnSQL = new Book("Learn SQL", 87956, 9.75, 220, 4.4);
		Book learnAgile = new Book("Learn Agile", 35367,25.5 ,500 ,4.4);
		Book learnReact = new Book("Learn React", 55676, 28.75, 490 ,4.8);
		Book learnJavaScript = new Book("Learn JavaScript" ,34343 ,14.99 ,300, 4.4);
		Book learnPython = new Book("Learn Python", 65767, 27.25 , 500, 4.1);
		
		ArrayList<Book> books = new ArrayList<Book>();
		
		books.add(learnJava);
		books.add(learnUnix);
		books.add(learnSQL);
		books.add(learnAgile);
		books.add(learnReact);
		books.add(learnJavaScript);
		books.add(learnPython);
		
		//1. sort by number of pages
		Collections.sort(books, new PageComparator());
		Iterator<Book> itr = books.iterator(); 
		
		while (itr.hasNext()) {
			Book b1 = (Book)itr.next();
			System.out.println("Number of Pages: " + b1.getNumberOfPages());
			
		}
		
		System.out.println();
		
		//2. sort by title
		Collections.sort(books, new NameComparator());
		Iterator<Book> itr2 = books.iterator();
		
		while (itr2.hasNext()) {
			Book b2 = (Book)itr2.next();
			System.out.println("Title: " + b2.getTitle());
		}
		
		System.out.println();
		
		//3. sort by price in descending order
		Collections.sort(books, new PriceComparator());
		
		Iterator<Book> itr3 = books.iterator();
		
		while (itr3.hasNext()) {
			Book b3 = (Book)itr3.next();
			System.out.println(b3.getPrice());
		}
		
		
	}

}
