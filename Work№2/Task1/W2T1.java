// Work №2 - Task №1

// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

// Дополнительные задания

// Дана json-строка (можно сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

// *Сравнить время выполнения замены символа "а" на "А" любой строки содержащей >1000 символов средствами String и StringBuilder.
// *Дана строка: ".3 + 1.56 = " подсчитать результат и добавить к строке.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// import java.util.Arrays;

public class W2T1 
{


    // public static void main(String[] args) {
    //     Map<String, String> map = new LinkedHashMap<>();
    //     map.put("name","Ivanov");
    //     map.put("country","Ukraine");
    //     map.put("city","Kiev");
    //     map.put("age",null);
    //     map.put("name1","Ivanov");
    //     map.put("name2","Ivanov");

    //     System.out.println(getQuery(map));
    // }

    // public static String getQuery(Map<String, String> params) {
    //     StringBuilder result = new StringBuilder();
    //     if (params == null || params.isEmpty())
    //         return result.toString();

    //     for (Map.Entry<String, String> pair : params.entrySet()) {
    //         if (pair.getKey() == null || pair.getValue() == null)
    //             continue;

    //         result.append(pair.getKey()).append(" = '").append(pair.getValue()).append("' and ");
    //     }

    //     if (result.length() > 5)
    //         result.delete(result.length() - 5, result.length());

    //     return result.toString();
    // }
    

    }