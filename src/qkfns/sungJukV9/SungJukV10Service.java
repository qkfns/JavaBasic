package qkfns.sungJukV9;

import qkfns.sungJukV6.SungJukVO;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *   SungJukV9Service
 *   성적처리 추상클래스를 상속해서 만든 클래스
 */

public class SungJukV10Service extends SungJukV9Service{

    private String fpath = "c:/Java/sungjuk.dat";
    private FileReader fr = null;
    private FileWriter fw = null;
    private BufferedReader br = null;
    private BufferedWriter bw = null;

    public SungJukV10Service() {
        // 프로그램 최초시작시
        // 파일에 저장된 모든 성적테이터를
        // List 타입의 sjdata변수에 저장
        try {
            loadSungJuk();
        } catch (IOException e) {
            System.out.println("성적 데이터 초기화중 오류발생");

        }
    }

    //멤버변수 선언
    //입력받은 모든 성적데이터를 저장하는 동적배열 변수 선언
    List<SungJukVO> sjdata = new ArrayList<>();

    /**
     *  성적 처리 프로그램의 메뉴 출력 기능
     */
    public void displayMenu(){
        StringBuilder sb = new StringBuilder();
        sb.append("-------------------\n")
                .append("  성적 처리프로그램 v4   \n")
                .append("-------------------\n")
                .append(" 1. 성적 데이터 입력       \n")
                .append(" 2. 성적 데이터 조회       \n")
                .append(" 3. 성적 데이터 상세조회       \n")
                .append(" 4. 성적 데이터 수정       \n" )
                .append(" 5. 성적 데이터 삭제       \n")
                .append(" 0. 프로그램 종료         \n")
                .append("-------------------\n")
                .append(" 원하시는 작업은 ? ");

        System.out.print(sb);
    }

    /**
     *  writeSungJuk
     *  입력 받은 성적데이터를 sungjuk.dat에 저장
     */

    @Override
    public void newSungJuk() {

        // 성적데이터 입력받은 후
        // ArrayList 객체에 저장
        super.newSungJuk();

        try {
            writeSungJuk(sj);
        } catch (IOException e) {
            System.out.println("파일쓰기 중 오류!");

        }
    }

    protected void writeSungJuk(SungJukVO sj) throws IOException {
        String fmt = "%s,%s,%s,%s,%s,%.1f,%s";

        fw = new FileWriter(fpath, true);
        bw = new BufferedWriter(fw);
        String data = String.format(fmt,sj.getName(),sj.getKor(),sj.getEng(),sj.getMat(),sj.getSum(),sj.getMean(),sj.getGrd());
        bw.write(data);
        bw.newLine();   //줄바꿈 메서드
        // FileWriter 클래스를 이용해서
        // 파일에 데이터를 기록할때 다소 불편함
        // =>PrintWriter 추천!
        bw.close();
        fw.close();
    }


    /**
     *  loadSungJuk
     *  파일에 저장된 성적데이터를 List타입의 sjdata에 저장
     */

    protected void loadSungJuk() throws IOException {
        fr = new FileReader(fpath);
        br = new BufferedReader(fr);

        while(br.ready()){
            String s[] = br.readLine().split(",");

            sj = new SungJukVO(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]), Integer.parseInt(s[3]), Integer.parseInt(s[4]),
                    Double.parseDouble(s[5]), s[6].charAt(0));
            sjdata.add(sj);

        }
        br.close();
        fr.close();
    }
}
