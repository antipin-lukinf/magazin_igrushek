import  java.util.ArrayList;
import java.util.List;
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
        toys.add(new Mishka(1, "Misha", 15, 80, "green"));
        System.out.println(toys);
        System.out.println(toys);

    }
}