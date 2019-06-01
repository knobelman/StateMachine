import java.util.ArrayList;

public class DownloadMngr  implements DownloadMngrState, Observable{
    MovieDownloaderManager mgm;
    public double downloadPercentage;
    public int diskSize;
    public boolean wait;
    public boolean inDownload;
    public boolean inIdle;
    public Movie movieInProgress;
    private ArrayList<Observer> observers;

    //Download Region
    DownloadMngrState dIdle;
    DownloadMngrState dCheck;
    DownloadMngrState dWait;
    DownloadMngrState dDownload;
    DownloadMngrState dHold;
    DownloadMngrState dFixing;
    DownloadMngrState downloadState;

    public DownloadMngr(MovieDownloaderManager mgm) {
        this.dIdle = new dIdle(this);
        this.dCheck = new dCheck(this);
        this.dWait = new dWait(this);
        this.dDownload = new dDownload(this);
        this.dHold = new dHold(this);
        this.dFixing = new dFixing(this);
        this.mgm = mgm;
        observers = new ArrayList<>();
        this.addObs(this.mgm);


        this.downloadState = dIdle;
        this.downloadState.entry();
        downloadPercentage = 0;
        this.diskSize = 100;
        this.wait = false;
        this.inDownload = false;
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
    public void notifyObs(Object x) {
        for(Observer observer : observers){
            observer.update(x);
        }

    }

    public void setDownloadState(DownloadMngrState newState){
        this.downloadState = newState;
    }
    public DownloadMngrState getState(){ return this.downloadState; }
    public void getMovie(){ this.movieInProgress = this.mgm.downloadQ.remove(); }

    @Override
    public void whenChangePoints(int x) {
        this.notifyObs(x);
    }

    public void downloadDone(){
        this.downloadState.downloadDone();
    }

    @Override
    public void whenInIdle() {
        this.notifyObs(0);
    }

    @Override
    public void whenInDownload() {
        this.notifyObs(2);
    }

    @Override
    public void whenQueueNotEmpty() {
        this.downloadState.whenQueueNotEmpty();
    }

    @Override
    public void turnOn() {
        this.downloadState.entry();
    }

    @Override
    public void turnOff() {
        this.downloadState.exit();
    }

    @Override
    public void internetOn() {
        this.downloadState.internetOn();
    }

    @Override
    public void internetOff() {
        this.downloadState.internetOff();
    }

    @Override
    public void checkPoints() {
        this.downloadState.checkPoints();
    }

    @Override
    public void checkValidMovieSize() {
        this.downloadState.checkValidMovieSize();
    }

    @Override
    public void fileRequest(Movie movie) {
        this.downloadState.fileRequest(movie);
    }

    @Override
    public void downloadAborted() {
        this.downloadState.downloadAborted();
    }

    @Override
    public void downloadError() {
        this.downloadState.downloadError();
    }

    @Override
    public void errorFixed() {
        this.downloadState.errorFixed();
    }

    @Override
    public void errorFixedFailed() {
        this.downloadState.errorFixedFailed();
    }

    @Override
    public void movieOn() {
        this.downloadState.movieOn();
    }

    @Override
    public void restartMovie() {
        this.downloadState.restartMovie();
    }

    @Override
    public void holdMovie() {
        this.downloadState.holdMovie();
    }

    @Override
    public void movieOff() {
        this.downloadState.movieOff();
    }

    @Override
    public void resume() {
        this.downloadState.resume();
    }

    @Override
    public void entry() {
        this.downloadState.entry();
    }

    @Override
    public void exit() {
        this.downloadState.exit();
    }

}

