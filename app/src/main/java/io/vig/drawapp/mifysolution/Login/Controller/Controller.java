package io.vig.drawapp.mifysolution.Login.Controller;

import io.vig.drawapp.mifysolution.Login.Model.Profile;

public final class Controller {
    private static Controller instance=null;
    private Profile profile;

    private Controller() {
        super();
    }

    public static final Controller getInstance(){
        if (Controller.instance==null){
            Controller.instance=new Controller();

        }
        return Controller.instance;
    }

    /**
     *
     * @param userName
     * @param passWord
     * verification  du profile
     */
    public void checkProfile(String userName,String passWord){
        profile=new Profile(userName,passWord);
        profile.comparaison();

    }

    public String message(){
        return profile.getMessage();
    }

    public boolean ans(){
        return profile.isAns();
    }


}
