import java.util.*;
class twodarray {
    public static void main (String[] args){
    int[][] arr=new int[3][3];
    int num = 1;
    for(int i=0;i<arr.size();i++){
        for(int j=0;j<arr[i].length();j++){

        }
    }   
    }
}

//  int[][] arr1 = new int[3][3];

//     for(int i = 0; i < arr1.length; i++) {
//         for(int j = 0; j < arr1[i].length; j++) {
//             arr1[i][j] = (i * 2) * (j * 2);
//         }
//     }[0,0,0 ]
//      [0,4,8 ]
//      [0,8,16]

//     int[][] arr2 = new int[3][3];
//     for(int i = 0; i < arr2.length; i++) {
//         for(int j = 0; j < arr2[i].length; j++) {
//             arr2[i][j] = arr1[i][j] * arr1[i][j];
//         }
//     }[0,0,0   ]
//      [0,16,64 ]
//      [0,64,256]

//     int[][] arr3 = new int[5][5];

//     int num = 1;
//     for(int i = 0; i < arr3.length; i++) {
//         for(int j = 0; j < arr3[i].length; j++) {
//             arr3[i][j] = num; 
//             num *= 2
//         }
//     }[1,2,4,8,16                               ]
//      [64,128,256,512,1024                      ]
//      [2048,4096,8192,16384,32768               ]
//      [65536,131072,262144,524288,1048576       ]
//      [2097152,4194304,8388608,16777216,33554432] 