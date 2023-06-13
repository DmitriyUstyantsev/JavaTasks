// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, 
// используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
public class task1 {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
      String [] list = lib.ReadLineFromFile("C:\\Users\\OMEN\\Documents\\java_projects\\lesson2\\dataForSelect.txt"); 
      System.out.println(list[0]); 
      StringBuilder resultSelect = LineInList(list[0]);
      System.out.println(resultSelect);
    }
    /**
     * @param line
     * @return
     */
    public static StringBuilder LineInList(String line) {
        final String line1 = line.replace("{", "");
        final String line2 = line1.replace("}", "");
        final String line3 = line2.replaceAll("\"", "");
        System.out.println(line3);
        StringBuilder result = new StringBuilder("select * from students where ");

        final String [] arrayData = line3.split(", ");
        for (int i =0; i < arrayData.length; i++) {
            final String[] arrData = arrayData[i].split(":");
            if(arrData[1].equals("null") == false) {
                if (i != 0) {
                    result.append(", ");
                    result.append(arrData[0]);
                    result.append(" = ");
                    result.append(arrData[1]);
                } else {
                    result.append(arrData[0]);
                    result.append(" = ");
                    result.append(arrData[1]);
                }
            }
            
        }
        return result;
    }
}
