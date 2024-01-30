/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package mybeans;

import javax.ejb.Stateless;

/**
 *
 * @author Sorawat
 */
@Stateless
public class FtoCBean implements FtoCBeanRemote {

    @Override
    public double fToC(int F) {
        double C = (((double)5/9) * (F-32));
        return C;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
