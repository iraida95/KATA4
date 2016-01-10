package Kata4final;

import Kata4final.Histogram;
import Kata4final.HistogramDisplay;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Kata4 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String pathname="/Users/iraidacorvo/NetBeansProjects/kata4vfinal-master/emails.txt";
        ArrayList <String> mailList = MailReader.read(pathname);
        Histogram<String> histogram= MailHistogramBuilder.build(mailList);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}
