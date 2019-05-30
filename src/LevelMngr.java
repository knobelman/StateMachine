public class LevelMngr {
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
}
