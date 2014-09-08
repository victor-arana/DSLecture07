package com.arana.ds.lecture07;

public class ListNode {
	public int item;
	public ListNode next;
	
	// CONSTRUCTORS	
	// Constructor a new node
    public ListNode(int item, ListNode next) {
    	this.item = item;
    	this.next = next;
    }
    
    // Construct with null next reference
    public ListNode(int item){
    	this(item, null);
    }
    
    // METHODS
    // Insert an item after this
    public void insertAfter(int item){
    	this.next = new ListNode(item, this.next);
    }
    
    // Finds the nth item in a list 
    public ListNode nth(int position){
    	if (position == 1){
    		return this;
    	// The thing we are looking for does not exists
    	} else if ( (position < 1) || (next == null)){
    		return null;
    	} else {
    		return next.nth(position - 1);
    	}    	    } 

}
