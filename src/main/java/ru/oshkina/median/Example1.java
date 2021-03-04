package ru.oshkina.median;

public class Example1 {

    public static void main(String[] args) {
        //создаем объект MedianFinder
        MedianFinder medianFinder = new MedianFinder();

        //Добавляем во внутреннюю структуру данных 1
        medianFinder.addNum(1);

        //Добавляем во внутреннюю структуру данных 2
        medianFinder.addNum(2);

        //Добавляем во внутреннюю структуру данных 3
        medianFinder.addNum(3);

        //Добавляем во внутреннюю структуру данных 3
        medianFinder.addNum(4);

        //Добавляем во внутреннюю структуру данных 3
        medianFinder.addNum(5);

        //Вычисляем медиану при 2 элементах, результат 1 + 2 + 3 / 3 = 2.5
        System.out.println(medianFinder.findMedian());
    }

}
