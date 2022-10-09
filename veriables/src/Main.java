public class Main {

    public static void main(String[] args) {
        int ogrenciSayisi = 11;
        String mesaj ="Öğrenci sayısı: ";

        System.out.println(mesaj + ogrenciSayisi); // String bir ifaedeyi tek tek değiştirmek yerine tanımlarsak işimiz daha kolay olur
        System.out.println("Öğrenci Sayım : " + ogrenciSayisi);
        System.out.println("Öğrenci Sayım : 10"); //Yukarıdaki gibi yazarsak hem zamandan tasarruf ederiz hem uğraşmayız
    }
}