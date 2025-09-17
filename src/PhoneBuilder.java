public class PhoneBuilder implements IBuilder {
    private String brand;
    private String model;
    private String camera;
    private boolean has5G;
    private boolean hasESIM;

    @Override
    public PhoneBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public PhoneBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public PhoneBuilder setCamera(String camera) {
        this.camera = camera;
        return this;
    }

    @Override
    public PhoneBuilder setHas5G(boolean has5G) {
        this.has5G = has5G;
        return this;
    }

    @Override
    public PhoneBuilder setHasESIM(boolean hasESIM) {
        this.hasESIM = hasESIM;
        return this;
    }

    @Override
    public Phone getPhone() {
        return new Phone(brand,model,camera, has5G, hasESIM);
    }
}
