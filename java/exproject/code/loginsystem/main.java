package loginsystem;

public class main {
    public static void main(String[] args) {
        IDandPass idandpass = new IDandPass();
        loginpage loginpage = new loginpage(idandpass.getlogininfo());



    }
}
