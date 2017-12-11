import java.util.Scanner;

public class 是否在圈內 {
    public static void main(String [] args){
        Scanner sc =new Scanner(System .in);
        int x = sc.nextInt() ;
        int y = sc.nextInt() ;
        if(x*x+y*y<=100*100){
            System .out.println("Inside");
        }
        else{
            System.out.println("Outside");
        }
    }
}
