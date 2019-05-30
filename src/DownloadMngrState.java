public interface DownloadMngrState {
    void turnOn();
    void turnOff();
    void internetOn();
    void internetOff();
    void checkPoints();
    void checkValidMovieSize();
    void fileRequest(Movie movie);
    void changePoints(int x);//change point by x and change level accordingly (pPro,pInter,pAma)
    void downloadAborted();
    void downloadError();
    void errorFixed();
    void movieOn();
    void restartMovie();
    void holdMovie();
    void movieOff();
    void resume();
    void entry();
    void exit();
}
