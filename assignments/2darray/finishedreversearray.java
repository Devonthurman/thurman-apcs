import java.util.*;
class finishedreversearray{
    public static int[][] arr= new int[3][3];
    public static int[][] revers= new int[3][3];
    public static void main (String[] args){
        int num=1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=num;
                num++;
            }
        }
        reverse(arr);
        for(int i=0;i<revers.length;i++){
            for(int j=0;j<revers[i].length;j++){
                System.out.println(revers[i][j]);
            }
        }
    }

    public static int[][] reverse(int[][] arr){
        int num1=0;
        for(int i=arr.length-1;i>=0;i--){
            int num2=0;
            for(int j=arr[i].length-1;j>=0;j--){
                revers[i][j]=arr[num1][num2];
                num2++;
            }
            num1++;
        }
        return revers;
    }
}