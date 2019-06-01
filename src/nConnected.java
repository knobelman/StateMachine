public class nConnected  implements DownloadMngrState {
    NetworkMngr nmgr;

    public nConnected(NetworkMngr nmgr){
        this.nmgr = nmgr;
    }

    @Override
    public void turnOn() {
        entry();
    }

    @Override
    public void turnOff() {

    }

    @Override
    public void internetOn() {
    }

    @Override
    public void internetOff() {
        exit();
        this.nmgr.setNetworkState(this.nmgr.nDisconnected);
        this.nmgr.networdState.entry();
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
    public void errorFixedFailed() {

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
        System.out.println("Enter Network Connected state");
        this.nmgr.internet = true;
    }

    @Override
    public void exit() {
        System.out.println("Exit Network Connected state");
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
