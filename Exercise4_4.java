//250542010 Muhammet Yasir Çelik

public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();

        //Derleyici hata vermez, sadece bazı IDE’ler “Sonuç kullanılmıyor (unused result)” şeklinde uyarı gösterebilir.

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);
        //Derleyici hata verir: “void type not allowed here” veya “bad operand types”.
        // Cevaplarinizi yorum olarak ekleyin.
    }
}
