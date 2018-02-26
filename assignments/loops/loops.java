class loops {
    public static void main (String[] args){
        int n=1;
        while (n<=10){
            System.out.println(n);
            n++;
        }
        System.out.println("exercise 2 correction part 1");
        for(int i = 0; i >= -100; i--) {
        System.out.println(i);
        }
        System.out.println("exercise 2 correction part 2");
        for(int i = 1; i < 20; i *= 2) {
        System.out.println(i);
        }
        System.out.println("exercise 2 multiples of 3");
        for (int i=0;i<100;i+=3){
            System.out.println(i);
        }
        System.out.println("exercise 2 powers of 2");
        for(int i = 1; i <= 1024; i *= 2) {
        System.out.println(i);
        }
    }
}

