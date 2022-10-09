public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Ayşe";
        String ogrenci2 = "Hasan";
        String ogrenci3 = "Semih";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        String[] ogrenciler = new String[3];
        ogrenciler[0]="Ayşe";  // indeksler 0 dan başlar yani 0 = 1.eleman
        ogrenciler[1]="Hasan";
        ogrenciler[2]="Semih";

        for (String s : ogrenciler) {
            System.out.println(s);
        }
    }
}