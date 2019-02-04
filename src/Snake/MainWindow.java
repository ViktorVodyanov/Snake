package Snake;

import javax.swing.*;

public class MainWindow extends JFrame {

    MainWindow(){
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320,345);
        setLocation(400,400);
        add(new GameField());
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args) {
        new MainWindow();
    }
}
