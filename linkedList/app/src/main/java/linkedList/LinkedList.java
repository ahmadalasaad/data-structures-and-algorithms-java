package linkedList;

public class LinkedList<T>{
    Node head;
    public void append(T value){
        Node newNode=new Node(value);
        Node current=head;
        while (current.next!=null){
                current=current.next;
        }
        current.next=newNode;
        newNode.next=null;

    }
    public void insertBefor(int a,T value){
        Node newNode=new Node(value);
        Node current=head;
        if(current.value.equals(a)){
            insert(value);

        }else {
            while (current != null) {
                if (current.next.value.equals(a)) {
                    newNode.next = current.next;
                    current.next = newNode;
                    break;
                }
                current = current.next;
            }
        }}
        public void insertAfter(int a,int value){
            Node newNode=new Node(value);
            Node current=head;
            while (current!=null){
                if(current.value.equals(a)){
                    newNode.next=current.next;
                    current.next=newNode;
                    break;
                }
                current=current.next;
            }
    }

    public void insert(T value){
            Node newNode=new Node(value);
            newNode.next=head;
            head=newNode;
       }
    public boolean includes(T value){
       Node current=head;
       while (current!=null){
           if(current.value.equals(value)){
               return true;
           }
           current=current.next;
       }
       return false;
    }

    @Override
    public String toString() {
        Node current=head;
        String result="";
        while (current!=null){
            result+="{ "+ current.value+" } -> ";
            current=current.next;
        }
        return result+"NULL";
    }
}


