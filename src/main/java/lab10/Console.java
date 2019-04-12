package lab10;

public class Console {
    public static void main(String[] args) {
        java.io.Console con = System.console();
        if (con == null){
            System.err.println("no console");
            System.exit(-1);
        }
        con.printf("[%s]", con.readLine());
    }


}
