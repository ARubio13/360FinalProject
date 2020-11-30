package AttendanceRoster;

import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import javax.swing.*;

public class LoadFile {
    FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV File", "csv");
    JFileChooser fc = new JFileChooser();
    File file;

    public File pickFile() throws Exception {
        fc.setFileFilter(filter);
        
        if(fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                file = fc.getSelectedFile();
            } else {
                return null;
            }
        return file;
    }
}
