public class QueueMngr {
    MovieDownloaderManager mgm;
    //Queue Region
    DownloadMngrState qListening;
    DownloadMngrState queueState;

    public QueueMngr(MovieDownloaderManager mgm) {
        this.qListening = qListening;
        this.queueState = queueState;
        this.mgm = mgm;
    }
}
