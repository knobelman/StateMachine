public class NetworkMngr implements DownloadMngrState{
    MovieDownloaderManager mgm;
    boolean internet;
    //Network Region
    DownloadMngrState nConnected;
    DownloadMngrState nDisconnected;
    DownloadMngrState networdState;

    public NetworkMngr(MovieDownloaderManager mgm) {
        this.nConnected = new nConnected(this);
        this.nDisconnected = new nDisconnected(this);
        this.mgm = mgm;

        this.networdState = nConnected;
        this.networdState.entry();
        internet = true;
    }

    public void setNetworkState(DownloadMngrState newState){
        this.networdState = newState;
    }

    public boolean getInternet(){ return this.internet; }


    @Override
    public void turnOn() {
        this.networdState.turnOn();
    }

    @Override
    public void turnOff() {
        this.networdState.exit();
        internet = false;
        setNetworkState(nConnected);
    }

    @Override
    public void internetOn() {
        this.networdState.internetOn();
    }

    @Override
    public void internetOff() {
        this.networdState.internetOff();
    }

    @Override
    public void whenChangePoints(int x) {
        this.networdState.whenChangePoints(x);
    }

    @Override
    public void downloadDone() {
        this.networdState.downloadDone();
    }

    @Override
    public void whenInIdle() {
        this.networdState.whenInIdle();
    }

    @Override
    public void whenInDownload() {
        this.networdState.whenInDownload();
    }

    @Override
    public void whenQueueNotEmpty() {
        this.networdState.whenQueueNotEmpty();
    }

    @Override
    public void checkPoints() {
        this.networdState.checkPoints();
    }

    @Override
    public void checkValidMovieSize() {
        this.networdState.checkValidMovieSize();
    }

    @Override
    public void fileRequest(Movie movie) {
        this.networdState.fileRequest(movie);
    }

    @Override
    public void downloadAborted() {
        this.networdState.downloadAborted();
    }

    @Override
    public void downloadError() {
        this.networdState.downloadError();
    }

    @Override
    public void errorFixed() {
        this.networdState.errorFixed();
    }

    @Override
    public void movieOn() {
        this.networdState.movieOn();
    }

    @Override
    public void restartMovie() {
        this.networdState.restartMovie();
    }

    @Override
    public void holdMovie() {
        this.networdState.holdMovie();
    }

    @Override
    public void movieOff() {
        this.networdState.movieOff();
    }

    @Override
    public void resume() {
        this.networdState.resume();
    }

    @Override
    public void entry() {
        this.networdState.entry();
    }

    @Override
    public void exit() {
        this.networdState.exit();
    }
}
