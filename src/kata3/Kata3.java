
package kata3;

import javax.swing.JFrame;


public class Kata3  {
    public static void main(String[] args) {
        Histogram<String> histogram=new Histogram();
        histogram.increment("uned.es");
        histogram.increment("uned.es");
        histogram.increment("uned.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        HistogramDisplay histo= new HistogramDisplay(histogram);
        histo.execute();
    }
    
}
