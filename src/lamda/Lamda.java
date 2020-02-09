/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lamda;

/**
 *
 * @author sara
 */
 interface Interface {

    void printIt(String text);
}

public class Lamda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Interface myInterface = (String text) -> {
           // System.out.print(text);
       };
        Class c=myInterface.getClass();
        System.out.println(c.getClassLoader());
        
  System.out.println(Interface.class.getClassLoader());
    }
    
}
