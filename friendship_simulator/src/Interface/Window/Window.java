package Interface.Window;

public class Window {
    
    // Attributes
    private String title;
    private int width;
    private int height;

    // Constructor
    public Window(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
}
