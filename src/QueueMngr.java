import java.util.ArrayList;

public class QueueMngr implements DownloadMngrState, Observable{
    MovieDownloaderManager mgm;
    private ArrayList<Observer> observers;

    //Queue Region
    DownloadMngrState qListening;
    DownloadMngrState queueState;

    public QueueMngr(MovieDownloaderManager mgm) {
        this.qListening = new qListening(this);
        this.mgm = mgm;
        observers = new ArrayList<>();
        this.addObs(this.mgm);

        this.queueState = qListening;
        this.queueState.entry();
    }

    @Override
    public void whenQueueNotEmpty() {
        notifyObs("q");
    }


    @Override
    public void addObs(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObs(Observer o) {
        int observerIndex = observers.indexOf(o);
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObs(Object o) {
        for(Observer observer : observers){
            observer.update(o);
        }

    }

    public DownloadMngrState getState(){ return this.queueState; }

    public void addMovieToQueue(Movie movie){
        this.mgm.downloadQ.add(movie);
    }

    @Override
    public void fileRequest(Movie movie) {
        this.queueState.fileRequest(movie);
    }

    @Override
    public void turnOn() {
        this.queueState.turnOn();
    }

    @Override
    public void whenChangePoints(int x) {
        this.queueState.whenChangePoints(x);
    }

    @Override
    public void turnOff() {
        this.queueState.exit();
    }

    @Override
    public void internetOn() {
        this.queueState.internetOn();
    }

    @Override
    public void internetOff() {
        this.queueState.internetOff();
    }

    @Override
    public void checkPoints() {
        this.queueState.checkPoints();
    }

    @Override
    public void checkValidMovieSize() {
        this.queueState.checkValidMovieSize();
    }

    @Override
    public void downloadAborted() {
        this.queueState.downloadAborted();
    }

    @Override
    public void downloadError() {
        this.queueState.downloadError();
    }

    @Override
    public void errorFixed() {
        this.queueState.errorFixed();
    }

    @Override
    public void movieOn() {
        this.queueState.movieOn();
    }

    @Override
    public void restartMovie() {
        this.queueState.restartMovie();
    }

    @Override
    public void holdMovie() {
        this.queueState.holdMovie();
    }

    @Override
    public void movieOff() {
        this.queueState.movieOff();
    }

    @Override
    public void resume() {
        this.queueState.resume();
    }

    @Override
    public void entry() {
        this.queueState.entry();
    }

    @Override
    public void exit() {
        this.queueState.exit();
    }

    @Override
    public void downloadDone() {
        this.queueState.downloadDone();
    }

    @Override
    public void whenInIdle() {
        this.queueState.whenInIdle();
    }

    @Override
    public void whenInDownload() {
        this.queueState.whenInDownload();
    }

}
