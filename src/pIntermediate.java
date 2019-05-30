public class pIntermediate implements DownloadMngrState {
    LevelMngr lmgr;

    public pIntermediate(LevelMngr lmgr){
        this.lmgr = lmgr;
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
    public void changePoints(int x){
        if(this.lmgr.points + x < 0)
            this.lmgr.points = 0;
        else
            this.lmgr.points += x;
        if(this.lmgr.points<4){
            exit();
            this.lmgr.setLevelState(this.lmgr.pAmature);
            this.lmgr.levelState.entry();
            this.lmgr.speed = 1.0;
        }
        else if(this.lmgr.points>7){
            exit();
            this.lmgr.setLevelState(this.lmgr.pProfessional);
            this.lmgr.levelState.entry();
            this.lmgr.speed = 1.5;
        }
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
        System.out.println("Enter Level Intermediate state");
        this.lmgr.speed = 1.2;
    }

    @Override
    public void exit() {
        System.out.println("Exit Level Intermediate state");
    }
}
