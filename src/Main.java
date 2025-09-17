public class Main {
    public static void main(String[] args) {
       IBuilder phoneBuilder = new PhoneBuilder();

        Phone FlagshipSamsung = phoneBuilder
                .setBrand("Samsung")
                .setModel("Galaxy S25")
                .setCamera("200MP")
                .setHas5G(true)
                .setHasESIM(true)
                .getPhone();
        System.out.println(FlagshipSamsung);
    }
}