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

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void internetOn() {

    }

    @Override
    public void internetOff() {

    }

    @Override
    public void checkPoints() {

    }

    @Override
    public void checkValidMovieSize() {

    }

    @Override
    public void fileRequest(Movie movie) {

    }

    @Override
    public void whenChangePoints(int x) {

    }

    @Override
    public void downloadAborted() {

    }

    @Override
    public void downloadError() {

    }

    @Override
    public void whenQueueNotEmpty() {

    }

    @Override
    public void errorFixed() {

    }

    @Override
    public void movieOn() {

    }

    @Override
    public void restartMovie() {

    }

    @Override
    public void holdMovie() {

    }

    @Override
    public void movieOff() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void entry() {

    }

    @Override
    public void exit() {

    }

    @Override
    public void downloadDone() {

    }
}
