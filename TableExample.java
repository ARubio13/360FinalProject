package testy;

import javax.swing.*;


import javax.swing.*;    
public class TableExample {    
    JFrame f;    
    TableExample(){    
    f=new JFrame();    
    String data[][]={ {"101","Amit","Sereal", "CSE", "Undergraduate", "Sea26"},    
                          {"102","Jai","Cheese", "Math", "Graduate", "tars6247"},    
                          {"101","Sachin","Testy", "CSGaming", "Graduate", "Cmon2764"}};    
    String column[]={"ID", "First Name", "Last Name", "Program","Level", "ASURITE"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(300,400);    
    f.setVisible(true);    

    
}     
public static void main(String[] args) {    
    new TableExample();    
}    
}  

