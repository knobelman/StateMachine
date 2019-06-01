public interface Observable {
    public void addObs(Observer o);
    public void removeObs(Observer o);
    public void notifyObs(Object o);
}
