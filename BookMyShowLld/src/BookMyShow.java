import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import controller.MovieController;
import controller.TheatreController;
import enums.SeatCategory;
import models.Booking;
import models.Movie;
import models.Payment;
import models.Screen;
import models.Seat;
import models.Show;
import models.Theatre;

public class BookMyShow {

    MovieController movieController;
    TheatreController theatreController;

    public BookMyShow(){
        movieController = new MovieController();
        theatreController = new TheatreController();

    }
    public static void main(String[] args) throws Exception {

        BookMyShow bookMyShow = new BookMyShow();

        bookMyShow.initialise();

        //user1
        bookMyShow.createBooking("Delhi", "Bahubali");

        //user1
        bookMyShow.createBooking("Bangalore", "Avengers");
        
    }

    private void createBooking(String city, String inputMovie){
        List<Movie> cityMovies = movieController.getAllMovies(city);

        Movie interestedMovie = null;

        for(Movie movie: cityMovies) {
            if(movie.getMovieName().equals(inputMovie)){
                interestedMovie = movie;
            }
        }

        Map<Theatre, List<Show>> theatreVsShows = theatreController.getAllShows(interestedMovie, city);

        Map.Entry<Theatre, List<Show>> entry = theatreVsShows.entrySet().iterator().next();
        List<Show> runningShows = entry.getValue();
        Show interestedShow = runningShows.get(0);

        int seatNumber = 30;

        List<Integer> bookedSeats = interestedShow.getBookedSeats();

        if(!bookedSeats.contains(seatNumber)){
            bookedSeats.add(seatNumber);

            Booking booking = new Booking();

            List<Seat> seatBookList = new ArrayList<>();
            
            for(Seat screenSeat : interestedShow.getScreen().getSeats()){
                if(screenSeat.getId() == seatNumber){
                    seatBookList.add(screenSeat);
                }
            }

            booking.setBookedSeats(seatBookList);
            booking.setShow(interestedShow);
            booking.setPayment(new Payment());

        } else {
            System.out.println("SEAT ALREADY BOOKED, TRY AGAIN");
            return;
        }

        System.out.println("BOOKING SUCCESSFUL");
    }

    private void initialise() {

        createMovies();
        createTheatres();
    }

    private void createMovies(){
        Movie movie1 = new Movie();
        movie1.setMovieId(1);
        movie1.setMovieName("BAHUBALI");
        movie1.setMovieDuration(180);

        Movie movie2 = new Movie();
        movie2.setMovieId(2);
        movie2.setMovieName("AVENGERS");
        movie2.setMovieDuration(120);

        movieController.addMovie("Delhi", movie1);
        movieController.addMovie("Bengaluru", movie2);

    }

    private void createTheatres() {

        Theatre theatre1 = new Theatre();
        theatre1.setId(1);
        theatre1.setCity("Delhi");
        theatre1.setAllScreens(createScreens());

        Movie bahubaliMovie = movieController.getMovieByName("BAHUBALI");

        Show pvrMorningShow = new Show();
        pvrMorningShow.setId(121);
        pvrMorningShow.setMovie(bahubaliMovie);

        Show pvrEveningShow = new Show();
        pvrEveningShow.setId(121);
        pvrEveningShow.setMovie(bahubaliMovie);






        theatre1.setAllShows(null);
    }

    private List<Screen> createScreens(){
        List<Screen> allScreens =  new ArrayList<>();

        Screen screen1 = new Screen();
        screen1.setId(11);
        screen1.setSeats(createSeats());

        allScreens.add(screen1);
        return allScreens;

    }

    private List<Seat> createSeats(){

        List<Seat> allSeats = new ArrayList<>();

        for(int i=1;i<=30;i++){
            Seat seat = new Seat();
            seat.setId(i);
            seat.setCategory(SeatCategory.SILVER);
            allSeats.add(seat);
        }

        for(int i=31;i<=60;i++){
            Seat seat = new Seat();
            seat.setId(i);
            seat.setCategory(SeatCategory.GOLD);
            allSeats.add(seat);
        }

        for(int i=61;i<=90;i++){
            Seat seat = new Seat();
            seat.setId(i);
            seat.setCategory(SeatCategory.PLATINUM);
            allSeats.add(seat);
        }

        return allSeats;
    }
}
