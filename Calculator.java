import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Image;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public static String str = "";
    public static int number1;
    public static int parca;
    public static boolean toplamami = false;
    public static boolean cikarmami = false;
    public static boolean bolmemi = false;
    public static boolean carpmami = false;

    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");
        // İkon dosyasının yolunu belirtme
        String iconPath = "C:\\Users\\muham\\OneDrive\\Masaüstü\\Redudant\\Photos\\calcicon.png";

        // İkonu yükleme
        ImageIcon icon = new ImageIcon(iconPath);
        Image image = icon.getImage();

        // İkonu pencereye ayarlama
        f.setIconImage(image);
        JTextField jtext = new JTextField();
        jtext.setBounds(5, 5, 350, 80);

        Font font = new Font("Arial", Font.BOLD, 46);
        Font btnfont = new Font("Arial", Font.BOLD, 26);
        jtext.setFont(font);
        jtext.setHorizontalAlignment(JTextField.RIGHT);

        JButton btn1 = new JButton("1");
        btn1.setFont(btnfont);
        btn1.setBounds(5, 95, 80, 75);
        btn1.setBackground(Color.LIGHT_GRAY);

        btn1.addActionListener(new ActionListener() {
            int i = 1;

            @Override
            public void actionPerformed(ActionEvent e) {
                str = str + i;
                jtext.setText(str);
                System.out.println(i + " Bastın");
            }

        });
        JButton btn2 = new JButton("2");
        btn2.setFont(btnfont);
        btn2.setBounds(95, 95, 80, 75);
        btn2.setBackground(Color.LIGHT_GRAY);
        btn2.addActionListener(new ActionListener() {
            int i = 2;

            @Override
            public void actionPerformed(ActionEvent e) {
                str = str + i;
                jtext.setText(str);
                System.out.println(i + " Bastın");
            }

        });
        JButton btn3 = new JButton("3");
        btn3.setFont(btnfont);
        btn3.setBounds(185, 95, 80, 75);
        btn3.setBackground(Color.LIGHT_GRAY);

        btn3.addActionListener(new ActionListener() {
            int i = 3;

            @Override
            public void actionPerformed(ActionEvent e) {
                str = str + i;
                jtext.setText(str);
                System.out.println(i + " Bastın");
            }

        });

        JButton btn4 = new JButton("4");
        btn4.setFont(btnfont);
        btn4.setBounds(5, 185, 80, 75);
        btn4.setBackground(Color.LIGHT_GRAY);

        btn4.addActionListener(new ActionListener() {
            int i = 4;

            @Override
            public void actionPerformed(ActionEvent e) {
                str = str + i;
                jtext.setText(str);
                System.out.println(i + " Bastın");
            }

        });

        JButton btn5 = new JButton("5");
        btn5.setFont(btnfont);
        btn5.setBounds(95, 185, 80, 75);
        btn5.setBackground(Color.LIGHT_GRAY);

        btn5.addActionListener(new ActionListener() {
            int i = 5;

            @Override
            public void actionPerformed(ActionEvent e) {
                str = str + i;
                jtext.setText(str);
                System.out.println(i + " Bastın");
            }

        });

        JButton btn6 = new JButton("6");
        btn6.setFont(btnfont);
        btn6.setBounds(185, 185, 80, 75);
        btn6.setBackground(Color.LIGHT_GRAY);

        btn6.addActionListener(new ActionListener() {
            int i = 6;

            @Override
            public void actionPerformed(ActionEvent e) {
                str = str + i;
                jtext.setText(str);
                System.out.println(i + " Bastın");
            }

        });

        JButton btn7 = new JButton("7");
        btn7.setFont(btnfont);
        btn7.setBounds(5, 275, 80, 75);
        btn7.setBackground(Color.LIGHT_GRAY);

        btn7.addActionListener(new ActionListener() {
            int i = 7;

            @Override
            public void actionPerformed(ActionEvent e) {
                str = str + i;
                jtext.setText(str);
                System.out.println(i + " Bastın");
            }

        });

        JButton btn8 = new JButton("8");
        btn8.setFont(btnfont);
        btn8.setBounds(95, 275, 80, 75);
        btn8.setBackground(Color.LIGHT_GRAY);

        btn8.addActionListener(new ActionListener() {
            int i = 8;

            @Override
            public void actionPerformed(ActionEvent e) {
                str = str + i;
                jtext.setText(str);
                System.out.println(i + " Bastın");
            }

        });

        JButton btn9 = new JButton("9");
        btn9.setFont(btnfont);
        btn9.setBounds(185, 275, 80, 75);
        btn9.setBackground(Color.LIGHT_GRAY);

        btn9.addActionListener(new ActionListener() {
            int i = 9;

            @Override
            public void actionPerformed(ActionEvent e) {
                str = str + i;
                jtext.setText(str);
                System.out.println(i + " Bastın");
            }

        });

        JButton btn0 = new JButton("0");
        btn0.setFont(btnfont);
        btn0.setBounds(95, 365, 80, 75);
        btn0.setBackground(Color.LIGHT_GRAY);

        btn0.addActionListener(new ActionListener() {
            int i = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                str = str + i;
                jtext.setText(str);
                System.out.println(i + " Bastın");
            }

        });
        // !Toplama
        JButton btntopla = new JButton("+");
        btntopla.setFont(btnfont);
        btntopla.setBounds(275, 365, 80, 75);
        btntopla.setBackground(Color.LIGHT_GRAY);

        btntopla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Toplama");
                parca = str.length();// ilk sayının uzunluğu
                System.out.println("ilk sayı uzunluk>" + parca);
                number1 = Integer.parseInt(str);
                toplamami = true;
                str = str + "+";
                jtext.setText(str);
                System.out.println("String:" + str);
            }

        });

        // ! Çıkarma
        JButton btncikar = new JButton("-");
        btncikar.setFont(btnfont);
        btncikar.setBounds(275, 275, 80, 75);
        btncikar.setBackground(Color.LIGHT_GRAY);

        btncikar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Çıkarma");
                parca = str.length();// ilk sayının uzunluğu
                System.out.println("ilk sayı uzunluk>" + parca);
                number1 = Integer.parseInt(str);
                cikarmami = true;
                str = str + "-";
                jtext.setText(str);
                System.out.println("String:" + str);
            }

        });

        // !Bölme
        JButton btnbol = new JButton("/");
        btnbol.setFont(btnfont);
        btnbol.setBounds(275, 95, 80, 75);
        btnbol.setBackground(Color.LIGHT_GRAY);

        btnbol.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Bölme");
                parca = str.length();// ilk sayının uzunluğu
                number1 = Integer.parseInt(str);
                bolmemi = true;
                str = str + "/";
                jtext.setText(str);
                System.out.println("Stringimiz:" + str);
            }

        });

        // !Çarpma
        JButton btncarp = new JButton("x");
        btncarp.setFont(btnfont);
        btncarp.setBounds(275, 185, 80, 75);
        btncarp.setBackground(Color.LIGHT_GRAY);
        if (carpmami == false) {
            btncarp.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Çarpma");
                    parca = str.length();// ilk sayının uzunluğu
                    number1 = Integer.parseInt(str);
                    carpmami = true;
                    str = str + "x";
                    jtext.setText(str);
                    System.out.println("Stringimiz:" + str);
                }

            });
        }
        // !Eşittir
        JButton btnes = new JButton("=");
        btnes.setFont(btnfont);
        btnes.setBounds(185, 365, 80, 75);
        btnes.setBackground(Color.GRAY);

        btnes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("-----------------------------");
                System.out.println("Sonuç istedin");
                int result = 0;
                // parca = 9+9 ---> 9 yani 1 uzunluk
                int number2 = Integer.parseInt(str.substring(parca + 1, str.length()));
                // parça ilk sayımızın uzunluğudur
                // index e dönüşünce 1 sayı sağa kayar ve işlem işaretinden yazmaya başlar
                // çünkü index 0 dan başlar uzunluk ise değil
                // O yüzden +1 eklersek 2. sayının ilk indexinden başlar
                // Begin dahil end dahil değil !!!!!
                System.out.println("Parça>" + parca);
                System.out.println("String uzunluk>" + str.length());
                System.out.println("2.sayı>" + number2);
                if (toplamami) {
                    result = (number1 + number2);// ilk sayı ile ikinci sayı toplamı
                    String news = "";
                    news += result; // sonucu stringe atama
                    jtext.setText(news);// yeni stringi ekrana yazma
                    str = news;// sonuçtan devam etme
                } else if (cikarmami) {
                    result = (number1 - number2);
                    String news = "";
                    news += result;
                    jtext.setText(news);
                    str = news;
                } else if (bolmemi) {
                    result = (number1 / number2);
                    String news = "";
                    if (result <= 0) {
                        JOptionPane.showMessageDialog(f, "Sonuç 1'den küçük", "Hata", 3);
                    }
                    news += result;
                    jtext.setText(news);
                    str = news;
                } else if (carpmami) {
                    result = (number1 * number2);
                    String news = "";
                    news += result;
                    jtext.setText(news);
                    str = news;
                }
                toplamami = false;
                cikarmami = false;
                bolmemi = false;
                carpmami = false;

                System.out.println("beginindex" + (parca + 1));
                System.out.println("Sonuç: " + result);
                System.out.println("String:" + str);
            }

        });

        // ! Clear
        JButton btnclear = new JButton("C");
        btnclear.setFont(btnfont);
        btnclear.setBounds(5, 365, 80, 75);
        btnclear.setBackground(Color.GRAY);

        btnclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                jtext.setText("");
                System.out.println("C Bastın");
                str = ""; // Sildikten sonra ana stirngi boşaltma
            }

        });

        f.add(btn1);
        f.add(btn2);
        f.add(btn3);
        f.add(btn4);
        f.add(btn5);
        f.add(btn6);
        f.add(btn7);
        f.add(btn8);
        f.add(btn9);
        f.add(btnbol);
        f.add(btncarp);
        f.add(btncikar);
        f.add(btnclear);
        f.add(btn0);
        f.add(btnes);
        f.add(btntopla);

        f.add(jtext);
        f.setSize(380, 510);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

// ?Başa 0 gelmesin
// ? birden fazla işlem basılmasın