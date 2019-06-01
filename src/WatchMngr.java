public class WatchMngr implements DownloadMngrState {
    MovieDownloaderManager mgm;
    public boolean manual;
    //Watch Region
    DownloadMngrState wIdle;
    DownloadMngrState wWatch;
    DownloadMngrState wHold;
    DownloadMngrState watchState;

    public double cursor;

    public WatchMngr(MovieDownloaderManager mgm) {
        this.wIdle = new wIdle(this);
        this.wWatch = new wWatch(this);
        this.wHold = new wHold(this);
        this.mgm = mgm;

        this.watchState = wIdle;
        this.watchState.entry();
        this.manual = false;
    }

    public void setWatchState(DownloadMngrState newState){
        this.watchState = newState;
    }
    public DownloadMngrState getState(){ return this.watchState; }

    @Override
    public void whenInIdle() {
        this.watchState.exit();
        setWatchState(wIdle);
        this.watchState.entry();
    }

    @Override
    public void whenInDownload() {

    }

    @Override
    public void turnOn() {
        this.watchState.turnOn();
    }

    @Override
    public void turnOff() {
        this.watchState.exit();
        setWatchState(wIdle);
    }

    @Override
    public void internetOn() {
        this.watchState.internetOn();
    }

    @Override
    public void internetOff() {
        this.watchState.internetOff();
    }

    @Override
    public void checkPoints() {
        this.watchState.checkPoints();
    }

    @Override
    public void checkValidMovieSize() {
        this.watchState.checkValidMovieSize();
    }

    @Override
    public void fileRequest(Movie movie) {
        this.watchState.fileRequest(movie);
    }

    @Override
    public void whenChangePoints(int x) {
        this.watchState.whenChangePoints(x);
    }

    @Override
    public void downloadAborted() {
        this.watchState.downloadAborted();
    }

    @Override
    public void downloadError() {
        this.watchState.downloadError();
    }

    @Override
    public void whenQueueNotEmpty() {
        this.watchState.whenQueueNotEmpty();
    }

    @Override
    public void errorFixed() {
        this.watchState.errorFixed();
    }

    @Override
    public void errorFixedFailed() {

    }

    @Override
    public void movieOn() {
        this.watchState.movieOn();
    }

    @Override
    public void restartMovie() {
        this.watchState.restartMovie();
    }

    @Override
    public void holdMovie() {
        this.watchState.holdMovie();
    }

    @Override
    public void movieOff() {
        this.watchState.movieOff();
    }

    @Override
    public void resume() {
        this.watchState.resume();
    }

    @Override
    public void entry() {
        this.watchState.entry();
    }

    @Override
    public void exit() {
        this.watchState.exit();
    }

    @Override
    public void downloadDone() {
        this.watchState.downloadDone();
    }
}
