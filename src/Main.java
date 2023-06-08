public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightKg = 67; //вес в кг
        double heightMetres = 1.78; //рост в метрах
        int bmi = service.calculate(weightKg, heightMetres);
        System.out.println("Индекс массы тела = " + bmi);
    }
}