package AttendanceRoster;

import javax.swing.*;
import java.util.Scanner;

public class LoadFile {
    JFileChooser fc = new JFileChooser();
    StringBuilder sb = new StringBuilder();
    final String nl = "\n";

    public void pickFile() throws Exception {
        if(fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                java.io.File file = fc.getSelectedFile();
                Scanner in = new Scanner(file);

                while(in.hasNext()) {
                    sb.append(in.nextLine());
                    sb.append(nl);
                }
                in.close();
            } else {
                sb.append("No file loaded");
            }
    }
}
