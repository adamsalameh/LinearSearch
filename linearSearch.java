//'main' method must be in a class 'Rextester'.
//Compiler version 1.8.0_111

import java.util.*;
import java.lang.*;

class Rextester
{  
    public static int linearSearch(int[] array, int num){
        for (int i=0; i<array.length; i++){
            if (num == array[i]){
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String args[])
    {
        
        int[] numbers = {1, 2, 300, 400, 500, 50, 60, 70, 80};
        
        System.out.println(Arrays.toString(numbers));
        System.out.println(linearSearch(numbers,80));
    }
}
