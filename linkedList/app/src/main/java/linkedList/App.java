/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedList;

public class App<T> {

    public static void main(String[] args) {
        LinkedList<Integer> listNumber=new LinkedList<Integer>();
        listNumber.insert(3);
        listNumber.insert(4);
        listNumber.insert(2);
//        listNumber.insert(10);
//        listNumber.append(5);
        LinkedList<Integer> listNumber1=new LinkedList<Integer>();
        listNumber1.insert(4);
        listNumber1.insert(6);
        listNumber1.insert(5);
//        listNumber1.insert(6);
//        listNumber.insertBefor(5,88);
//        listNumber.insertAfter(2,77);


//        System.out.println(listNumber.includes(5));
//        System.out.println(listNumber.removeItemFromFirst());
//        System.out.println(listNumber.toString());
//
//        System.out.println(listNumber.kthFromEnd(9));
//        System.out.println(zipLists(listNumber,listNumber1));
//        System.out.println( reverse(listNumber));
    }

        public static LinkedList<Integer> zipLists(LinkedList<Integer> list1,LinkedList<Integer> list2){
            LinkedList<Integer> zipList = new LinkedList<Integer>();
            Node current1= list1.head;
            Node current2= list2.head;
            while(current1!=null||current2!=null){
                if(current1!=null) {
                    zipList.append((Integer) current1.value);
                    current1=current1.next;
                }
                if(current2!=null) {
                    zipList.append((Integer) current2.value);
                    current2=current2.next;
                }
            }
            return zipList;
    }
//    public static LinkedList<Integer> reverseList(LinkedList<Integer> list){
//    LinkedList<Integer> reversedList=new LinkedList<>();
//        Node current= list.head;
//        int i=0;
//        while(current!=null){
//            reversedList.append(list.kthFromEnd(i));
//            i++;
//            current=current.next;
//        }
//    return reversedList;
//    }

}
