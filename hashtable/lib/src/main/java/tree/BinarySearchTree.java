package tree;

public class BinarySearchTree <T> extends tree.BinaryTree {

    public void insert(Integer key) {
        Node node = new Node(key);
        Node temp = root;
        if (root == null) {
            root = node;
            return;
        }
        while (temp != null) {
            if(key> (Integer) temp.value){
                if(temp.right ==null){
                    temp.right =node;
                    return;
                }else {
                    temp =temp.right;
                }
            }
           else if(key< (Integer) temp.value){
                    if(temp.left ==null){
                        temp.left =node;
                        return;
                    }else {
                        temp =temp.left;
                    }
            }
        }
    }

    public boolean contains(Integer key) {
        Node temp = root;

        while(temp!=null){
            if (temp.value == key) {
                return true;
            }
            if(key>(Integer) temp.value){
                if(temp.right!=null){
                    temp=temp.right;
                }else {
                    return false;
                }
            }
            else if(key<(Integer) temp.value){
                if(temp.left!=null){
                    temp=temp.left;
                }else {
                    return false;
                }
            }
        }
        return false;
    }



    public T getMax(){
        return findMax(root);
    }

    public T findMax(Node root){
        Node temp =root;
        while (temp!=null){
            if (temp.right!=null){
                temp=temp.right;
            }else {
                return (T) temp.value;
            }
        }
        String str="the tree is empty";
           return (T) str;
}

    private static int getLeafCount(Node node)
    {
        if (node == null)
            return 0;
        if (node.left == null && node.right == null)
            return 1;
        else
            return getLeafCount(node.left) + getLeafCount(node.right);
    }
    public static boolean leafCompare(Node root1,Node root2){
        return getLeafCount(root1)==getLeafCount(root2);
    }
}

