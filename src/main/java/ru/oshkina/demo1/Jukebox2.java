package ru.oshkina.demo1;

import ru.oshkina.demo2.Song;
import ru.oshkina.util.Util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

//Добалвяем Collections.sort() в код приложения JukeBox1.java
public class Jukebox2 {
    //Мы будет хранить названия песен в списке ArrayList, состоящем из строковых данных
    ArrayList<String> songList = new ArrayList<>();

    ArrayList songs = new ArrayList();


    public static void main(String[] args) {
        new Jukebox2().go();
    }

    /**
     * Метод, который загружает файл и выводит содержимое songList (ArrayList)
     */
    public void go() {
        //songList.add(new Song("", "", "", ""));
        songs.add("data");
        songs.add("data");
        songs.add(new Song("", "", "", ""));

        String o = (String) songs.get(2);
        System.out.println(o);

//        getSongs();
//        System.out.println(songList);
//
//        Collections.sort(songList); //сортирует список строк в алфавитном порядке
//        System.out.println(songList);
    }

    /**
     * Считываем файл и вызываем для каждой его строки метод addSong()
     */
    void getSongs() {
        try {
            File file = new File(Util.PATH + "SongList.txt");
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
     * Разбиваем содержимое строки "имя исполнителя/название пеесни"
     * по "/" на 2 части (лексемы), с помощью метода split()
     */
    void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");
        songList.add(tokens[0]);
    }
}

