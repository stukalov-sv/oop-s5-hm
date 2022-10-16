public class Main {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();
        sb.append("setCoffee(\"Растворимый кофе\") ");
        sb.append("setWater(\"0,5 литра\") ");
        sb.append("setSugar(\"1 ложка\")");
        
        // CoffeeBuilder cb = new CoffeeBuilder(); // порождающий паттерн строитель - builder, с помощью изменяющихся инструкций

        // cb.setCoffee("Молотый кофе");
        // cb.setWater("Вода");
        // cb.setSugar("Сахар");

        // cb.boilWater();

        // Coffee coffee = cb.buildCoffee();

        System.out.println(sb.toString());
    }
}
