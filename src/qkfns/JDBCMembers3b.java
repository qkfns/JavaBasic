package qkfns;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCMembers3b {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String fmt = "%s, %s, %s, %s\n";
        String sql = "select * from BookMembers where name = ?";
        StringBuilder sb = new StringBuilder();

        Scanner sc = new Scanner(System.in);
        System.out.println("조회할 멤버이름은?");
        String na = sc.nextLine();

        conn = JDBCUtil.makeConn();

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,na);
            rs = pstmt.executeQuery();
            while(rs.next()){
                String custid = rs.getString(1);
                String name = rs.getString(2);
                String adress = rs.getString(3);
                String phone = rs.getString(4);
                String result = String.format(fmt,custid,name,adress,phone);
                sb.append(result);
            }
        } catch (SQLException se) {
            System.out.println("JDBC 실행문 오류");
        }

        JDBCUtil.destroyConn(conn,pstmt,rs);

        System.out.println(sb.toString());
    }
}
