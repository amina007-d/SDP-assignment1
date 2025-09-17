public class PhoneBuilder implements IBuilder {
    private String brand;
    private String model;
    private String camera;
    private boolean has5G;
    private boolean hasESIM;

    @Override
    public IBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public IBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public IBuilder setCamera(String camera) {
        this.camera = camera;
        return this;
    }

    @Override
    public IBuilder setHas5G(boolean has5G) {
        this.has5G = has5G;
        return this;
    }

    @Override
    public IBuilder setHasESIM(boolean hasESIM) {
        this.hasESIM = hasESIM;
        return this;
    }

    @Override
    public Phone getPhone() {
        return new Phone(brand, model, camera, has5G, hasESIM);
    }
}
