//Задание 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список

import java.util.LinkedList;
import java.util.Random;

class Seminar4Task1{
    private static LinkedList<Integer> reverse(LinkedList<Integer> list) {
        LinkedList<Integer> newList = new LinkedList<Integer>();
        for (int i = 0; i < list.size(); i++)
            newList.add(list.get(list.size() - i - 1));
        return newList;
    }
    public static void main(String[] args) {
        LinkedList<Integer> listRev = new LinkedList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++)
            listRev.add(random.nextInt(10));
        System.out.println(reverse(listRev));
        System.out.println(listRev);
    }
}