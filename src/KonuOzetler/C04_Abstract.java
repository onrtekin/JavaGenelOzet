package KonuOzetler;

public class C04_Abstract {
    /*
    ~~~~~~~~~~~~~~~~~~~~~~~~~ABSTRACT classes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

1) Parent class'daki body'siz methodlara abstract methodlar denir.
   Bazi child parent iliskisindeki classlarda child class parent class'in bazi methodlarini kullanmak zorunda ise
   o methodlar abstrack hale getirilir...
   ABSTRACT CLASS'LARDA OBJ ASLA CREAT EDİLEMEZ....

2) Bir method'u abstrack yapmak icin--> {body} silinir ve  return type den once "abstract" keyword kullanilir.

3) Abstract bir method ancak abstract bir class'da creat edilir.
   Concrete class'da asla abstract method creat edilmez

4) Abstract bir class'da hem abstract hem de concrete method olabilir.

5) Concrete class abstract class'a extend edildiginde abstract class'taki tum abstract methodlari implement(uyarlama) zorundadir!!
   Ama concreate methodlari implement etmeyebilir...

6) Bir Abstract Class baska bir abstract class'a extend edildiginde herhangi bir methodu owerride etmek zorunda degildir...
   Zaten hepsi gelir...
   Cunku javaya gore abstract child class'inda altinda mutlaka concrete bir child class vardir.

7) Final, private ve static methodlar abstract o-la- mazzz!!!

8) Abstract Class'ta concreate veriable olabilir. Ama bu veriable asla kesinlikle abstract o-la-maz!!!
     */
}
