package KonuOzetler;

public class C15_StringBuilderMethods {
    public static void main(String[] args) {

        // ***************************STRING BUILDER METHODLARI***************************\\

        StringBuilder sb1 = new StringBuilder("nilufer");
        System.out.println("ilk Durum : " + sb1);

        // ---------------------------------------------------------------------------------
        // 1.Method --> append(); String Builder a ekleme yapar... Eklemeleri sona yapar..

        sb1.append(" tekin");

        System.out.println("1.Method append : " + sb1);

        // append(); in iki ozelligi var.
        // Bir tanesi direk birlestirme concat gibi...
        // Digeri de substring de oldugu gibi araligi alarak ekleme yapabiliriz...

        sb1.append("okulunu cok sever", 6, 10);
        // 6 7 8 ve 9. indexleri birlestirir. 10 u almaz..
        System.out.println("1.Method append : " + sb1);

        // ---------------------------------------------------------------------------------
        // 2.Method --> length(); SB nin uzunlugunu verir...

        System.out.println("2.Method length : " + sb1.length());

        // ---------------------------------------------------------------------------------
        // 3.Method --> capacity ();

        System.out.println("3.Method capacity : " + sb1.capacity());


        // ---------------------------------------------------------------------------------
        // 4.Method --> trimToSize(); capacity de ki bosluklari siler lengt e esitler

        System.out.println("2.Method length : " + sb1.length());
        System.out.println("3.Method capacity : " + sb1.capacity());

        sb1.trimToSize();
        System.out.println("4.Method trimToSize : " + sb1.capacity());

        // ---------------------------------------------------------------------------------
        // 5.Method --> charAt(); SB de ki istene karakteri indexine gore almaya yarar.
        sb1.charAt(1);
        System.out.println("5.Method charAt : " + sb1.charAt(1));
        // Rumeysa'nin 1.indexi u harfidir...

        // Not ---> methodlardan bazilari bize sadece bilgi getirir. length ve charAt gibi..

        // ---------------------------------------------------------------------------------
        // 6.Method --> delete(int start, int end); Aralikli Silme Methodu

        sb1.delete(17, 21);
        System.out.println("6.Method delete : " + sb1.delete(17, 21));
        // Son 4 karakter olan "_cok" 17 ile 21 arasini sildi...

        // ---------------------------------------------------------------------------------
        // 7.Method --> deleteCharAt(index); Belirlenen karakteri silme Methodu
        sb1.deleteCharAt(16);
        System.out.println("7.Method deleteCharAt : " + sb1);

        // ---------------------------------------------------------------------------------
        // 8.Method --> equals(); esitlik halinde true aksi halde false verir...

        String isim = "nilufer tekin";
        System.out.println("8.Method equals : " + sb1.equals(isim));



        // 9.Method --> indexOf(); SB de istenen karakterin indexini verir...

        sb1.indexOf("tekin");
        System.out.println("9.Method indexOf : " + sb1.indexOf("Cetin"));

        System.out.println("9.Method indexOf : " + sb1.indexOf("e", 6));


        // ---------------------------------------------------------------------------------
        // 10.Method --> lastIndexOf(); SB de istenen karakterin son indexini verir.

        sb1.lastIndexOf("t");
        System.out.println("10.Method lastIndexOf : " + sb1.lastIndexOf("t"));

        System.out.println("10.Method lastIndexOf : " + sb1.lastIndexOf("a", 12)); // 6

        // ---------------------------------------------------------------------------------
        // 11.Method --> insert (index, string); Yazilan index e istenen karakteri ekler..

        System.out.println("11.Method insert : " + sb1.insert(2, "*"));


        isim = "Merhaba Dunya";

        // insert(0, isim, 0, 8) aciklamasi su sekilde
        // 0 --> SB nin 0 ince index ten baslar.
        // str --> hangi string den eklenecek
        // 0 --> cumlenin hangi indexinden baslanacak
        // 8 --> bitis index i
        System.out.println("11.Method insert : " + sb1.insert(0, isim, 0, 8));


        // ---------------------------------------------------------------------------------
        // 12.Method --> replace(); 3 virgullu bu methodun ilki indexi dahil eder
        // ikincisinin indexini haric tutar araya ucuncusune yerlestirir..

        System.out.println("12.Method replace : " + sb1.replace(8, 14, "Seda"));


        // ---------------------------------------------------------------------------------
        // 13.Method --> reverse(); SB yi tersine cevirir...

        System.out.println("13.Method reverse : " + sb1.reverse());
        // rutniteC asreheS abahreM
        System.out.println("Duzenlenen reverse : " + sb1.reverse());
        // ---------------------------------------------------------------------------------
        // 14.Method --> setCharAt(); SB de verilen indexi karakter ile degistirir
        sb1.setCharAt(10, 'k');
        System.out.println("14.Method setCharAt : " + sb1);

        // ---------------------------------------------------------------------------------
        // 15.Method --> subSequence(); sub parca demektir. ilk index dahil son index
        // haric
        // olani alir yazdirir. istedigimiz parcayi indexlerle aliriz.

        System.out.println("15.Method subSequence : " + sb1.subSequence(8, 13));

        // Aciklama
        System.out.println("SubString Methodu : " + sb1.substring(8));
        // 8 den sonrakileri getirir..

        // Bunu subSequence ile soyle yapariz.
        // Istedigim indexten sonraki parcanin tamamini almak icin dahil olan index yazilir.
        // Sonra virgulle sb1.length() yazilir.
        System.out.println("15.Method subSequence : " + sb1.subSequence(5, sb1.length()));


        // ---------------------------------------------------------------------------------
        // 16.Method --> toString(); SB yi Stringe cevirir..

        StringBuilder sb3 = new StringBuilder("Java cok guzel");
        StringBuilder sb4 = new StringBuilder("Java cok guzel");

        System.out.println("Son Durum : " + sb3.equals(sb4));

        sb3.toString(); // sb3 SB den stringe doner..
        sb4.toString(); // sb4 SB den stringe doner..

        System.out.println("16.Method toString : " + sb3.toString().equals(sb4.toString()));
        // true

        // ---------------------------------------------------------------------------------
        // 17.Method --> compareTo(); compareTo soyle calisir..
        // Hakan ile hasan kiyaslar..
        // ilk index ler i kiyaslar esit ise 0 dir.
        // a lar esit ise 0 dir.
        // s ile k esit degil.. k dan s ye kadar olan harfleri sayar..
        // l m n o p r s ---> 7 sayisini dondurur...

        System.out.println("17:Method compareTo : " + sb3.compareTo(sb4));


    }
}
