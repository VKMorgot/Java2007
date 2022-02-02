package course1.lesson8;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class CounterApp extends JFrame {
    private int value;
    private JLabel infoLabel;


    public CounterApp(int x, int y) {
        setBounds(x, y, 300,120);
        setTitle("Counter app");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Шрифт
        Font font = new Font("Arial", Font.BOLD, 32);

        //Текстовое поле(нередактируемое)
        JLabel label = new JLabel(String.valueOf(value));
        label.setFont(font);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);

        //Добавление инфопанели
        //Будем показывать ошибку, если значение счетчика по модулю больше 10
        this.infoLabel = new JLabel();
        infoLabel.setBackground(Color.RED);
        add(infoLabel, BorderLayout.NORTH);

        //Кнопки увеличения и умменьшения
        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        add(decrementButton, BorderLayout.WEST);

        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);
        add(incrementButton, BorderLayout.EAST);

        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value--;
                label.setText(String.valueOf(value));
                validateRange();
            }
        });

        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value++;
                label.setText(String.valueOf(value));
                validateRange();
            }
        });

        setVisible(true);
    }

    private void validateRange() {
        if (Math.abs(value) > 10) {
            infoLabel.setText("Value out of range");
        } else {
            infoLabel.setText("");
        }
    }

    public static void main(String[] args) {
        new CounterApp(100, 100);
    }
}
