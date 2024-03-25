package programmer.zaman.now.application;

import static programmer.zaman.now.data.Application.processors;
import static programmer.zaman.now.data.Constant.*;
import programmer.zaman.now.data.Country;
import programmer.zaman.now.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {

        System.out.println(Aplication);
        System.out.println(Version);

        System.out.println(MathUtil.sum(1, 1, 1, 1, 1));

        Country.City city = new Country.City();
        city.setName("Semarang");

        System.out.println(city.getName());

        System.out.println(processors);
    }
}
