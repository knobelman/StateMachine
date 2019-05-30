public class Movie {
    private String name;
    private int size;
    private int length;

    public Movie(String name, int size, int length) {
        this.name = name;
        this.size = size;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                "Name='" + name + '\'' +
                ", Size=" + size +
                ", Length=" + length +
                '}';
    }
}
