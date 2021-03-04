package ru.oshkina.frequency;

import java.util.Arrays;
import java.util.Comparator;

public class FrequencySort {

    public String frequencySort(String initial) {
        //Создаем массив в котором будем хранить информацию о символах (длина массива равна количеству символов в строке)
        CharacterCount[] chars = new CharacterCount[initial.length()];
        //текущий индекс нулевого элемента в массиве (для вставки нового элемента)
        int currentIndex = 0;

        //собираем информацию о частоте символов в строке
        for (char current : initial.toCharArray()) {
            //создаем поле, которое будет содержать информацию о том нашелся ли символ в массиве chars или нет
            boolean contains = false;
            for (CharacterCount existed : chars) {
                //прерываем цикл - так как дальше идти нет смысла, у нас одни null
                if (existed == null) break;
                //если символ существует - увеличиваем его count++
                if (existed.currentSymbol == current) {
                    existed.increaseCount();
                    contains = true;
                }
            }
            //если символ не был найдем в массиве chars - то добавляем его с count = 1
            if (!contains) {
                chars[currentIndex] = new CharacterCount(current);
                currentIndex++;
            }
        }

        //создаем копию массива chars, но без null в конце (оставляем только существующие значения)
        CharacterCount[] charsWithoutNull = Arrays.copyOf(chars, currentIndex);
        //Сортируем массив по полю count в обратном порядке (сначала те символы - которые встречаются чаще)
        Arrays.sort(charsWithoutNull, Comparator.comparing(CharacterCount::getCount).reversed());

        //билдим финальную строку
        StringBuilder result = new StringBuilder();
        //идем по всем символам из массива charsWithoutNull
        for (CharacterCount characterCount : charsWithoutNull) {
            //добавляем в result символ столько раз - сколько он встречается в поле count
            for (int i = 0; i < characterCount.count; i++) {
                result.append(characterCount.currentSymbol);
            }
        }

        //возвращаем результат
        return result.toString();
    }

    //внутренний класс - будет хранить информацию о том, сколько раз встретился конкретный символ в строке
    private static class CharacterCount {
        //символ
        private final char currentSymbol;
        //количество в строке
        private int count;

        //конструктор класса CharacterCount
        CharacterCount(char currentSymbol) {
            this.currentSymbol = currentSymbol;
            count = 1;
        }

        //геттер для поля count
        public int getCount() { return count; }

        //увеличиваем count на 1
        public void increaseCount() { count += 1; }
    }

}
