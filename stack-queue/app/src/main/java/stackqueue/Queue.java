package stackqueue;

public class Queue {
    Node front=null;
    Node rear=null;
  public <T> void enqueue(T value){
      Node newNode=new Node(value);

      if(isEmpty()){
          front=newNode;
      }else {
          rear.next=newNode;
      }
      rear=newNode;
  }
    public <T> T dequeue(){
        Node temp=front;
            if(isEmpty()){
                String returnSt="the stack already empty";
                return (T) returnSt;
            }
        else {
           front=front.next; ;
        }
        temp.next=null;
        return (T)temp.value;
    }
    public boolean isEmpty(){
        return front==null;
    }
    public <T> T  peek(){
        if(isEmpty()){
            String returnSt="the stack already empty";
            return (T) returnSt;
        }
        return (T) front.value;
    }
    @Override
    public String toString() {
        Node current=front;
        String result= "front->";
        while (current!=null){
            result+=" { "+current.value+" } -> ";
            current=current.next;
        }
        return result+"NUll";
    }

}
