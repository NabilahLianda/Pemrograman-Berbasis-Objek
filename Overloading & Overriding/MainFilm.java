public class MainFilm{
    public static void main(String[] args){
        Film film1 = new Film("Escape Room", "Adam Robitel", 2019, 99);
        Transformer film2 = new Transformer("Transformer", "Rise of the Beast", "Steven Caple Jr.", 2023, 127);
        Series film3 = new Series("Transformer", "Rise of the Beast", "Steven Caple Jr.", 2023, 127, 3.4, "Noah and Mirage", "Unicorn and Terrorcons");

        System.out.println("Film 1");
        film1.showInfo();   
        film1.getDurasi();
        System.out.println();

        System.out.println("Film 2");
        film2.showInfo(true);
        System.out.println();

        System.out.println("Film 3");
        film3.showInfo();
    }
}