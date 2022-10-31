package TugasPraktek1;
import java.awt.*;

public class LatihanMembuatCheckBox {
    
    public static void main(String[]args){
        Frame object_frame = new Frame("Latihan Membuat Check Box");
        Checkbox object_checkBox_c = new Checkbox("C++");
        Checkbox object_checkbox_java = new Checkbox("Java");
        
        object_checkBox_c.setBounds(100,100,50,50);
        object_checkbox_java.setBounds(60,60,40,40);
        
        object_frame.add(object_checkBox_c);
        object_frame.add(object_checkbox_java);
        
        object_frame.setSize(400,400);
        object_frame.setLayout(null);
        object_frame.setVisible(true);
        
    }
    
}
