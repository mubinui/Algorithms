package Sorting_Algorithms;

public class QuickSort {
    public void Sort(double [] a){
        double array [] = new double[a.length+1];
        for (int i = 0; i <a.length ; i++) {



        }
        int p = 1;
        int q = a.length-1;
        int pivot = 0;

        for(int i = 0; i<array.length; i++){
            for (int j = array.length; j <array.length ; j++) {
                if (array[p]> array[pivot] && array[q]< array[pivot]){
                    double temp = array[p];
                    array[p] = array[q];
                    array[q] = temp;
                }

            }

        }




    }

}
