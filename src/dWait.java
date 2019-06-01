import java.util.concurrent.TimeUnit;

public class dWait implements DownloadMngrState {
    DownloadMngr dmngr;

    public dWait(DownloadMngr dmngr){
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
        System.out.println("Enter Download Wait state");
        System.out.print("Waiting 4 seconds");
        for(int x=0; x<10; x++){
            System.out.print(".");
            try {
                TimeUnit.MILLISECONDS.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.dmngr.wait = true;

        this.dmngr.setDownloadState(this.dmngr.dCheck);
        System.out.println();
        exit();
        this.dmngr.downloadState.entry();
    }

    @Override
    public void exit() {
        System.out.println("Exit Download Wait state");
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
