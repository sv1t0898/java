package api.homework;

public class mytools {
    
    public static void main(String[] args) {

        System.out.println(printArray(randomArray(15)));

        }
    
    // факториал  
    public static double factorial(int n){
        double result = 1;
        if (n <= 0 || n == 1)
            return result;
        
        result = n * factorial(n - 1); //if change '*' on '+' it will be triangular Numbe.

        return result;
    }

    // определение треугольного числа
    public static double triangularNumber(int n){
        double result = 0.5*n*(n+1);

        return result;
    }
    
    // проверка на простое натуральное число
    public static boolean checkNatNum(int n){
        if (n < 2){
            return false;
        }

        for (int i = 2; i < n/2; i++){
            if (n % i == 0){
                return false;
            }
        }

        return true;
    }

    // массив случайных чисел
    public static int[] randomArray(int len){
        int array[] = new int[len];
        
        for (int i = 0; i < len; i++){
            int a = (int) ( Math.random()*100 );
            array[i] = a;

        }

        return array;
    }

    // вывод массива в консоль
    public static String printArray(int[] array){
        String str = "";
        for(int i = 0; i < array.length; i++){
            str += array[i] + ", ";
        }
        
        return str;
    }

    // удалить чётные числа из массива:
    public static String delEvenNumber(int[] array){
        String result = "";
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0){
                result += array[i] + ", ";
            }
        }

        return result;
    }  

    // найти минимальное значение в массиве
    public static int minValue(int[] array){
        int result = array[0];
        for (int i = 1; i < array.length ; i++){
            if (result > array[i]){
                result = array[i];
            }
        }

        return result;
    }

    // найти максимальное значение
    public static int maxValue(int[] array){
        int result = array[0];
        for (int i = 1; i < array.length ; i++){
            if (result < array[i]){
                result = array[i];
            }
        }

        return result;
    }

    // найти среднее значение массива чисел
    public static double averangeValue(int[] array){
        double result = array[0];
        for (int i = 1; i < array.length ; i++){
            result += array[i];
        }
        result /= array.length;

        return result;
    }

    

}    


