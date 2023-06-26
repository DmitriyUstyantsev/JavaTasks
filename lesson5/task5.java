import java.util.HashMap;

public class task5 {

    //Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
 //их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.

    public static void main(final String[] args) {
        var dict = new HashMap<String, String>();
        dict.put("88001122333", "Михаил Петров");
        dict.put("88001662333", "Андрей Иванов");
        dict.put("88001112333", "Степан Семенов");
        dict.put("88001122432", "Петр Васильков");
        dict.put("88001112453", "Александр Семенов");
        dict.put("88001632145", "Александр Семенов");
        dict.put("88001424214", "Игорь Петров");
        dict.put("88001424215", "Игорь Петров");
        dict.put("88001424216", "Игорь Петров");
        dict.put("88001234374", "Петр Васильков");

        var a = get(dict);

        a.entrySet().stream()
                .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()))
                .forEach(k -> System.out.println(k.getKey() + ": " + k.getValue()));
    }


    public static HashMap<String, Integer> get(HashMap<String, String> dict){
        var result = new HashMap<String, Integer>();
        for (var item : dict.entrySet()) {
            if (result.containsKey(item.getValue())) {
                var key = item.getValue();
                var value = result.get(item.getValue());
                result.replace(key, value + 1);
            } else {
                result.put(item.getValue(), 1);
            }
        }
        return result;
    }
}
//
//    OutPut
//    Иван - 3
//    Сергей - 2
//    Потому как если один сотрудник имеет 2 или более номера , его имя считаем 1 раз.