import java.awt.event.ActionEvent;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Tela2CheckBox extends JFrame{
    JCheckBox jBox;

    public Tela2CheckBox() {
        // configurando a tela
        setTitle("Tela com CheckBox");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        setLayout(null);

        // configurando o checkbox
        jBox = new JCheckBox("cheque aqui");
        jBox.setBounds(10, 10, 100, 30);
        // jBox.setSelected(true); // por padrão não vem selecionado (opcional para false)
        add(jBox);

        jBox.addActionListener(this::action);



        setVisible(true);
    }

        private void action(ActionEvent actionevent1) {
            System.out.println(jBox.isSelected());
    }
}
