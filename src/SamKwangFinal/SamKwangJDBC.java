package SamKwangFinal;

import qkfns.JDBCUtil;

public class SamKwangJDBC extends JDBCUtil {

    public static String readCODP =
            "select 고객번호,고객이름,주문번호,주문일,제품번호,수량,제품이름,단가" +
                    " from CODP order by 주문번호 desc";

    public static String readOneCODP = "select * from CODP where 주문번호 = ?";

    public static String readSOE =
            " select 인사번호, 주문번호, 운송ID, 운송이름, 주문일, 직책 " +
                    " from SOE order by 운송ID desc ";


    public static String readOneSOE = "select 인사번호,주문번호,운송ID,운송이름,담당자전화번호,주문일,납기일,고객번호," +
            "주민등록번호,성명,소속부서,직책,입사일" +
            " from SOE where 운송ID = ?";


}