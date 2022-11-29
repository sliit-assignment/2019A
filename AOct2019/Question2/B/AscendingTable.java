package PastPapers.AOct2019.Question2.B;

import java.util.TreeMap;

public class AscendingTable <T1, T2>{
    private TreeMap<T1, T2> elements = new TreeMap<>();

    public void display(AscendingTable<T1, T2> myTable) {
//        System.out.println(elements);
    }

    public void add(T1 key, T2 val) {
        System.out.println(elements);
        elements.put(key, val);
    }
}
