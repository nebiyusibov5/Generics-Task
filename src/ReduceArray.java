import java.util.Arrays;

public class ReduceArray {
    public static <T> void swap(T[] arr,int i,int j){
        T temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args){
        String[] word={"albert","fyodor","tarkovsky"};
        System.out.println(Arrays.toString(word));
        ReduceArray.swap(word,0,2);
        System.out.println(Arrays.toString(word));
    }
}
