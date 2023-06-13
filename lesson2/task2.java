//Дана json строка (сохранить в файл и читать из файла) 
//[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова", "оценка":"4","предмет":"Информатика"},
//{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
//Пример вывода:
//Студент Иванов получил 5 по предмету Математика.
//Студент Петрова получил 4 по предмету Информатика.
//Студент Краснов получил 5 по предмету Физика.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class task2 {
    public static void WriteFile(List<Dictionary<String, String>> students_data) {
        try {
          String pathDirectory = System.getProperty("user.dir");
          String pathFile = pathDirectory.concat("C:\\Users\\OMEN\\Documents\\java_projects\\lesson2\\dataForSelect2.txt");
          FileWriter fWriter = new FileWriter(pathFile, StandardCharsets.UTF_8);
          fWriter.write(students_data.toString());
          fWriter.close();
        } catch (Exception ex) {
          System.out.println("ERROR!");
        }
      }
    
      public static void ReadFile(List<Dictionary<String, String>> students_data) {
        try {
          String pathDirectory = System.getProperty("user.dir");
          System.out.println(pathDirectory);
          String pathFile = pathDirectory.concat("z2_data.txt");
          BufferedReader bReader = new BufferedReader(new FileReader(pathFile, StandardCharsets.UTF_8));
          bReader.close();
        } catch (Exception ex) {
          ex.printStackTrace();
        }
      }
    
      public static void StringParse(List<Dictionary<String, String>> students_data) {
        StringBuilder sBuilder = new StringBuilder();
        for (Dictionary<String, String> student : students_data) {
          sBuilder.append("Студент ").append(student.get("фамилия"))
          .append(" получил ").append(student.get("оценка"))
          .append(" по предмету ").append(student.get("предмет")).append("\n");
        }
        System.out.println(sBuilder.toString());
      }
    
    public static void main(String[] args) {
      Dictionary<String, String> studentInfo1 = new Hashtable<>();
      studentInfo1.put("фамилия", "Иванов");
      studentInfo1.put("оценка", "5");
      studentInfo1.put("предмет", "Математика");

      Dictionary<String, String> studentInfo2 = new Hashtable<>();
      studentInfo2.put("фамилия", "Петрова");
      studentInfo2.put("оценка", "4");
      studentInfo2.put("предмет", "Информатика");

      Dictionary<String, String> studentInfo3 = new Hashtable<>();
      studentInfo3.put("фамилия", "Краснов");
      studentInfo3.put("оценка", "5");
      studentInfo3.put("предмет", "Физика");
      
      List<Dictionary<String, String>> students = new ArrayList<>();
      students.add(studentInfo1);
      students.add(studentInfo2);
      students.add(studentInfo3);
      WriteFile(students);
      ReadFile(students);
      StringParse(students);
    }
}