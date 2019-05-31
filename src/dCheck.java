public class dCheck implements DownloadMngrState {
    DownloadMngr dmngr;

    public dCheck(DownloadMngr dmngr){
        this.dmngr = dmngr;
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void internetOn() {
        boolean valid = this.dmngr.movieInProgress.getSize() < this.dmngr.diskSize;
        if(valid){
            this.dmngr.setDownloadState(this.dmngr.dDownload);
            exit();
            this.dmngr.downloadState.entry();
        }
    }

    @Override
    public void internetOff() {

    }

    @Override
    public void checkPoints() {

    }

    @Override
    public void checkValidMovieSize() {
        boolean valid = this.dmngr.movieInProgress.getSize() < this.dmngr.diskSize;
        if(!valid && !this.dmngr.wait){//not enough space and haven't been inside wait
            this.dmngr.setDownloadState(this.dmngr.dWait);
        }
        else if(!valid && this.dmngr.wait){//not enough space and have been inside wait
            whenChangePoints(-1);
            this.dmngr.setDownloadState(this.dmngr.dIdle);
        }
        else if(valid && this.dmngr.mgm.networkMngr.getInternet()){
            this.dmngr.setDownloadState(this.dmngr.dDownload);
        }
        exit();
        this.dmngr.downloadState.entry();
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
        System.out.println("Enter Download Check state");
        checkValidMovieSize();
    }

    @Override
    public void exit() {
        System.out.println("Exit Download Check state");
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
