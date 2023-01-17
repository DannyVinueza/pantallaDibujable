import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class v1 {
    private JButton Button1;
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel labelRespuesta;
    private JLabel label1;
    private JLabel label2;
    private JButton ButtonCan;

    public v1() {
        Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //labelRespuesta.setText("HOlA!!!!");
                try{
                    double peso = Double.parseDouble(textField2.getText());
                    double altura = Double.parseDouble(textField1.getText());
                    double resultado = peso/(Math.pow(altura,2));
                    String resu = String.valueOf(resultado);
                    labelRespuesta.setText(resu);
                }catch (Exception ex){
                    labelRespuesta.setText("Valor ingresado incorrectamente " + ex.getMessage() );
                }

            }
        });
        ButtonCan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("v1");
        frame.setContentPane(new v1().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
