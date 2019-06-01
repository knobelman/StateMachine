public class wHold implements DownloadMngrState {
    WatchMngr wmngr;

    public wHold(WatchMngr wmngr){
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
        if(this.wmngr.mgm.downloadMngr.inDownload && this.wmngr.manual) {
            exit();
            this.wmngr.setWatchState(this.wmngr.wWatch);
            this.wmngr.watchState.entry();
        }
    }

    @Override
    public void entry() {
        System.out.println("Enter Watch Hold state");
    }

    @Override
    public void exit() {
        System.out.println("Exit Watch Hold state");
    }

    @Override
    public void downloadDone() {

    }

    @Override
    public void whenInIdle() {
        exit();
        this.wmngr.setWatchState(this.wmngr.wIdle);
        this.wmngr.watchState.entry();
    }

    @Override
    public void whenInDownload() {
        if(!this.wmngr.manual){
            exit();
            this.wmngr.setWatchState(this.wmngr.wWatch);
            this.wmngr.watchState.entry();
        }
    }
}
