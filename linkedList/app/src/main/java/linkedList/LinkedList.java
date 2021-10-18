package linkedList;

public class LinkedList<T>{
    Node head;

    public T kthFromEnd(int k){
        int i=0;
        Node current=head;
        while (current!=null){
            i++;
            current=current.next;
        }
        current=head;
        int j=0;
        while (current!=null){
            if((i-j-1)==k) {
            return (T)current.value;
            }
                current = current.next;
                j++;
            }
        String ret="Exception";
        return (T)ret;
        }

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


