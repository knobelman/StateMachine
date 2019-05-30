import java.util.Observable;

public class qListening extends Observable implements DownloadMngrState{
    MovieDownloaderManager mgm;

    public qListening(MovieDownloaderManager mgm){
        this.mgm = mgm;
    }

    public void addObserver(DownloadMngrState state){
        this.addObserver(state);
    }

    public void removeObserver(DownloadMngrState state){
        this.removeObserver(state);
    }

    public void notifyObs(){
        this.notifyObservers();
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
        this.mgm.downloadQ.add(movie);
        notify();
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
        System.out.println("Enter Queue Listening state");
    }

    @Override
    public void exit() {

    }

}
