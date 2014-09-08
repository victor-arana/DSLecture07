package com.arana.ds.lecture07;

public class SList {
	private SListNode head;		// First node in list
	private int size; 			// Number of items in List
	
	public SList() {
		this.head = null;
		this.size = 0;
	}
	
	public void insertFront(Object item){
		this.head = new SListNode(item, head);
		this.size++;
	}
	
	

}
