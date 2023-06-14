package ru.netology.data;

import lombok.Value;

public class DataHelper {
    private DataHelper() {
    }

    @Value
    public static class AuthInfo{
        private String login;
        private String password;
    }

    public static AuthInfo getAuthInfoFirstUser(){
        return new AuthInfo("vasya", "qwerty123");
    }
    public static AuthInfo getAuthInfoSecondUser(){
        return new AuthInfo("petya", "123qwerty");
    }
    public static AuthInfo getAuthInvalidLogin(){
        return new AuthInfo("andrei", "1234567");
    }
    public static AuthInfo getAuthInvalidPassword() {
        return new AuthInfo("ivan", "987654");
    }

    @Value
    public static class VerificationCode{
        private String code;
    }

    public static VerificationCode getInvalidCode() {
        return new VerificationCode("1");
    }

}