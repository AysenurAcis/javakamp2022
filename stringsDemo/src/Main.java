public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);
        /*
        System.out.println("Eleman sayısı : " + mesaj.length());
        System.out.println("5. eleman : " + mesaj.charAt(4));
        System.out.println(mesaj.concat("Yaşasın!")); // concat iki cümleyi birleştirir
        System.out.println(mesaj.startsWith("A")); // B ile başlıyorsa true döndürür değilse false döndürür
        System.out.println(mesaj.endsWith("."));  // . ile biten

        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0); // karakteri bulma
        System.out.println(karakterler);

        System.out.println(mesaj.indexOf("av")); //kaçıncı karakter oldugunu bulur  boşlukta bir karakterdir
        System.out.println(mesaj.lastIndexOf("a")); // aramaya en sağdan başlar*/

        System.out.println(mesaj.replace(' ', '-')); //karakter değiştirme
        System.out.println(mesaj.substring(2)); // 2.indeksten itibaren parçalar yazdırır
        System.out.println(mesaj.substring(2,4)); // 2. ile 4. karakterler arasını al demek

    }
}