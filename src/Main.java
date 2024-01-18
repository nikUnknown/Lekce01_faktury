import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //datovy typ
        String item;
        int quantity;
        double weight;
        BigDecimal pricePerPiece; //desitkova cisla a operace s nemi, hlavne u penez
        LocalDate date;
        boolean isDiscounted;

        //inicializace promenne - muze se udelat zaroven s deklaraci promenne (predchozi krok)

        item = "Trekove boty Sedmimilovky";
        quantity = 3;
        weight = 0.45;
        pricePerPiece = BigDecimal.valueOf(1800);
        date = LocalDate.of (2022,04,01  );
        isDiscounted = true;

        double totalWeight = quantity*weight;
        System.out.println("Celkova hmotnost zasilky je: "+ totalWeight+" kg");

        BigDecimal totalPrice =
                pricePerPiece.multiply(BigDecimal.valueOf(quantity));

        totalPrice = totalPrice.add(BigDecimal.valueOf(45));
        System.out.println("Celkova cena zasilky je: "+ totalPrice+" Kc");

    }
}