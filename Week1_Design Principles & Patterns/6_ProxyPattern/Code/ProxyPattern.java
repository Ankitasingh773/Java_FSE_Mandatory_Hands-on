public interface Image {
    void display();
}
public class RealImage implements Image {
    private String fname;
    public RealImage(String fname) {
        this.fname = fname;
        loadFromDisk();
    }
    private void loadFromDisk() {
        System.out.println("Loading image from disk: " + fname);
    }
    @Override
    public void display() {
        System.out.println("Displaying image: " + fname);
    }
}
public class ProxyImage implements Image{
    private RealImage realImage;
    private String fname;
    public ProxyImage(String fname) {
        this.fname = fname;
    }
    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fname); 
        }
        realImage.display();
    }
}
public class Main {
    public static void main(String[] args) {
        Image img = new ProxyImage("Parrot.png");
        System.out.println("Image will be loaded now:");
        img.display();  
        System.out.println("\nImage will be displayed again:");
        img.display(); 
    }
}
