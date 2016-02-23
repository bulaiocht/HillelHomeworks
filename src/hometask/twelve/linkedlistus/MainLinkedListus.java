package hometask.twelve.linkedlistus;

/**
 * Created by horsey on 18.02.16.
 */
public class MainLinkedListus {
    public static void main(String[] args) {

        LinkedListus<Integer> linkstus = new LinkedListus<>();


        linkstus.addLast(1);
        linkstus.addLast(1);
        linkstus.addLast(1);
        linkstus.addLast(1);
        linkstus.addLast(1);
        linkstus.addLast(1);
        linkstus.addLast(1);

        for (Object o : linkstus) {
            System.out.println(o);
        }


    }
}
