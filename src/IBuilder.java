public interface IBuilder {
    IBuilder setBrand(String brand);
    IBuilder setModel(String model);
    IBuilder setCamera(String model);
    IBuilder setHas5G(boolean has5G);
    IBuilder setHasESIM(boolean hasESIM);
    Phone getPhone();
}
