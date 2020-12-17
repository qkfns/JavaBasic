package semiproject;

import qkfns.JDBCUtil;

public class EmployeeJDBC extends JDBCUtil {

    public static String insertEmp =
            "insert into EMPLOYEES (employee_id,first_name,last_name,email," +
                    "phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id)"
                    + " values (?,?,?,?,?,?,?,?,?,?,?);";

    public static String selectEmp = "select employee_id,first_name,email" +
            ",job_id,manager_id,department_id from EMPLOYEES";

    public static String selectOneEmp = "select * from EMPLOYEES where employee_id = ?";

    public static String updateEmp =
            " update EMPLOYEES set first_name = ?, last_name = ?, email = ?, phone_number = ?, hire_date = ? where employee_id = ? ";

    public static String deleteEmp =
            "delete from EMPLOYEES where employee_id = ?";


}
