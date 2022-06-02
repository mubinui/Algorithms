package Sorting_Algorithms;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int a [] = {1,5,3,2,6,9,4};
        heapsort(a);
        for (int i:a){
            System.out.print(i+" ");
        }

    }
    public static void heapsort(int[] a){
        int heapsize = a.length;
        //build max heap
        build_max_heap(a);
        for (int i = a.length-1; i >1 ; i--) {
            int temp = a[i];
            a[1] = a[i];
            a[i] = temp;
            // a.heapsize = a.heapsize - 1;
            heapsize--;
            max_heapify(a,heapsize,1);


        }

    }
    public static void build_max_heap(int [] array){
        for (int i = array.length/2; i>0 ; i--) {
            max_heapify(array, array.length-1,i);

        }
    }
    public static void max_heapify( int heap [],int heap_size, int i){
        int largest = i;
        int l = left_child(i);
        int r = right_child(i);
        if (l<=heap_size && heap[l]>heap[i]){
            largest = l;

        }
        if(r<=heap_size && heap[r]>heap[largest]){
            largest = r;

        }
        if(largest!= i){
            int temp = heap[i];
            heap[i] = heap[largest];
            heap[largest] = temp;
            max_heapify(heap,heap_size,largest);

        }


    }
    public static int parent(int i){
        return (int)Math.floor(i/2);
    }

    public static int left_child(int i){
        return 2*i;
    }
    public static int right_child(int i){
        return 2*i+1;
    }


}
