package models;

public class Movie {
    int movieId;
    String movieName;
    long movieDuration;

//    public Movie(int movieId, String movieName, long movieDuration) {
//     this.movieId = movieId;
//     this.movieName = movieName;
//     this.movieDuration = movieDuration;
//    }

//    public Movie() {
//     //TODO Auto-generated constructor stub
// }

public int getMovieId(){
    return movieId;
   }

   public void setMovieId(int movieId){
    this.movieId = movieId;
   }

   public String getMovieName(){
    return movieName;
   }

   public void setMovieName(String movieName){
    this.movieName = movieName;
   }

   public long getMovieDuration(){
    return movieDuration;
   }

   public void setMovieDuration(long movieDuration){
    this.movieDuration = movieDuration;
   }
    
}
