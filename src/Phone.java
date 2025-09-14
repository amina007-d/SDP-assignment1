public class Phone {
    private final String brand;
    private final String model;
    private final String camera;
    private final boolean has5G;
    private final boolean hasESIM;

    private Phone(PhoneBuilder builder){
        this.brand = builder.brand;
        this.model = builder.model;
        this.camera = builder.camera;
        this.has5G = builder.has5G;
        this.hasESIM = builder.hasESIM;
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

    public static class PhoneBuilder {
        private String brand;
        private String model;
        private String camera;
        private boolean has5G;
        private boolean hasESIM;

        public PhoneBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public PhoneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PhoneBuilder setCamera(String camera) {
            this.camera = camera;
            return this;
        }

        public PhoneBuilder setHas5G(boolean has5G) {
            this.has5G = has5G;
            return this;
        }

        public PhoneBuilder setHasESIM(boolean hasESIM) {
            this.hasESIM = hasESIM;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }
    }
}
