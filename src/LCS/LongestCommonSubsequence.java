package LCS;
public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String s1 = "facbcnaaade ";
        String s2 = "abclkpnde ";
        //cdgi
        int out = solver(s1,s2);
        System.out.println("Length of the Sequence is-> "+out);

    }
    public static int solver (String a, String b){
        int common_sequence = 0;
        char [] ch_array = a.toCharArray();
        char [] ch_array2 = b.toCharArray();
        common_sequence =LCS(a.length()-1,b.length()-1,ch_array,ch_array2);

        return common_sequence;
    }

    public static int LCS(int i, int j, char [] a, char [] b){

        if (i==0 ||j==0){
            return 0;

        }

        else if (a[i]==b[j]) {
            return 1+LCS(i-1,j-1, a, b);

        }
        return Math.max(LCS(i,j-1, a,b),LCS(i-1,j,a,b)) ;

    }
}
