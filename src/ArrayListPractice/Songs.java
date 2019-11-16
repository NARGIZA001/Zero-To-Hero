package ArrayListPractice;

public class Songs {
   private String title, singer, writer;
   private  Double duration;

   public Songs(String title, String singer, String writer, Double duration) {

       this.writer=writer;
       this.singer=singer;
       this.title=title;
       this.duration=duration;


    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getTitel() {
        return title;
    }

    public void setTitel(String titel) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(){
       this.writer=writer;
    }

    public Double getDuration (){
       return duration;
    }

    public void setDuration(){
       this.duration=duration;

    }
}
