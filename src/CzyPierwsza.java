public class CzyPierwsza {
    public static void main(String[] args) {

        int liczba, dzielnik;
        boolean czyPierwsza;

        // Szukamy liczby pierwszej z przedziału od 2 - 100

        for (liczba = 2; liczba <= 100; liczba++) {
            czyPierwsza = true;  //założenie że każda liczba jest pierwsza

            for (dzielnik = 2; dzielnik < liczba; dzielnik++) {

                if (liczba % dzielnik == 0) {
                    czyPierwsza = false;
                    break;
                }
            }

            if (czyPierwsza)
                System.out.println(liczba);

        }
    }
}
