package lab;

import java.util.Scanner;

public class Q28_Gugudan {
    public static void main(String[] args) {
        int insert;
        Scanner scanner = new Scanner(System.in);

        System.out.println("1~9사이의 숫자를 입력하시오");
        insert = scanner.nextInt();
        if(insert<1 || insert>9){
            System.out.println("잘못 입력하셨습니다!!");
        }else{
            for (int i=1; i<=9; i++){
            System.out.printf("%d x %d = %d\n",insert,i,insert*i);
            }
        }
    }
}
