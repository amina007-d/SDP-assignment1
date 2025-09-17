public class Main {
    public static void main(String[] args) {
       PhoneBuilder phoneBuilder = new PhoneBuilder();

        Phone FlagshipSamsung = phoneBuilder
                .setBrand("Samsung")
                .setModel("Galaxy S25")
                .setCamera("200MP")
                .setHas5G(true)
                .setHasESIM(true)
                .getPhone();
        System.out.println(FlagshipSamsung);

        Phone BudgetXiaomi = phoneBuilder
                .setBrand("Xiaomi")
                .setModel("Redmi Note 9")
                .setCamera("48MP")
                .setHas5G(false)
                .setHasESIM(false)
                .getPhone();
        System.out.println(BudgetXiaomi);
    }
}