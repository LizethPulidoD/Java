import java.io.File;

public class SuffixingApp {
    String path;

    public SuffixingApp(String path) {
        this.path = path;
    }

    File file = new File(this.path);

}
