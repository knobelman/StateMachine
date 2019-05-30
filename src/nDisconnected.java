public class nDisconnected implements DownloadMngrState {
    NetworkMngr nmgr;

    public nDisconnected(NetworkMngr nmgr){
        this.nmgr = nmgr;
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void internetOn() {
        exit();
        this.nmgr.setNetworkState(this.nmgr.nConnected);
        this.nmgr.networdState.entry();
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
    public void changePoints(int x) {

    }

    @Override
    public void downloadAborted() {

    }

    @Override
    public void downloadError() {

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
        System.out.println("Enter Network Disconnected state");
    }

    @Override
    public void exit() {
        System.out.println("Exit Network Disconnected state");
    }
}
