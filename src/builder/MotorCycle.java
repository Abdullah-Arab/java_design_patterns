/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package builder;

/**
 *
 * @author abdullah
 */
public class MotorCycle  implements  IBuilder{
    
        private Product product = new Product();
    
        @Override
        public void buildBody() {
            product.add("This is a body of a MotorCycle");
        }
    
        @Override
        public void insertWheels() {
            product.add("2 wheels are added");
        }
    
        @Override
        public void addHeadlights() {
            product.add("1 Headlights are added");
        }
    
        @Override
        public Product getVehicle() {
            return product;
        }

}
