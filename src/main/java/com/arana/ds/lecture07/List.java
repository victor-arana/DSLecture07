package com.arana.ds.lecture07;
/**
 * @(#)List.java
 *
 *
 * @author Víctor José Arana Rodríguez
 * @version 1.00 2013/4/5
 */

public class List {

	// INSTANCE VARIABLES
	int[] a;   			// Integers list
	int lastItem;  		//Index to the last item of the list
	
	// CONSTRUCTORS
    // Initialize a new empty list of 10 integers
    public List(){
    	this.a = new int[10];   // The number 10 is arbitrary
    	this.lastItem = -1; 	   	
    }
    
    // Insert an element at a specific location    
    public void insertItem(int newItem, int location){

    	int i;
    	
        // 01. Check if the array is full
    	if(lastItem + 1 == a.length){
            // 01.1 Allocate a new array, twice as long
    		int b[] = new int[2*a.length];
            // 01.2 Copy items to the bigger array
			for( i = 0 ; i <= lastItem ; i++ ){
				b[i] = a[i];
			}
            // 01.3 Replace the too-small array with the new one
			this.a = b;
    	}

        // 02. Shift items to the right
    	for(i = lastItem; i >= location; i--){
    			a[i+1] = a[i];
    	}

    	// 03. Insert the new item, at the specified location
        a[location]	= newItem;

        // 04. Increment the last item index
    	lastItem++;    			
    }
}
