public class App {
    public static void main(String[] args) throws Exception {
       Triangle t = new Triangle(20, 10);
         CalculatorAdapter ca = new CalculatorAdapter(
            
         );
         
         ca.getArea(
            t
         );
    }
}
