package qkfns;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCMembers3c {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "select * from BookMembers where name like ? ";
        String fmt = "%s, %s, %s, %s\n";
        StringBuilder sb = new StringBuilder();

        Scanner sc = new Scanner(System.in);
        System.out.println("검색할 이름의 일부를 입력하세요");
        String na = sc.nextLine();

        conn = JDBCUtil.makeConn();
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,'%'+na+'%');
            rs = pstmt.executeQuery();
            while(rs.next()){
                String custid = rs.getString(1);
                String name = rs.getString(2);
                String address = rs.getString(3);
                String phone = rs.getString(4);
                String result = String.format(fmt,
                        custid,name,address,phone);
                sb.append(result);
            }
        } catch (SQLException se) {
            System.out.println("JDBC문 오류");
        }

        JDBCUtil.destroyConn(conn,pstmt,rs);
        System.out.println(sb.toString());
    }
}
