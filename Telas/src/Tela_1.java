import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Tela_1 extends JFrame implements ActionListener {
    JTextField num1 = new JTextField();
    JTextField num2 = new JTextField();
    JLabel title = new JLabel();

    public Tela_1() {

        // Configurando a TELA
        setTitle("Primeira Tela");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        // Configurando o TITULO DA TELA_1
        title.setText("CALCULADORA");
        title.setBounds(this.getX() / 2, 10, 310, 50);
        title.setFont(new Font("Arial", Font.BOLD, 40));
        add(title);

        // Configurando a LABEL1
        JLabel lblNum1 = new JLabel();
        lblNum1.setText("Numero 1");
        lblNum1.setBounds(100, 50, 100, 50);
        lblNum1.setFont(new Font("Arial", Font.PLAIN, 14));
        add(lblNum1);

        // Configurando a TEXTFIELD NUM1
        num1.setBounds(100, 100, 100, 30);
        num1.setFont(new Font("Arial", Font.ITALIC, 20));
        add(num1);

        // Configurando a LABEL2
        JLabel lblNum2 = new JLabel();
        lblNum2.setText("Numero 2");
        lblNum2.setBounds(435, 50, 100, 50);
        lblNum2.setFont(new Font("Arial", Font.PLAIN, 14));
        add(lblNum2);

        // Configurando a TEXTFIELD NUM2
        num2.setBounds(435, 100, 100, 30);
        num2.setFont(new Font("Arial", Font.ITALIC, 20));
        add(num2);

        // Configurando o BOTAO CANCELAR
        JButton jButton = new JButton("CANCELAR"); // (*) TEXTO NO CONSTRUTOR
        jButton.setBounds(100, 200, 250, 70); // botão padrao, nesta posicao
        add(jButton);
        jButton.addActionListener(this);

        // Configurando o BOTAO OK
        JButton jButton2 = new JButton("okay..."); // botão personalizado:
        jButton2.setText("OK"); // (*) ou TEXTO NO seText (vale o ultimo)
        jButton2.setBounds(435, 200, 250, 70);
        jButton2.setFont(new Font("Arial", Font.BOLD, 40));
        jButton2.setForeground(new Color(10, 10, 100));
        jButton2.setBackground(new Color(20, 200, 40));
        add(jButton2);
        jButton2.addActionListener(this::teste);

        setVisible(true); // TORNADO A TELA E SEUS COMPONENTES, TODOS VISÍVEIS
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "cliquei no botão CANCELAR", "Titulo CANCELAR", JOptionPane.ERROR_MESSAGE);
        System.exit(ABORT);
    }

    private void teste(ActionEvent actionevent1) {
        try {
            Integer a = Integer.parseInt((num1.getText()));
            Integer b = Integer.parseInt((num2.getText()));
            Integer soma = a + b;
            title.setText("A soma é " + soma); //passa para título, o valor somado ou:
            JOptionPane.showMessageDialog( //exibe caixa de diálogo com o valor somado
                null, "OK, a soma é " + soma, 
                "Titulo OKAY", 
                JOptionPane.INFORMATION_MESSAGE
            );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "entre s\u00F3 numeros", "Errou!!!!!!!!!!", JOptionPane.ERROR_MESSAGE);
        }
    }

}
