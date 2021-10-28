/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stackqueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static <T> void main(String[] args) {
        /*--------------class10------------------*/
        Stack stack1=new Stack();
        stack1.push(10);
        stack1.push(5);
        stack1.push(7);
        stack1.push(6);

        T returnedValue= (T) stack1.pop();
        System.out.println(returnedValue);
        System.out.println(stack1.toString());


        Queue queue1=new Queue();
        queue1.enqueue(2);
        queue1.enqueue(3);
        queue1.enqueue(4);
        queue1.enqueue(5);
        T returnedValueQueue=(T) queue1.dequeue();
        System.out.println(returnedValueQueue);
        System.out.println(queue1.toString());

        /*------------------------------------------------------------------------------------------------*/
        /*---------------------------------------------class11--------------------------------------------*/

        PseudoQueue pseudoQueue1 =new PseudoQueue();
        pseudoQueue1.enqueue(1);
        pseudoQueue1.enqueue(2);
        pseudoQueue1.enqueue(3);
        pseudoQueue1.enqueue(4);
        pseudoQueue1.dequeue();
//        pseudoQueue1.dequeue();
//        pseudoQueue1.dequeue();
//        pseudoQueue1.dequeue();

        System.out.println(pseudoQueue1.toString());

        /*------------------------------------------------------------------------------------------------*/
        /*-------------------------------------------class12----------------------------------------------*/
        Animal dog1=new Dog("Spike");
        Animal dog2=new Dog("Pop");
        Animal dog3=new Dog("Rock");
        Animal cat1=new Cat("semsem");
        Animal cat2=new Cat("sokar");
        AnimalShelter house=new AnimalShelter();
        house.enqueue(dog1);
        house.enqueue(dog2);
        house.enqueue(dog3);
        house.enqueue(cat1);
        house.enqueue(cat2);
        System.out.println( house.dequeue());
        System.out.println( house.dequeue());
        System.out.println( house.dequeue());
        System.out.println( house.dequeue());
        System.out.println(house.toString());
//        System.out.println( getMax(stack1));
    }
//    public static Integer getMax(Stack stack){
//        Node current=stack.top;
//        Integer max=0;
//        while (current!=null){
//            if((int) current.value>max){
//                max= (int)current.value;
//            }
//            current=current.next;
//        }
//        return max;
//    }
}
