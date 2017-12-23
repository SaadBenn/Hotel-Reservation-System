
class List {
 
 private Node top;
 private Node end;
 private int numItems;
 
 //constructor
 public List(){
  top = null;//sets top to null
  end = null;//sets end to null
  numItems = 1;//initializes numItems to 1
 }
 
 //getter for top
 public Node getTop(){ return top; }
 
 //setter for top
 public void setTop(Node newNode){ top=newNode; }
 
 //getter for numItems
 public int getCount(){ return numItems; }
 
 
 /**
  * isEmpty
  * returns true if the list is empty,false otherwise
  */
 public boolean isEmpty(){ return top == null; }
 
 /**
  * incrementNumItems
  * increases the number of items by 1
  */
 public void incrementNumItems(){ numItems++; }
 
 public void add(Object item) {
	 Node newNode = new Node(item);
	 
	 if( top == null && end == null) {
		 top = newNode;
		 end = newNode;
	 } else {
		 end.setNext(newNode);
		 end = newNode;
	 }
	 numItems++;
 }
 
 
 /**
  * insertEnd
  * inserts a new node to the end of the list
  * input - object to be inserted
  * output - none
  */
// public void insertEnd(Object newItem){
//  //creates a new node
//  Node newNode=new Node(newItem);
//  int res=Integer.MIN_VALUE;
//  //checks if top and end both are null
//  if(top==null&&end==null){
//   //sets both top and end to null
//   top=end=newNode;
//  }
//  //else if both top and end points to the same node
//  else if(top == end){
//   //compares newNode to the first element
//   res = newNode.compare(top.getData());
//   //if it is not a duplicate
//   if(res!= 0){
//    //adds the new node to the end
//    top.setNext(newNode);
//    //updates end
//    end = end.getNext();
//   }
//  }
//  else{
//   //sets curr to top
//   Node curr = getTop();
//   //checks if curr is not null
//   if(curr!= null){
//    //compares new node with curr
//    res = newNode.compare(curr.getData());
//   }
//   //loop goes till curr is not null and till res is not 0
//   while(curr!= null && res!= 0){
//    curr = curr.getNext();//updates curr to the next node
//    if(curr != null){//checks if curr is not null
//     //compares new node with curr
//     res = newNode.compare(curr.getData());
//    }
//   }
//   //checks if newNode is not a dupicate and if curr is null
//   if(res!= 0 && curr == null){
//    //adds the newNode at the end
//    end.setNext(newNode);
//    end=end.getNext();//updates end to next node
//   }
//  }
//  //increases numItems by 1
//  numItems++;
// }
 
 
 /**
  * removeFront
  * removes the first node from the list
  * input - none
  * output - none
  */
 public void removeFront(){

  if (top != null){
   //updates top to the next node
   top = top.getNext();
  }
  //decreases numItems by 1
  numItems--;
 }
 
 
 /**
  * remove
  * removes a node from a particular position in the list
  * input - position
  * output - none
  */
 public void remove(int index) {
  Node curr = top;//sets curr to top
  Node prev = null;//sets prev to null
  numItems--;//decreases numItems by 1
  //loop goes till curr is not null and index > 1
  while(curr != null & index > 1){
   index--;//decreases index by 1
   prev=curr;//sets prev to curr
   curr=curr.getNext();//updates curr to next node
 
  }
  //checks if prev is null
  if(prev==null){
   //updates top to the next node
   top=top.getNext();
  }
  else{//else if prev is not null
   //sets next of prev to next of curr
   prev.setNext(curr.getNext());
  }
 }
 
// public Object search(String target){
//	  
//	  boolean found=false;//sets found to false
//	  Object toReturn=null;//sets toReturn to null
//	  
//	  String first="";//creates an empty string
//	  
//	  Node curr=getTop();//sets curr to top
//	  Node prev=null;//sets prev to null
//	  
//	  //loop goes till curr is not null and object is not found
//	  while(curr!=null&&!found){
//	   //checks if curr is instance of Movies
//	   if(curr.getData() instanceof Hotels){
//	    //adds the title of curr to first
//	    first=((Hotels)curr.getData()).getName();
//	    //compares first with target
//	    if(first.compareToIgnoreCase(target)==0){
//	     found=true;//sets found to true if the two strings are the same
//	     
//	    } 
//	   }   
//	   prev=curr;//sets prev to curr
//	   curr=curr.getNext();//updates curr to the next node
//	   first="";//makes first empty  
//	  }
//	  //checks if prev is not null and if object is found
//	  if(prev!=null&&found){
//	   //adds prev's data to toReturn
//	   toReturn=prev.getData();
//	  }  
//	  return toReturn;
//	 }

 public Object traversal() {
	 Object result = null;
	 int minCost = Integer.MAX_VALUE;
	 Node curr = getTop();
	 while(curr != null ) {
		 if( curr.getData() instanceof Rooms) {
			 Rooms rObj = (Rooms)curr.getData();
			 if(!rObj.getOccupied()) {
				 if(rObj.getRate() < minCost) {
					 minCost = rObj.getRate();
					 result = rObj;
				 }
				 
			 }
		 }
		 curr = curr.getNext();
	 }
	 return result;
 }
 
 /**
  * print
  * prints the details of the list
  * input - none
  * output - none
  */
 public void print(){
  Node curr = top;//sets curr to top
  
  //loop goes till curr is not null
  while(curr != null){
   //checks if curr is an instance of Moies
   if(curr.getData() instanceof Hotels){
    //prints the current node
    System.out.println("\n"+curr);
   }
    if( curr.getData() instanceof Hotels ) {
    	Object obj = curr.getData();
//    
    	List rList = ((Hotels)obj).rList();
    	rList.print();
    }
  
//   else if curr is an instance if Customers
  else if(curr.getData() instanceof Customers){
	   System.out.println( curr);
   } else {
	   System.out.println(curr);
   }
    
   curr=curr.getNext();//updates curr to next node
  }
 
 }
 
}

