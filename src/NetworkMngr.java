public class NetworkMngr {
    MovieDownloaderManager mgm;
    //Network Region
    DownloadMngrState nConnected;
    DownloadMngrState nDisconnected;
    DownloadMngrState networdState;

    public NetworkMngr(MovieDownloaderManager mgm) {
        this.nConnected = new nConnected(this);
        this.nDisconnected = new nDisconnected(this);
        this.mgm = mgm;

        this.networdState = nConnected;
        this.networdState.entry();
    }

    public void setNetworkState(DownloadMngrState newState){
        this.networdState = newState;
    }

}
