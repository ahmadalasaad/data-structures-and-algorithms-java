package stackqueue;

public class PseudoQueue {
     Node top;
     public <T> void enqueue(T value){
         Node newNode=new Node(value);
         newNode.next=top;
         top=newNode;
     }
    public void dequeue(){
        Stack stack=new Stack();
         Node current=top;
        if(top==null){
            return ;
        }
         while (current.next!=null){
             stack.push(current.value);
             current=current.next;
         }

        top=null;
         current= stack.top;
         while (current!=null){
             enqueue(current.value);
            current = current.next;
         }
    }
    @Override
    public String toString() {
        Node current=top;
        String result= "top->";
        while (current!=null){
            result+=" { "+current.value+" } -> ";
            current=current.next;
        }
        return result+"NULL";
    }
}
