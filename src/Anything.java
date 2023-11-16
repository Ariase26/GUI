import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Anything extends JFrame{
    private JButton button1;
    private JTextField textField1;
    private JPanel jpanel;
    private JRadioButton rbMale;
    private JRadioButton rbFemale;
    private JRadioButton rbPNTS;
    private JTextArea textArea1;
    private JComboBox cbProgram;
    private JCheckBox cbJava;
    private JCheckBox cbCPP;
    private JCheckBox cbPython;

    public Anything() {
        Anything a = this;
        button1.addActionListener(e -> {
            String name = textField1.getText();
            if(name.length() == 0){
                //JOptionPane.showMessageDialog(this, "INVALID NAME");
                name = JOptionPane.showInputDialog("What is your Name?");
                textField1.setText(name);
            } else {
                textArea1.append("-----o STUDENT APPLICATION FORM SUMMARY o-----\n\n");
                textArea1.append("Hello, " + name + "!");

                textArea1.append("\nYour gender is ");
                if(rbMale.isSelected()){
                    textArea1.append("male.\n");
                } else if (rbFemale.isSelected()){
                    textArea1.append("female.\n");
                } else if (rbPNTS.isSelected()){
                    textArea1.append("(unknown).\n");
                }

                String program = (String) cbProgram.getSelectedItem();
                if (cbProgram.getSelectedIndex() == 0) {
                    int opt = JOptionPane.showConfirmDialog(this, "MUST SELECT A PROGRAM\n\n Set to Computer Science?");
                    if(opt == JOptionPane.YES_OPTION){
                        cbProgram.setSelectedIndex(1);
                    } else {
                        return;
                    }
                } else {
                    textArea1.append("Program is " + program + "\n");
                }

                if(!cbJava.isSelected() && !cbCPP.isSelected() && !cbPython.isSelected()){
                    textArea1.append("You know nothing!\n");
                } else {
                    textArea1.append("Your programming languages is/are : \n");
                    if(cbJava.isSelected()){
                        textArea1.append("Java \n");
                    }
                    if(cbCPP.isSelected()){
                        textArea1.append("C++ \n");
                    }
                    if(cbPython.isSelected()){
                        textArea1.append("Python\n");
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        Anything app = new Anything();
        app.setContentPane(app.jpanel);
        app.setSize(1000, 400);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);

    }
}
