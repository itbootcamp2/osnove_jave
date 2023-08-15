package p15_08_2023;

public class Zadatak4 {
    public static void main(String[] args) {
//Napisati program koji na ekranu stampa podatke u formatu:
//Sifra [SIFRA PROIZVODA]
//[NAZIV PROIZVODA]  - $[CENA] - Popust [POPUST]%
//[BOJA], [VELICINA]
//
//Svaku informaciju za proizvod je potrebno cuvati u okviru zasebne promenljive.
//        Primer izvrsenja:
//Sifra x932k20
//Nike Patike - $90 - Popust 13.5%
//Crna, 46.5
        String id = "x932k20";
        String productName = "Nike patike";
        int price = 90;
        double discount = 13.5;
        String color = "Crna";
        double size = 46.5;

        System.out.println("Sifra " + id);
        System.out.println(
                productName + " - $" + price +
                " - Popust " + discount + "%");
        System.out.println(color + ", " + size);


    }
}
