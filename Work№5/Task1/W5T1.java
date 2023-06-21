// Work №5 - Task №1

// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, 
// их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.

// ------------
//  Вариант №1 - Основное задание
// ------------ 

import java.util.*;


public class W5T1 
{
    public static void main(String[] args) 
    {
        Map<Integer, String> Phonebook = new HashMap<>();

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
        Phonebook.put(7886, "Sveta");
        Phonebook.put(1, "Lena");
        Phonebook.put(456, "Lena");

           
        // for (int i : Phonebook.keySet())
        // {
        //         if(Phonebook.containsValue(value))
        //             {
        //                 System.out.println(Phonebook.get(i) + " - " + i);

        //             }
            
        // }
       
      HashMap<Integer, String> duplicatMap = new HashMap<>();

        Set<Map.Entry<Integer, String>> entrySet = Phonebook.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = entrySet.iterator();
        while(iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            String value = entry.getValue();
            Integer key = entry.getKey();
            
            if(duplicatMap.containsValue(value)) 
            {
                duplicatMap.put(key, value);
            } 
            else 
            {
                duplicatMap.put(key, duplicatMap.get(value)+", " + value);
            }
          
        }
       
        Map<Integer, String> sorted = new TreeMap<>(duplicatMap).descendingMap(); 
        sorted.entrySet().forEach(System.out::println); 

        }
        
        }
        











        

// System.out.println(Phonebook);
// System.out.println(Phonebook);

		
				
    

    
    

