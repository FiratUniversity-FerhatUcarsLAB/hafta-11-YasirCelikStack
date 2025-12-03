// 250542010 Muhammet Yasir Çelik

public class Exercise4_1 {

    public static void printAmerican(String day, String month, int date, int year) {
        System.out.println("Amerikan Formati");
        System.out.println(day + ", " + month + " " + date + ", " + year);
        System.out.println();
    }

    // Avrupa formatı: 22 July 2019, Monday
    public static void printEuropean(String day, String month, int date, int year) {
        System.out.println("Avrupa Formati");
        System.out.println(date + " " + month + " " + year + ", " + day);
    }

   public static void main(String[] args) {
        // Örnek kullanım:
        String day = "Monday";
        String month = "July";
        int date = 22;
        int year = 2019;

        printAmerican(day, month, date, year);
        printEuropean(day, month, date, year);
    }
}
