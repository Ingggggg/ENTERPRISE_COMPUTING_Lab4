/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statelessftocclient;

import java.util.Scanner;
import javax.ejb.EJB;
import mybeans.FtoCBeanRemote;

/**
 *
 * @author Sorawat
 */
public class Main {

    @EJB
    private static FtoCBeanRemote ftoCBean;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter degree in Fahrenheit: ");
        int F = in.nextInt();
        System.out.println(F + " Fahrenheit = " + ftoCBean.fToC(F) + " Celsius");
    }
  
}
