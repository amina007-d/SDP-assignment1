public class Phone {
    private String brand;
    private String model;
    private String camera;
    private boolean has5G;
    private boolean hasESIM;

    public Phone(String brand, String model, String camera, boolean has5G, boolean hasESIM) {
        this.brand = brand;
        this.model = model;
        this.camera = camera;
        this.has5G = has5G;
        this.hasESIM = hasESIM;
    }

    public  String getBrand() {
        return brand;
    }
    public  String getModel() {
        return model;
    }
    public  String getCamera() {
        return camera;
    }
    public  boolean getHas5G() {
        return has5G;
    }
    public  boolean getHasESIM() {
        return hasESIM;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setCamera(String camera) {
        this.camera = camera;
    }
    public void setHas5G(boolean has5G) {
        this.has5G = has5G;
    }
    public void setHasESIM(boolean hasESIM) {
        this.hasESIM = hasESIM;
    }

    @Override
    public String toString() {
        return "Phone characteristics:" + "\n" +
                "Brand: " + brand + "\n" +
                "Model: " + model + "\n" +
                "Camera: " + camera + "\n" +
                "5G: " + has5G + "\n" +
                "eSIM: " + hasESIM + "\n";
    }
}
