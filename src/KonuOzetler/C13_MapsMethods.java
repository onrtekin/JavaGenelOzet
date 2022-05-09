package KonuOzetler;

import java.util.HashMap;

public class C13_MapsMethods {
    public static void main(String[] args) {

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

		/*
		Key value yapsini kullanirlar...
		Key ler unique olmalidir... Or tc no
		3 farkli map vardir...
		-- HashMap : En cok kullanilan ve en hizli olanidir... Siralamayi rastgele yapar..
		Key bir adet null olabilir ama value birden fazla olabilir...
		-- Hashtable : Key veya value icin null kallanilmaz
		-- TreeMap :
		 */
        HashMap<Integer, String> m1 = new HashMap<>();
        m1.put(101, "omer");
        m1.put(102, "nilufer");
        m1.put(103, "secil");
        m1.put(104, "beril");
        m1.put(105, "eymen");
        m1.put(106, "ridvan");

        System.out.println("Listenin ilk hali : " + m1);


        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        //1-put(key,value) methodu ayni key de bir elaman eklendiginde degisiklik yapar....
        m1.put(101, "begum"); // key value su update edilir eski veri uzerine yeni girilen veri yazilir
        System.out.println("1-put(key,value) methodu : " + m1);



        m1.put(106, "sila");
        System.out.println("1-put(key,value) methodu : " + m1);


        // key degeri null alabilir
        m1.put(null, "afra");
        System.out.println("1-put(key,value) methodu : " + m1);


        // null key in e tekrardan bir value eklersek degistirir...
        m1.put(null, "vahdet");
        System.out.println("1-put(key,value) methodu : " + m1);

        // Value degerleri coklu null olabilir
        m1.put(107, null);
        m1.put(108, null);
        System.out.println("1-put(key,value) methodu : " + m1);


        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        HashMap<Integer, String> m2 = new HashMap<>();
        m2.put(1, "Birgun");
        m2.put(2, "Java");
        m2.put(3, "Ogrenecegiz");
        m2.put(4, "InsaAllah");

        System.out.println("Listenin ilk hali m2 : " + m2);
        // Listenin ilk hali m2 : {1=Birgun, 2=Java, 3=Ogrenecegiz, 4=InsaAllah}

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 2-putAll(map); verilen map deki tum elemanlari bizim map imize ekler, tekrarlanan eleman varsa uzerine yazar
        m1.putAll(m2);
        // m1 map'e m2 put edildi(eklendi)... Dolayisyle m1 update oldu ancak m2 ayni degerde.
        // Trick of day : putAll() methodu calismasi icin her iki map'in Data type'lari eslesmeli
        System.out.println("2-m1 e m2 put edildikten sonra : " + m1);

        System.out.println("2-m1 e m2 put edildikten sonra : " + m2);
        // "m1 e m2 put edildikten sonra : {1=Birgun, 2=Java, 3=Ogrenecegiz, 4=InsaAllah}

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 3-get(key); istenen key degeri Map de varsa o key e ait value yu, map de yoksa null doner.
        System.out.println("3-get(key) methodu : " + m1.get(103));


        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 4-getOrDefault(key,defaultDeger); istenen key degeri Map de varsa o key e ait value yu, Key map te yoksa default degeri doner.
        System.out.println("4-getOrDefault(key,defaultDeger) : " + m1.getOrDefault(106, "Boyle bir eleman yoktur"));

        System.out.println("4-getOrDefault(key,defaultDeger) : " + m1.getOrDefault(111, "Boyle bir eleman yoktur"));


        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 5-values() methodu ; map'deki tum elemanlarin value'lerini return eder.
        System.out.println("5-values() methodu : " + m1.values());


        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 6-keySet() methodu ; map'deki tum elemanlarin key lerini return eder.
        System.out.println("6-keySet() methodu : " + m1.keySet());


        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        //7-putIfAbsent(key, value); verilen key map de varsa creat eder yoksa ekler.
        m1.putIfAbsent(109, "Haluk");
        System.out.println("7-putIfAbsent(key, value) methodu : " + m1.putIfAbsent(109, "Haluk"));
        // 7-putIfAbsent(key, value) : Haluk

        System.out.println("7-putIfAbsent(key, value) methodundan sonra : " + m1);


        m1.putIfAbsent(105, "oner");
        System.out.println("7-putIfAbsent(key, value) methodu : " + m1.putIfAbsent(105, "oner"));


        System.out.println("7-putIfAbsent(key, value) methodundan sonra : " + m1);


        m1.putIfAbsent(null, "Selam");
        System.out.println("7-putIfAbsent(key, value) methodu : " + m1.putIfAbsent(null, "Selam"));

        System.out.println("7-putIfAbsent(key, value) methodundan sonra : " + m1);


        m1.putIfAbsent(107, "Merhaba");
        System.out.println("7-putIfAbsent(key, value) methodu : " + m1.putIfAbsent(107, "Merhaba"));

        System.out.println("7-putIfAbsent(key, value) methodundan sonra : " + m1);


        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        HashMap<Integer, String> m3 = new HashMap<>();

        m3.put(101, "Levent");
        m3.put(102, "Said");
        m3.put(103, "Huseyin");
        m3.put(104, "Fatma");
        m3.put(105, "Ayse");

        System.out.println("Listenin ilk hali m3 : " + m3);
        // Listenin ilk hali m3 : {101=Levent, 102=Said, 103=Huseyin, 104=Fatma, 105=Ayse}

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 8-remove(eleman) ; Entry : Map de her bir elemani olusturan key value ikilisidir... Ikisi beraber silinir...
        m3.remove(101);
        System.out.println("8-remove(eleman) methodundan sonra : " + m3);
        // 8-remove(eleman) methodundan sonra : {102=Said, 103=Huseyin, 104=Fatma, 105=Ayse}

        m3.remove(102, "said");
        // key value eslesmsi olursa entry silinir eslesme olmazsa (said!=Said) herhangi bir islem yapilmaz.
        System.out.println("8-remove(eleman) methodundan sonra : " + m3);
        // 8-remove(eleman) methodundan sonra : {102=Said, 103=Huseyin, 104=Fatma, 105=Ayse}

        m3.remove(102, "Said");
        System.out.println("8-remove(eleman) methodundan sonra : " + m3);
        // 8-remove(eleman) methodundan sonra : {103=Huseyin, 104=Fatma, 105=Ayse}

        m3.remove(111, "salih");
        // Olmayan key'deki entry'i silme islemi yapilmaz
        System.out.println("8-remove(eleman) methodundan sonra : " + m3.remove(111, "salih"));
        // 8-remove(eleman) methodundan sonra : false

        System.out.println("8-remove(eleman) methodundan sonra : " + m3);
        // 8-remove(eleman) methodundan sonra : {103=Huseyin, 104=Fatma, 105=Ayse}

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 9-size(); map teki entry sayisini verir..
        System.out.println("9-size() : " + m3.size());
        // 9-size() : 3

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 10-compute(key, (key,value)->yeniDeger); Verilen map deki istenen key degerine sahip elemanin value sunu gunceller
        // key map te yoksa ekler...
        m3.compute(103, (key, value) -> "Haluk");
        // 103 te ki Huseyin in yerine Haluk gelir...
        System.out.println("10-compute(key, (key,value)->yeniDeger) metodundan sonra : " + m3);
        // 10-compute(key, (key,value)->yeniDeger) metodundan sonra : {103=Haluk, 104=Fatma, 105=Ayse}

        m3.compute(106, (key, value) -> "Can");
        // 106 key olmadigi icin ekleme yapar...
        System.out.println("10-compute(key, (key,value)->yeniDeger) metodundan sonra : " + m3);


        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 11-ComputeIfAbsent(key, k->->yeniDeger); istenen key degeri map de yoksa o key i ve value yu ekler, map de varsa birsey yapmaz...
        m3.computeIfAbsent(107, value -> "Ayse");
        // 107 key varsa islem yapilmaz; yoksa atama yapar...
        System.out.println("11-ComputeIfAbsent(key, k->->yeniDeger) methodundan sonra : " + m3);


        m3.computeIfAbsent(105, value -> "Ali");
        // map'de 105 key varligini kontrol eder. 105 key oldugu icin islem yapilmaz...
        System.out.println("11-ComputeIfAbsent(key, k->->yeniDeger) methodundan sonra : " + m3);


        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 12-ComputeIfPresent(key, (key,value)->yeniDeger); istenen key degeri Map de varsa o key e ait value yu gunceller yoksa birsey yapmaz.
        m3.computeIfPresent(107,(key,value)-> "Halil");

        System.out.println("12-ComputeIfPresent(key, k->->yeniDeger) methodundan sonra : " + m3);


        m3.computeIfPresent(120,(key,value)-> "Hasan");
        // 120 key oldmadigi icin herhnagi bir islem yapilmaz..
        System.out.println("12-ComputeIfPresent(key, k->->yeniDeger) methodundan sonra : " + m3);


        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 13-containsKey(key); istenen key degeri Map de varsa true, yoksa false doner .
        System.out.println("13-containsKey(key) methodu : " + m3.containsKey(105));
        // 13-containsKey(key) methodu : true
        System.out.println("13-containsKey(key) methodu : " + m3.containsKey(120));
        // 13-containsKey(key) methodu : false

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 14-containsValue(value); istenen value degeri Map de varsa true, yoksa false doner .
        System.out.println("14-containsValue(value) methodu : " + m3.containsValue("Halil"));
        // 14-containsValue(value) methodu : true
        System.out.println("14-containsValue(value) methodu : " + m3.containsValue("Hasan"));
        // 14-containsValue(value) methodu : false

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 15-entrySet(); Map deki entry leri bir Set olarak verir. Entry : Map de her bir elemani olusturan key value ikilisidir
        System.out.println("15-entrySet() methodu " + m2.entrySet());

        System.out.println("15-entrySet() methodu " + m3.entrySet());


        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 16-equals(map); Map deki tum elemanlari karsilastirir. Hepsi ayni ise true farkli olan varsa false dondurur
        m2.equals(m3);
        System.out.println("16-equals(map) methodu : " + m2.equals(m3));
        // 16-equals(map) methodu : false

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // 17-clone() methodu
        m3.clone();
        System.out.println("17-clone() methodu : " + m3.clone());




    }

}

