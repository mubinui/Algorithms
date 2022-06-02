package ComplexityAnalysis;

public class NestedLoops {
    public static void main(String[] args) {
        int i,j,n,count;
        count = 0;
        n = 6;
        for (i = 0; i < n; i++) {
            for (j = 0; j <n; j+=2) {
                count++;

            }

        }
        System.out.println(count);
    }
}
