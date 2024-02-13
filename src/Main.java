import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//         TODO: 12.02.2024 ГҮЛ ДЕГЕН КЛАСС ТҮЗҮҢҮЗ.
//        ПОЛЕЛЕРИ (FLOWERNAME, FRESHNESS, PRICE)
//        МЕЙНДЕН АНЫН БИР НЕЧЕ ОБЪЕКТТЕРИН ТҮЗҮҢҮЗ,
//        МААНИЛЕРИН БЕРИНИЗ.
//        1) ГҮЛДҮН МАССИВИН ТҮЗОБУЗ, ГУЛДОРДУ ОШОЛ
//        МАССИВКЕ САЛЫБЫЗ.
//        МЕТОД ТУЗУНУЗ, ПАРАМЕТРИНЕ ГУЛДОЛДУН
//        МАССИВИН АЛСЫН, АНАН МЕТОД ЭН КЫМБАТ ГУЛДУН
//        БААСЫН КАЙТАРСЫН. МЕЙНДЕН ОШОЛ МЕТОДДУ
//        ЧАКЫРЫНЫЗ
//        ГҮЛДҮ АНЫН ЖАҢЫЛЫГЫНА (СВЕЖЕСТЬ) КАРАТА
//        СОРТТОЙБУЗ.
//        ГҮЛДҮ АТЫНА ЖАРАША СОРТТОЙБУЗ

        Flowers4[] gul = {new Flowers4("Roza", 6, 34543),
        new Flowers4("Romashka", 3, 2345345),
                new Flowers4("Baichechekei", 3, 2000000),
    };
        System.out.print("MaxPrice: ");
        Flowers4.method(gul);
        Flowers4.getFreshestFlowerName(gul);
        String freshestFlowerName =  Flowers4.getFreshestFlowerName(gul);
        System.out.println("\nThe freshest flower is: " + freshestFlowerName);

    }
}
