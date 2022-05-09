package KonuOzetler;

import java.util.Arrays;
import java.util.LinkedList;

public class C11_LinkedListMethods {
    public static void main(String[] args) {

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

		/*
		-- LinkedListte elemanlar iki kisimdan olusur.. (data , adres)
		-- Linkedlist te elamnlarin yapisi farkli oldugundan node olarak adalandirilir...
		-- Linkedlist lerde her zaman en basta head vardir. "Head" sadece adres bolumunden olusur.
		"Head" icin data bolumu yoktur
		-- Linkedlist lerde en sn node "tail" olarak adlandirilir...
		-- Linkedlist ler eleman ekleme ve silmede cok basarilidirlar fakat eleman bulmada zayiftirlar.
		Nedeni ise index kullanmazlar....
		 */
        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("nilufer", "omer", "eymen", "beril", "sila"));

        System.out.println("0-Ilk Liste : " +ll1);






        // 1-add(); yapilan node LinkedList'in en sonuna ekler..
        ll1.add("afra");
        System.out.println("1-add methodu : " + ll1);


        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 2-add(1,"A"); istenen index e istenen elemani ekler
        ll1.add(2, "vahdet");
        System.out.println("2-add(Index,ekle) methodu : " + ll1);



        LinkedList<String> ll2 = new LinkedList<>(Arrays.asList("X", "Y"));

        // 3-addAll(coll); istenen collection in tum elemanlarini ekler
        ll1.addAll(ll2); // ll1 sonuna ll2 de ki X ve Y node larini ekler
        System.out.println("3-addAll methodu : " + ll1);




        // 4-addAll(addAll(2, coll); istenen collection in tum elemanlarini istenen index e ekler
        ll1.addAll(3, ll2); // ll1 de ll2 de ki X ve Y node larini 3. index e ekler
        System.out.println("4-addAll(index, coll) methodu : " + ll1);



        // 5-addFirst(); istenen elemani, ilk eleman olarak ekler
        ll1.addFirst("rana");
        System.out.println("5-addFirst methodu : " + ll1);



        // 6-addLast(); istenen elemani, son eleman olarak ekler
        ll1.addLast("begum");
        System.out.println("6-addLast methodu : " + ll1);


        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 7-remove(); ilk elemani siler
        ll1.remove();
        System.out.println("7-remove methodu : " + ll1);


        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 8-removeFirst(); ilk elemani siler (daha hizlidir)
        ll1.removeFirst();
        System.out.println("8-removeFirst methodu : " + ll1);


        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 9-remove(index); istenen indexdeki elemani siler ve silinen elemani dondurur
        ll1.remove("beril");
        System.out.println("9-remove(index) methodu : " + ll1);


        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 10-remove(eleman); istenen elemani siler sildi ise true, bulamadi ise false dondurur
        ll1.remove(2);
        System.out.println("10-remove(eleman) methodu : " + ll1);


        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 11-removeFirstOccurrence("aaa"); istenen elemanin, ilkini siler.
        ll1.removeFirstOccurrence("X");// ilk gorulen node silinir
        System.out.println("11-removeFirstOccurrence(XXX) : " + ll1);


        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        //Yeni eleman ekleyelim...
        ll1.add(3, "neslihan");
        System.out.println("Yeni eklenen 1. eleman : " + ll1);


        ll1.add(8, "fuat");
        System.out.println("Yeni eklenen 2. eleman : " + ll1);


        // 12-removeLastOccurrence("XXX") ; ayni olanlardan son gorulen node(eleman) silinir
        ll1.removeLastOccurrence("fuat");
        System.out.println("12-removeFirstOccurrence(basri) : " + ll1);


        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        LinkedList<Integer> ll3 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        // 13-removeLast(); son nodu siler
        ll3.removeLast();
        System.out.println("13-removeLast : " + ll3);
        // 13-removeLast : [1, 2, 3, 4, 5]

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 14-remove(coll.index); son nodu siler
        ll3.remove(ll3.indexOf(2));
        System.out.println("14-remove(coll.indexOf) meth0du : " + ll3);
        // 14-remove(coll.indexOf) methodu : [1, 3, 4, 5]

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 15-removeAll(list); istenen listedeki tum elemanlari siler
        ll1.removeAll(ll2); // ll1 den ll2 objesindeki X ve Y yi yani ll2 nin tum elemanlarini siler
        System.out.println("15-removeAll methodu : " + ll1);


        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // Not: Olmayan bir index exception verir...
        // ll3.remove(33); olmayan bir index excepion verir...
        // System.out.println(ll3);//IndexOutOfBoundsException firlatir

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // 16-get(index); istenen indexdeki elemani getirir
        ll1.get(4);
        System.out.println("16-get(index) methodu : " + ll1.get(4));


        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // 17-contains(eleman); istenen eleman listede var ise true, yoksa false dondurur
        ll1.contains("eymen");
        System.out.println("17-contains(eleman) methodu : " + ll1.contains("merve"));
        // 17-contains(eleman) methodu : true

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //18-containsAll(liste); istenen listenin tumu aranan listede var ise true, yoksa false dondurur
        ll1.containsAll(ll3);
        System.out.println("18-containsAll(liste) methodu : " + ll1.containsAll(ll3));
        // 18-containsAll(liste) methodu : false

    }
}

