package Class1;

public class Homework3 {
    public static void main(String[] args) {


        /**
         * Homework #3:
         * Refer for formula: https://www.rapidtables.com/convert/temperature/celsius-to-fahrenheit.html
         *
         * C -> F
         * C -> K
         *
         * F -> C
         * F -> K
         *
         * K -> F
         * K -> C
         *
         */

        /* C -> F */
        /* fT = cT × 9/5 + 32 */
        double cTemp = 21.111;
        double fTemp = cTemp * 9/5 + 32;
        System.out.println(cTemp + "°C --> " + fTemp + "°F");

        /* C -> K */
        /* kT = cT + 273.15 */
        double cT = 65.99;
        double kT = cT + 273.15;
        System.out.println(cT + "°C --> " + kT + "°K");

        /* F -> C */
        /* cT = (fT - 32) × 5/9 */
        double fTemperature = 302;
        double cTemperature = (fTemperature - 32) * 5/9;
        System.out.println(fTemperature + "°F --> " + cTemperature + "°C");

        /* F -> K */
        /* kT = (fT + 459.67)× 5/9 */
        double fTem = 600;
        double kTem = (fTem + 459.67) * 5/9;
        System.out.println(fTem + "°F --> " + kTem + "°K");

        /* K -> F */
        /* fT = kT × 9/5 - 459.67 */
        double kTmp = 109;
        double fTmp = kTmp * 9/5 - 459.67;
        System.out.println(kTmp + "°K --> " + fTmp + "°F");

        /* K -> C */
        /* cT = kT - 273.15 */
        double kTeper = 23;
        double cTemper = kTeper - 273.15;
        System.out.println(kTeper + "°K --> " + cTemper + "°C");

        String hello = "Hello World";
        char lastChar = hello.charAt(10);
        System.out.println("Last char in Hello World is" + " " + lastChar);






    }
}