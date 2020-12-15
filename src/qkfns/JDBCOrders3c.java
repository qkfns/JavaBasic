package qkfns;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCOrders3c {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String sql = "select * from BookOrders where orderdate like ?";
        String fmt = "%s, %s, %s, %s, %s \n";
        StringBuilder sb = new StringBuilder();

        Scanner sc = new Scanner(System.in);
        System.out.println("조회할 날짜를 입력하세요");
        String date = sc.nextLine();

        conn = JDBCUtil.makeConn();
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,'%' + date + '%');
            rs = pstmt.executeQuery();
            while(rs.next()){
                String orderid = rs.getString(1);
                String custid = rs.getString(2);
                String bookid = rs.getString(3);
                String saleprice = rs.getString(4);
                String orderdate = rs.getString(5);
                String result = String.format(fmt,
                        orderid,custid,bookid,saleprice,orderdate);
                sb.append(result);
            }
        } catch (SQLException se) {
            System.out.println("JDBC문 오류");
        }

        JDBCUtil.destroyConn(conn,pstmt,rs);
        System.out.println(sb.toString());
    }
}
