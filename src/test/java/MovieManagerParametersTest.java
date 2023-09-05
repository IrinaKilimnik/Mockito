import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerParametersTest {
    @Test
    public void testFindLastWhenLimitEqualSize () {
        MovieManager manager = new MovieManager(3);
        String movie1 = "Королева бензоколонки";
        String movie2 = "Гладиатор";
        String movie3 = "Бал вампиров";
        String movie4 = "От заката до рассвета";
        String movie5 = "Король лев";
        String movie6 = "Ешь, молись, люби";
        String movie7 = "Русалочка";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);

        String[] actual = manager.findLast();
        String[] expected = {movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWhenLimitMoreSize () {
        MovieManager manager = new MovieManager(7);
        String movie1 = "Королева бензоколонки";
        String movie2 = "Гладиатор";
        String movie3 = "Бал вампиров";
        String movie4 = "От заката до рассвета";
        String movie5 = "Король лев";
        String movie6 = "Ешь, молись, люби";
        String movie7 = "Русалочка";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);

        String[] actual = manager.findLast();
        String[] expected = {movie5, movie4, movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWhenLimitLessSize () {
        MovieManager manager = new MovieManager(3);
        String movie1 = "Королева бензоколонки";
        String movie2 = "Гладиатор";
        String movie3 = "Бал вампиров";
        String movie4 = "От заката до рассвета";
        String movie5 = "Король лев";
        String movie6 = "Ешь, молись, люби";
        String movie7 = "Русалочка";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);

        String[] actual = manager.findLast();
        String[] expected = {movie7, movie6, movie5};

        Assertions.assertArrayEquals(expected, actual);
    }
}
