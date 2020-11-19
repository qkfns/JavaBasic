package lab.q79;

public class Movie {
    String title;
    int age;
    int playtime;
    String mCompany;
    String genre;
    String director;
    String actor;
    String scenario;
    String introduce;
    public Movie(){

    }
    public Movie(String title,int age,int playtime,String mCompany,String genre,String director,String actor,String scenario,String introduce){
        this.title = title;
        this.age = age;
        this.playtime = playtime;
        this.mCompany = mCompany;
        this.genre = genre;
        this.director = director;
        this.actor = actor;
        this.scenario = scenario;
        this.introduce = introduce;
    }
}
