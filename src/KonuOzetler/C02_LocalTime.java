package KonuOzetler;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {
    public static void main(String[] args) {

        // -------------------------------ZAMAN-----------------------------------------

        LocalTime saat = LocalTime.now();
        // now su an ki zamani verir.

        System.out.println(saat);


        for (int i = 0; i < 9999; i++) {
            i += 1;
        }
        System.out.println("islemden sonraki saat : "+saat);
        // java ne kadar hizli oldugunu gorme adina ...
        // 1000000 kere dondurdu mili saniyeler icinde

        // -----------------------------------------------------------------------------------
        // plusSeconds ---> saniye sonra
        // plusMinutes ---> dakika sonra
        // plusHours ---> saat sonra

        System.out.println(saat.plusHours(50));
        System.out.println(saat.plusSeconds(145));
        System.out.println(saat.plusMinutes(12));

        // -----------------------------------------------------------------------------------
        // minusSeconds ---> saniye once
        // minusMinutes ---> dakika once
        // minusHours ---> saat once

        System.out.println(saat.minusHours(4));
        System.out.println(saat.minusSeconds(143));
        System.out.println(saat.minusMinutes(10));

        // -----------------------------------------------------------------------------------
        // Hepsini toplu da yazdirabiliriz.
        System.out.println(saat.plusHours(5).plusMinutes(2).plusSeconds(7347));


        System.out.println(saat.minusHours(5).minusMinutes(2).minusSeconds(7347));


        // Karisikkta yazdirabiliriz..
        System.out.println(saat.minusHours(15).plusMinutes(20).minusSeconds(7897347));


        // -----------------------------------------------------------------------------------
        // getSeconds getHours ve getMinutes ile de o an ki saat dakika ve saniyeyi
        // getirebiliriz..
        System.out.println(saat.getHour()); // 3 ---> su an da saat 3 sadece saati getirir..

        // -----------------------------------------------------------------------------------
        // Baska ulke saatleri ZoneId methodu ile yapilir..



    }
}

