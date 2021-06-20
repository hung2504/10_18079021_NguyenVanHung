package com.example.a10_18079021_nguyenvanhung;

public class LoginApp {
    private String mail;
    private String time;


    public LoginApp() {
    }

    public LoginApp(String mail, String time) {
        this.mail = mail;
        this.time = time;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
