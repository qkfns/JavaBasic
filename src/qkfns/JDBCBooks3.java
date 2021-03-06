package qkfns;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCBooks3 {
    public static void main(String[] args) {
        //Books테이블의 저장된 모든 내용을 출력함
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String sql = "select bookid, bookname, publisher, price from Books";
        String fmt = "%s, %s, %s, %s \n";
        StringBuilder sb = new StringBuilder();

        conn = JDBCUtil.makeConn();

        try {
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while(rs.next()){
                String bookid = rs.getString(1);
                String bookname = rs.getString(2);
                String publisher = rs.getString(3);
                String price = rs.getString(4);
                String result = String.format(fmt,bookid, bookname, publisher,price);
                sb.append(result);
            }
        } catch (SQLException throwables) {
            System.out.println("JDBC 질의문 생성 오류");
        }

        JDBCUtil.destroyConn(conn, pstmt , rs);

        System.out.println(sb.toString());
    }
}
