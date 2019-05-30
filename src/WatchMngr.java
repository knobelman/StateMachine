public class WatchMngr {
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
}
