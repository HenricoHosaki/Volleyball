
import javax.swing.JFrame;

class JanelaDoJogo extends JFrame {

    public JanelaDoJogo() {
        janela();
    }

    public void janela() {
        this.setTitle("Volleyball");
        this.setSize(400, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new PainelDoJogo());
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new JanelaDoJogo();

    }
}

