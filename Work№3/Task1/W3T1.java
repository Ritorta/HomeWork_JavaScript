// Work №3 - Task №1

// Пусть дан произвольный список из 100 целых чисел.

// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение




// ------------
//  Вариант №1 - Основное задание
// ------------ 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;



public class W3T1 

{
    public static void main(String[] args) 
    {
     
        List task1 = randlist(100, 1, 100);
        System.out.println("List random numbers: ");
        System.out.println(task1);

        List task2 = deletenumber(task1);
        System.out.println("List of delete even numbers: ");
        System.out.println(task2);

        List task3 = minnamber(task2);
        System.out.println("Min number the list: ");
        System.out.println(task3);

        List task4 = maxnamber(task2);
        System.out.println("Max number the list: ");
        System.out.println(task4);

        List task5 = midllenamber(task2);
        System.out.println("Middle number the list: ");
        System.out.println(task5);
        
        


        
    }

    public static List<Integer> randlist(int size, int min, int max)
    {
        // int rand = new Random().nextInt(1, 100 + 1);
        List<Integer> randlist = new ArrayList<>();
        for (int i = 0; i < size; i++) 
        {
            randlist.add(new Random().nextInt(min, max + 1));        
        }
        return randlist;
    }

    public static List deletenumber(List task1) 
    {
        for (Iterator<Integer> iterator = task1.iterator(); iterator.hasNext();) 
        {
            Integer deleven = iterator.next();

            if(deleven % 2 == 0)
            {
                iterator.remove();
            }
        } 
        return task1;
    }

    public static List minnamber(List task2) 
    {
        int min = 100;
        List<Integer> minlist = new ArrayList<>();
        for (Iterator<Integer> iterator = task2.iterator(); iterator.hasNext();) 
        {
            Integer deleven = iterator.next();

            if(deleven < min)
            {
               min = deleven;  
            }
        }
        minlist.add(min);
        return minlist;
    }

    public static List maxnamber(List task2) 
    {
        int max = 0;
        List<Integer> maxlist = new ArrayList<>();
        for (Iterator<Integer> iterator = task2.iterator(); iterator.hasNext();) 
        {
            Integer deleven = iterator.next();

            if(deleven > max)
            {
               max = deleven;  
            }
        }
        maxlist.add(max);
        return maxlist;
    }

    public static List midllenamber(List task2) 
    {
        int min = 100;
        int max = 0;
        int middle = 0;
        List<Integer> midllelist = new ArrayList<>();

        for (Iterator<Integer> iterator = task2.iterator(); iterator.hasNext();) 
        {
            Integer deleven = iterator.next();

            if(deleven < min)
            {
                min = deleven;  
            }

            if(deleven > max)
            {
                max = deleven; 
            }
        }

        middle = (min + max) / 2;
        midllelist.add(middle);
        
        return midllelist;
    }

}    