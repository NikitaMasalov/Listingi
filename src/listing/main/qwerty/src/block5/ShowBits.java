package listing.main.qwerty.src.block5;

import java.io.PrintStream;

public class ShowBits {

    private int numbits;

    public ShowBits(int numbits){
        this.numbits = numbits;
    }
    public String getBinaryForm(long val) {
        long mask = 1;
        String form = "";
        mask <<= numbits - 1;

        int spacer = 0;
        for(; mask != 0; mask >>=1){

            if ((val & mask) !=0) {
                form += "1";
            }else{
                form += "0";
            }

            if ((spacer % 9) == 0){
                form +="";
                spacer += 0;
            }
        }
        return form;
    }
    public void show(long val, PrintStream out) {
        String binaryForm = getBinaryForm(val);
                out.println(binaryForm);
    }
}
