
public class qListening implements DownloadMngrState{
    QueueMngr qmngr;

    public qListening(QueueMngr qmngr){
        this.qmngr = qmngr;
    }

    @Override
    public void fileRequest(Movie movie) {
        if(this.qmngr.mgm.downloadQ.isEmpty() && this.qmngr.mgm.downloadMngr.inIdle) {//only one download at a time
            this.qmngr.addMovieToQueue(movie);
            whenQueueNotEmpty();
        }
    }

    @Override
    public void whenQueueNotEmpty() {
        this.qmngr.whenQueueNotEmpty();
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
        System.out.println("Enter Queue Listening state");
    }

    @Override
    public void exit() {
        System.out.println("Exit Queue Listening state");
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
