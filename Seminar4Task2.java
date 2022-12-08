//Задание 2. Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди, 
//dequeue() - возвращает первый элемент из очереди и удаляет его, 
//first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.Random;

public class Seminar4Task2 {
    private static void enqueue(LinkedList<Integer> list, Integer elements) {
        list.addLast(elements);
    }

    private static Integer dequeue(LinkedList<Integer> list) {
        Integer result = list.get(0);
        list.remove(0);
        return result;
    }

    private static Integer first(LinkedList<Integer> list) {
        Integer result = list.get(0);
        return result;
    }

    public static void main(String[] args) {
        LinkedList<Integer> newList = new LinkedList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++)
            newList.add(random.nextInt(10));
        System.out.println(newList);
        enqueue(newList, 3);
        System.out.println(newList);
        System.out.println(dequeue(newList));
        System.out.println(newList);
        System.out.println(first(newList));
        System.out.println(newList);
    }
}
