public class dDownload implements DownloadMngrState {
    DownloadMngr dmngr;

    public dDownload(DownloadMngr dmngr){
        this.dmngr = dmngr;
    }

    public void downloadDone(){
        this.dmngr.diskSize -= this.dmngr.movieInProgress.getSize();
        this.dmngr.downloadPercentage = 100;
        whenChangePoints(1);
        exit();
        this.dmngr.setDownloadState(this.dmngr.dIdle);
        this.dmngr.downloadState.entry();
    }

    @Override
    public void whenInIdle() {

    }

    @Override
    public void whenInDownload() {
        this.dmngr.whenInDownload();
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
        exit();
        this.dmngr.setDownloadState(this.dmngr.dHold);
        this.dmngr.downloadState.entry();
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
        this.dmngr.whenChangePoints(x);
    }

    @Override
    public void downloadAborted() {
        whenChangePoints(-1);
        exit();
        this.dmngr.setDownloadState(this.dmngr.dIdle);
        this.dmngr.downloadState.entry();
    }

    @Override
    public void downloadError() {
        exit();
        this.dmngr.setDownloadState(this.dmngr.dFixing);
        this.dmngr.downloadState.entry();
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
        System.out.println("Enter Download Download state");
        double speed = this.dmngr.mgm.levelMngr.speed;
        System.out.println("Downloading with speed of " + speed + "...");
        this.dmngr.downloadPercentage = 20;
        this.dmngr.inDownload = true;
        whenInDownload();
    }

    @Override
    public void exit() {
        System.out.println("Exit Download Download state");
        this.dmngr.inDownload = false;
    }
}
