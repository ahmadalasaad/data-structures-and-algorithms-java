package stackqueue;

public class Stack {
    Node top;

    public <T> void push(T value){

        Node newNode=new Node(value);
        newNode.next=top;
        top=newNode;
    }
    public <T> T  pop(){
        if(isEmpty()){
            String returnSt="the stack already empty";
            return (T) returnSt;
        }
        Node temp=top;
        top=top.next;
        temp.next=null;
        return (T) temp.value;
    }

public boolean isEmpty(){
        return top==null;
}
    public <T> T  peek(){
        if(isEmpty()){
            String returnSt="the stack already empty";
            return (T) returnSt;
        }
        return (T) top.value;
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
