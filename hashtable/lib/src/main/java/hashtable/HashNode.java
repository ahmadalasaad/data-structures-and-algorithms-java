package hashtable;

public class HashNode <k,v>{
 public    k key;
  public   v value;

    final int hashCode;

   public HashNode<k,v> next;

    public HashNode(k key, v value, int hashCode) {
        this.key = key;
        this.value = value;
        this.hashCode = hashCode;
    }
}
