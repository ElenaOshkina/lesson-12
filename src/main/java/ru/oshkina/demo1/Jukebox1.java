package ru.oshkina.demo1;

import ru.oshkina.util.Util;

import java.util.*;
import java.io.*;

public class Jukebox1
{
    //Мы будет хранить названия песен в списке ArrayList, состоящем из строковых данных
    ArrayList<String> songList = new ArrayList<>();

    public static void main(String[] args) {
        new Jukebox1().go();
    }

    /**
     * Метод, который загружает файл и выводит содержимое songList (ArrayList)
     */
    public void go() {
        getSongs();
        System.out.println(songList);

        LinkedList<String> songList = new LinkedList<>();
        songList.add("Pink Moon");
        songList.add("Shiva Moon");

        songList.add(0, "Listen");
        System.out.println(songList); //[Listen, Pink Moon, Shiva Moon]

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
        } catch (Exception ex) { ex.printStackTrace(); }
    }

    /**
     * Разбиваем содержимое строки "имя исполнителя/название пеесни"
     * по "/" на 2 части (лексемы), с помощью метода split()
     */
    void addSong(String lineToParse) {
        String[]tokens = lineToParse.split("/");
        songList.add(tokens[0]);
    }
}

