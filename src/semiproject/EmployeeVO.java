package semiproject;
//https://github.com/siestageek/datasets/blob/master/csv/EMPLOYEES.csv
public class EmployeeVO {
    private int empno;
    private String fname;
    private String lname;
    private String email;
    private String phone;
    private String hdate;
    private String jobId;
    private int sal;
    private double comm;
    private int mgrId;
    private int deptId;

    public EmployeeVO() {
    }

    public EmployeeVO(int empno, String fname, String lname, String email, String phone, String hdate, String jobId, int sal, double comm, int mgrId, int deptId) {
        this.empno = empno;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
        this.hdate = hdate;
        this.jobId = jobId;
        this.sal = sal;
        this.comm = comm;
        this.mgrId = mgrId;
        this.deptId = deptId;
    }

    public EmployeeVO(int empno, String fname, String email, String jobId, int mgrId, int deptId) {
        this.empno = empno;
        this.fname = fname;
        this.email = email;
        this.jobId = jobId;
        this.mgrId = mgrId;
        this.deptId = deptId;
    }


    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setHdate(String hdate) {
        this.hdate = hdate;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public void setMgrId(int mgrId) {
        this.mgrId = mgrId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public int getEmpno() {
        return empno;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getHdate() {
        return hdate;
    }

    public String getJobId() {
        return jobId;
    }

    public int getSal() {
        return sal;
    }

    public double getComm() {
        return comm;
    }

    public int getMgrId() {
        return mgrId;
    }

    public int getDeptId() {
        return deptId;
    }
}
