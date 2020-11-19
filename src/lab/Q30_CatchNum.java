package lab;

import java.util.Scanner;

public class Q30_CatchNum {
    public static void main(String[] args) {
        int num1;
        int num2 = (int)(Math.random()*100)+1;

        Scanner scanner = new Scanner(System.in);
        while(true){
            try{
            num1 = scanner.nextInt();
            if(num1>num2){
                System.out.println("추측한 숫자가 큽니다");
                }
            else if(num1<num2){
                System.out.println("추측한 숫자가 작습니다");
            }
            else{
                System.out.println("빙고 숫자를 맞췄습니다.");
                break;
                }

            } catch (Exception e) {
            System.out.println("에러입니다.");
            }

        }

    }
}
