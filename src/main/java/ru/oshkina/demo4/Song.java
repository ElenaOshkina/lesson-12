package ru.oshkina.demo4;


public class Song  {
    //Четыре переменных экземпляра для четырех атрибутов песни, получаемых из файла
    private final String title;
    private final String artist;
    private final String rating;
    //BPM (bpm, англ. beats per minute, удары в минуту) в музыке — показатель, определяющий
    // скорость исполнения или воспроизведения композиции
    private final String bpm;

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

//    @Override
//    public int compareTo(Song o) {
//        return title.compareTo(o.getTitle());
//    }

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
        return title + " " + artist;
    }
}
