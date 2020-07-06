package com.company;


import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int max(int[] arr){
        int length = arr.length;
        int max = arr[0];
        for(int j = 1; j < length; ++j){
            if(arr[j] > max){
                max = arr[j];
            }
        }
        return max;
    }

    public static int min(int[] arr){
        int length = arr.length;
        int min = arr[0];
        for(int j = 1; j < length; ++j){
            if(arr[j] < min){
                min = arr[j];
            }
        }
        return min;
    }

    public static boolean even(int num){
        if((num & 1) == 1) return false;
        return true;
    }

    public static void sort(int[] arr){
        int length = arr.length;
        for(int i = 0; i < length - 1; ++i){
            for(int j = 0; j < length - i - 1; ++j){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static boolean palindrome(String str){
        int length = str.length();
        for(int i = 0; i < length / 2; ++i){
            if(str.charAt(i) != str.charAt(length - i - 1)){
                return false;
            }
        }
        return true;
    }

    public static int largestProduct(int[] arr){
        int length = arr.length;
        int max = arr[0] * arr[1];
        for(int i = 1; i < length - 1; ++i){
            int product = (arr[i] * arr[i + 1]);
            if(product > max){
                max = product;
            }
        }
        return max;
    }
    // homework 2
    public static int degreeOfTwo(int[] arr){
        int length = arr.length;
        int count = 0;
        for(int i = 0; i < length; ++i){
            boolean b = true;
            int el = arr[i];
            while(el > 1){
                int mod = el % 2;
                if(mod == 1){
                    b = false;
                    break;
                }
                el /= 2;
            }
            if(el != 0 && b){
                ++count;
            }
        }
        return count;
    }

    public static void randomArray(int[] arr){
        int length = arr.length;
        Random random = new Random();
        for(int i = 0; i < length; ++i){
            arr[i] = random.nextInt(1000) + 1;
        }
    }

    public static int minIndex(float[] arr){
        int length = arr.length;
        float min = arr[0];
        int index = 0;
        for(int i = 1; i < length; ++i){
            if(arr[i] < min)
            {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static int century(int year){
        int century = year / 100;
        if((year % 100) != 0){
            ++century;
        }
        return century;
    }

    public static String missingElements(int[] arr){
        int length = arr.length;
        String result = "";
        int max = max(arr);
        int min = min(arr);
        for(int i = min + 1; i < max; ++i){
            boolean b = false;
            for(int j = 0; j < length; ++j){
                if(i == arr[j]){
                    b = true;
                    break;
                }
            }
            if(!b){
                result += i + " ";
            }
        }
        return result;
    }

    public static int sumWithThree(int[] arr){
        int length = arr.length;
        int sum = 0;
        for(int i = 0; i < length; ++i){
            int el = arr[i];
            while(el > 9){
                el /= 10;
            }
            if(el == 3){
                sum += arr[i];
            }
        }
        return sum;
    }

    public static boolean primeNumbers(int[] arr){
        int length = arr.length;
        int count = 0;
        for(int value : arr){
            int el = value;
            boolean b = true;
            for(int i = 2; i * i < el; ++i){
                if(el % i == 0){
                    b = false;
                    break;
                }
            }
            if(b){
                ++count;
            }
        }
        if(count > 1) return true;
        return false;
    }

    public static void main(String[] args) throws IOException {
        byte b = 10;
        short s = -100;
        int i = 1;
        long l = 10000L;
        float f = 0.5f;
        double d = 1.0;
        boolean bool = true;
        char ch = 'A';
        System.out.printf("%d %d %d %d %.1f %.1f %b %c", b, s, i, l, f, d, bool, ch);
        System.out.println();

        /////////////////////

        char c = (char)System.in.read();
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] array = new int[length];
        for(int j = 0; j < length; ++j){
            array[j] = in.nextInt();
        }
        if(c == 'A'){
            System.out.println(max(array));
        }
        else {
            if (c == 'B') {
                System.out.println(min(array));
            }
            else {
                int mean = (max(array) + min(array)) / 2;
                System.out.println(mean);
            }
        }

        ////////////////////
        System.out.println("enter an integer");
        int num = in.nextInt();
        System.out.println(even(num));
        System.out.println("sorted array");
        sort(array);
        for(int value : array){
            System.out.println(value);
        }
        System.out.println("enter a string");
        String str = in.next();
        System.out.println(palindrome(str));
        System.out.println(largestProduct(array));

        // homework 2

        System.out.println(degreeOfTwo(array));
        randomArray(array);
        for(int value : array){
            System.out.println(value);
        }
        float[] arrf = new float[length];
        System.out.println("enter float numbers");
        for(int j = 0; j < length; ++j){
            arrf[j] = in.nextFloat();
        }

        System.out.println(minIndex(arrf));
        int year = in.nextInt();
        System.out.println(century(year));
        System.out.println(missingElements(array));

        System.out.println(sumWithThree(array));
        System.out.println(primeNumbers(array));

        in.close();
    }
}
