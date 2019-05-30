import java.util.ArrayDeque;
import java.util.Queue;

public class MovieDownloaderManager {
    //Mngrs
    DownloadMngr downloadMngr;
    LevelMngr levelMngr;
    WatchMngr watchMngr;
    QueueMngr queueMngr;
    NetworkMngr networkMngr;
    //Download Region
//    DownloadMngrState dIdle;
//    DownloadMngrState dCheck;
//    DownloadMngrState dWait;
//    DownloadMngrState dDownload;
//    DownloadMngrState dHold;
//    DownloadMngrState dFixing;
//    DownloadMngrState downloadState;
//    //Queue Region
//    DownloadMngrState qListening;
//    DownloadMngrState queueState;
//    //Network Region
//    DownloadMngrState nConnected;
//    DownloadMngrState nDisconnected;
//    DownloadMngrState networdState;
//    //Watch Region
//    DownloadMngrState wIdle;
//    DownloadMngrState wWatch;
//    DownloadMngrState wHold;
//    DownloadMngrState watchState;
//    //Points Region
//    DownloadMngrState pAmature;
//    DownloadMngrState pIntermediate;
//    DownloadMngrState pProfessional;
//    DownloadMngrState levelState;
    //Fields
    //public boolean internet;//TODO
    //public double speed;
    //public int points;
    public Queue<Movie> downloadQ;
    //public double cursor;
//    public double downloadPercentage;
//    public boolean manual;
    public boolean wait;
//    public int diskSize;


    public MovieDownloaderManager() {
        //state mngrs
        downloadMngr = new DownloadMngr(this);
        levelMngr = new LevelMngr(this);
        watchMngr = new WatchMngr(this);
        queueMngr = new QueueMngr(this);
        networkMngr = new NetworkMngr(this);
//        //states
//        this.dIdle = new dIdle(this);
//        this.dCheck = new dCheck(this);
//        this.dWait = new dWait(this);
//        this.dDownload = new dDownload(this);
//        this.dHold = new dHold(this);
//        this.dFixing = new dFixing(this);
//        this.qListening = new qListening(this);
//        this.nConnected = new nConnected(this);
//        this.nDisconnected = new nDisconnected(this);
//        this.wIdle = new wIdle(this);
//        this.wWatch = new wWatch(this);
//        this.wHold = new wHold(this);
//        this.pAmature = new pAmature(this);
//        this.pIntermediate = new pIntermediate(this);
//        this.pProfessional = new pProfessional(this);

        //current states
//        this.downloadState = dIdle;
//        this.downloadState.entry();
//
//        this.queueState = qListening;
//        this.queueState.entry();
//
//        this.levelState = pAmature;
//        this.levelState.entry();
//
//        this.networdState = nConnected;
//        this.networdState.entry();
//
//        this.watchState = wIdle;
//        this.watchState.entry();

        //fields
        //this.internet = true;
//        this.speed = 1.0;
//        this.points = 0;
        this.downloadQ = new ArrayDeque<>();
//        this.cursor = 0.0;
//        this.downloadPercentage = 0.0;
//        this.manual = false;
//        this.wait = false;
//        this.diskSize = 100;

    }
//
//    public void setNetworkState(DownloadMngrState newState){
//        this.networdState = newState;
//    }
//
//    public void setDownloadState(DownloadMngrState newState){
//        this.downloadState = newState;
//    }
//
//    public void setWatchState(DownloadMngrState newState){
//        this.watchState = newState;
//    }
//
//    public void setLevelState(DownloadMngrState newState){
//        this.levelState = newState;
//    }
//
//    public void setQueueState(DownloadMngrState newState){
//        this.queueState = newState;
//    }

}
