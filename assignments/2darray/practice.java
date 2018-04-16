import java.util.*;
class practice{
    public static int[][] strt= new int[3][3];
    public static int[][] revers= new int[3][3];
    public static void main (String[] arg){
        
    }

    public static int[][] reverse(int[][] strt){
        int num1=0;
        for(int i=strt.length-1;i>=0;i--){
            int num2=0;
            for(int j=strt[i].length-1;j>=0;j--){
                revers[i][j]=strt[num1][num2];
                num2++;
            }
            num1++;
        }
        return revers;
    }
}