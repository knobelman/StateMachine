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

    @Override
    public void whenInIdle() {

    }

    @Override
    public void whenInDownload() {

    }
}
