package KonuOzetler;

import java.time.LocalDate;

public class C01_LocalDate {
    public static void main(String[] args) {

        // ---------------------------TARIH------------------------------

        LocalDate tarih = LocalDate.now();
        // now su an ki tarihi verir.
        // new keyword u kullanilmaz..

        System.out.println(tarih);

        // ---------------------------------------------------------------
        // plusDay ---> gun sonra
        // plusWeek ---> hafta sonra
        // plusMonths ---> ay sonra
        // plusYears ---> yil sonra

        System.out.println(tarih.plusDays(10));
        System.out.println(tarih.plusWeeks(2));
        System.out.println(tarih.plusMonths(70));
        System.out.println(tarih.plusYears(30));

        // ---------------------------------------------------------------
        // minusDay ---> gun once
        // minusWeek ---> hafta once
        // minusMonths ---> ay once
        // minusYears ---> yil once

        System.out.println(tarih.minusDays(1));
        System.out.println(tarih.minusWeeks(2));
        System.out.println(tarih.minusMonths(14));
        System.out.println(tarih.minusYears(5));

        // ---------------------------------------------------------------
        // Hepsini toplu da yazdirabiliriz.

        System.out.println(tarih.plusDays(1).plusWeeks(2).plusMonths(70).plusYears(3));


        System.out.println(tarih.minusDays(5).minusWeeks(2).minusMonths(70).minusYears(5));


        // Karisikta yazdirabiliriz..

        System.out.println(tarih.minusDays(5).plusWeeks(20).minusMonths(7).plusYears(10));


        // ---------------------------------------------------------------
        // artik yil hesaplama... true ve false dondurur. boolean dir.

        System.out.println(tarih.isLeapYear());

        // ---------------------------------------------------------------
        // Kendimiz tarih olusturacak isek ve eski bir tarih olusturacaksak;
        // LocalDate.of methodu kullanilr.

        LocalDate tarih1 = LocalDate.of(2000, 1, 16);
        LocalDate tarih2 = LocalDate.of(2001, 12, 10);

        // Bu 2 tarihi soyyle kiyaslariz..
        // tarih1 tarih2 den sonra mi once mi

        System.out.println(tarih1.isAfter(tarih2));
        System.out.println(tarih1.isBefore(tarih2));

    }

}

