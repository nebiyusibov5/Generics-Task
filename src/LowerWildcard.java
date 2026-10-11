import java.util.ArrayList;
import java.util.List;

public class LowerWildcard {
    public static void addNumber(List<? super Integer>list,int n){
        Integer[] arr={};
        for (int i=1;i<n;i++){
            list.add(i);
        }
    }
    public static void main(String[] args){
        List<Integer> intList=new ArrayList<>();
        LowerWildcard.addNumber(intList,10);
        System.out.println(intList);
    }
}
