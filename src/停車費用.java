import java.util.Scanner;

public class 停車費用 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System .in);
        int hr1 =sc.nextInt() ;
        int min1 =sc.nextInt() ;
        int hr2 =sc.nextInt() ;
        int min2 =sc.nextInt() ;
        int min =(hr2*60+min2)-(hr1*60+min1) ;
        int total;
        if(min<120){
            total=30*(min/30);
        }
        else if (min<240){
            min=min-120;
            total=120+40*(min/30);
        }
        else{
            min=min-240;
            total=120+160+60*(min/30);
        }
        System .out.println(total);
    }
}
