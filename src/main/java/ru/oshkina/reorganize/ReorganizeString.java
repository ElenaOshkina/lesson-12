package ru.oshkina.reorganize;

public class ReorganizeString {

    public String reorganizeString(String initial) {
        //Признак показывающий нам - можно ли реорганизовать строку или нет
        boolean possibleReorganize = true;
        //Создаем stringBuilder который будет содержать результат
        StringBuilder current = new StringBuilder(initial);
        //Создаем цикл который идет по всем символам строки
        for (int i = 0; i < current.length() - 1; i++) {
            char replaced = current.charAt(i + 1);
            //Если текущий символ равен следующему - то пытаемся найти в строке другой и заменить
            if (current.charAt(i) == replaced) {
                possibleReorganize = false;
                //Ищем символ для замены
                for (int j = i + 1; j < current.length() - 1; j++) {
                    char next = current.charAt(j + 1);
                    //если удалось найти символ - меняем местами
                    if (replaced != next) {
                        current.setCharAt(i + 1, next);
                        current.setCharAt(j + 1, replaced);
                        possibleReorganize = true;
                    }
                }
                //если не удалось найти символ - прерываем цикл и возвращаем пустой результат
                if (!possibleReorganize) break;
            }
        }
        if (possibleReorganize) return current.toString();
        else return "";
    }
}
