package KonuOzetler;

public class C08_GitDers {
    /*
    Cmd KOMUTLARI (KomutIslemi)

======================================================================================================================
   1) C:\>dir komutu ---> Butun klasorleri gosterir (C'nin icinde bunlar)
   2) C:\>cd users ---> Diger klasorlere gecebiliyoruz(users klasorunun icine giriyor)
   3) C:\>dir ---> users klasorunun icinde hangi klasor oldugunu gormek istiyorum
   ! Hangi klasore girmek istiyorsak ayni islemleri tekrarliyoruz
   4) cd .. ---> Bir onceki klasore gidiyor
   5) cd / ---> En basa gidiyor
   6) cls ---> Ekrani temizliyor


   KLASOR OLUSTURMA
   7.a)
      - C:\>mkdir deneme -> ENTER deyince (mk --make directory)
      Bu Komutla direkt olarak Toshiba-PC nin icine deneme isminde klasor olusturuyoruz...

   7.b)
      Masaustunde klasor olusturma

      - C:\>cd users (users klasorune giriyoruz)

      - C:\Users>cd Toshiba-PC (Toshiba-PC klasorune giriyoruz)

      - C:\Users\Toshiba-PC>cd desktop (masaustune gidiyoruz)

      - C:\Users\Toshiba-PC\Desktop>mkdir test1 (masaustunde test1 klasorunu olusturuyoruz)

      - C:\Users\Toshiba-PC>\Desktop>cd test1 (olusturdugumuz test1 klasorunun icine giriyoruz)

      - C:\Users\Toshiba-PC>\Desktop\test1> (test1 klasorunun icindeyiz)

      - C:\Users\Toshiba-PC>\Desktop\test1>mkdir test2 (test1 klasorunun icinde test2 klasoru olusturduk)

      - C:\Users\Toshiba-PC>\Desktop\test1>mkdir test3 (test1 klasorunun icinde test3 klasoru olusturduk)

      - C:\Users\Toshiba-PC>\Desktop\test1>mkdir test4 (test1 klasorunun icinde test4 klasoru olusturduk)

      - C:\Users\Toshiba-PC>\Desktop\test1>dir (dir ile klasorun icine bakiyoruz test2-test3 ve test4 klasorleri gozukuyor)


   KLASOR SILME (rm--remove directory)

   8.a)
      - C:\Users\Toshiba-PC>\Desktop\test1>rmdir test4 ( test1'de olusturdugumuz test4 klasorunu sildik)
      test 1 i tamamen silmenin yolu rmdir ile icini tamamen bosaltip sonra ust klasorunden sonra silebiliriz...

      Peki sildigimizi nasil anlayacagiz?

   8.b)
      - C:\Users\Toshiba-PC>\Desktop\test1>dir ( dir ile silip silmedigini gorebiliriz)

======================================================================================================================
   - VKS -- Versiyon kontrol sistemi

   - Versiyon Kontrol Sistemi, seçili dosyaların bir önceki versiyona döndürülmesi ,
   *** Projenin tamamının bir önceki versiyona döndürülmesi,
   *** Zaman içerisinde yapılan değişikliklerin karşılaştırılması,
   *** Probleme neden olabilecek değişikliklerin en son kimin tarafından yapıldığı gibi
   *** Bir çok işlemin gerçekleştirilebilmesini sağlar.

   *** Genel olarak VKS kullanmak ;;;
   *** Değişiklik yaptığınız dosyalar üzerinde bir şeyleri berbat ettiğinizde
   *** Veya bir şeyleri kaybettiğinizde kolayca geri getirebilmeniz anlamına gelmektedir.

   - Yerel VKS -- Local Bilgisayardaki Versiyon kontrol sistemi
   *** YVKS, versiyon kontrol sisteminin lokal bilgisayarda tutulduğu sistemlerdir.
   *** Bu sistemde geliştirici kendi lokal bilgisayarında uygulama ile ilgili versiyon sistemi kullanabilir
   *** Ancak farklı developerlar ile çalışmak isterse YVKS sistemi bunun için bir çözüm üretemez.
   *** Kullanimi cok avantajli degil...

   - Merkezi VKS -- Merkezi serverdaki versiyon kontrol sistemi | sıkıntısı: serverda arıza olunca proje durur.
   *** Bu sistemde verisyonların depolanması ve kontrolü uzaktaki bir sunucu üzerinden yapılmaktadır.
   *** Lokal cihazlarda herhangi bir depolama ve kontrol yapılmaz .
   *** Bu sistemin en büyük sorunu eğer o sunucuda bir sorun oluştuğu andan itibaren hiç kimse iş yapamaz
   *** veya üzerinde çalışmakta oldukları herhangi bir şeye sürüm değişikliklerini kaydedemezler.

   - Dağıtık VKS -- Projede çalışanlar ve server'de tutulan VKS'dir. | avantajı her pc veya server yedekleri tutar.
   *** İşte tam da burada devreye Dağıtık Versiyon Kontrol Sistemleri (DVKS) giriyor.
   *** Bir DVKS’de hem merkezi bir sunucu bulunmaktadır, hem de client larda da aynı yapının bir kopyası bulunmaktadır.
   *** Dolayısıyla eğer bir sunucu devre dışı kalırsa , client larda da aynı yapı bulunduğundan
   *** Sunucu devreye girene kadar her bir geliştirici lokalde çalışabilirken,
   *** Sunucu devreye alındığında client lar tarafından sunucu rahatlıkla güncelleyebilir.
   *** Her client, en nihayetinde tüm verilerin tam bir yedeğidir aslında...
======================================================================================================================

   - git --version ===> git versionunu gösterir. Ayrıca pc de var olup olmadığını anlarız.

   - git config --global color.ui true 	===> git komutlarını yazdığımızda sonuçları renkli renkli gösterir...
   *** System parametresi kullanıldığında tüm kullanıcılar ve tüm repolar üzerinde etkili olur
   *** Global parametresi geçerli kullanıcının tüm repolar üzerinde etkili olur
   *** Local parametresi ise sadece geçerli repo üzerinde etkili olur...

======================================================================================================================

   Repository

   *** Versiyon kontrol sistemi ve birlikte çalışma altyapısını ayrı tutmak istediğimiz her bir bağımsız yapıya repository denir.
   *** Genellikle her proje için ayrı bir repository tanımlanır.

   9) Local Repo Olusturma
   Local bilgisayarımızda bir projeyi versiyon sistemine alabilmek için git init komutu kullanılır.
   Bu komut kullanılınca proje klasöründe .git klasörü oluşturulur. Bu local repomuzu saklayacaktır.

   - Once bir klasor olusturuyoruz olusturdugumuz klasorun icine de bir klasor olusturuyoruz
   - Komut sisteminden cd proj* diyerek son olusturdugumuz klasore geliyoruz
   - git init komutunu yaziyoruz. Repo olusmus oluyor...
   - dir / a:h ==> gizli olan .git dosyasini komutta gormemizi saglar..

   10) Local Versiyon Olusturma -- (3 alanda 2 komut yardimiyla bir versiyon olusturmaya yarar)
   *** Working Space --> .git klasörünün bulunduğu çalışma alanıdır.
   Klasörler ve dosyalar üzerinden değişiklik burada yapılır.
   Degisikliklerin Stage Area ya gonderilmesini saglayan ortamdir...

   *** Staging Area --> Versiyon oluşturulacak olan dosya veya klasörlerin geçici olarak toplandığı yerdir.
   Versiyon(commit) oluşturulduktan sonra otomatik olarak staging area boşaltılır...

   *** Commit Store --> Git her bir commit i ayrı bir versiyon olarak tutar.
   Böylece yapılan çeşitli değişikliklerden sonra projede sorunlar ortaya çıkarsa bir önceki commit e geri dönülebilir.


   **********IMPORTANT**********************
   - Degisiklik yapilan tum dosyalari stage'e gondermek icin ---> git add . (her versiyon olustururken yapmaliyiz)
     ! Calisma alaninda olusturdugumuz ve degisiklik yaptigimiz dosyalari stage area'ya tasiyor
     ! "git status" ile gorebiliriz

   - Sonra "git commit -m "first version"" ENTER diyerek bir commit (versiyon) olusturmus oluyoruz
     ! Commit yapip yapmadigini "git log" --> ENTER ile gorebiliriz (Varolan commit'lerimizin listesini veriyor)

   - Degisiklik yaparsak tekrardan "git add ." --> ile versiyon olusturuyoruz
     Bunu da git status --> ile gorebiliriz

   - git commit -m "yeni kodlar eklendi" --> ile yeni commit (versiyon) olusturduk
     Tekrardan git log --> ile commit olusturup olusturmadigimizi kontrol edebiliriz

   - "git log" --> yerine
   --> "git log --oneline"  kullanabiliriz. Daha sade bir gorunum saglar.
     ! "git log --oneline" dedigimizde bize satir satir commitleri gosterir ve uzun olan kodlarin ilk 7 kodunu gosterir
     Istedigimiz commit'in kodunu kopyalayip
   ---> "git show 824c33e" ENTER diyerek o commit'in icerigindeki yazilari gorebiliriz.. 824c33e her komutta farklidir bu kod..
   824c33e bu kodara hash kodu denir...

   11) Degisiklikleri Geri Alma
   Working Space
   "git restore src/index.html" --> Tek bir dosyadaki son kaydedilen satiri siler...
   "git restore ." ---> Son yaptigimiz butun satirlardaki degisiklikleri siler...

   --> Working Space

   "git restore [dosya]" --> Tek bir dosyayı iptal eder
   "git restore ." --> Tüm dosyaları iptal eder

   --> Stage Area

   "git restore --staged [dosya]" --> Tek bir dosyayı iptal eder
   "git restore --staged ." --> Tüm dosyaları iptal eder

   --> Working Space ve Stage Area

   "git reset --hard" -->  Working space deki değişiklikleri iptal eder, staging area yı boşaltır.

   --> Commits
   "git checkout [hash(7 haneli kod)] [dosya]" -->  Dosya, hash ile belirtilen versiyona döner
   "git checkout [hash(7 haneli kod)] ." --> Hash değeri verilen versiyona döner

   *** Git checkout lardan sonra değişikliklerin commit haline gelmesi için git add ve commit komutları unutulmamalıdır...

   ~~~~~~~~~~Onceki versiyonlara donmenin 2 yolu var~~~~~~~~~~
   1)
   "git checkout [hash]2 --> İstenilen versiyonu geri alır. Ancak bunun için sadece HEAD hareket ettirilir.
   Yapılan değişiklikler silinmez. Bu işlemin de bir versiyon haline gelmesi için commit oluşturmak gerekir.

   2)
   "git reset --hard [hash]" --> İstenilen versiyona geri döner, bu versiyondan daha sonra yapılan tüm
    commit ler ve içerdiği değişiklikler geri alınamayacak şekilde iptal edilir.

    BRANCH KOMUTLARI

    Master branch, projemizin ana yapısıdır. Zaman zaman bu ana yapıyı bozmadan bazı
    denemeler yapmak ve gerekirse kolaylıkla bu denemeleri iptal etmek ya da master ile birleştirmek için branch ler kullanılır.
    Branch ler içindeki değişiklikler master dan bağımsız olarak saklanır.

****====UYARI====*** ===> BU İŞLEM EN TEPEDEKİ AKTİF OLAN COMMIT İPTAL ETMİYOR. ESKİ COMMITI EN TEPEYE ALIYOR. ARDINDAN "git add ."+"git commit -m "message"" kullanılmalıdır.
****====UYARI====*** ===> git log yaptığınızda cmd ekranının altında sorun olursa "Q"uit tuşuna basarak bundan kurtulabiliriz.

git reset --hard (hashcode)				===>working spacedeki değişiklikleri iptal eder staging areayı boşaltır.
*****************************************************************************************************************************
git branch (isim)			===> branch oluşturma.
git branch					===> branch'leri listeler. masterda bir branch'tir:) listenen branch'da sol tarfında *master *osman gibi bir şey varsa aktif olan branch * işareti olan branch'tir.
git checkout (branchismi) 	===> istediğimiz branch'e geçiş yaparız. hangi branch'te çalışma yapıyorsak onu seçeriz
****====UYARI====*** ===> DENEME YANILMA DURUMLARINI BRANCH'TE YAPMAK GEREKİR.
===> branch'te yapılan değişiklikleri master'a taşıma için önce master'a geçiş yapılmalı.[git checkout master] ardından merge (birleştirme) yapılmalı
git merge (branchismi)		===> branch veya master'i birleştirme.
git branch -d				===> branch silme.
git branch -m				===> branch isim değiştirme.(aktif olan branch'in ismini değiştirir.)
git clone [url]				===> githubdaki ni lokale alırız.
git pull					===> klonlama yapıldıktan sonraki değişiklikleri(updateleri) lokale çekmek için kullanılır. bizde olmayan versiyonları çekmek için kullanılır.
git push                    ===> klonlama yapıldıktan pc de yaptığımız değişikleri githuba remote'a aktarma yapmak için kullanılır.

****====UYARI====*** token durumu varsa google.com'a "github token" yazıyoruz.Personal access tokens kısmında generete new access token yazıp token oluşturup password kısmına yazılıp sorunu çözüyoruz

git remote add origin[REMOTE_url] 		===> githuba 1 seferlik push ve pull yapabilmek için yazılır.bu code lokalde ilk defa proje yapılacaksa yazılır.
gitpush u origin master				===> githuba 1 seferlik push ve pull yapabilmek için yazılır.bu code lokalde ilk defa proje yapılacaksa yazılır.

git push --set-upstream origin (branchismi)	===> branch'ten git push yaparken remote(github'da) kullanıcının yani senin branch tanımlı değilse bunu remote'a tanımlamak için kullanılır.
     */
}
