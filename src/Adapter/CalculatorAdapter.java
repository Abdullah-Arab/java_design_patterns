import Adapter.Rectangle;

public class CalculatorAdapter {
    Calculator calculator;
   

   


    public double getArea(Triangle triangle) {

        this.calculator = new Calculator();

        Rectangle rectangle = new Rectangle(
                triangle.b,
                0.5 * triangle.h
        );

      return   calculator.getArea(rectangle);

    }

}
