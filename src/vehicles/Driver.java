/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicles;

/**
 *
 * @author CReynolds17
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("In driver main");
        
        promptUser();
    }
    
    public static void promptUser(){
        System.out.println("In prompt user");
        
        new Vehicle();
}
    
}