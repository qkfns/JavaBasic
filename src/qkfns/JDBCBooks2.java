package qkfns;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCBooks2 {

    // 정적쿼리문과 동적쿼리문

    // 정적쿼리문은 사용하기전에 변수들을 이용해서
    // 온전한 형태의 문장을 미리 만들어둬야 함
    // 또한, 쿼리문이 실행될때 매번 1)쿼리 문장 분석 2) 컴파일
    // 3) 실행의 과정을 거쳐야 함 -> 성능 저하

    // 반면, 동적쿼리문은 불완전한 형태의 문장을 먼저 만들어두고
    // 실행전에 매개변수에 실제로 전달할 값을 지정할 수 있음
    // 또한, 캐쉬기능을 지원하기 때문에 반복적으로 실행하는
    // 문장의 경우 1),2) 과정을 건너뛰고 3)으로 바로 갈 수 있음


    // JDC 드라이버 초기화 및 Connection 객체 생성
    public static Connection makeConn() {
        String DRV = "org.mariadb.jdbc.Driver";
        String URL = "jdbc:mariadb://mariadb.c3zgrbtde6pb.ap-northeast-2.rds.amazonaws.com:3306/playground";
        String USR = "playground";
        String PWD = "playground2020";

        Connection conn = null;
        try {
            Class.forName(DRV);
            conn = DriverManager.getConnection(URL,USR,PWD);
        } catch (ClassNotFoundException cnf) {
            System.out.println("JDBC 드라이버를 확인하세요!!");
        } catch (SQLException se) {
            System.out.println("JDBC 연결 실패!");
        }
        return conn;
    }

    public static void destroyConn(Connection conn, PreparedStatement pstmt) {

        if (pstmt != null) { try { pstmt.close(); } catch (SQLException se) { } }
        if (conn != null) { try { conn.close(); } catch (SQLException se) { } }
    }

    public static void main(String[] args) {

        //데이터베이스 관련변수
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql = "insert into Books values (?,?,?,?)";

        //도서 정보 입력받음
        Scanner sc = new Scanner(System.in);

        System.out.println("도서번호는? ");
        int bookid = Integer.parseInt(sc.nextLine());
        System.out.println("도서제목은? ");
        String bookname = sc.nextLine();
        System.out.println("도서출판사는? ");
        String publisher = sc.nextLine();
        System.out.println("도서 가격은? ");
        int price = Integer.parseInt(sc.nextLine());

        // 입력받은 도서정보를 테이블에 저장

        conn = makeConn();
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, bookid);
            pstmt.setString(2, bookname);
            pstmt.setString(3, publisher);
            pstmt.setInt(4, price);

            int cnt = pstmt.executeUpdate();
            if (cnt>0) System.out.println("도서정보 추가완료!");
        } catch (SQLException se) {
            System.out.println("JDBC 질의문 생성 오류");
        }
        destroyConn(conn, pstmt);






    }
}
