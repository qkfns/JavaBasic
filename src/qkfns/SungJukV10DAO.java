package qkfns;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SungJukV10DAO {

    // 넘겨받은 성적데이터를 sungjuk테이블에 저장
    public static String insertSungJuk(SungJukVO sj) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String result = "성적데이터 처리중??";

        conn = SungJukJDBC.makeConn();
        try {
            pstmt = conn.prepareStatement(SungJukJDBC.insertSungJuk);
            pstmt.setString(1,sj.getName());
            pstmt.setInt(2,sj.getKor());
            pstmt.setInt(3,sj.getMat());
            pstmt.setInt(4,sj.getEng());
            pstmt.setInt(5,sj.getSum());
            pstmt.setDouble(6,sj.getMean());
            pstmt.setString(7,sj.getGrd()+"");
            int cnt = pstmt.executeUpdate();
            if (cnt > 0) result = "성적 데이터 저장완료!";
        } catch (SQLException se) {
            System.out.println("insertSQL에서 오류발생!!");
        }
        SungJukJDBC.destroyConn(conn,pstmt);
        return  result;
    }

    // 번호,이름,국어,영어,수학,등록일을 조회하고
    // 그 결과들을 ArrayList에 담아서 넘김
    public static ArrayList<SungJukVO> selectSungJuk() {
        ArrayList<SungJukVO> sjs = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        conn = SungJukJDBC.makeConn();
        try {
            pstmt = conn.prepareStatement(SungJukJDBC.selectSungJuk);
            rs = pstmt.executeQuery();
            while(rs.next()){
                SungJukVO sj = new SungJukVO(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        0,0.0,' ',rs.getString(6));
                sjs.add(sj);
            }
        } catch (SQLException se) {
            System.out.println("selectSungJuk에서 오류발생");
        }
        SungJukJDBC.destroyConn(conn,pstmt,rs);

        return sjs;
    }

    // 성적번호로 성적데이터를 조회하고
    // 그 결과를 SungJukVO에 담아서 넘김
    public static SungJukVO selectOneSungJuk(String sjid) {
        SungJukVO sj = null;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        conn = SungJukJDBC.makeConn();
        try {
            pstmt = conn.prepareStatement(SungJukJDBC.selectOneSungJuk);
            pstmt.setString(1,sjid);
            rs = pstmt.executeQuery();
            if (rs.next()){
                sj = new SungJukVO(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getDouble(7),
                        rs.getString(8).charAt(0),
                        rs.getString(9));
            }
        } catch (SQLException se) {
            System.out.println("selectOneSungJuk에서 오류발생");
            se.printStackTrace();
        }

        SungJukJDBC.destroyConn(conn,pstmt,rs);
        return sj;
    }

    public static String updateSungJuk(SungJukVO sj) {
        return null;
    }

    // 삭제할 성적번호를 매개변수로 넘겨주면
    // sungjuk테이블에서 해당 데이터를 삭제함
    public static String deleteSungJuk(int sjid) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String result = "성적데이터 삭제 처리중 ....?";

        conn = SungJukJDBC.makeConn();
        try {
            pstmt = conn.prepareStatement(SungJukJDBC.deleteSungJuk);
            pstmt.setInt(1,sjid);

            int cnt = pstmt.executeUpdate();
            if (cnt>0) result = "성적데이터 삭제완료!!";
        } catch (SQLException se) {
            System.out.println("delectSungJuk에서 오류!!");
            se.printStackTrace();
        }
        SungJukJDBC.destroyConn(conn,pstmt);
        return result;
    }
}
