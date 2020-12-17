package semiproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeV3DAO {
    public static String insertEmp(EmployeeVO emp) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String result = "사원 등록 처리중?";

        conn = EmployeeJDBC.makeConn();
        try {
            pstmt = conn.prepareStatement(EmployeeJDBC.insertEmp);
            pstmt.setInt(1,emp.getEmpno());
            pstmt.setString(2,emp.getFname());
            pstmt.setString(3,emp.getLname());
            pstmt.setString(4,emp.getEmail());
            pstmt.setString(5,emp.getPhone());
            pstmt.setString(6,emp.getHdate());
            pstmt.setString(7,emp.getJobId());
            pstmt.setInt(8,emp.getSal());
            pstmt.setDouble(9,emp.getComm());
            pstmt.setInt(10,emp.getMgrId());
            pstmt.setInt(11,emp.getDeptId());
            int cnt = pstmt.executeUpdate();
            if (cnt>0) result = "사원정보 저장완료";
        } catch (SQLException se) {
            System.out.println("insertEMP 작동중 오류 발생");
            se.printStackTrace();
        }
        EmployeeJDBC.destroyConn(conn,pstmt);
        return result;
    }

    public static ArrayList<EmployeeVO> selectEmp() {
        ArrayList<EmployeeVO> emps = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        conn = EmployeeJDBC.makeConn();
        try {
            pstmt = conn.prepareStatement(EmployeeJDBC.selectEmp);
            rs = pstmt.executeQuery();
            while(rs.next()){
                EmployeeVO e = new EmployeeVO(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6));
                emps.add(e);
            }
        } catch (SQLException se) {
            System.out.println("selectEmp에서 오류발생!!");
            se.printStackTrace();
        }
        EmployeeJDBC.destroyConn(conn,pstmt,rs);

        return emps;
    }

    // 입력받은 사원번호로 employees 테이블을 조회하고
    // 그 결과글 EmployeeVO로 구성한 후 EmployeeV3Service로 넘김
    public static EmployeeVO selectOneEmp(String empid) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        EmployeeVO emp = null;

        conn = EmployeeJDBC.makeConn();
        try {
            pstmt = conn.prepareStatement(EmployeeJDBC.selectOneEmp);
            pstmt.setString(1,empid);
            rs = pstmt.executeQuery();
            if (rs.next()){
                emp = new EmployeeVO(
                        rs.getInt(1), rs.getString(2),
                        rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6),
                        rs.getString(7), rs.getInt(8),
                        rs.getDouble(9), rs.getInt(10),
                        rs.getInt(11));
            }
        } catch (SQLException se) {
            System.out.println("selectOneEmp에서 오류 발생!!");
            se.printStackTrace();
        }
        EmployeeJDBC.destroyConn(conn,pstmt,rs);

        return emp;
    }
}
