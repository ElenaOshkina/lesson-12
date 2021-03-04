package ru.oshkina.frequency;

public class Example {

    public static void main(String[] args) {
        //создаем объект FrequencySort
        FrequencySort sort = new FrequencySort();
        //ожидаем результат eetr
        System.out.println(sort.frequencySort("tree"));
        //ожидаем результат bbAa
        System.out.println(sort.frequencySort("Aabb"));
    }
}
