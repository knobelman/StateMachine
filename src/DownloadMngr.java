public class DownloadMngr {
    MovieDownloaderManager mgm;
    public double downloadPercentage;
    public int diskSize;
    public boolean wait;
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

        this.downloadState = dIdle;
        this.downloadState.entry();
        downloadPercentage = 0;
        this.diskSize = 100;
        this.wait = false;
    }

    public void setDownloadState(DownloadMngrState newState){
        this.downloadState = newState;
    }
}
