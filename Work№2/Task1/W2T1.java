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

// ------------
//  Вариант №1 - Основное задание
// ------------ 

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

// public class W2T1
// {
    
//     public static void main(String[] args)
//     {
//         StringBuffer strb = new StringBuffer("{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}");
//         strb.delete(0, 2);
//         strb.delete(4, 5);
//         strb.insert(4, " ");
//         strb.insert(6, " ");
//         strb.delete(7, 8);
//         strb.delete(13, 14);
//         strb.delete(15, 16);
//         strb.delete(22, 23);
//         strb.insert(22, " ");
//         strb.insert(24, " ");
//         strb.delete(25, 26);
//         strb.delete(31, 32);
//         strb.delete(33, 34);
//         strb.delete(37, 38);
//         strb.insert(37, " ");
//         strb.insert(39, " ");
//         strb.delete(40, 41);
//         strb.delete(46, 47);
//         strb.delete(48, 49);
//         strb.delete(51, 52);
//         strb.insert(51, " ");
//         strb.insert(54, " ");
//         strb.delete(53, 54);
//         strb.delete(58, 60);
//         System.out.println(strb);
//     }

// }

// ------------
//  Вариант №1.1 - Основное задание
// ------------


// public class W2T1
// {
//     public static void main(String[] args)
//     {
//         StringBuilder str1 = new StringBuilder();
//         str1.append("{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}");
//         String[] str2 = str1.toString()
//         .replaceAll("\\{", "")
//         .replaceAll("\\}", "")
//         .replaceAll("\\\"", "")
//         .replaceAll("\\:", " - ")
//         .split(" \" ");
//         // System.out.println(Arrays.toString(str2));
        
//         StringBuilder Fbuld = new StringBuilder();;
//         Fbuld.append(str2[0]);

//         System.out.println(Fbuld);
        
//     }
// }
    
// ------------
//  Вариант №1.2 - Основное задание
// ------------

// public class W2T1
// {

//        public static void main(String[] args) 
//     {
//        Map<String, String> map = new LinkedHashMap<String, String>();
//        map.put("name", "Ivanov");
//        map.put("country", "Russia");
//        map.put("city", "Moscow");
//        map.put("age", "null");
//        System.out.print(getQuery(map));

//     }

//     public static String getQuery(Map<String, String> params) {
//         StringBuilder finishString= new StringBuilder();

//         for (Map.Entry<String, String> entry : params.entrySet()) {
//             if (entry.getValue().equals("")) {
//                 continue;
//             } else {
//                 finishString = finishString.append(", " + entry.getKey() + " - " + "" + entry.getValue());
//             }

//         }
//         finishString.delete(0, 2);

//         return finishString.toString();
//         }
// }

// ------------
//  Вариант №2.1 - Дополнительное задание
// ------------

public class W2T1
{


}