import java.util.List;

public class Wildcard {
    public static double sum(List<? extends Number>list){
        double total=0;
        for (Number number:list){
            total+= number.doubleValue();
        }

        return total;
    }
    public static void main(String[] args){
        Integer[] arr={10,20,30};
        System.out.println(Wildcard.sum(List.of(arr)));
    }
}
