package ru.oshkina.reorganize;

public class Example {

    public static void main(String[] args) {
        //создаем объект ReorganizeString
        ReorganizeString reorganizeService = new ReorganizeString();

        //ожидаем результат - aba
        System.out.println("result '" + reorganizeService.reorganizeString("aab") + "'");

        //ожидаем результат - пустую строку
        System.out.println("result '" + reorganizeService.reorganizeString("aaab") + "'");
    }
}
