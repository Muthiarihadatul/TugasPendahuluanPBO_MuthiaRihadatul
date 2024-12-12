/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaspendahuluan10;

/**
 *
 * @author Muthia Rihadatul
 */
public class TugasPendahuluan10 {

    public static void main(String[] args) {
        UserData ud1 = new UserData(1234,8766);
        UserData ud2 = new UserData(1113, 1112);
        
        try{
            ud1.login();
        }catch(LoginFailedException e){
            System.out.println(e.getMessage() + e.getFailedCounter(e.getUserId()) + " kali");
        }
        
        try{
            ud2.login();
        }catch(LoginFailedException e){
            System.out.println(e.getMessage() + e.getFailedCounter(e.getUserId()) + " kali");
        }
        
        try{
            ud2.login();
        }catch(LoginFailedException e){
            System.out.println(e.getMessage() + e.getFailedCounter(e.getUserId()) + " kali");
        }
    }
}
