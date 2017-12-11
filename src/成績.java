import java.util.Scanner;

public class 成績 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int n= sc.nextInt() ;
        int failNum =0;
        int listen,read,speak;
        for (int i=0;i<n;i++) {
            listen = sc.nextInt();
            read = sc.nextInt();
            speak = sc.nextInt();
            if (listen >= 0 && listen <= 100) {
                if (listen < 60) {
                    failNum++;
                }
            }
            else {
                System.out.println("聽力分數超出範圍");
            }
            if (read >= 0 && read <= 100) {
                if (read < 60) {
                    failNum++;
                }
            }
            else {
                System.out.println("閱讀分數超出範圍");
            }
            if (speak >= 0 && speak <= 100) {
                if (speak < 60) {
                    failNum++;
                }
            }
            else {
                System.out.println("口說分數超出範圍");
            }
            if (failNum == 0) {
                System.out.println("P");
            }
            else if (failNum == 1) {
                if ((listen + read + speak) >= 220) {
                    System.out.println("P");
                }
                else {
                    System.out.println("M");
                }
            }
           else if (failNum == 2) {
                if (listen >= 80) {
                    System.out.println("M");
                } else if (read >= 80) {
                    System.out.println("M");
                } else if (speak >= 80) {
                    System.out.println("M");
                } else {
                    System.out.println("F");
                }
                failNum = 0;
            }
        }
    }
}
