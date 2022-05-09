package KonuOzetler;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C14_QueueMethods {
    public static void main(String[] args) {
        /*
         * Fifo : First in first out --> Elemanlar ilk eklenen ilk silinir eczane
         * yemekhane vs sektorlerde zaman kaydi olam elemanlarin tutulmasinda kullanilir.

         * Queue intreface'nin iki subClass constructoru ile obj creat edileblir. LinkedList ve PriorityQueue....

         * LinkedList constructoru ile obj creat edilirse
         * elemanlar Queue icinde insertion order'e gore yani ekleme sirasina gore siralanir

         * PriorityQueue constructoru ile obj creat edilirse elemanlar Queue icinde
         * java'nin kendine ozel algoritmasina gore siralanir.
         */

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        Queue<String> q1 = new LinkedList<>();

        q1.add("omer");
        q1.add("faik");
        q1.add("nilufer");
        q1.add("secil");
        q1.add("sila");
        q1.add("afra");
        q1.add("vahdet");

        System.out.println("Listenin ilk Hali q1 : " + q1);

        // Not --> java LinkedList geregi insertion order'e gore yani eklenilen siraya sira olusturdu..

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        Queue<String> q2 = new PriorityQueue<>();

        q2.add("rana");
        q2.add("vahet");
        q2.add("begum");
        q2.add("ridvan");

        System.out.println("Listenin ilk Hali q2 : " + q2);

        // --> java kendi PriorityQueue(oncelik sirasi)algoritmasini calistirdi. Kendine gore dizilim yapar...

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        //1-peek() methodu ; ilk elemani silmeden bize return eder.
        System.out.println("1-peek() methodu  : " + q1.peek());

        System.out.println("1-peek() methodu PriorityQueue : " + q2.peek());


        // q1 listesini tekrar yazdirmak istersek peek yaptigi ilk elaman silinmeden yazdirir...
        System.out.println("1-peek () methodundan sonra : " + q1);

        System.out.println("1-peek () methodundan sonra PriorityQueue : " + q2);


        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 2-poll(); ilk elemani queue'dan siler ve bize return eder
        System.out.println("2-poll() methodu  : " + q1.poll());


        // q1 listesini tekrar yazdirmak istersek peek yaptigi ilk elaman olmadan yazdirir...
        System.out.println("2-poll () methodundan sonra : " + q1);



        System.out.println("2-poll() methodu PriorityQueue : " + q2.poll());


        // q2 listesini tekrar yazdirmak istersek peek yaptigi ilk elaman olmadan yazdirir...
        System.out.println("2-poll () methodundan sonra PriorityQueue : " + q2);


        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 3-offer(); eleman eklemek icin kullanilir. Add gibidir ama queue ya hastir...
        // Ancak eleman siniri konulduysa add() metodu IllegalStateException firlatir.
        // Ancak offer() method'unda bu durum olmadan kod calismaya devam eder...

        q1.offer("sila");
        System.out.println("3-offer() methodu : " + q1);


        // Yazdirmak istedigimizde consol da bize varsa true yoksa false dondurur...
        System.out.println("3-offer() methodundan sonra : " + q1.offer("sila"));
        // 3-offer() methodundan sonra : true

        q2.offer("seda");
        System.out.println("3-offer() methodu PriorityQueue : " + q2);



        // Yazdirmak istedigimizde consol da bize varsa true yoksa false dondurur...
        System.out.println("3-offer() methodundan sonra PriorityQueue : " + q2.offer("seda"));
        // 3-offer() methodundan sonra PriorityQueue : true

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // poll () methduyla ilgili ek bilgi : Hata gorecegimizden code acisindan asagiya almis olduk...
        // Listeyi bosaltip sordurursak ne olur ?

        q1.clear();
        System.out.println("clear() methodu ile : " + q1);
        //clear() methodu ile : []

        // poll () methodu listeden ilk elemani silerek return eder. biz ise boz listede bunu yaparsa ne olur diye yazdirdik...
        System.out.println("clear() methodundan sonra poll() : " + q1.poll());
        // clear() methodundan sonra poll() : null

        // Bir onceki islemi remove(indexsiz remove ilk elemani siler) methodu ile sil dersek ne olur?
        System.out.println("clear() methodundan sonra remove() : " + q1.remove());
        // clear() methodundan sonra remove() : NoSuchElementException

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // isEmpty bos ise true dolu ise false dondurur..
        // element() methodu ise bos ise NoSuchElementException dondudurur..


    }
}
