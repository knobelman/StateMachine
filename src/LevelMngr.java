public class LevelMngr implements DownloadMngrState{
    MovieDownloaderManager mgm;
    //Level Region
    DownloadMngrState pAmature;
    DownloadMngrState pIntermediate;
    DownloadMngrState pProfessional;
    DownloadMngrState levelState;
    public int points;
    public double speed;


    public LevelMngr(MovieDownloaderManager mgm) {
        this.pAmature = new pAmature(this);
        this.pIntermediate = new pIntermediate(this);
        this.pProfessional = new pProfessional(this);
        this.points = 0;
        this.mgm = mgm;
        this.speed = 1.0;

        this.levelState = pAmature;
        this.levelState.entry();
    }

    public void setLevelState(DownloadMngrState newState){
        this.levelState = newState;
    }
    public DownloadMngrState getState(){ return this.levelState; }

    @Override
    public void turnOn() {
        this.levelState.turnOn();
    }

    @Override
    public void turnOff() {
        this.levelState.exit();
        setLevelState(this.pAmature);
    }

    @Override
    public void internetOn() {
        this.levelState.internetOn();
    }

    @Override
    public void internetOff() {
        this.levelState.internetOff();
    }

    @Override
    public void checkPoints() {
        this.levelState.checkPoints();
    }

    @Override
    public void checkValidMovieSize() {
        this.levelState.checkValidMovieSize();
    }

    @Override
    public void fileRequest(Movie movie) {
        this.levelState.fileRequest(movie);
    }

    @Override
    public void whenChangePoints(int x) {
        this.levelState.whenChangePoints(x);
    }

    @Override
    public void downloadAborted() {
        this.levelState.downloadAborted();
    }

    @Override
    public void downloadError() {
        this.levelState.downloadError();
    }

    @Override
    public void whenQueueNotEmpty() {
        this.levelState.whenQueueNotEmpty();
    }

    @Override
    public void errorFixed() {
        this.levelState.errorFixed();
    }

    @Override
    public void movieOn() {
        this.levelState.movieOn();
    }

    @Override
    public void restartMovie() {
        this.levelState.restartMovie();
    }

    @Override
    public void holdMovie() {
        this.levelState.holdMovie();
    }

    @Override
    public void movieOff() {
        this.levelState.movieOff();
    }

    @Override
    public void resume() {
        this.levelState.resume();
    }

    @Override
    public void entry() {
        this.levelState.entry();
    }

    @Override
    public void exit() {
        this.levelState.exit();
    }

    @Override
    public void downloadDone() {
        this.levelState.downloadDone();
    }

    @Override
    public void whenInIdle() {

    }

    @Override
    public void whenInDownload() {

    }
}
