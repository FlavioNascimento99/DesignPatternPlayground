public interface Image {
    void show();
}

public class ImageReal implements Image {
    public ImageReal (String document) {
        System.out.println("Loading " + document);
    }
    public void show() {
        System.out.println("Showing image.");
    }
}

public class ImageProxy implements Image {
    private ImageReal imageReal;
    private String document;

    public ImageProxy(String document) {
        this.document = document;
    }

    public void show() {
        if (imageReal == null) {
            imageReal = new ImageReal(document);
        }
        imageReal.show();
    }
}


public class Main {
    public static void main(String[] args) {
        Image img = new ImageProxy("picture.jgp");
        img.show();
        img.show();
    }
}