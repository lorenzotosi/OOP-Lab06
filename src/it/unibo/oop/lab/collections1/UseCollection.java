package it.unibo.oop.lab.collections1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
 * Example class using {@link java.util.List} and {@link java.util.Map}.
 * 
 */
public final class UseCollection {

    private UseCollection() {
    }

    /**
     * @param s
     *            unused
     */
    public static void main(final String... s) {
    	
    	ArrayList<Integer> a1 = new ArrayList<Integer>();
    	
    	long time = System.nanoTime();
    	
    	for(int i=1000; i<2000; i++) {
    		a1.add(i);
    	}
    	
    	
    	LinkedList<Integer> l1 = new LinkedList<>();
    	
    	l1.addAll(a1);
    	
    	
    	int num=a1.get(a1.size()-1);
    	a1.set(a1.size()-1, a1.get(0));
    	a1.set(0, num);
    	
    	for (Integer i: a1) {
    		System.out.println(i);
    	}
    	
    	time = System.nanoTime() - time;
    	
    	System.out.println("Converting x int to String and inserting them in a Set took " + time
                + "ns (" + time / 1_000_000 + "ms)");
    	
    	Map <String,Long> m1 = new HashMap<>();
    	
    	m1.put("Africa", 1_110_635_000L);
    	m1.put("Americas", 1_110_635_000L);
    	m1.put("Antarctica", 0L);
    	m1.put("Asia", 4_298_723_000L);
    	m1.put("Europe", 742_452_000L);
    	m1.put("Oceania", 38_304_000L);
    	
        /*
         * 1) Create a new ArrayList<Integer>, and populate it with the numbers
         * from 1000 (included) to 2000 (excluded).
         */
        /*
         * 2) Create a new LinkedList<Integer> and, in a single line of code
         * without using any looping construct (for, while), populate it with
         * the same contents of the list of point 1.
         */
        /*
         * 3) Using "set" and "get" and "size" methods, swap the first and last
         * element of the first list. You can not use any "magic number".
         * (Suggestion: use a temporary variable)
         */
        /*
         * 4) Using a single for-each, print the contents of the arraylist.
         */
        /*
         * 5) Measure the performance of inserting new elements in the head of
         * the collection: measure the time required to add 100.000 elements as
         * first element of the collection for both ArrayList and LinkedList,
         * using the previous lists. In order to measure times, use as example
         * TestPerformance.java.
         */
        /*
         * 6) Measure the performance of reading 1000 times an element whose
         * position is in the middle of the collection for both ArrayList and
         * LinkedList, using the collections of point 5. In order to measure
         * times, use as example TestPerformance.java.
         */
        /*
         * 7) Build a new Map that associates to each continent's name its
         * population:
         * 
         * Africa -> 1,110,635,000
         * 
         * Americas -> 972,005,000
         * 
         * Antarctica -> 0
         * 
         * Asia -> 4,298,723,000
         * 
         * Europe -> 742,452,000
         * 
         * Oceania -> 38,304,000
         */
        /*
         * 8) Compute the population of the world
         */
    }
}
