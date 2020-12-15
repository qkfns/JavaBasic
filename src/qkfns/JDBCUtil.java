package qkfns;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCUtil {

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

}
