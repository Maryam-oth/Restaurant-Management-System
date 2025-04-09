/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rms;

/**
 *
 * @author hamsa
 */
public class Client extends User 
{
    
     /*
     * Variables of class Client
     **/

    public Client ( ) {
    }

    public Client(String UserName, String Email, String PhoneNum) {
        this.UserName = UserName;
        this.Email = Email;
        this.PhoneNum = PhoneNum ;
    }




    @Override
    public String toString() {
        return ("Customer UserName = " +UserName + ", Email= " +Email+", PhoneNum= " + PhoneNum );
            }


      
    
}
