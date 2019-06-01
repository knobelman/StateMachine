import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;


public class MovieDownloaderManager implements Observer, DownloadMngrState {
    //Mngrs
    DownloadMngr downloadMngr;
    LevelMngr levelMngr;
    WatchMngr watchMngr;
    QueueMngr queueMngr;
    NetworkMngr networkMngr;
    boolean on;

    public Queue<Movie> downloadQ;

    public MovieDownloaderManager() {
        //state mngrs
        downloadMngr = new DownloadMngr(this);
        levelMngr = new LevelMngr(this);
        watchMngr = new WatchMngr(this);
        queueMngr = new QueueMngr(this);
        networkMngr = new NetworkMngr(this);

        this.downloadQ = new ArrayDeque<>();
        on = true;
    }

    /**
     * int - points, null - queue
     */
    public void update(Object arg) {
        if(arg instanceof Integer){//points or idle
            if((Integer) arg == 1 || (Integer) arg == -1)//points
                whenChangePoints((Integer) arg);
            else if((Integer) arg == 0)//dIdle
                whenInIdle();
            else if((Integer) arg == 2)
                whenInDownload();
        }
        else{//queue
            whenQueueNotEmpty();
        }
    }

    @Override
    public void turnOn() {
        if(!on) {
            on = true;
            this.downloadMngr.turnOn();
            this.levelMngr.turnOn();
            this.watchMngr.turnOn();
            this.queueMngr.turnOn();
            this.networkMngr.turnOn();
        }
    }

    @Override
    public void turnOff() {
        if(on) {
            on = false;
            this.downloadMngr.turnOff();
            this.levelMngr.turnOff();
            this.watchMngr.turnOff();
            this.queueMngr.turnOff();
            this.networkMngr.turnOff();
        }
    }

    @Override
    public void internetOn() {
        if(on) {
            this.downloadMngr.internetOn();
            this.levelMngr.internetOn();
            this.watchMngr.internetOn();
            this.queueMngr.internetOn();
            this.networkMngr.internetOn();
        }
    }

    @Override
    public void internetOff() {
        if(on) {
            this.downloadMngr.internetOff();
            this.levelMngr.internetOff();
            this.watchMngr.internetOff();
            this.queueMngr.internetOff();
            this.networkMngr.internetOff();
        }
    }

    @Override
    public void checkPoints() {
        if(on) {
            this.downloadMngr.checkPoints();
            this.levelMngr.checkPoints();
            this.watchMngr.checkPoints();
            this.queueMngr.checkPoints();
            this.networkMngr.checkPoints();
        }
    }

    @Override
    public void checkValidMovieSize() {
        if(on) {
            this.downloadMngr.checkValidMovieSize();
            this.levelMngr.checkValidMovieSize();
            this.watchMngr.checkValidMovieSize();
            this.queueMngr.checkValidMovieSize();
            this.networkMngr.checkValidMovieSize();
        }
    }

    @Override
    public void fileRequest(Movie movie) {
        if(on) {
            this.downloadMngr.fileRequest(movie);
            this.levelMngr.fileRequest(movie);
            this.watchMngr.fileRequest(movie);
            this.queueMngr.fileRequest(movie);
            this.networkMngr.fileRequest(movie);
        }
    }

    @Override
    public void whenChangePoints(int x) {
        if(on) {
            //this.downloadMngr.whenChangePoints(x);
            this.levelMngr.whenChangePoints(x);
            this.watchMngr.whenChangePoints(x);
            this.queueMngr.whenChangePoints(x);
            this.networkMngr.whenChangePoints(x);
        }
    }

    @Override
    public void downloadAborted() {
        if(on) {
            this.downloadMngr.downloadAborted();
            this.levelMngr.downloadAborted();
            this.watchMngr.downloadAborted();
            this.queueMngr.downloadAborted();
            this.networkMngr.downloadAborted();
        }
    }

    @Override
    public void downloadError() {
        if(on) {
            this.downloadMngr.downloadError();
            this.levelMngr.downloadError();
            this.watchMngr.downloadError();
            this.queueMngr.downloadError();
            this.networkMngr.downloadError();
        }
    }

    @Override
    public void whenQueueNotEmpty() {
        if(on) {
            this.downloadMngr.whenQueueNotEmpty();
            this.levelMngr.whenQueueNotEmpty();
            this.watchMngr.whenQueueNotEmpty();
            //this.queueMngr.whenQueueNotEmpty();
            this.networkMngr.whenQueueNotEmpty();
        }
    }

    @Override
    public void errorFixed() {
        if(on) {
            this.downloadMngr.errorFixed();
            this.levelMngr.errorFixed();
            this.watchMngr.errorFixed();
            this.queueMngr.errorFixed();
            this.networkMngr.errorFixed();
        }
    }

    @Override
    public void movieOn() {
        if(on) {
            this.downloadMngr.movieOn();
            this.levelMngr.movieOn();
            this.watchMngr.movieOn();
            this.queueMngr.movieOn();
            this.networkMngr.movieOn();
        }
    }

    @Override
    public void restartMovie() {
        if(on) {
            this.downloadMngr.restartMovie();
            this.levelMngr.restartMovie();
            this.watchMngr.restartMovie();
            this.queueMngr.restartMovie();
            this.networkMngr.restartMovie();
        }
    }

    @Override
    public void holdMovie() {
        if(on) {
            this.downloadMngr.holdMovie();
            this.levelMngr.holdMovie();
            this.watchMngr.holdMovie();
            this.queueMngr.holdMovie();
            this.networkMngr.holdMovie();
        }
    }

    @Override
    public void movieOff() {
        if(on) {
            this.downloadMngr.movieOff();
            this.levelMngr.movieOff();
            this.watchMngr.movieOff();
            this.queueMngr.movieOff();
            this.networkMngr.movieOff();
        }
    }

    @Override
    public void resume() {
        if(on) {
            this.downloadMngr.resume();
            this.levelMngr.resume();
            this.watchMngr.resume();
            this.queueMngr.resume();
            this.networkMngr.resume();
        }
    }

    @Override
    public void entry() {
        if(on) {
            this.downloadMngr.entry();
            this.levelMngr.entry();
            this.watchMngr.entry();
            this.queueMngr.entry();
            this.networkMngr.entry();
        }
    }

    @Override
    public void exit() {
        if(on) {
            this.downloadMngr.exit();
            this.levelMngr.exit();
            this.watchMngr.exit();
            this.queueMngr.exit();
            this.networkMngr.exit();
        }
    }

    @Override
    public void downloadDone() {
        if(on) {
            this.downloadMngr.downloadDone();
            this.levelMngr.downloadDone();
            this.watchMngr.downloadDone();
            this.queueMngr.downloadDone();
            this.networkMngr.downloadDone();
        }
    }

    @Override
    public void whenInIdle() {
        if(on) {
            //this.downloadMngr.whenInIdle();
            this.levelMngr.whenInIdle();
            this.watchMngr.whenInIdle();
            this.queueMngr.whenInIdle();
            this.networkMngr.whenInIdle();
        }
    }

    @Override
    public void whenInDownload() {
        if(on) {
            //this.downloadMngr.whenInDownload();
            this.levelMngr.whenInDownload();
            this.watchMngr.whenInDownload();
            this.queueMngr.whenInDownload();
            this.networkMngr.whenInDownload();
        }
    }

    public static void main(String[] args){
        MovieDownloaderManager mdm = new MovieDownloaderManager();
        Scanner scr = new Scanner(System.in);  // Create a Scanner object
        int ans = 0;
        while(ans != -1){
            System.out.println("------------------");
            System.out.println("----Event List----");
            System.out.println("1. turnOn");
            System.out.println("2. turnOff");
            System.out.println("3. internetOn");
            System.out.println("4. internetOff");
            System.out.println("5. fileRequest");
            System.out.println("6. downloadAborted");
            System.out.println("7. downloadError");
            System.out.println("8. errorFixed");
            System.out.println("9. downloadDone");
            System.out.println("10. movieOn");
            System.out.println("11. restartMovie");
            System.out.println("12. holdMovie");
            System.out.println("13. movieOff");
            System.out.println("14. resume");
            System.out.println("-1. Exit");
            System.out.print("Enter the event number you want to run: ");
            try {
                ans = scr.nextInt();
            }catch (Exception e){
                System.out.println("Wrong input, only Integer numbers are allowed");
            }
            switch (ans){
                case 1:
                    mdm.turnOn();
                    break;
                case 2:
                    mdm.turnOff();
                    break;
                case 3:
                    mdm.internetOn();
                    break;
                case 4:
                    mdm.internetOff();
                    break;
                case 5:
                    mdm.fileRequest(new Movie());
                    break;
                case 6:
                    mdm.downloadAborted();
                    break;
                case 7:
                    mdm.downloadError();
                    break;
                case 8:
                    mdm.errorFixed();
                    break;
                case 9:
                    mdm.downloadDone();
                    break;
                case 10:
                    mdm.movieOn();
                    break;
                case 11:
                    mdm.restartMovie();
                    break;
                case 12:
                    mdm.holdMovie();
                    break;
                case 13:
                    mdm.movieOff();
                    break;
                case 14:
                    mdm.resume();
                    break;
            }
            System.out.println();
        }

    }
}
