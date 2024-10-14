/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package builder;

/**
 *
 * @author abdullah
 */
public interface IBuilder {
    public void buildBody();
    public void insertWheels();
    public void addHeadlights();
    public Product getVehicle();

}
