/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class Library {
    public static void main(String[] args) {
        BinarySearchTree test=new BinarySearchTree();
        test.insert(50);
        test.insert(30);
        test.insert(20);
        test.insert(40);
        test.insert(70);
        test.insert(60);
        test.insert(80);
        BinarySearchTree test2=new BinarySearchTree();
        test2.insert(50);
        test2.insert(30);
        test2.insert(20);
        test2.insert(40);
        test2.insert(70);
        test2.insert(60);
        test2.insert(80);


//        System.out.println(test.inOrder(test.root)+" inOrder");
//        System.out.println(test.preOrder(test.root)+" preOrder");
//        System.out.println(test.postOrder(test.root)+" postOrder");
//        System.out.println(test.contains(50));
//        System.out.println(test.getMax());
//        System.out.println(breadthFirst(test));
        System.out.println(BinarySearchTree.leafCompare(test.root, test2.root));

    }
    /*---------------challenge 17----------------*/
    public static ArrayList   breadthFirst(BinarySearchTree tree) {
        Queue<Node> breadth = new LinkedList<>();
        ArrayList treeList=new ArrayList();
        breadth.add(tree.root);
        while (breadth.peek() != null) {
            Node front = breadth.remove();
            treeList.add(front.value);
            if (front.left != null)
                breadth.add(front.left);
            if (front.right != null)
                breadth.add(front.right);
        }

        return treeList;
    }
}
