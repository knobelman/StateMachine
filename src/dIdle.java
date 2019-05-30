import java.util.Observable;
import java.util.Observer;

public class dIdle implements DownloadMngrState, Observer {
    DownloadMngr dmngr;

    public dIdle(DownloadMngr dmngr){
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
        System.out.println("Enter Download Idle state");
    }

    @Override
    public void exit() {
        System.out.println("Exit Download Idle state");
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
