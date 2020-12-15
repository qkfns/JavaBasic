package qkfns;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCMembers2 {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql = "insert into BookMembers values (?,?,?,?)";

        Scanner sc = new Scanner(System.in);

        System.out.println("고객번호는?");
        int custid = Integer.parseInt(sc.nextLine());
        System.out.println("고객이름은?");
        String name = sc.nextLine();
        System.out.println("고객주소는?");
        String address = sc.nextLine();
        System.out.println("고객전화번호는?");
        String phone = sc.nextLine();

        //입력받은 회원정보를 저장

        conn = JDBCUtil.makeConn();

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, custid);
            pstmt.setString(2, name);
            pstmt.setString(3, address);
            pstmt.setString(4, phone);
            int cnt = pstmt.executeUpdate();
            if(cnt>0) System.out.println("회원정보 추가완료!");
        } catch (SQLException ex) {
            System.out.println("JDBC 질의문 생성 오류");
        }
        JDBCUtil.destroyConn(conn,pstmt);
    }
}
