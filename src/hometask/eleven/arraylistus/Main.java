package hometask.eleven.arraylistus;

import java.util.ArrayList;

/**
 * Created by ArtLiner on 16.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        ArrayListus<Integer> listus = new ArrayListus<Integer>(12);
        listus.add(1);
        listus.add(2);
        listus.add(3);
        listus.add(2, 200);
        listus.set(0, 100500);


        for (Object o : listus) {
            System.out.println(o);
        }
    }
}
