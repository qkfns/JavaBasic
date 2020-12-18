package SamKwangFinal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SamKwangDAO {

    // CODP 테이블에서 기본정보만 조회한 후 넘김
   public static ArrayList<SamKwangVO> selectCODP() {
       ArrayList<SamKwangVO> codps = new ArrayList<>();
       Connection conn = null;
       PreparedStatement pstmt = null;
       ResultSet rs = null;

       conn = SamKwangJDBC.makeConn();
       try {
           pstmt = conn.prepareStatement(SamKwangJDBC.readCODP);
           rs = pstmt.executeQuery();
           while(rs.next()){
               SamKwangVO codp = new SamKwangVO(
                       rs.getInt(1),
                       rs.getString(2),
                       rs.getInt(3),
                       rs.getString(4),
                       rs.getInt(5),
                       rs.getInt(6),
                       rs.getString(7),
                       rs.getInt(8));
               codps.add(codp);
           }
       } catch (SQLException se) {
           System.out.println("selectCODP 실행 중 오류");
           se.printStackTrace();
       }
       SamKwangJDBC.destroyConn(conn,pstmt,rs);
       return codps;
    }
}
