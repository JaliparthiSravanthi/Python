class MyLinkedList {

        class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
        Node(int data,Node next,Node prev){
            this.data=data;
            this.next=next;
            this.prev=prev;
        }
        }
        Node head;
        public MyLinkedList(){
            head=null;
        }
    
    
    public int get(int index) {
       Node temp=head;
       int c=0;
       while(temp!=null){
        if(c==index) return temp.data;
        c++;
        temp=temp.next;
       }
    return -1;
    }
    
    public void addAtHead(int val) {
       if(head==null){
       head=new Node(val);
       return ;
       }
       Node newnode=new Node(val,head,null);
       head.prev=newnode;
       head=newnode;
    }
    
    public void addAtTail(int val) {
    if(head==null){
         head=new Node(val);
        return;
    }
    else if(head.next==null){
        Node newnode=new Node(val,null,head);
        head.next=newnode;
        return;
    }
    Node temp=head;
    while(temp.next!=null){
        temp=temp.next;
    }
    Node newnode=new Node(val,null,temp);
    temp.next=newnode;
    }
    
    public void addAtIndex(int index, int val) {
        if(head==null){
            if(index==0){
             head=new Node(val);}
            return;
        }
        if(index==0){
         Node newnode=new Node(val,head,null);
         head.prev=newnode;
         head=newnode;  
         return;
        }
        Node temp=head;
        int c=0;
        while(temp!=null){
        if(c==index){
        Node back=temp.prev;
        Node newnode=new Node(val,temp,back);
        back.next=newnode;
        temp.prev=newnode;
        return;
        }
        c++;
        temp=temp.next;
        }
        if(c==index){
            Node tail=head;
            while(tail.next!=null){
                tail=tail.next;
            }
            Node newnode=new Node(val,null,tail);
            tail.next=newnode;
        }
           
        
     }
    
    public void deleteAtIndex(int index) {
        if(head==null) return;
        Node temp=head;
        int c=0;
        while(temp!=null){
            if(c==index) break;
            c++;
            temp=temp.next;
        }
        if(temp==null) return;
        Node back=temp.prev;
        Node front=temp.next;
        if(front==null && back==null){
            head=null;
            return;
        }
        if(back==null){
            head=head.next;
            head.prev=null;
            temp.next=null;
            return;
        }
        else if(front==null){
            back.next=front;
            temp.prev=null;
            return;
        }
        back.next=front;
        front.prev=back;
        temp.next=null;
        temp.prev=null;

    }
}
/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */