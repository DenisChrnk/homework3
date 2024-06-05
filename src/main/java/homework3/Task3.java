package homework3;

public class Task3 {
    public static void main(String[] args) {

        Movie [] films = new Movie[3];

        films[0] = new Movie("Индиана Джонс", 8.0, "Приключения", "США", true, 1981);
        films[1] = new Movie("Евротур", 7.6, "Комедия", "США", false, 2004);
        films[2] = new Movie("Властелин колец", 8.6, "Приключения", "Новая Зеландия", true, 2001);


        //Task5

        //Вариант 1
        for (Movie movie : films){
            System.out.println("Год - " + movie.year + " Название - " + movie.name + " Жанр - " + movie.genre + " Рейтинг - " + movie.rating);
        }

        //Вариант2
        for (int i = 0; i < films.length; i = i + 1 ){
            System.out.println("Год - " + films[i].year + " Название - " + films[i].name + " Жанр - " + films[i].genre + " Рейтинг - " + films[i].rating);
        }
    }
}
