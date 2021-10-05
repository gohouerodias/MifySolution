package io.vig.drawapp.mifysolution.Login.Model;

public class Profile {

    private static final String userN = "rodias";
    private static final String code="Azerty1234";
    //properties
    private String userName;
    private String password;
    private boolean ans;
    private String message;



    public Profile(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public static String getUserN() {
        return userN;
    }

    public static String getCode() {
        return code;
    }

    public boolean isAns() {
        return ans;
    }

    public String getMessage() {
        return message;
    }

    public void comparaison(){
        if (!userName.equals(userN)||!password.equals(code)) ans=false;
        else ans= true;
        if (ans) {message="Bienvenue";
           }
        else message="Mot de passe ou nom d'utilisateur incorrectes";

    }
}
