import java.util.Random;

public class Movie {
    private int size;
    private int length;
    Random rand = new Random();


    public Movie() {
        this.size = rand.nextInt(10);//GB
        this.length = rand.nextInt(120);//Minutes
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "Size=" + size +
                ", Length=" + length +
                '}';
    }
}
