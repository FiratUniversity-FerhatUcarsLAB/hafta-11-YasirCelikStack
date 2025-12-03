public class Exercise4_2 {

  // Her satirin sonuna calisma sirasi yorumlarini ekleyin.

   1 - > public static void main(String[] args) {
        2 - > zippo("rattle", 13);
    }

    public static void baffle(String blimp) {
        5 - > System.out.println(blimp);
         6 - > zippo("ping", -5);
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) {
           7 - >  System.out.println(quince + " zoop");
        } else {
           3 - >  System.out.println("ik");
            4 - > baffle(quince);
            8 - > System.out.println("boo-wa-ha-ha");
        }
    }
}
