public class wWatch implements DownloadMngrState {
    WatchMngr wmngr;

    public wWatch(WatchMngr wmngr){
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
        exit();
        this.wmngr.manual = false;
        this.wmngr.setWatchState(this.wmngr.wHold);
        this.wmngr.watchState.entry();
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
        exit();
        this.wmngr.manual = false;
        this.wmngr.setWatchState(this.wmngr.wHold);
        this.wmngr.watchState.entry();
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
        exit();
        this.wmngr.cursor = 0;
        entry();
    }

    @Override
    public void holdMovie() {
        exit();
        this.wmngr.manual = true;
        this.wmngr.setWatchState(this.wmngr.wHold);
        this.wmngr.watchState.entry();
    }

    @Override
    public void movieOff() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void entry() {
        System.out.println("Enter Watch Watch state");
    }

    @Override
    public void exit() {
        System.out.println("Exit Watch Watch state");
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

    }
}
