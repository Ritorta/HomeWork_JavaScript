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

// Arrays.toString - Божественная волшебная приписка для принта, только нужна для вывода массивов в JAVA!!!

// import java.util.LinkedHashMap;
// import java.util.Map;

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
//  Вариант №1.3 - Основное задание
// ------------

// public class W2T1
// {
//     public static void main(String[] args)
//     {
//         StringBuilder str1 = new StringBuilder();
//         str1.append("{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}");

//         // Преобразуем строку в массив параметров
//         String[] strArray = str1.toString().replaceAll("[{}\"]", "").split(", ");

//         // Создаем новую StringBuilder для хранения отфильтрованных параметров
//         StringBuilder filteredParams = new StringBuilder();

//         // Перебираем параметры и добавляем их в новую строку, если их значение не равно "null"
//         for (String param : strArray) {
//             String[] keyValue = param.split(":");
//             if (!keyValue[1].equals("null")) {
//                 filteredParams.append(keyValue[0]).append(": ").append(keyValue[1]).append(", ");
//             }
//         }

//         // Убираем лишнюю запятую и пробел в конце строки
//         if (filteredParams.length() > 0) {
//             filteredParams.setLength(filteredParams.length() - 2);
//         }

//         // Выводим отфильтрованные параметры
//         System.out.println("Отфильтрованные параметры: {" + filteredParams.toString() + "}");

//     }
// }

// ------------
//  Вариант №2.1 - Дополнительное задание № 1
// ------------

public class W2T1 {
    public static void main(String[] args) {
        StringBuilder arrayMain = new StringBuilder(
                "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]");
        String str = arrayMain.toString();
        String str1 = str.replace("{", "");
        String str2 = str1.replace("}", "");
        String str3 = str2.replaceAll("\"", "");
        String str4 = str3.replace("[", "");
        String str5 = str4.replace("]", "");
        String[] arrayData = str5.split(",");
        String[] listName = { "Студент", "получил", "по предмету" };
        StringBuilder result = new StringBuilder("");

        for (int i = 0; i < arrayData.length; i++) {
            String[] arrData = arrayData[i].split(":");
            result.append(listName[i % 3] + " " + arrData[1] + " ");
            if (i % 3 == 2) {
                result.append(".\n");
            }
        }
        String finalResult = result.toString().replace(" .", ".");
        System.out.println(finalResult);

    }
}

// ------------
// Вариант №2.2 - Дополнительное задание № 2
// ------------

// public class W2T1
// {
// public static void main(String[] args)
// {
// String comparison = "a";
// long starttime1 = System.currentTimeMillis();
// for (int i = 0; i < 1000; i++)
// {
// String fihish = comparison.replace("a", "A");
// // System.out.println(fihish);
// }
// long endtime1 = System.currentTimeMillis();
// long time1 = endtime1 - starttime1;
// System.out.println("String time = " + (endtime1 - starttime1));

// StringBuilder buld = new StringBuilder("a");
// long starttime2 = System.currentTimeMillis();
// for (int i = 0; i < 1000; i++)
// {
// buld.replace(0, 1, "A");
// // System.out.println(buld);
// }
// long endtime2 = System.currentTimeMillis();
// long time2 = endtime2 - starttime2;
// System.out.println("StringBuilder time = " + (endtime2 - starttime2));

// System.out.println(time1 == time2 ? "String time fast!" : "StringBuilder time
// fast!");

// }
// }

// ------------
// Вариант №2.3 - Дополнительное задание № 3
// ------------

// public class W2T1
// {
// public static void main(String[] args)
// {
// String str1 = ".3 + 1.56 = ";
// double num1 = Double.parseDouble(".3f");
// double num2 = Double.parseDouble("1.56f");
// double resnum = num1 +num2;
// String str2 = String.valueOf(resnum);
// String resstr = str1 + str2;
// System.out.println(resstr);

// }
// }
