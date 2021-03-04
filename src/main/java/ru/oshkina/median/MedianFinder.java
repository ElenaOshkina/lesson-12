package ru.oshkina.median;

import java.util.Arrays;

public class MedianFinder {

    //текущий индекс элемента
    private int currentIndex;

    //массив элементов, изначально заполнен нулями
    private int[] numbers;

    /**
     * Конструктор класса MedianFinder
     */
    public MedianFinder() {
        //инициализируем переменные
        currentIndex = 0;
        numbers = new int[10];
    }

    /**
     * Метод добавляет число в структуру данных
     */
    public void addNum(int num) {
        //если индекс выходит за переделы массива, то увеличиваем массив в 2 раза
        if (numbers.length < currentIndex - 1) {
            numbers = Arrays.copyOf(numbers, numbers.length * 2);
        }
        //добавляем новое число в массив
        numbers[currentIndex] = num;
        //увеличиваем текущий индекс
        currentIndex++;
    }

    /**
     * Метод вычисляет медиану
     */
    public double findMedian() {
        if (currentIndex == 0) return 0.0;
        else if (currentIndex % 2 == 1) return numbers[currentIndex / 2];
        else return (numbers[currentIndex / 2 - 1] + numbers[currentIndex / 2]) / 2.0;
    }
}


