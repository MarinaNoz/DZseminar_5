import java.util.HashMap;
import java.util.Map;

public class Task {
    public static void main(String[] args) {
        //Объявить и инициализировать словарь hashMap<String, String>
        System.out.println();
        Map<String, String> bookСatalog = new HashMap<>();
        System.out.println("Инициализировали словарь, в котором будем хранить книжный каталог");
        System.out.println();
   
        //Добавить в словарь 10 пар "Ключ - Значение". Автор и название книги например.
        bookСatalog.put("Борис Пастернак", "Доктор Живаго");
        bookСatalog.put("Ли Харпер", "Убить пересмешника");
        bookСatalog.put("Харуки Мураками", "Норвежский лес");
        bookСatalog.put("Айн Рэнд", "Атлант расправил плечи");
        bookСatalog.put("Габриэль Гарсия Маркес", "Сто лет одиночества");
        bookСatalog.put("Оноре де Бальзак", "Кузина Бетта");
        bookСatalog.put("Чак Паланик", "Неведимки");
        bookСatalog.put("Джон Фаулз", "Коллекционер");
        bookСatalog.put("Джон Голсуорси", "Сага о Форсайтах");
        bookСatalog.put("Эрих Мария Ремарк", "Три товарища");
   
        bookСatalog.forEach((a,b) -> System.out.println("Автор: " + a + ". Произведение: " +b));

        //Пройти по словарю и добавить к значениям символ "!"
        System.out.println();
        System.out.println("Добавим к значениям символ ");
        bookСatalog.replaceAll((a, b) -> b + "!");
        bookСatalog.forEach((a,b) -> System.out.println("Автор: " + a + ". Произведение: " +b));

        //Добавить нового автора и название книги если соответствующего ключа не было.
        System.out.println();
        System.out.println("Добавим нового автора и название книги");
        bookСatalog.putIfAbsent("Януш Вишневский", "Одиночество в сети");
        bookСatalog.forEach((a,b) -> System.out.println("Автор: " + a + ". Произведение: " +b));

        //Если ключ, указанный в запросе, имеется, вырезать из соответствующего ключу значения первое слово.
        System.out.println();
        System.out.println("Вырежем из соответствующего ключу значения первое слово");
        bookСatalog.computeIfPresent("Борис Пастернак", (a, b) -> b.replaceFirst("Доктор", " "));
        bookСatalog.forEach((a,b) -> System.out.println("Автор: " + a + ". Произведение: " +b));

        //Пройти по словарю другим, не таким как в пункте 3, методом и вывести пары ключ значение в консоль.
        System.out.println();
        for (Map.Entry<String, String> entry: bookСatalog.entrySet())
        System.out.println(entry.getKey() + " : " + entry.getValue());

        //Пройти по словарю другим, не таким как в пункте 3 и 6, методом. Добавить к значениям строку "(просмотрен)" и вывести в консоль. 
        System.out.println();
        bookСatalog.compute("Джон Фаулз", (a, b) -> b + " - Просмотрено");
        bookСatalog.forEach((a,b) -> System.out.println("Автор: " + a + ". Произведение: " +b));
    
    }
   
}







     
