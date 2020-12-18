package SamKwangFinal;

import qkfns.JDBCUtil;

public class SamKwangJDBC extends JDBCUtil {

    public static String readCODP =
            "select 고객번호,고객이름,주문번호,주문일,제품번호,수량,제품이름,단가" +
            " from CODP order by 주문번호 desc";

    public static String readSOE = "select * from 주문\n" +
            "join 운송 using(주문번호)\n" +
            "join 직원 using(인사번호);";


    public static String readOneCODP = "select * from CODP where 주문번호 = ?";
}
