package java_dsa_program;
// singlelinked list program

import java.util.*;// import all utility package
// node creation
class Node{ //for that create the class
    int data;  //for that create the variable for store the data which is used to insert in the node
    Node next; // create the node variable which has data part (int data) and address part(to store  the address of the next node) 
    Node(int x){
        data=x;     /*in the node  data(x whic is (int data) in line 6) is store the data 
                    And next is store the address of the next node we set as null */
        next=null;
    }
}
/*
 * at first the linked list is empty so the head and tail is null
 * the create function is used to insert the data in the node
 */
class linkedlist{
    Node head = null;
    Node tail = null;
    void create(int data){
    Node obj1 = new Node(data); //create the object to access the Node class() data and method) 
    if (head == null) {
       head = obj1; // if the list is empty the inset the first element in head node
       tail= obj1;  

    }
    else{
        tail.next = obj1;
        tail = obj1;
    }

     }
          // display function to print the element in linked list
    void display(){
        Node temp = head;  // store the head node in the temp node
        while(temp!=null){// in this loop the temp node go to the next node and print the data if int not null
            System.out.print(temp.data+" "); // print the data
            temp = temp.next; // it move the acess to next node untill it become temp=null
        }
    }
    // linked list sorting function 
    void sort (){
       Node temp1; // createing the first temp node 
       Node temp2 ;// creating the second temp node
       for (temp1=head;temp1!=null;temp1=temp1.next){ 
           for(temp2=temp1.next;temp2!=null;temp2=temp2.next){ 
               if(temp1.data>temp2.data){
                   int t = temp1.data; // sort ing the program
                   temp1.data = temp2.data;
                   temp2.data =t;
               }
           }
       }


    }
    /**
     * // traversing the linked list to know last before  node data
        // temp1.next!=null it address the next node address it go to that data if the address ia null then it wxite the loop temp2 contain the last before node value
     */
    void secondmax(){
        Node temp1;
        int t2=0;
        for (temp1=head;temp1.next!=null;temp1=temp1.next){   
            }
            
            System.out.println(t2);
        }
    }

class linkedlist_single {
    public static void main(String[] args) {
        linkedlist obj2 = new linkedlist();
        // creating the loop[] to get the input from the user
        Scanner objScanner = new Scanner(System.in);
        System.out.print("Enter the number:"); 

        int n = objScanner.nextInt();
        for (int i = 0; i < n; i++) { 
            int r=objScanner.nextInt();  
            obj2.create(r);
        
        }
        // calling display function
        //obj2.display();
        // calling sort function

         obj2.sort();
         obj2.display();
         obj2.secondmax();
        

    }

}