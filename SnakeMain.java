import java.awt.EventQueue;
import javax.swing.JFrame;

public class SnakeMain extends JFrame {

    public SnakeMain() {
        initUI();
    }
    
    private void initUI() {
        add(new SnakeBoard());
        
        setResizable(false);
        pack();
        
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame snakeGame = new SnakeMain();
            snakeGame.setVisible(true);
        });
    }
}
