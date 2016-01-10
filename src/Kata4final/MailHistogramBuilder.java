package Kata4final;

import Kata4final.Histogram;
import Kata4final.Histogram;
import java.util.ArrayList;

public class MailHistogramBuilder {
    public static Histogram<String> build(ArrayList <String> mails){
        Histogram<String> histogram= new Histogram<>();
        for (String mailss : mails) {
            Mail mail = new Mail(mailss);
            histogram.increment(mail.getDomain());
        }
        return histogram;
    }
}
