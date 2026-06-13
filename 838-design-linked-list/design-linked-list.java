class MyLinkedList {

        class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
        Node(int data,Node next){
            this.data=data;
            this.next=next;
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
            if(c==index){
                return temp.data;
            }
            c++;
            temp=temp.next;
        }
    return -1;

    }
    
    public void addAtHead(int val) {
        Node x=new Node(val);
        x.next=head;
        head=x;
    }
    
    public void addAtTail(int val) {
    if(head == null){
       head = new Node(val);
       return;
      }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node x=new Node(val);
        temp.next=x;
    }
    
    public void addAtIndex(int index, int val) {
        if(head==null){
            if(index==0){
                 Node x=new Node(val);
            x.next=head;
            head=x;
            }
            return;
        }
        if(index==0){
            Node x=new Node(val);
            x.next=head;
            head=x;
            return;
        }
        Node temp=head;
        Node prev=null;
        int c=0;
        while(temp!=null){
            if(c==index){
               Node x=new Node(val);
               x.next=temp;
               prev.next=x;
               return;
            }
            c++;
            prev=temp;
            temp=temp.next;
        }
        if(c==index){
            Node x=new Node(val);
            prev.next=x;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(head==null) return;
        if(index==0){
            head=head.next;
            return;
        }
        Node temp=head;
        Node prev=null;
        int c=0;
        while(temp!=null){
            if(c==index){
             prev.next=temp.next;
             return;
            }
            c++;
            prev=temp;
            temp=temp.next;
        }
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