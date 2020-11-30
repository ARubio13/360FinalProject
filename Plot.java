import java.awt.Color;  
import javax.swing.JFrame;  
import javax.swing.SwingUtilities;  
import javax.swing.WindowConstants;  
import org.jfree.chart.ChartFactory;  
import org.jfree.chart.ChartPanel;  
import org.jfree.chart.JFreeChart;  
import org.jfree.chart.plot.XYPlot;  
import org.jfree.data.xy.XYDataset;  
import org.jfree.data.xy.XYSeries;  
import org.jfree.data.xy.XYSeriesCollection; 
  
public class Plot extends JFrame {  
  private static final long serialVersionUID = 6294689542092367723L;  
  
  public Plot(String title) {  
    super(title);  
    
    XYDataset dataset = createDataset();  
    
    JFreeChart chart = ChartFactory.createScatterPlot(  
        "Student Attendance Chart",   
        "Attendance Percentage", "Number of Students", dataset);  
   
    XYPlot plot = (XYPlot)chart.getPlot();  
    plot.setBackgroundPaint(new Color(230, 238, 240));  
      
    ChartPanel panel = new ChartPanel(chart);  
    setContentPane(panel);  
  }  
  
  private XYDataset createDataset() {  
    XYSeriesCollection dataset = new XYSeriesCollection();  
    
    // using sample data for now
    XYSeries series1 = new XYSeries("Date 1");
    series1.add(10, 2);
    series1.add(20, 4);
    series1.add(30, 3);
    series1.add(40, 7);
    series1.add(50, 2);
    series1.add(60, 8);
    series1.add(70, 3);
    series1.add(80, 8);
    series1.add(90, 14);
    series1.add(100, 12);
  
    dataset.addSeries(series1);  
      
    XYSeries series2 = new XYSeries("Date 2");
    series2.add(10, 1);
    series2.add(20, 3);
    series2.add(30, 1);
    series2.add(40, 6);
    series2.add(50, 2);
    series2.add(60, 3);
    series2.add(70, 7);
    series2.add(80, 8);
    series2.add(90, 9);
    series2.add(100, 18);
  
    dataset.addSeries(series2);  
  
    return dataset;  
  }  
  
  public static void main(String[] args) {  
    SwingUtilities.invokeLater(() -> {  
      Plot example = new Plot("Student Attendance Plot Chart");  
      example.setSize(800, 400);  
      example.setLocationRelativeTo(null);  
      example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  
      example.setVisible(true);  
    });  
  }  
}
