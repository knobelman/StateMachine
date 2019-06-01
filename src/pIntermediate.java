public class pIntermediate implements DownloadMngrState {
    LevelMngr lmgr;

    public pIntermediate(LevelMngr lmgr){
        this.lmgr = lmgr;
    }

    @Override
    public void whenChangePoints(int x){
        if(this.lmgr.points + x < 0)
            this.lmgr.points = 0;
        else
            this.lmgr.points += x;
        if(this.lmgr.points<4){
            exit();
            this.lmgr.setLevelState(this.lmgr.pAmature);
            this.lmgr.levelState.entry();
        }
        else if(this.lmgr.points>7){
            exit();
            this.lmgr.setLevelState(this.lmgr.pProfessional);
            this.lmgr.levelState.entry();
        }
    }

    @Override
    public void entry() {
        System.out.println("Enter Level Intermediate state");
        this.lmgr.speed = 1.2;
    }

    @Override
    public void exit() {
        System.out.println("Exit Level Intermediate state");
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
    public void fileRequest(Movie movie) {

    }

    @Override
    public void downloadAborted() {

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
    public void downloadDone() {

    }

    @Override
    public void whenInIdle() {

    }

    @Override
    public void whenInDownload() {

    }

    @Override
    public void movieOff() {

    }

    @Override
    public void resume() {

    }
}
