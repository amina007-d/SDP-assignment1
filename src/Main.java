public class Main {
    public static void main(String[] args) {
        Phone FlagshipSamsung = new Phone.PhoneBuilder()
                .setBrand("Samsung")
                .setModel("Galaxy S25")
                .setCamera("200MP")
                .setHas5G(true)
                .setHasESIM(true)
                .build();
        System.out.println(FlagshipSamsung);

        Phone iphone = new Phone.PhoneBuilder()
                .setBrand("Iphone")
                .setModel("15 PRO")
                .setCamera("48MP")
                .setHas5G(true)
                .setHasESIM(true)
                .build();
        System.out.println(iphone);

        Phone BudgetPhone = new Phone.PhoneBuilder()
                .setBrand("Xiaomi")
                .setModel("Redmi Note 9")
                .setCamera("48MP")
                .setHas5G(false)
                .setHasESIM(false)
                .build();
        System.out.println(BudgetPhone);
    }
}