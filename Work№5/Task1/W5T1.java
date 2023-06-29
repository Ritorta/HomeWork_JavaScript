// Work №5 - Task №1

// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, 
// их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.

// ------------
//  Вариант №1 - Основное задание
// ------------ 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class W5T1
{

    public static void addnamebook(String key, int value, Map<String, ArrayList<Integer>> map)
    {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }

    public static void printphone(Map<String, ArrayList<Integer>> map)
    {
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }

    public static void main(String[] args)
    {
        Map<String, ArrayList<Integer>> phonebook = new HashMap<>();
        addnamebook("Ira", 5416, phonebook);
        addnamebook("Kola", 1235164, phonebook);
        addnamebook("Sidorov", 516816585, phonebook);
        addnamebook("Ira", 89568477, phonebook);
        addnamebook("Dima", 146233, phonebook);
        addnamebook("Kola", 764287897, phonebook);
        addnamebook("Sidorov", 8456477, phonebook);
        addnamebook("Veronika", 123566233, phonebook);
        addnamebook("Ugor", 78789947, phonebook);
        addnamebook("Ivanov", 8956477, phonebook);
        addnamebook("Pentorv", 12356233, phonebook);
        addnamebook("Ivanov", 787897, phonebook);
        printphone(phonebook);
    }

}

// ------------
//  Вариант №2 - На потом
// ------------ 

// import java.util.*;


// public class W5T1 
// {
//    public static void main(String[] args) 
//    {
//        Map<Integer, String> Phonebook = new HashMap<>();

        // Phonebook.put(55, "Vasa");
        // Phonebook.put(123, "Ira");
        // Phonebook.put(2, "Valera");
        // Phonebook.put(412, "Anton");
        // Phonebook.put(6989, "Lena");
        // Phonebook.put(829037186-27-5, "Vasa");
        // Phonebook.put(911, "DIMON!");
        // Phonebook.put(311, "Alecsey");
        // Phonebook.put(128511, "Andrey");
        // Phonebook.put(8213, "Lera");
//        Phonebook.put(7886, "Sveta");
//        Phonebook.put(1, "Lena");
//        Phonebook.put(456, "Lena");

           
        // for (int i : Phonebook.keySet())
        // {
        //         if(Phonebook.containsValue(value))
        //             {
        //                 System.out.println(Phonebook.get(i) + " - " + i);

        //             }
            
        // }
       
//      HashMap<Integer, String> duplicatMap = new HashMap<>();

//        Set<Map.Entry<Integer, String>> entrySet = Phonebook.entrySet();
//        Iterator<Map.Entry<Integer, String>> iterator = entrySet.iterator();
//        while(iterator.hasNext()) {
//            Map.Entry<Integer, String> entry = iterator.next();
//            String value = entry.getValue();
//            Integer key = entry.getKey();
            
//            if(duplicatMap.containsValue(value)) 
//            {
//                duplicatMap.put(key, value);
//            } 
//            else 
//            {
//                duplicatMap.put(key, duplicatMap.get(value)+", " + value);
//            }
          
//        }
       
//        Map<Integer, String> sorted = new TreeMap<>(duplicatMap).descendingMap(); 
//        sorted.entrySet().forEach(System.out::println); 

//        }
        
//        }
        











        

// System.out.println(Phonebook);
// System.out.println(Phonebook);

		
				
    

    
    

