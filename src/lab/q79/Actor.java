package lab.q79;

public class Actor {
    private String name;
    private String birth;
    private String[] joinmovie;
    private String[] casting;
    public Actor(){
        name="김윤석";
    }

    public Actor(String name, String birth, String[] joinmovie, String[] casting) {
        this.name = name;
        this.birth = birth;
        this.joinmovie = joinmovie;
        this.casting = casting;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setBirth(String birth){
        this.birth = birth;
    }

    public void setJoinmovie(String[] joinmovie) {
        this.joinmovie = joinmovie;
    }

    public void setCasting(String[] casting) {
        this.casting = casting;
    }

    public String getBirth(){
        return birth;
    }

    public String getName() {
        return name;
    }

    public String[] getJoinmovie() {
        return joinmovie;
    }

    public String[] getCasting() {
        return casting;
    }
}
