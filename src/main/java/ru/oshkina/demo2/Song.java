package ru.oshkina.demo2;

public class Song {
    //Четыре переменных экземпляра для четырех атрибутов песни, получаемых из файла
    String title;
    String artist;
    String rating;
    //BPM (bpm, англ. beats per minute, удары в минуту) в музыке — показатель, определяющий
    // скорость исполнения или воспроизведения композиции
    String bpm;

    /**
     * Переменные, которые передаются в конструктор при создании нового объекта Song
     *
     * @param t - название
     * @param a - автор
     * @param r - рейтинг
     * @param b - удары в минуту
     */
    public Song(String t, String a, String r, String b) {
        title = t;
        artist = a;
        rating = r;
        bpm = b;
    }

    public String getArtist() {
        return artist;
    }

    public String getBpm() {
        return bpm;
    }

    public String getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }

    /**
     * Мы переопределили этот метод, так как хотим
     * при выводе на экран через println() увидеть название песни
     * Вызов метода будет выполняться автоматически
     * при передаче каждого элемента списка в println()
     */
    public String toString() {
        return title;
    }

}
