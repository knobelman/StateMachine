public class dFixing implements DownloadMngrState {
    DownloadMngr dmngr;

    public dFixing(DownloadMngr dmngr){
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
        System.out.println("Enter Download Fixing state");
        System.out.println("Trying to fix...");
        double random = Math.random();
        if(random<0.5){//failed
            System.out.println("Failed to fix in time, deleting movie");
            whenChangePoints(-1);
            exit();
            this.dmngr.setDownloadState(this.dmngr.dIdle);
            this.dmngr.downloadState.entry();
        }
        else if(this.dmngr.mgm.networkMngr.getInternet()){
            System.out.println("Successfully fixed the move, beck to downloading");
            exit();
            this.dmngr.setDownloadState(this.dmngr.dDownload);
            this.dmngr.downloadState.entry();
        }
        else{
            exit();
            this.dmngr.setDownloadState(this.dmngr.dHold);
            this.dmngr.downloadState.entry();
        }
    }

    @Override
    public void exit() {
        System.out.println("Exit Download Fixing state");

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
