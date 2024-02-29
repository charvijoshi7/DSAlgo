package LinkedList;

import java.util.*;


public class Practice1 {
 
 public Node head=null;
 public Node tail=null;
 
 public void addNode(int data) {
 
	 
	 //Step-create new node
	 
	 Node new_node=new Node(data);
	 
	 //Step-add new node at end of linked list	 
	 //if linked list is empty
	 
	 if(head==null)
	 {
		 //insert first node to linked list
		 head=new_node;
		 tail=new_node;
	 }
	 else
	 {
		 //add node at end of linked list
		 tail.next=new_node;
		 					/*we don't need-"new_node.next=null;" as node class already has set this.next=null*/
		 tail=new_node;
	 }
	 
	}
 
 public void addNode(int data,int index) {
	 Node new_node=new Node(data);
	 if(head==null)
	 {
		 head=new_node;
		 tail=new_node;
	 }
 }
 
}
