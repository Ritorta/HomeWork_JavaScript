// Work №2 - Task №2

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
//  Вариант №2.1 - Дополнительное задание № 1
// ------------

public class W2T2
{
    public static void main(String[] args)
    {
        StringBuilder arraymain = new StringBuilder("[{\"\u0444\u0430\u043C\u0438\u043B\u0438\u044F\":\"\u0418\u0432\u0430\u043D\u043E\u0432\",\"\u043E\u0446\u0435\u043D\u043A\u0430\":\"5\",\"\u043F\u0440\u0435\u0434\u043C\u0435\u0442\":\"\u041C\u0430\u0442\u0435\u043C\u0430\u0442\u0438\u043A\u0430\"},{\"\u0444\u0430\u043C\u0438\u043B\u0438\u044F\":\"\u041F\u0435\u0442\u0440\u043E\u0432\u0430\",\"\u043E\u0446\u0435\u043D\u043A\u0430\":\"4\",\"\u043F\u0440\u0435\u0434\u043C\u0435\u0442\":\"\u0418\u043D\u0444\u043E\u0440\u043C\u0430\u0442\u0438\u043A\u0430\"},{\"\u0444\u0430\u043C\u0438\u043B\u0438\u044F\":\"\u041A\u0440\u0430\u0441\u043D\u043E\u0432\",\"\u043E\u0446\u0435\u043D\u043A\u0430\":\"5\",\"\u043F\u0440\u0435\u0434\u043C\u0435\u0442\":\"\u0424\u0438\u0437\u0438\u043A\u0430\"}]");
        String str = arraymain.toString();
        String str1 = str.replace("{", "");
        String str2 = str1.replace("}", "");
        String str3 = str2.replaceAll("\"", "");
        String str4 = str3.replace("[", "");
        String str5 = str4.replace("]", "");

        String [] arrayData = str5.split(",");
        String [] listName = {"Студент ", " получил ", " по предмету "};

        StringBuilder result = new StringBuilder("");
        for (int i =0; i < arrayData.length; i++) {
            String[] arrData = arrayData[i].split(":");
            result.append(listName[i]);
            result.append(arrData[1]);
            }
    }
}


//     public static StringBuilder ln(String arraymain)
//     {
//         String str1 = arraymain.replace("{", "");
//         String str2 = str1.replace("}", "");
//         String str3 = str2.replaceAll("\"", "");
//         String str4 = str3.replace("[", "");
//         String str5 = str4.replace("]", "");

//         String [] arrayData = str5.split(",");
//         String [] listName = {"Студент ", " получил ", " по предмету "};

//         StringBuilder result = new StringBuilder("");
//         for (int i =0; i < arrayData.length; i++) {
//             String[] arrData = arrayData[i].split(":");
//             result.append(listName[i]);
//             result.append(arrData[1]);
//             }
//         return result;
//         }
// }   
    



// ------------
//  Вариант №2.1 - Дополнительное задание № 2
// ------------

// public class W2T2
// {
//     public static void main(String[] args) 
//     {
//         String comparison = "a";
//         long starttime1 = System.currentTimeMillis();
//         for (int i = 0; i < 1000; i++) 
//         {
//             String fihish = comparison.replace("a", "A");
//             // System.out.println(fihish);
//         }
//         long endtime1 = System.currentTimeMillis();
//         long time1 = endtime1 - starttime1;
//         System.out.println("String time = " + (endtime1 - starttime1));

//         StringBuilder buld = new StringBuilder("a");
//         long starttime2 = System.currentTimeMillis();
//         for (int i = 0; i < 1000; i++) 
//         {
//             buld.replace(0, 1, "A");
//             // System.out.println(buld);
//         }
//         long endtime2 = System.currentTimeMillis();
//         long time2 = endtime2 - starttime2;
//         System.out.println("StringBuilder time = " + (endtime2 - starttime2));
        
//         System.out.println(time1 == time2 ? "String time fast!" : "StringBuilder time fast!");
    
//     }
    
// }

// ------------
//  Вариант №2.1 - Дополнительное задание № 3
// ------------

// public class W2T2
// {
//     public static void main(String[] args) 
//     {
//         String str1 = ".3 + 1.56 = ";
//         double num1 = Double.parseDouble(".3f");
//         double num2 = Double.parseDouble("1.56f");
//         double resnum = num1 +num2;
//         String str2 = String.valueOf(resnum);
//         String resstr = str1 + str2;
//         System.out.println(resstr);
    

//     }
// }