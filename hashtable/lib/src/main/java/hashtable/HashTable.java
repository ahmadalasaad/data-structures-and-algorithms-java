package hashtable;

import tree.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HashTable<k, v> {

    private ArrayList<HashNode<k, v>> bucketArray;
    private int numBuckets;
    private int size;

    public HashTable() {
        bucketArray = new ArrayList<>();
        numBuckets = 30;
        size = 0;
        for (int index = 0; index < numBuckets; index++) {
            bucketArray.add(null);
        }
    }

    private int hashCode(k key){
        return Objects.hashCode(key);
    }

    private int getBucketIndex(k key){
        int hashCode = hashCode(key);

        int index = hashCode % numBuckets;
        index = index < 0 ? index * -1 : index;

        return index;
    }

    public int getSize(){
        return size;
    }

    public  boolean isEmpty(){
        return getSize()==0;
    }

    public void add(k key, v value){
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<k, v> head = bucketArray.get(bucketIndex);

        while (head != null){
            if (head.key.equals(key) && head.hashCode == hashCode){
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        head = bucketArray.get(bucketIndex);
        HashNode<k, v> newNode = new HashNode<>(key, value, hashCode);

        newNode.next = head;
        bucketArray.set(bucketIndex, newNode);

        if((1 * size) / numBuckets >= 0.8){
            ArrayList<HashNode<k, v>> temp = bucketArray;
            bucketArray = new ArrayList<>();
            numBuckets = 2 * numBuckets;

            size = 0;

            for (int index = 0; index < numBuckets; index++) {
                bucketArray.add(null);
            }

            for(HashNode<k, v> headNode : temp){
                while (headNode != null){
                    add(headNode.key, headNode.value);
                    headNode =  headNode.next;
                }
            }
        }
    }
    public v get(k key){
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);
        HashNode<k, v> head = bucketArray.get(bucketIndex);

        while (head != null){
            if(head.key.equals(key) && head.hashCode== hashCode){
                return head.value;
            }
            head = head.next;
        }
        return null;
    }
    public boolean contain(k key){
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);
        HashNode<k, v> head = bucketArray.get(bucketIndex);

        while (head != null){
            if(head.key.equals(key) && head.hashCode== hashCode){
                return true;
            }
            head = head.next;
        }
        return false;
    }
    /*ch31*/
    public String firstRepeated(String input){
        String string[] = input.split(" ");
        HashTable<String, Integer> setOfWord = new HashTable<>();

        for (int i = 0; i < string.length; i++) {
            if(setOfWord.contain(string[i])){
                setOfWord.add(string[i],setOfWord.get(string[i])+1);
            }else{
                setOfWord.add(string[i],1);
            }
        }

        for(int i =0 ; i< string.length; i++){
            int count = setOfWord.get(string[i]);
            if(count>1){
                return string[i];
            }
        }
        return  "No repetition";
    }
/*ch32*/
public List<Integer> repeatedNodes(BinaryTree firstTree, BinaryTree secondTree){
    List<Integer> list1= firstTree.inOrder(firstTree.root);
    List<Integer> list2= secondTree.inOrder(secondTree.root);

    List<Integer> list3 = new ArrayList<>();

    for (int i = 0; i < list1.size(); i++) {
        for (int j = 0; j < list2.size(); j++) {
            if (list1.get(i).equals(list2.get(j))) {
                list3.add(list1.get(i));
            }
        }
    }
    return list3;

}
    }
