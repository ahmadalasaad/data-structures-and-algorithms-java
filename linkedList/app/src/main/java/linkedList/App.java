/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedList;

public class App {

    public static void main(String[] args) {
        LinkedList<Integer> listNumber=new LinkedList<Integer>();
        listNumber.insert(5);
        listNumber.insert(3);
        listNumber.insert(2);
        listNumber.insert(8);
        System.out.println(listNumber.includes(5));
        System.out.println(listNumber.toString());

    }
}
