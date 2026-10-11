public class Box<T>{
    public T item;

    public Box() {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public boolean isEmpty(){
        return item==null;
    }

    public static <T> void isEmpty(T[] arr){
        for (T t:arr){
            System.out.println(t);
        }
    }
    public static void main(String[] args) {

        Box<Integer> box=new Box<>();
        System.out.println(box.isEmpty());
        box.setItem(120);
        System.out.println(box.getItem());

        Integer[] arr={10,20,30};
        String[] arr2={"15","25"};
        isEmpty(arr);
        isEmpty(arr2);

    }

}

