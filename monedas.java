import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class monedas {
    private JTextField origenTF;
    private JTextField destinoTF;
    private JButton convetirBTN;
    private JComboBox origenCB;
    private JComboBox destinoCB;
    private JLabel origenTxt;
    private JLabel destinoTxt;
    private JLabel auxiliarTxt;
    private JPanel mainPanel;

    public monedas() {
        origenCB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                auxiliarTxt.setText(""+origenCB.getSelectedItem());
            }
        });
        convetirBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double[] tarifas={20.45,44383.50,1.0};
                double tarifaSeleccionada=tarifas[destinoCB.getSelectedIndex()];
                double resultado=Double.parseDouble(origenTF.getText())*tarifaSeleccionada; //Obtiene el valor ingresado
                 destinoTF.setText(""+resultado);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Monedas");
        frame.setContentPane(new monedas().mainPanel);
        frame.setTitle("Calcular el ICM");
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
