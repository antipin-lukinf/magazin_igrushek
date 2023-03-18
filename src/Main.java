import  java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {
//    Задание 2
//
//    Необходимо написать программу – розыгрыша игрушек в магазине детских товаров.
//    Стараемся применять ООП и работу с файлами.
//
//    Желательный функционал программы:
//    В программе должен быть минимум один класс со следующими свойствами:
//    id игрушки,
//    текстовое название,
//            количество
//    частота выпадения игрушки (вес в % от 100)
//
//    Метод добавление новых игрушек и возможность изменения веса (частоты выпадения игрушки)
//    Возможность организовать розыгрыш игрушек.
//    Например, следующим образом:
//    С помощью метода выбора призовой игрушки – мы получаем эту призовую игрушку и записываем в список\массив.
//    Это список призовых игрушек, которые ожидают выдачи.
//    Еще у нас должен быть метод – получения призовой игрушки.
//    После его вызова – мы удаляем из списка\массива первую игрушку и сдвигаем массив. А эту игрушку записываем в текстовый файл.
//    Не забываем уменьшить количество игрушек
//
//    К написанию программы можно подойти более творчески и делать так, как Вы поняли задание.
//    Немного менять и отходить от примера выше.


    public static void main(String[] args){

        List<Toy> toys = new ArrayList<>();
        List<Toy> toys1 = new ArrayList<>();
        Mishka mishka = new Mishka(1, "Misha", 15, 8);
        toys.add(mishka);

        Boll boll = new Boll(2, "basketBoll", 10, 1);
        toys.add(boll);

        Car car = new Car(3, "bigCar", 20, 1);
        toys.add(car);

//        GamingMashin gamingMashin = new GamingMashin(toys);
//        String g = String.valueOf(gamingMashin);
//        System.out.println(g);
        int mishkaDropProbality = mishka.getDropProbability();
        for (int i = 0; i < mishkaDropProbality; i++) {
            toys1.add(mishka);
        }
        int bollDropProbality = boll.getDropProbability();
        for (int i = 0; i < bollDropProbality; i++) {
            toys1.add(boll);
        }
        int carDropProbality = car.getDropProbability();
        for (int i = 0; i < carDropProbality; i++) {
            toys1.add(car);
        }
        //System.out.println(toys1);
        Random rand = new Random();
        Toy randomElement = toys1.get(rand.nextInt(toys1.size()));
        System.out.println(randomElement);



    }
}