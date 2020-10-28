/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import static org.jfree.chart.ChartFactory.createBarChart;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.ui.ApplicationFrame;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author José Roberto Jiménez
 */
public class HistogramDisplay extends ApplicationFrame {

    public HistogramDisplay() {
        super("Histograma");
        setContentPane(createPanel());
        pack();
    }
    
    public void execute(){
        setVisible(true);
    }
    
    private JPanel createPanel(){
        ChartPanel chartPanel= new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataset){
        JFreeChart chart =createBarChart("Histograma JFreeChart",
                "Dominios email","Nº de emails",dataset,
                PlotOrientation.VERTICAL,false,false,
                rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataset =new DefaultCategoryDataset();
        dataset.addValue(7, "", "ulpgc.es");
        dataset.addValue(5, "", "uned.es");
        dataset.addValue(8, "", "gmail.com");
        dataset.addValue(3, "", "hotmail.com");
        dataset.addValue(2, "", "gob.es");
        return dataset;
    }
    
}
