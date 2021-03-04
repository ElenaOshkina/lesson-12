package ru.oshkina.demo3;

import ru.oshkina.util.Util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

//Добалвяем Collections.sort() в код приложения JukeBox1.java
public class Jukebox2 {
    //Мы будет хранить объекты в списке ArrayList, состоящем из строковых данных
    ArrayList<ru.oshkina.demo3.Song> songList = new ArrayList<>();

    public static void main(String[] args) {
        new Jukebox2().go();
    }

    /**
     * Метод, который загружает файл и выводит содержимое songList (ArrayList)
     */
    public void go() {
        getSongs();
        System.out.println(songList);

        Collections.sort(songList); //сортирует список песен в алфавитном порядке
        System.out.println(songList);
        ;

    }

    /**
     * Считываем файл и вызываем для каждой его строки метод addSong()
     */
    void getSongs() {
        try {
            File file = new File(Util.PATH + "SongListMore.txt");
            //BufferedReader читает текст из потока ввода символов,
            // буферизуя прочитанные символы, чтобы обеспечить эффективное считывание символов, массивов и строк
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    /**
     * Создаем новый объект Song с помощью четырх лексем
     * (четыре составляющих каждой строки файла с инфой о песне), затем добавляем в список
     */
    void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");
        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);
    }
}

