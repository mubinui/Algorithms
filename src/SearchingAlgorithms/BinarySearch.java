package SearchingAlgorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int l, r;
        int [] a = {1, 2, 3, 4, 5, 6, 7};
        int x = binary_search(a,0,a.length,10);
        System.out.println(a[x]);





    }
    public static int binary_search(int [] a, int l, int r, int x){
        if (l<=r){
            int mid = (l+(r-1))/2;

            if (a[mid]==x){
                return mid;
            }
            if (x<a[mid]) {
                return binary_search(a, l, mid, x);
            }
            return binary_search(a,mid+1,r,x);
        }
        return -1;
    }
}
