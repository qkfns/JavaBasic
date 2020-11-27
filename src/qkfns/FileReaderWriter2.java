package qkfns;

import java.io.*;

// 2차원 표 형태의 데이터를 파일에 저장하기
public class FileReaderWriter2 {
    public static void main(String[] args) throws IOException {
        // 학번,이름,주소,생년월일,학과명,교수등으로 구성된 2차원 표 형태의 데이터를 student.dat에 저장

        // 어떤 학생의 기본 정보
        int hakbun = 201350050;
        String name = "김태희";
        String addr = "경기도 고양시";
        String birth = "1985.3.22";
        String dname = "컴퓨터";
        int prof = 504;

        // 학생 기본정보를 student.dat에 저장함
        String fpath = "c:Java/student.dat";

        FileWriter fw = new FileWriter(fpath);

        // 기본 정보를 저장할 형식 정의
        // 각 항목들은 ,로 구분함
        String fmt = "%s , %s , %s , %s , %s , %s";
        String data = String.format(fmt, hakbun, name,addr,birth,dname,prof);

        fw.write(data);

        fw.close();

        // 버퍼기능을 지원하는 Writer 사용하기
        fw= new FileWriter(fpath);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(data);

        bw.close();
        fw.close();

        // 학생 기본정보가 저장된 파일을 읽어서 출력하기
        // 출력하기
        // 학번 : ~~~
        // 이름 : ~~~
        // ...

        FileReader fr = new FileReader(fpath);
        BufferedReader br = new BufferedReader(fr);
        fmt = "학번 : %s\n이름 : %s\n주소 : %s\n생년월일 : %s\n학과 : %s\n교수 : %s\n";

        while (br.ready()){
            String line = br.readLine();
            //System.out.println(line);

            String[] items = line.split(",");
            String result = String.format(fmt,items[0],items[1],items[2],items[3],items[4],items[5]);
            System.out.println(result);
        }
        br.close();
        fr.close();

    }
}
