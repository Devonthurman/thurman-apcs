import java.util.*;
class stringdecomp{
    public static String message="Given the circumstances, I'm not sure if it was a success, but it certainly seems promising.";
    public static ArrayList<Integer> spaces= new ArrayList<Integer>();
    public static ArrayList<Integer> punc= new ArrayList<Integer>(); 
    public static ArrayList<Integer> itidx= new ArrayList<Integer>();
    public static ArrayList<String> words= new ArrayList<String>();      
    
    public static void main (String args[]){
        findpunc();
        findspace();
        finditidx();
        findwords();
    }

    public static void findpunc(){
        for(int i=0;i<message.length();i++){
            if(message.charAt(i)==','){
                punc.add(i);
            }
            if(message.charAt(i)=='.'){
                punc.add(i);
            }
            if(message.charAt(i)=='I'){
                punc.add(i+1);
            }
        }
        for(int idx : punc) {
            System.out.println(message.charAt(idx));
        }
    }

    public static void findspace(){
        for(int i=0;i<message.length();i++){
            if(message.charAt(i)==' '){
                spaces.add(i);
            }
        }
        for(int idx : spaces) {
            System.out.println("space");
        }
    }
    public static void finditidx(){
        for(int i=0;i<message.length();i++){
            if(message.charAt(i)=='i'){
                if(message.charAt(i+1)=='t'){
                    itidx.add(i);
                }    
            }
        }
        for(int idx : itidx) {
            System.out.println(message.charAt(idx));
        }
    }

     public static void findwords(){
        for(int i=0;i<message.length();i++){
            if(message.charAt(i)==' '){
                if(message.charAt(i-1)=='.'){
                    words.add("y");
                }
                if(message.charAt(i-1)==','){
                    words.add("t");
                }
                else{
                    words.add("f");
                } 
            }
        }
        
    }
}


//  String s = "I'd go, but I'm broke.";

//     char c1 = s.charAt(7);
//     System.out.println(c1); prints " "

//     char c2 = s.charAt(10);
//     System.out.println(c); prints "t"

//     int idx1 = s.indexOf(',');
//     System.out.println(idx1); prints "6"

//     int idx2 = idx1 + 3;
//     System.out.println(idx2); prints "9"

//     char c3 = s.charAt(idx1);
//     System.out.println(c3); prints ","

//     char c4 = s.charAt(s.indexOf(c2) + 2);
//     System.out.println(c4); prints "I"

//     char c5 = s.charAt(s.length() - 1);
//     System.out.println(c5); prints "."

//     int idx3 = s.indexOf('\'');
//     System.out.println(idx3); prints "1"

//     int idx4 = s.indexOf("go");
//     System.out.println(idx4); prints "4"