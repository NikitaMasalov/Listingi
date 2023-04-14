package listing.main.qwerty.src.block6;

import java.io.IOException;

public class ExecProgress {
    public static void main(String[] args) {
        try{
            Runtime.getRuntime().exec("notepad.exe");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
// 6.5