/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspendahuluan10;

/**
 *
 * @author Muthia Rihadatul
 */

import java.util.HashMap;


public class LoginFailedException extends Exception {
    private static HashMap<Integer, Integer> failedCount = new HashMap<>();
    private int userId;

    public LoginFailedException(String message, int user) {
        super(message);
        this.userId = user;
        
        if (failedCount.containsKey(user)){
            failedCount.put(user,failedCount.get(user) + 1);
        }else{
            failedCount.put(user, 1);
        }
    }

    public int getUserId() {
        return userId;
    }

    public static int getFailedCounter(int user) {
        return failedCount.getOrDefault(user, 0);
    }
}
