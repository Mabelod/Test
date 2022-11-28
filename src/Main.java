import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Дан массив строк, необходимо удалить из него все дубли, оставшиеся строки объединить в одну в порядке следования в массиве.
        String[] list = new String[]{"Привет", "Как дела", "Привет", "Привет", "Пока", "Жизнь", "Пока", "Как дела", "Жизнь"};
        String list1 = Arrays.stream(list).distinct().collect(Collectors.joining(" ,"));
        System.out.println(list1);
    }
}