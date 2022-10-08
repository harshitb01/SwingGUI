import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class gui {

    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Unit Convertor");
        mainFrame.setSize(400, 400);
        mainFrame.setLayout(new GridLayout(2, 2));
        mainFrame.setVisible(true);
        JPanel p1 = new JPanel();
        p1.setBackground(Color.white);
        JLabel label11 = new JLabel("Temperature Convertor");
        label11.setBounds(410, 50, 280, 30);
        JLabel label12 = new JLabel("Enter Fahrenheit temperature");
        label12.setBounds(155, 120, 280, 30);
        JLabel label13 = new JLabel("Output");
        label13.setBounds(285, 170, 280, 30);
        TextField tf11 = new TextField();
        tf11.setBounds(330, 120, 280, 30);
        TextField tf12 = new TextField();
        tf12.setBounds(330, 170, 280, 30);
        Button b11 = new Button("Celsius");
        b11.setBounds(350, 270, 90, 50);
        Button b12 = new Button("Kelvin");
        b12.setBounds(500, 270, 90, 50);

        b11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Double a = Double.parseDouble(tf11.getText());
                    Double c = (a - 32) * 5 / 9;
                    tf12.setText(String.valueOf(c) + "C");
                } catch (NumberFormatException er) {
                    tf12.setText("Error: Enter a number");
                }
            }
        });

        b12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Double a = Double.parseDouble(tf11.getText());
                    Double c = ((a - 32) * 5 / 9) + 273.15;
                    tf12.setText(String.valueOf(c) + "K");
                } catch (NumberFormatException er) {
                    tf12.setText("Error: Enter a number");
                }
            }
        });

        p1.add(tf11);
        p1.add(tf12);
        p1.add(b11);
        p1.add(b12);
        p1.add(label11);
        p1.add(label12);
        p1.add(label13);
        p1.setLayout(null);

        JPanel p2 = new JPanel();
        p2.setBackground(Color.red);
        JLabel label21 = new JLabel("Data Convertor");
        label21.setBounds(430, 50, 250, 30);
        JLabel label22 = new JLabel("Enter the data in Bytes");
        label22.setBounds(205, 120, 280, 30);
        JLabel label23 = new JLabel("Output");
        label23.setBounds(295, 170, 280, 30);
        TextField tf21 = new TextField();
        tf21.setBounds(340, 120, 280, 30);
        TextField tf22 = new TextField();
        tf22.setBounds(340, 170, 280, 30);
        Button b21 = new Button("KB");
        b21.setBounds(210, 270, 90, 50);
        Button b22 = new Button("MB");
        b22.setBounds(360, 270, 90, 50);
        Button b23 = new Button("GB");
        b23.setBounds(510, 270, 90, 50);
        Button b24 = new Button("TB");
        b24.setBounds(660, 270, 90, 50);
        b21.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Double a = Double.parseDouble(tf21.getText());
                    Double c = a / 1024;
                    tf22.setText(String.valueOf(c) + " KB");
                } catch (NumberFormatException er) {
                    tf22.setText("Error: Enter a number");
                }
            }
        });
        b22.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Double a = Double.parseDouble(tf21.getText());
                    Double c = (a / 1024) / 1024;
                    tf22.setText(String.valueOf(c) + " MB");
                } catch (NumberFormatException er) {
                    tf22.setText("Error: Enter a number");
                }
            }
        });
        b23.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Double a = Double.parseDouble(tf21.getText());
                    Double c = ((a / 1024) / 1024) / 1024;
                    tf22.setText(String.valueOf(c) + " GB");
                } catch (NumberFormatException er) {
                    tf22.setText("Error: Enter a number");
                }
            }
        });
        b24.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Double a = Double.parseDouble(tf21.getText());
                    Double c = (((a / 1024) / 1024) / 1024) / 1024;
                    tf22.setText(String.valueOf(c) + " TB");
                } catch (NumberFormatException er) {
                    tf22.setText("Error: Enter a number");
                }
            }
        });
        p2.add(tf21);
        p2.add(tf22);
        p2.add(b21);
        p2.add(b22);
        p2.add(b23);
        p2.add(b24);
        p2.add(label21);
        p2.add(label22);
        p2.add(label23);
        p2.setLayout(null);

        JPanel p3 = new JPanel();
        p3.setBackground(Color.blue);
        JLabel label31 = new JLabel("Weight Convertor");
        label31.setBounds(410, 50, 280, 30);
        JLabel label32 = new JLabel("Enter the lenght in Kilograms");
        label32.setBounds(155, 120, 280, 30);
        JLabel label33 = new JLabel("Output");
        label33.setBounds(285, 170, 280, 30);
        TextField tf31 = new TextField();
        tf31.setBounds(330, 120, 280, 30);
        TextField tf32 = new TextField();
        tf32.setBounds(330, 170, 280, 30);
        Button b31 = new Button("Milligram");
        b31.setBounds(200, 270, 90, 50);
        Button b32 = new Button("Gram");
        b32.setBounds(350, 270, 90, 50);
        Button b33 = new Button("Pound");
        b33.setBounds(500, 270, 90, 50);
        Button b34 = new Button("Ton");
        b34.setBounds(650, 270, 90, 50);
        b31.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Double a = Double.parseDouble(tf31.getText());
                    Double c = a * 1000000;
                    tf32.setText(String.valueOf(c) + " mg");
                } catch (NumberFormatException er) {
                    tf32.setText("Error: Enter a number");
                }
            }
        });
        b32.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Double a = Double.parseDouble(tf31.getText());
                    Double c = a * 1000;
                    tf32.setText(String.valueOf(c) + " g");
                } catch (NumberFormatException er) {
                    tf32.setText("Error: Enter a number");
                }
            }
        });
        b33.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Double a = Double.parseDouble(tf31.getText());
                    Double c = a * 2.20462262;
                    tf32.setText(String.valueOf(c) + " lb");
                } catch (NumberFormatException er) {
                    tf32.setText("Error: Enter a number");
                }
            }
        });
        b34.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Double a = Double.parseDouble(tf31.getText());
                    Double c = a / 1000;
                    tf32.setText(String.valueOf(c) + " t");
                } catch (NumberFormatException er) {
                    tf32.setText("Error: Enter a number");
                }
            }
        });
        p3.add(tf31);
        p3.add(tf32);
        p3.add(b31);
        p3.add(b32);
        p3.add(b33);
        p3.add(b34);
        p3.add(label31);
        p3.add(label32);
        p3.add(label33);
        p3.setLayout(null);

        JPanel p4 = new JPanel();
        p4.setBackground(Color.green);
        JLabel label41 = new JLabel("Length Convertor");
        label41.setBounds(430, 50, 250, 30);
        JLabel label42 = new JLabel("Enter the data in Kilometers");
        label42.setBounds(180, 120, 280, 30);
        JLabel label43 = new JLabel("Output");
        label43.setBounds(295, 170, 280, 30);
        TextField tf41 = new TextField();
        tf41.setBounds(340, 120, 280, 30);
        TextField tf42 = new TextField();
        tf42.setBounds(340, 170, 280, 30);
        Button b41 = new Button("CentiMetre");
        b41.setBounds(210, 270, 90, 50);
        Button b42 = new Button("Metre");
        b42.setBounds(360, 270, 90, 50);
        Button b43 = new Button("DecaMetre");
        b43.setBounds(510, 270, 90, 50);
        Button b44 = new Button("Miles");
        b44.setBounds(660, 270, 90, 50);
        b41.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Double a = Double.parseDouble(tf41.getText());
                    Double c = a * 100000;
                    tf42.setText(String.valueOf(c) + " cm");
                } catch (NumberFormatException er) {
                    tf42.setText("Error: Enter a number");
                }
            }
        });
        b42.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Double a = Double.parseDouble(tf41.getText());
                    Double c = a * 1000;
                    tf42.setText(String.valueOf(c) + " m");
                } catch (NumberFormatException er) {
                    tf42.setText("Error: Enter a number");
                }
            }
        });
        b43.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Double a = Double.parseDouble(tf41.getText());
                    Double c = a * 100;
                    tf42.setText(String.valueOf(c) + " dam");
                } catch (NumberFormatException er) {
                    tf42.setText("Error: Enter a number");
                }
            }
        });
        b44.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Double a = Double.parseDouble(tf41.getText());
                    Double c = a / 1.609;
                    tf42.setText(String.valueOf(c) + " mile");
                } catch (NumberFormatException er) {
                    tf42.setText("Error: Enter a number");
                }
            }
        });
        p4.add(tf41);
        p4.add(tf42);
        p4.add(b41);
        p4.add(b42);
        p4.add(b43);
        p4.add(b44);
        p4.add(label41);
        p4.add(label42);
        p4.add(label43);
        p4.setLayout(null);

        mainFrame.add(p1);
        mainFrame.add(p2);
        mainFrame.add(p3);
        mainFrame.add(p4);
    }
}
