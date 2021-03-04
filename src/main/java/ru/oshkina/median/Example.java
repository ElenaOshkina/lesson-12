package ru.oshkina.median;

public class Example {

    public static void main(String[] args) {
        //создаем объект MedianFinder
        MedianFinder medianFinder = new MedianFinder();

        //Вычисляем медиану при 0 элементах, результат 0.0
        System.out.println(medianFinder.findMedian());

        //Добавляем во внутреннюю структуру данных 1
        medianFinder.addNum(1);

        //Добавляем во внутреннюю структуру данных 2
        medianFinder.addNum(2);

        //Вычисляем медиану при 2 элементах, результат 1 + 2 / 2 = 1.5
        System.out.println(medianFinder.findMedian());

        //Добавляем во внутреннюю структуру данных 3
        medianFinder.addNum(3);

        //Вычисляем медиану при 2 элементах, результат 1 + 2 + 3 / 3 = 2.5
        System.out.println(medianFinder.findMedian());
    }

}
