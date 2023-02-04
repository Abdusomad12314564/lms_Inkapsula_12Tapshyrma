import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Country co = new Country();
        co.setCountry("Kyrgyzstan");

        Country co2 = new Country();
        co2.setCountry("Uzbekistan");

        Country co3 = new Country();
        co3.setCountry("Kazakhstan");

        City ci = new City();
        ci.setRegion("Bishkek");

        City ci2 = new City();
        ci2.setRegion("Osh");

        City ci3 = new City();
        ci3.setRegion("Jalal-Abad");

        Address add = new Address();
        add.setDistrict("Suzak raionu Barpy aiyly");

        Address add2 = new Address();
        add2.setDistrict("Talas raionu Sheker aiyly");

        Address add3 = new Address();
        add3.setDistrict("Tup raionu Prezident aiyly");

        Person per = new Person();
        per.setFullName("Abdusomad Koshmamatov");
        per.setAge(31);
        per.setPhoneNumber(777123456);

        Person per2 = new Person();
        per2.setFullName("Abdulla Abrurahmanov");
        per2.setAge(70);
        per2.setPhoneNumber(555987654);

        String[] countries = {co.getCountry(), co2.getCountry(), co3.getCountry() + "\n"
                + ci.getRegion(), ci2.getRegion(), ci3.getRegion() + "\n"
                + add.getDistrict(), add2.getDistrict(), add3.getDistrict() + "\n"
                + per.getFullName(), String.valueOf(per.getAge()), per.getPhoneNumber() + "\n"
                + per2.getFullName(), String.valueOf(per2.getAge()), String.valueOf(per2.getPhoneNumber())};
        System.out.println(Arrays.toString(countries));
    }
}