Instructions:
1. The state machine is initialized to "Connected state" (Unlike the forum suggests)
2. Run the Main (in 'MovieDownloaderManager') to see the full event list that you can run
3. In order to finish a download after "FileRequest", use the event "downloadDone"
4. In order to fix\fail to fix a downloading problem, use the according events

Events:
    void turnOn(); - Turn the program on
    void turnOff(); - Turn the program off
    void internetOn(); - Turn the internet on
    void internetOff(); - Turn the internet off
    void fileRequest(Movie movie); - Request to download a file
    void downloadAborted(); - Abort download
    void downloadError(); - Error found while downloading
    void errorFixed(); - Error fixed (instead of time)
    void errorFixedFailed(); - Error fix failed (instead of time)
    void movieOn(); - turn movie on
    void restartMovie(); - reset the movie 
    void holdMovie(); - hold movie
    void movieOff(); - turn movie off
    void resume(); - resume movie after hold
    void entry(); - entry for each state
    void exit(); - exit for each state
    void downloadDone(); - download done after fileRequest

Variables:
	boolean on - if the machine is on\off
	double downloadPercentage - the % of the current download
	int diskSize - the size of the disk - can be changed by using menu item number 16 when machine is off
	boolean wait - if waited already after check
	boolean inDownload - in download download state
	boolean inIdle - in download idle state
	Movie movieInProgress - the movie now downloading\watched
	DownloadMngr downloadMngr - the context of the download region
	LevelMngr levelMngr - the context of the Level region
	WatchMngr watchMngr - the context of the Watch region
	QueueMngr queueMngr - the context of the Queue region
	NetworkMngr networkMngr - the context of the Network region
	public Queue<Movie> downloadQ - the queue for the movie (only one movie at a time)
	public int points - the point of the user
	public double speed - the speed of the download	
	boolean internet - if there is internet or not
	boolean manual - if the user paused the movie manualy 

States:
	DownloadMngrState qListening;
	DownloadMngrState pAmature;
    DownloadMngrState pIntermediate;
	DownloadMngrState dIdle;
	DownloadMngrState dCheck;
	DownloadMngrState dWait;
	DownloadMngrState dDownload;
	DownloadMngrState dHold;
	DownloadMngrState dFixing;
	DownloadMngrState nConnected;
    DownloadMngrState nDisconnected;
	DownloadMngrState wIdle;
    DownloadMngrState wWatch;
    DownloadMngrState wHold;
