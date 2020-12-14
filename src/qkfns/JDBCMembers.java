package qkfns;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCMembers {

    // 컬럼정보 : custid, name, address,phone
    // 입력은 Scanner 이용

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("고객번호는?");
        int custid = Integer.parseInt(sc.nextLine());
        System.out.println("고객이름은?");
        String name = sc.nextLine();
        System.out.println("고객주소는?");
        String address = sc.nextLine();
        System.out.println("고객전화번호는?");
        String phone = sc.nextLine();


        String sql = "insert into BookMembers values("+custid+",'"+name+"','"+address+"','"+phone+"')";
        System.out.println(sql);

        String DRV = "org.mariadb.jdbc.Driver";
        String URL = "jdbc:mariadb://mariadb.c3zgrbtde6pb.ap-northeast-2.rds.amazonaws.com:3306/playground";
        String USR = "playground";
        String PWR = "playground2020";
        try { Class.forName(DRV);
        } catch (ClassNotFoundException cnf) {
            System.out.println("드라이버를 확인하세요!");
        }

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL,USR,PWR);
        } catch (SQLException se) {
            System.out.println("url 아이디 비번을 확인하세요!!");
        }

        Statement stmt = null;
        try {
            stmt = conn.createStatement();
            boolean isfail = stmt.execute(sql);


        } catch (SQLException se) {
            System.out.println("sql 실행 에러!");
        }

        if (stmt != null) { try { stmt.close(); } catch (SQLException se) { } }
        if (conn != null) {try { conn.close(); } catch (SQLException se) { } }

    }
}
