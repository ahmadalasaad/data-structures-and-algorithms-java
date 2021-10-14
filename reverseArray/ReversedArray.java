public class ReversedArray{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        reverseArray(arr);
    }


static int[] reverseArray(int[]arr){
    int index=0;
    int[]newArr=new int[arr.length];
    for (int i = arr.length-1; i>=0; i--) {
        newArr[index]=arr[i];
        index++;
    }
    return newArr;
}
}