/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionRemote.java to edit this template
 */
package mybeans;

import javax.ejb.Remote;

/**
 *
 * @author Sorawat
 */
@Remote
public interface FtoCBeanRemote {

    double fToC(int F);
    
}
