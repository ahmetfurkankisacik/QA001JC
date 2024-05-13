package day18_dateTime_StringBuilder;

public class C06_AccesModifier {

    //her classtan kullanilabilir
    public String name="Ali Can";

    //protected olanlar baska package dan sadece child classlardan gorulebilir
    protected String adress="Istanbul";//Sadece Ali can'in akrabalari gorebilsin

    //default accsess modifierlarda defualt keyword yazilmaz,zaten defualt'tur
    //baska package lardan kullanılamaz
    String email="alican@gmail.com";

    //private olanlar sadece olusturulduklari classtan gozukulur ve kullanılabilir
    private String tcKimlikNo="12345678901";





        /*
   1)public
   2)protected
   3)default
   4)private

   public > protected > default > private

   public     ==> public olanlar her class'dan kullanilabilir(Halk kutuphanesi)
   protected  ==> protected olanlar baska package'lardan kullanilamaz, ancak baska package'larda child classlar icinden kullanilabilir
   default    ==> default olanlar baska package'lardan kullanilamazlar(Ev)
   private    ==> private olanlar sadece olusturulduklari class icinden kullanilabilirler(Kimlik Ehliyet)

   Soru: "protected ile default" arasindaki farki söyleyiniz?
    Cevap: protected olanlar baska package'lardan kullanilamaz ancak baska package'larda
   child classlar icinden kullanilabilir. default olanlar baska package'lardan kullanilamazlar
   */


}
