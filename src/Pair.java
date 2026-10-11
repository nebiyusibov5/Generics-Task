public class Pair<K,V> {
   public K key;
   public V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return key + "=" + value;
    }

    public static void main(String[] args){
        Pair<String,Integer> result=new Pair<>("key",100);
        System.out.println(result);
    }
}
