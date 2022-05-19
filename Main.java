// Я участвую в проекте возрождения всего Человечества - Созидательное Общество! 
// Присоединяйся, если ты за добро: https://creativesociety.com/ru/

//Автор кода:
//Сокольский Михаил
//+7 926 8645511
//mysokolsky@gmail.com



// Домашнее задание №2


import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    
// 1) Составьте программу, выводящую на экран квадраты чисел от 1 до 25.

System.out.println();
System.out.println("Задача 1: Выведем квадраты чисел от 1 до 25:");

for (int i=1; i<=25; i++) {
  System.out.println(i*i);
}



// 2) Даны числа от 100 до 1000. Вывести числа, которые делятся на 3 и не делятся на 9 на цело.

System.out.println();
System.out.println("Задача 2: Выведем числа от 100 до 1000, которые делятся без остатка на 3 и с остатком на 9.");

for (int i=100; i<=1000; i++) {

  if (i%3 == 0 && i%9 != 0 ) {
   System.out.println(i);
  }
  
}

System.out.println();
System.out.println("Другой вариант:");

int w = 102;
while (w<=1000) {
  if (w%9 !=0){
    System.out.println(w);
  }
    w += 3;
} 




// 3) Даны две матрицы (два двумерных int массива одинаковой размерности). Найти сумму матриц

System.out.println();
System.out.println("Задача 3: Найти сумму матриц");

int[][] FirstMatrix = {
  {1,5,3},
  {2,-6,8},
  {9,5,-11},
  {-7,6,4}
};

int[][] SecondMatrix = {
  {6,-15,21},
  {18,10,-7},
  {52,-23,8},
  {11,64,-37}
};



System.out.println();
System.out.println("Первая матрица:");
for (int i = 0; i < FirstMatrix.length; i++) {
  System.out.println(Arrays.toString(FirstMatrix[i]));
}

System.out.println();
System.out.println("Вторая матрица:");
for (int i = 0; i < SecondMatrix.length; i++) {
  System.out.println(Arrays.toString(SecondMatrix[i]));
}

System.out.println();
System.out.println("Сумма матриц:");

int i, j;
i = 0;
j = 0;

for (int x[]: FirstMatrix) {    // перебор строк матрицы FirstMatrix
  for (int y: x) {              // перебор элементов строки матрицы FirstMatrix
    System.out.print(y+SecondMatrix[i][j]+", ");
    j++;
  }
  i++;
  j=0;
  System.out.println();
}


// 4) Реализовать алгоритм сортировки пузырьком для массива типа int

System.out.println();
System.out.println("Задача 4: Упорядочить массив методом пузырька.");

int[] array = {3,67,11,34,0,-77,-8};

System.out.println("Изначальный массив имеет вид:");
System.out.println(Arrays.toString(array));


int n = array.length;
int temp;
for (i=0; i<n; i++) {
  for (j=i+1; j<n; j++){
    if (array[j]<array[i]) {
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
  }
}

System.out.println();
System.out.println("Упорядоченный массив имеет вид:");
System.out.println(Arrays.toString(array));


  }
}