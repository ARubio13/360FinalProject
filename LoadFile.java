package AttendanceRoster;

import java.io.File;
import javax.swing.*;
import java.util.Scanner;

public class LoadFile {
    JFileChooser fc = new JFileChooser();
    StringBuilder sb = new StringBuilder();
    final String nl = "\n";

    public File pickFile() throws Exception {
        File file;
        
        if(fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                file = fc.getSelectedFile();
                Scanner in = new Scanner(file);

                while(in.hasNext()) {
                    sb.append(in.nextLine());
                    sb.append(nl);
                }
                in.close();
            } else {
                sb.append("No file loaded");
            return null;
            }
        return file;
    }
}
