public class wIdle implements DownloadMngrState {
    WatchMngr wmngr;

    public wIdle(WatchMngr wmngr){
        this.wmngr = wmngr;
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
        if(this.wmngr.mgm.downloadMngr.inDownload && this.wmngr.mgm.downloadMngr.downloadPercentage>=20){
            exit();
            this.wmngr.setWatchState(this.wmngr.wWatch);
            this.wmngr.watchState.entry();
        }
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
        System.out.println("Enter Watch Idle state");
        this.wmngr.cursor = 0;
    }

    @Override
    public void exit() {
        System.out.println("Exit Watch Idle state");
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
