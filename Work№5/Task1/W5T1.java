// Work №5 - Task №1

// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, 
// их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.

// ------------
//  Вариант №1 - Основное задание
// ------------ 

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;



public class W5T1 
{
    public static void main(String[] args) 
    {
        Map<Integer, String> Phonebook = new HashMap<>();

        Phonebook.put(81593, "Vasa");
        Phonebook.put(39312, "Ira");
        Phonebook.put(279192-03-83, "Valera");
        Phonebook.put(412, "Anton");
        Phonebook.put(90077699-8-39, "Lena");
        Phonebook.put(829037186-27-5, "Vasa");
        Phonebook.put(911, "DIMON!");
        Phonebook.put(508995-51-21, "Alecsey");
        Phonebook.put(128511, "Andrey");
        Phonebook.put(109176626-85-86, "Lera");
        Phonebook.put(313306089, "Sveta");
        Phonebook.put(1264894140, "Lena");
        Phonebook.put(1123416240, "Lena");
        Map<Integer, String> sorted = new TreeMap<>(Phonebook).descendingMap(); 
        sorted.entrySet().forEach(System.out::println); 

    }
    
}
