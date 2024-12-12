/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspendahuluan10;

/**
 *
 * @author Muthia Rihadatul
 */
public class UserData {
    private int userId;
    private int password;
    private boolean isLoggedIn;

    public UserData(int userId, int password) {
        this.userId = userId;
        this.password = password;
    }

    public void login() throws LoginFailedException {
        assert String.valueOf(this.userId).length() == 4;
        assert String.valueOf(this.password).length() == 4;

        if (this.userId + this.password == 10000) {
            isLoggedIn = true;
            System.out.println("Login successful for user " + this.userId);
        } else {
            isLoggedIn = false;
            throw new LoginFailedException("Login user " + this.userId + " gagal, telah gagal login ", this.userId);
        }
    }
}
