interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}
class MinMaxClass<T extends Comparable<T>> implements MinMax<T>{
    T[] vals;
    MinMaxClass(T[] a) 
 { vals = a; }
 public T min() {
 T v = vals[0];
 for(int i=1; i < vals.length; i++)
 if(vals[i].compareTo(v) < 0) v = vals[i];
 return v;
 }
 public T max() {
 T v = vals[0];
 for(int i=1; i < vals.length; i++)
 if(vals[i].compareTo(v) > 0) v = vals[i];
 return v;
 }
}

public class GenInterface {
    public static void main(String args[]) {
        Integer inums[] = {3, 6, 2, 8, 6 };
        Character chs[] = {'b', 'r', 'p', 'w' };
        MinMaxClass<Integer> iob = new MinMaxClass<Integer>(inums);
        MinMaxClass<Character> cob = new MinMaxClass<Character>(chs);
        System.out.println("Max value in inums: " + iob.max());
        System.out.println("Min value in inums: " + iob.min());
        System.out.println("Max value in chs: " + cob.max());
        System.out.println("Min value in chs: " + cob.min());
 }
}
