// Work №1 - Task №1

// 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

// Пункты реализовать в методе main
// *Пункты реализовать в разных методах

// int i = new Random().nextInt(k); //это кидалка случайных чисел!)


// ------------
//  Вариант №1 - Пункты реализовать в методе main
// ------------

// import java.util.ArrayList;
// import java.util.Random;

// public class W1T1
// {
//     public static void main(String[] args) 
//     {
//         int rand = new Random().nextInt(2000 + 1);
//         int i = rand;
//         System.out.println("Random number: " + i);

//         int n = Integer.highestOneBit(i);
//         System.out.println("Hing bit: " + n);
        
//         int n_max = 0;
//         ArrayList<Integer> array1 = new ArrayList<Integer>();
//         for (int j = n; j < Short.MAX_VALUE; j++) {
//             if (j % n == 0)
//             n_max ++;
//             array1.add(n_max);
//         }
//         System.out.println("Multiples of N: " + array1);
        
//         int n_min = 0;
//         ArrayList<Integer> array2 = new ArrayList<Integer>();
//         for (int j = Short.MIN_VALUE; j < i; j++) {
//             if (j % n != 0)
//             n_min ++;
//             array2.add(n_min);
//         }
//         System.out.println("Multiples of N: " + array2);
//     }

// }

// ------------
//  Вариант №2 - Пункты реализовать в разных методах
// ------------

import java.util.ArrayList;
import java.util.Random;

public class W1T1
{
    public static void main(String[] args) 
    {

    }
    public void name() 
    {
         int rand = new Random().nextInt(2000 + 1);
        int i = rand;
        System.out.println("Random number: " + i);

       
    }
    }

    public void name() 
    {
         int n = Integer.highestOneBit(i);
        System.out.println("Hing bit: " + n);
        
        

    public void name() 
    {
        int n_max = 0;
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        for (int j = n; j < Short.MAX_VALUE; j++) {
            if (j % n == 0)
            n_max ++;
            array1.add(n_max);
        }
        System.out.println("Multiples of N: " + array1);
        
        
    }
    }

    public void name() 
    {
        int n_min = 0;
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j % n != 0)
            n_min ++;
            array2.add(n_min);
        }
        System.out.println("Multiples of N: " + array2);
    }
}