import java.util.*;
class practice{
    public static int[][] strt= new int[3][3];
    public static int[][] revers= new int[3][3];
    public static void main (String[] arg){
        int num=2;
        for(num=2;num<6;num++){
            if(num==4){
            }
            else{
                for(int i=0;i<strt.length;i++){
                    int num2=1;
                    for(int j=0;j<strt[i].length;j++){
                        strt[i][j]=num^num2;
                        num2++;
                    }
                }
            }
        }    
    }

    // public static int[][] reverse(int[][] strt){
    //     int num1=0;
    //     for(int i=strt.length-1;i>=0;i--){
    //         int num2=0;
    //         for(int j=strt[i].length-1;j>=0;j--){
    //             revers[i][j]=strt[num1][num2];
    //             num2++;
    //         }
    //         num1++;
    //     }
    //     return revers;
    // }
}