import java.util.Observable;

public class QueueMngr extends Observable implements DownloadMngrState{
    MovieDownloaderManager mgm;
    //Queue Region
    DownloadMngrState qListening;
    DownloadMngrState queueState;

    public QueueMngr(MovieDownloaderManager mgm) {
        this.qListening = new qListening(this);
        this.mgm = mgm;
        this.addObserver(this.mgm);

        this.queueState = qListening;
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
    public void whenQueueNotEmpty() {
        this.notifyObservers();
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
        this.queueState.turnOff();
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

    }

    @Override
    public void whenInIdle() {

    }

    @Override
    public void whenInDownload() {

    }
}
