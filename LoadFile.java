package AttendanceRoster;

import java.io.File;
import javax.swing.*;

public class LoadFile {
    JFileChooser fc = new JFileChooser();


    public File pickFile() throws Exception {
        File file;
        
        if(fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                file = fc.getSelectedFile();
            } else {
                return null;
            }
        return file;
    }
}
