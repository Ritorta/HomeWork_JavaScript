// Work №1 - Task №1

// 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

// Пункты реализовать в методе main
// *Пункты реализовать в разных методах

// int i = new Random().nextInt(k); //это кидалка случайных чисел!)


// ------------
//  Вариант №1 - Пункты реализовать в методе main.
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
//  Вариант №2 - Пункты реализовать в разных методах.
// ------------

// import java.util.ArrayList;
// import java.util.Random;

// public class W1T1
// {
//     public static void main(String[] args) 
//     {
//         int i = rand();
//         int n = bit(i);
//         ArrayList<Integer> max = array_max(n, i);
//         ArrayList<Integer> min = array_min(n, i);
//         System.out.println(i);
//         System.out.println(n);
//         System.out.println(max);
//         System.out.println(min);

//        // Или такой вывод:

//         // System.out.println(rand());
//         // System.out.println(bit(rand()));
//         // System.out.println(array_max(bit(rand()), rand()));
//         // System.out.println(array_min(bit(rand()), rand()));

//     }

//     public static int rand() 
//     {
//         int rand = new Random().nextInt(2000 + 1);
//         int i = rand;
//         return i;   
//     }
    
//     public static int bit(int i) 
//     {
//         int n = Integer.highestOneBit(i);
//         return n;
//     }    

//     public static ArrayList<Integer> array_max(int i, int n) 
//     {
//         int n_max = 0;
//         ArrayList<Integer> array1 = new ArrayList<Integer>();
//         for (int j = n; j < Short.MAX_VALUE; j++) {
//             if (j % n == 0)
//             n_max ++;
//             array1.add(n_max);
//         }
//         return array1;
//     }

//     public static ArrayList<Integer> array_min(int n, int i) 
//     {
//         int n_min = 0;
//         ArrayList<Integer> array2 = new ArrayList<Integer>();
//         for (int j = Short.MIN_VALUE; j < i; j++) {
//             if (j % n != 0)
//             n_min ++;
//             array2.add(n_min);
//         }
//         return array2;
//     }
// }

// ------------
//  Тест
// ------------


import java.util.Random;

public class W1T1
{
    public static void main(String[] args) 
    {
        int i = rand();
        int n = bit(i);
        int[] max = array_max(i, n);
        // ArrayList<Integer> min = array_min(n, i);
        System.out.println(i);
        System.out.println(n);
        System.out.println(max);
        // System.out.println(min);

    }

    public static int rand() 
    {
        int rand = new Random().nextInt(2000 + 1);
        int i = rand;
        return i;   
    }
    
    public static int bit(int i) 
    {
        int n = Integer.highestOneBit(i);
        return n;
    }    
// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
    public static int[] array_max(int i, int n) 
    {
        int n_max = 0;
        int[] array1 = new int[2001];

        for (int j = i; j < array1.length; j++) 
        {
            for (int k = j; k < Short.MAX_VALUE; k++) 
            {
                if (k % n == 0)
                {
                    array1[n_max] = k;
                }
                
            }    
        }
        
        return array1;
    }

//     public static ArrayList<Integer> array_min(int n, int i) 
//     {
//         int n_min = 0;
//         ArrayList<Integer> array2 = new ArrayList<Integer>();
//         for (int j = Short.MIN_VALUE; j < i; j++) {
//             if (j % n != 0)
//             n_min ++;
//             array2.add(n_min);
//         }
//         return array2;
//     }
}








