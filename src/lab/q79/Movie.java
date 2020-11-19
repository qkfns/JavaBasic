package lab.q79;

public class Movie {
    private String title;
    private int year;
    private int runtime;
    private String prdtin;
    private String[] genre;
    private String[] director;
    private String[] actor;
    private String summary;
    private String desc;

    public Movie() {
    }

    public Movie(String title, int year, int runtime, String prdtin, String[] genre, String[] director, String[] actor, String summary, String desc) {
        this.title = title;
        this.year = year;
        this.runtime = runtime;
        this.prdtin = prdtin;
        this.genre = genre;
        this.director = director;
        this.actor = actor;
        this.summary = summary;
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public String getPrdtin() {
        return prdtin;
    }

    public void setPrdtin(String prdtin) {
        this.prdtin = prdtin;
    }

    public String[] getGenre() {
        return genre;
    }

    public void setGenre(String[] genre) {
        this.genre = genre;
    }

    public String[] getDirector() {
        return director;
    }

    public void setDirector(String[] director) {
        this.director = director;
    }

    public String[] getActor() {
        return actor;
    }

    public void setActor(String[] actor) {
        this.actor = actor;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    //setter/getter


}