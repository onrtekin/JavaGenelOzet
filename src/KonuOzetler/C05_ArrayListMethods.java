package KonuOzetler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C05_ArrayListMethods {
    public static void main(String[] args) {
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ArrayList Methodlari~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 1-add() methodu list e eleman eklemek icin kullanilan methoddur. index li de eklenebilir index sizde eklenebilir.

        // 2-set() methodu var olan bir elemani baskasiyla degistirmeye yarar.

        // 3-remove() methodu silmeye yarar iki sekilde yapilir.
        // i)--index kullanarak siler
        // ii)--direk elaman belirtilerek kullanilan ilk yerdeki elemani siler

        // 4-sort() methodu elemanlari a dan z ye buyukten kucuge naturel order seklinde siralar.
        // Bunu yaparken """"Collections.sort()"""" seklinde yapar.

        // 5-contains() methodu ise list te bir elemanin var olup olmadigini kontrol eder true ve false olarak dondurur.

        // 6-get() methodu ise List te istenen index teki elemanlari getirir.

        // 7-size() methodu kac eleman oldugunu verir.uzunlugu da diyebiliriz.
        // Onemli noktasi array in uzunlugunu length verirken Array list te size verir.

        // 8-clear() methodu ad ustunde temizlik yapar tum elemanlari siler.

        // 9-isEmpty methodu ise List in ici bos ise tru dolu ise false olarak dondurmeye yarar.

        // 10-equals() methodu ise List lerin yani birden fazla list in icindeki elemanlari kiyaslar
        // Esit ise true degilse false dondurur...

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // Soru uzerinde gosterilmis olacak tum methodlar...

        // 1)Elemanlari A, C, E, ve F olan
        // bir String ArrayList olusturup ekrana yazdiriniz.

        List<String> list1 = new ArrayList<>();

        list1.add("A");
        list1.add("C");
        list1.add("E");
        list1.add("F");

        System.out.println(list1); // [A, C, E, F]

        // 1. sorunun devaminda sunlar isteniyor
        // indexsiz add() methodunu kullanarak, B yi ekleyiniz.
        // indexli add() methodunu kullanarak, L yi 1 numarali indexe ekleyiniz.
        // ArrayList i ekrana yazdiriniz, list boyle olmali; A, L, C, E, F, B.

        list1.add("B");
        System.out.println(list1); // [A, C, E, F, B]

        list1.add(1, "L");
        System.out.println(list1); // [A, L, C, E, F, B]

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 2)set() methodu kullanarak, E yi D yapiniz.
        // ArrayList i ekrana yazdiriniz, list boyle olmali; A, L, C, D, F, B.

        list1.set(3, "D");
        System.out.println(list1); // [A, L, C, D, F, B]

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 3)remove() methodu kullanarak, F yi siliniz.
        // ArrayList i ekrana yazdiriniz, list goyle olmali; A, L, C, D, B.

        // Remove un 2 yontemle kaldirilma yolu var. bunlari uygulayalim.

        // 1. yontem ;

        // list1.remove("F"); // bunu aktif edince index degistiginden dolayi bu sekilde
        // uygulamis olduk.
        System.out.println(list1); // [A, L, C, D, B]

        // 2. yontem ;

        list1.remove(4);
        System.out.println(list1); // [A, L, C, D, B]

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 4)sort() methodu kullanarak, elemanlari alfabetik siraya diziniz.
        // ArrayList i ekrana yazdiriniz, list boyle olmali; A, B, C, D, L.

        Collections.sort(list1);
        System.out.println(list1); // [A, B, C, D, L]

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 5)contains() methodu kullanarak, L nin list de var oldugunu ve
        // M nin list de var olmadigini dogrulayiniz.

        boolean sonuc = list1.contains("L");
        boolean sonuc1 = list1.contains("M");

        System.out.println(sonuc); // true
        System.out.println(sonuc1); // false

        // 2. yol ;

        System.out.println(list1.contains("L")); // true
        System.out.println(list1.contains("M")); // false

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 6)get() methodu kullanarak istenen 2. indexi dondurur

        System.out.println(list1.get(2)); // C

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 7)size() methodu kullanarak, list in kac eleman oldugunu ekrana yazdiriniz.

        System.out.println(list1.size()); // 5

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 8)clear() methodu kullanarak, list deki tum elemanlari siliniz.

        list1.clear();
        System.out.println(list1); // []

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 9)isEmpty() methodu kullanarak, list deki tum elemanlarin silindigini
        // dogrulayiniz

        System.out.println(list1.isEmpty()); // true

        // Soru bitti fakat kalan methodu hatirlatma icin yaziyoruz...

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 10)equals() methodu iki ayri list te ki elamanlari kiyaslayip true veya false
        // dondurur..

        List<String> first = new ArrayList<>();
        List<String> second = new ArrayList<>();

        // iki bos list olusturup esit mi diye sorduk.
        // Bos oldugu icin bize true dondurdu...
        System.out.println(first.equals(second)); // true

        // Sonraki adimda first list icine a harfi ekleyip sorunca false dondurdu.
        first.add("a"); // first'e a harfi ekledik.
        System.out.println(first.equals(second)); // false
        System.out.println("a");

    }

}





