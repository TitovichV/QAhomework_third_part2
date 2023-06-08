public class BmiService {

    public int calculate(double weightKg, double heightMetres) {

        double index = weightKg / Math.pow(heightMetres, 2.0);
        int bmi = (int) index;
        return bmi;
    }
}
