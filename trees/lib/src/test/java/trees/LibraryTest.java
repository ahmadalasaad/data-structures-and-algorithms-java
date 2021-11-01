/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

  /*-------------------------------challenge 15--------------------- */
  @Test
  void testInEmptyTree(){
  BinaryTree emptyTree=new BinaryTree();
  assertEquals(null,emptyTree.root);
  }
  @Test
  void testTreeWithOneRootNode(){
    BinarySearchTree singleNode=new BinarySearchTree();
    singleNode.insert(5);
    ArrayList expectedVlue=new ArrayList();
    expectedVlue.add(5);
    assertEquals(expectedVlue,singleNode.inOrder(singleNode.root));
  }
  @Test
  void testTreeLeftAndRightChild(){
    BinarySearchTree singleNode=new BinarySearchTree();
    singleNode.insert(5);
    singleNode.insert(2);
    singleNode.insert(7);
    ArrayList expectedVlue=new ArrayList();
    expectedVlue.add(2);
    expectedVlue.add(5);
    expectedVlue.add(7);
    assertEquals(expectedVlue,singleNode.inOrder(singleNode.root));
  }
  @Test
  void testTreePreOrder(){
    BinarySearchTree singleNode=new BinarySearchTree();
    singleNode.insert(5);
    singleNode.insert(2);
    singleNode.insert(7);
    ArrayList expectedVlue=new ArrayList();
    expectedVlue.add(5);
    expectedVlue.add(2);
    expectedVlue.add(7);
    assertEquals(expectedVlue,singleNode.preOrder(singleNode.root));
  }
  @Test
  void testTreeInorder(){
    BinarySearchTree singleNode=new BinarySearchTree();
    singleNode.insert(5);
    singleNode.insert(2);
    singleNode.insert(7);
    ArrayList expectedVlue=new ArrayList();
    expectedVlue.add(2);
    expectedVlue.add(5);
    expectedVlue.add(7);
    assertEquals(expectedVlue,singleNode.inOrder(singleNode.root));
  }
  @Test
  void testTreePostOrder(){
    BinarySearchTree singleNode=new BinarySearchTree();
    singleNode.insert(5);
    singleNode.insert(2);
    singleNode.insert(7);
    ArrayList expectedVlue=new ArrayList();
    expectedVlue.add(2);
    expectedVlue.add(7);
    expectedVlue.add(5);
    assertEquals(expectedVlue,singleNode.postOrder(singleNode.root));
  }
  /*-------------------------------challenge 16--------------------- */
  @Test
void testInTreeGetMax(){
    BinarySearchTree tree=new BinarySearchTree();
    tree.insert(5);
    tree.insert(2);
    tree.insert(7);
    Integer expectedVlue = 7;
    assertEquals(expectedVlue,tree.getMax());
  }
  @Test
  void testInTreeGetMaxEnpty(){
    BinarySearchTree tree=new BinarySearchTree();
    String expectedVlue = "the tree is empty";
    assertEquals(expectedVlue,tree.getMax());
  }
  @Test
  void testInOneItem(){
    BinarySearchTree tree=new BinarySearchTree();
    tree.insert(5);
    Integer expectedVlue = 5;
    assertEquals(expectedVlue,tree.getMax());
  }


  /*-------------------------------challenge 16--------------------- */
@Test void testInBreadthFirst(){
  Library crrentLibrary=new Library();
  BinarySearchTree test=new BinarySearchTree();
  test.insert(50);
  test.insert(30);
  test.insert(20);
  test.insert(40);
  test.insert(70);
  test.insert(60);
  test.insert(80);


  ArrayList accpectedResult= new ArrayList();
  accpectedResult.add(50);
  accpectedResult.add(30);
  accpectedResult.add(70);
  accpectedResult.add(20);
  accpectedResult.add(40);
  accpectedResult.add(60);
  accpectedResult.add(80);

  ArrayList acctualResult=crrentLibrary.breadthFirst(test);

  assertEquals(acctualResult,acctualResult);

}

  @Test void testInBreadthEmpty(){
    Library crrentLibrary=new Library();
    BinarySearchTree test=new BinarySearchTree();

    ArrayList accpectedResult= new ArrayList();

    ArrayList acctualResult=crrentLibrary.breadthFirst(test);

    assertEquals(acctualResult,acctualResult);

  }

  @Test void testInBreadthOneNode(){
    Library crrentLibrary=new Library();
    BinarySearchTree test=new BinarySearchTree();
    test.insert(50);

    ArrayList accpectedResult= new ArrayList();
    accpectedResult.add(50);

    ArrayList acctualResult=crrentLibrary.breadthFirst(test);

    assertEquals(acctualResult,acctualResult);

  }

}
