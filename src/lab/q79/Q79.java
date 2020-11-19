package lab.q79;

public class Q79 {
    public static void main(String[] args) {
        String[] genre = {"드라마"};
        String[] director = {"스콧 프랭크","앨런 스코트"};
        String[] actor = {"애니아 테일러조이", "토머스 브로디생스터", "해리 멜링"};
        String summary = "<퀸스 갬빗>은 넷플릭스에서 2020년 10월부터 방영된 미국의 드라마이다.";
        String desc = "1950년대 한 보육원, 체스에 천재적인 재능을 보이는 소녀. 점점 더 넓은 세계로 향하며, 체스 스타의 여정을 이어간다. 하지만 더 이기고 싶다면 중독부터 극복해야 한다.";
        Movie queenscombat = new Movie("퀸즈컴벳",2020,350,"넷플릭스",genre,director,actor,summary,desc);

        System.out.print("장르: ");
        for(int i =0; i <genre.length;i++){
            System.out.println(queenscombat.getGenre()[i]);
        }
        System.out.print("감독: ");
        for(int i = 0; i < director.length; i++){
            System.out.printf("%s, ",queenscombat.getDirector()[i]);
        }
        System.out.print("\n배우: ");
        for(int i = 0 ; i < actor.length; i++){
            System.out.printf("%s, ",queenscombat.getActor()[i]);
        }
        System.out.print("\n소개: ");
        System.out.println(queenscombat.getSummary());
        System.out.print("줄거리: ");
        System.out.println(queenscombat.getDesc());

    }

}
