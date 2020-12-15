package qkfns;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCOrders2 {
    public static void main(String[] args) {
        //
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql = "insert into BookOrders values (?,?,?,?,?)";

        //
        Scanner sc = new Scanner(System.in);
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

        //
        conn = JDBCUtil.makeConn();
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, orderid);
            pstmt.setInt(2, custid);
            pstmt.setInt(3, bookid);
            pstmt.setInt(4, saleprice);
            pstmt.setString(5, orderdate);

            int cnt = pstmt.executeUpdate();
            if(cnt>0) System.out.println("주문정보 생성완료!");
        } catch (SQLException se) {
            System.out.println("sql문 생성실패");
        }
        JDBCUtil.destroyConn(conn,pstmt);
    }
}
