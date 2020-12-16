package semiproject;

//https://github.com/siestageek/datasets/blob/master/csv/EMPLOYEES.csv

import java.io.*;

public class EmployeeV2Service extends EmployeeV1Service {

    private String fpath = "c:/Java/employee.dat";
    private FileWriter fw = null;
    private BufferedWriter bw = null;
    private FileReader fr = null;
    private BufferedReader br = null;

    public EmployeeV2Service() {
        try {
            loadEmployee();
        } catch (IOException e) {
            System.out.println("초기화중 오류발생");
        }
    }


    public void displayMenu() {
        StringBuilder em = new StringBuilder();
        em.append("-------------------\n")
                .append("  인사 관리 프로그램 v1   \n")
                .append("-------------------\n")
                .append(" 1. 인사 정보 입력       \n")
                .append(" 2. 인사 정보 조회       \n")
                .append(" 3. 인사 정보 상세조회       \n")
                .append(" 4. 인사 정보 수정       \n")
                .append(" 5. 인사 정보 삭제       \n")
                .append(" 0. 프로그램 종료         \n")
                .append("-------------------\n")
                .append(" 원하시는 작업은 ? ");

        System.out.print(em);
    }

    @Override
    public void newEmployee() {
        super.newEmployee();
        try {
            writeEmployee(empl);
        } catch (IOException e) {
            System.out.println("쓰기중 오류발생");
        }
    }



    protected void writeEmployee(EmployeeVO empl) throws IOException {
        String fmt = "%d,%s,%s,%s,%s,%s,%s,%d,%.1f,%d,%d";
        fw = new FileWriter(fpath,true);
        bw = new BufferedWriter(fw);
        String data = String.format(fmt,empl.getEmpno(),empl.getFname(),empl.getLname(),empl.getEmail(),
                empl.getPhone(),empl.getHdate(),empl.getJobId(),empl.getSal(),empl.getComm(),empl.getMgrId(),empl.getDeptId());
        bw.write(data);
        bw.newLine();
        bw.close();
        fw.close();
    }
    protected void loadEmployee() throws IOException {
        fr = new FileReader(fpath);
        br = new BufferedReader(fr);
        while(br.ready()){
            String s[] = br.readLine().split(",");

            empl = new EmployeeVO(Integer.parseInt(s[0]),s[1],s[2],s[3],s[4],s[5],s[6],Integer.parseInt(s[7]),Double.parseDouble(s[8])
                    ,Integer.parseInt(s[9]),Integer.parseInt(s[10]));
            empdata.add(empl);
        }
        br.close();
        fr.close();
    }

}
