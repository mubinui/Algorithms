package Graph_Algorithms;

public class HelloMelo {
    public static void main(String[] args) {
        int a [] = new int[10]; // for range 1-10
        int b [] = {1,1,2,4,5,6,6,7,9,9,9,9,1,4,4,4};
        for (int i = 0; i <b.length ; i++) {
            a[b[i]]++;

        }

        for (int i = 0; i <a.length ; i++) {
            System.out.println(i +" found ->"+a[i]+" times");

        }

    }
}
