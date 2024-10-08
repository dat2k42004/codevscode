package loginsystem;

import java.util.HashMap;

public class IDandPass {
    HashMap<String, String> logininfo = new HashMap<>();

    IDandPass () {
        logininfo.put("dat", "2410");
        logininfo.put("giang", "0512");
        logininfo.put("duong", "2209");
    }
    protected HashMap getlogininfo () {
        return logininfo;
    }
}
