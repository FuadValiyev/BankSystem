/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileutility;

import java.io.Serializable;

/**
 *
 * @author Windows
 */
public class User implements Serializable{
    private static final long serialVersionUID= 12L; 
    public String name;
    public String surname;
    public int age;
    public transient String password;
    
    public int i;
    
    public int k;
   
}
