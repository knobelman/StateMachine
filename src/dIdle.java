public class dIdle implements DownloadMngrState {
    DownloadMngr dmngr;

    public dIdle(DownloadMngr dmngr){
        this.dmngr = dmngr;
    }

    @Override
    public void whenQueueNotEmpty() {
        this.dmngr.getMovie();
        this.dmngr.setDownloadState(this.dmngr.dCheck);
        exit();
        this.dmngr.downloadState.entry();
    }

    @Override
    public void turnOn() {

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
        System.out.println("Enter Download Idle state");
        whenInIdle();
        this.dmngr.wait = false;
        this.dmngr.inIdle = true;
        this.dmngr.downloadPercentage = 0;
    }

    @Override
    public void exit() {
        this.dmngr.inIdle = false;
        System.out.println("Exit Download Idle state");
    }

    @Override
    public void downloadDone() {

    }

    @Override
    public void whenInIdle() {
        if(this.dmngr.mgm.on)
            this.dmngr.whenInIdle();
    }

    @Override
    public void whenInDownload() {

    }

}
