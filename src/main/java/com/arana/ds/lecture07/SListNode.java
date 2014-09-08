package com.arana.ds.lecture07;

public class SListNode {
	public Object item;
	public SListNode next;
	
	// CONSTRUCTORS	
	// Constructor a new node
    public SListNode(Object item, SListNode next) {
    	this.item = item;
    	this.next = next;
    }
    
    // Construct with null next reference
    public SListNode(Object item){
    	this(item, null);
    }
    
    // METHODS
    // Insert an item after this
    public void insertAfter(Object item){
    	this.next = new SListNode(item, this.next);
    }
    
    // Finds the nth item in a list 
    public SListNode nth(int position){
    	if (position == 1){
    		return this;
    	// The thing we are looking for does not exists
    	} else if ( (position < 1) || (next == null)){
    		return null;
    	} else {
    		return next.nth(position - 1);
    	}    	    } 

}
