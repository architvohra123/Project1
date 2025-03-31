public class Main{
    public static void main(String[] args){
        System.out.println("For common puposes");
        printFib(4);
    }
    public static void printFib(int n){
        if(n<1){
            System.out.println("Invalid input");
            return;
        }
        int n1 = 1;
        int n2 = 0;
        for(int i=0;i<n;i++){
            System.out.println(n1);
            int temp = n2;
            n2 = n1;
            n1 += temp;
        }
    }
}
/*
 * Made by OG
 */