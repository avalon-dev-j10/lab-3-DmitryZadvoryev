package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.initialization.FibonacciInitializer;
import ru.avalon.java.dev.j10.labs.initialization.RandomInitializer;
import ru.avalon.java.dev.j10.labs.sort.BubbleSort;
import ru.avalon.java.dev.j10.labs.sort.SelectionSort;
import ru.avalon.java.dev.j10.labs.sort.ShellSort;

public class Main {

    public static void main(String[] args) {
        
        final int size = 20;
        int[] firstArray = new int[size];
        Initializer firstInit = new FibonacciInitializer();
        firstInit.initialize(firstArray);
        int sum = getSum(firstArray);
        
        int[] secondArray = new int[size];
        Initializer secondInit =  new RandomInitializer();
        Sort arraySort = new BubbleSort();
        secondInit.initialize(secondArray);
        arraySort.sort(secondArray);
        
        int[] thirdArray = new int[size];
        Initializer thirdInit =  new RandomInitializer();
        Sort secondArraySort = new SelectionSort();
        thirdInit.initialize(thirdArray);
        arraySort.sort(thirdArray);
        
        int[] fourthArray = new int[size];
        Initializer fourthInit =  new RandomInitializer();
        Sort fourthArraySort = new ShellSort();
        thirdInit.initialize(fourthArray);
        arraySort.sort(fourthArray);
        
    }
    
        private static int getSum(int[] array){
                int sum = 0;
                for (int i = 0; i < array.length; i++){
                    sum+=array[i];
                }
                return sum;
            }
}
