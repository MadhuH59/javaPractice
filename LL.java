package array.linked_List;


// every single item knows about the next item.

// head --> head will be pointing to the first node in a linked list
// tail --> tail will be pointing to the last node of a linked list.

/* structure of linkedlist
 * class node{
 * int value;
 * node next;
 * }
 */

 // cons: we cant directly get the ndex of LL

import java.util.*;


public class LL {

    private node head;
    private node tail;


    public LL(node head,node tail){
        this.head=head;
        this.tail=tail;
    }


    public class node{

        private int val;
        private node next;

        public node(int val){

            this.val=val;
        }

        public node(int val, node next){

            this.val=val;
            this.next=next;
        }
    }
    
}
