/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

public class Library {
    public static void main(String[] args) {
        BinarySearchTree test=new BinarySearchTree();
        test.insert(50);
//        test.insert(30);
//        test.insert(20);
//        test.insert(40);
//        test.insert(70);
//        test.insert(60);
//        test.insert(80);
//        System.out.println(test.inOrder(test.root)+" inOrder");
//        System.out.println(test.preOrder(test.root)+" preOrder");
        System.out.println(test.postOrder(test.root)+" postOrder");
        System.out.println(test.contains(50));
    }
}
