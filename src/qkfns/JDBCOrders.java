package qkfns;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCOrders {

    public static void main(String[] args) {

        // 데이터베이스 연결정보
        String DRV = "org.mariadb.jdbc.Driver";
        String URL = "jdbc:mariadb://mariadb.c3zgrbtde6pb.ap-northeast-2.rds.amazonaws.com:3306/playground";
        String USR = "playground";
        String PWR = "playground2020";

        // JDBC 관련 객체 변수
        Connection conn = null;
        Statement stmt = null;

        // 기타 객체 변수
        Scanner sc = new Scanner(System.in);

        //주문정보 입력받기
        System.out.println("주문번호 입력");
        int orderid = Integer.parseInt(sc.nextLine());
        System.out.println("회원번호 입력");
        int custid = Integer.parseInt(sc.nextLine());
        System.out.println("책번호 입력");
        int bookid = Integer.parseInt(sc.nextLine());
        System.out.println("가격 입력");
        int saleprice = Integer.parseInt(sc.nextLine());
        System.out.println("주문일자 입력");
        String orderdate = sc.nextLine();

        // 쿼리문 작성
        String sql = "insert into BookOrders values("
                +orderid+","+custid+","+ bookid+","+saleprice+",'"+orderdate+"')";
        System.out.println(sql);

        // JDBC 드라이버 초기화
        // JDBC Connection 객체 생성
        // JDBC Statement 객체 생성
        // SQL문 실행 및 결과 확인
        // JDBC 관련 객체 제거

        try {
            Class.forName(DRV);
            conn = DriverManager.getConnection(URL,USR,PWR);
            stmt = conn.createStatement();
            int cnt = stmt.executeUpdate(sql);
            if (cnt > 0) System.out.println("주문정보 추가완료!");
        } catch (ClassNotFoundException cnf) {
            System.out.println("드라이버 설치 오류");
        } catch (SQLException se) {
            System.out.println("JDBC 연결실패!");
        } finally {

            if (stmt != null) { try { stmt.close(); } catch (SQLException se) { } }
            if (conn != null) { try { conn.close(); } catch (SQLException se) { } }
        }

    }
}
