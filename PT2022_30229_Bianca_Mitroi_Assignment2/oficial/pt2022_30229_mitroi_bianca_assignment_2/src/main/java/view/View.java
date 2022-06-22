package view;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class View {

    private JFrame frame;
    private JLabel lblNo;
    private JLabel lblNo_1;
    private JLabel lblNo_2;
    private JLabel lblNo_3;
    private JLabel lblNo_4;
    private ArrayList<JLabel> labels = new ArrayList<JLabel>();
    private JLabel lblNewLabel_6;
    private JLabel lblNewLabel_7;
    private JLabel lblNewLabel_8;
    private JLabel lblNewLabel_11;
    private JLabel lblNewLabel_12;

    public View() {
        frame = new JFrame();
        frame.setBounds(100, 100, 811, 592);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        lblNo = new JLabel("No 1");
        lblNo.setBounds(10, 11, 49, 14);
        frame.getContentPane().add(lblNo);

        lblNo_1 = new JLabel("No 2");
        lblNo_1.setBounds(10, 36, 49, 14);
        frame.getContentPane().add(lblNo_1);

        lblNo_2 = new JLabel("No 3");
        lblNo_2.setBounds(10, 61, 49, 14);
        frame.getContentPane().add(lblNo_2);

        lblNo_3 = new JLabel("No 4");
        lblNo_3.setBounds(10, 86, 49, 14);
        frame.getContentPane().add(lblNo_3);

        lblNo_4 = new JLabel("No 5");
        lblNo_4.setBounds(10, 111, 49, 14);
        frame.getContentPane().add(lblNo_4);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(69, 11, 718, 14);
        frame.getContentPane().add(lblNewLabel);
        labels.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setBounds(69, 36, 718, 14);
        frame.getContentPane().add(lblNewLabel_1);
        labels.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setBounds(69, 61, 718, 14);
        frame.getContentPane().add(lblNewLabel_2);
        labels.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setBounds(69, 86, 718, 14);
        frame.getContentPane().add(lblNewLabel_3);
        labels.add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setBounds(69, 111, 718, 14);
        frame.getContentPane().add(lblNewLabel_4);
        labels.add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("Simulation time");
        lblNewLabel_5.setBounds(10, 505, 109, 14);
        frame.getContentPane().add(lblNewLabel_5);

        lblNewLabel_6 = new JLabel("");
        lblNewLabel_6.setBounds(129, 505, 64, 14);
        frame.getContentPane().add(lblNewLabel_6);

        lblNewLabel_7 = new JLabel("Clients");
        lblNewLabel_7.setBounds(10, 530, 49, 14);
        frame.getContentPane().add(lblNewLabel_7);

        lblNewLabel_8 = new JLabel("");
        lblNewLabel_8.setBounds(69, 530, 718, 14);
        frame.getContentPane().add(lblNewLabel_8);

        JLabel lblNo_4_1 = new JLabel("No 6");
        lblNo_4_1.setBounds(10, 136, 49, 14);
        frame.getContentPane().add(lblNo_4_1);

        JLabel lblNo_4_2 = new JLabel("No 7");
        lblNo_4_2.setBounds(10, 161, 49, 14);
        frame.getContentPane().add(lblNo_4_2);

        JLabel lblNo_4_2_1 = new JLabel("No 8");
        lblNo_4_2_1.setBounds(10, 186, 49, 14);
        frame.getContentPane().add(lblNo_4_2_1);

        JLabel lblNo_4_2_2 = new JLabel("No 9");
        lblNo_4_2_2.setBounds(10, 211, 49, 14);
        frame.getContentPane().add(lblNo_4_2_2);

        JLabel lblNo_4_2_3 = new JLabel("No 10");
        lblNo_4_2_3.setBounds(10, 236, 49, 14);
        frame.getContentPane().add(lblNo_4_2_3);

        JLabel lblNo_4_2_4 = new JLabel("No 11");
        lblNo_4_2_4.setBounds(10, 261, 49, 14);
        frame.getContentPane().add(lblNo_4_2_4);

        JLabel lblNo_4_2_5 = new JLabel("No 12");
        lblNo_4_2_5.setBounds(10, 286, 49, 14);
        frame.getContentPane().add(lblNo_4_2_5);

        JLabel lblNo_4_2_6 = new JLabel("No 13");
        lblNo_4_2_6.setBounds(10, 311, 49, 14);
        frame.getContentPane().add(lblNo_4_2_6);

        JLabel lblNo_4_2_7 = new JLabel("No 14");
        lblNo_4_2_7.setBounds(10, 336, 49, 14);
        frame.getContentPane().add(lblNo_4_2_7);

        JLabel lblNo_4_2_8 = new JLabel("No 15");
        lblNo_4_2_8.setBounds(10, 361, 49, 14);
        frame.getContentPane().add(lblNo_4_2_8);

        JLabel lblNo_4_2_9 = new JLabel("No 16");
        lblNo_4_2_9.setBounds(10, 386, 49, 14);
        frame.getContentPane().add(lblNo_4_2_9);

        JLabel lblNo_4_2_10 = new JLabel("No 17");
        lblNo_4_2_10.setBounds(10, 411, 49, 14);
        frame.getContentPane().add(lblNo_4_2_10);

        JLabel lblNo_4_2_11 = new JLabel("No 18");
        lblNo_4_2_11.setBounds(10, 436, 49, 14);
        frame.getContentPane().add(lblNo_4_2_11);

        JLabel lblNo_4_2_12 = new JLabel("No 19");
        lblNo_4_2_12.setBounds(10, 461, 49, 14);
        frame.getContentPane().add(lblNo_4_2_12);

        JLabel lblNo_4_2_13 = new JLabel("No 20");
        lblNo_4_2_13.setBounds(10, 486, 49, 14);
        frame.getContentPane().add(lblNo_4_2_13);

        JLabel lblNewLabel_9 = new JLabel("");
        lblNewLabel_9.setBounds(69, 136, 718, 14);
        frame.getContentPane().add(lblNewLabel_9);
        labels.add(lblNewLabel_9);

        JLabel lblNewLabel_9_1 = new JLabel("");
        lblNewLabel_9_1.setBounds(69, 161, 718, 14);
        frame.getContentPane().add(lblNewLabel_9_1);
        labels.add(lblNewLabel_9_1);

        JLabel lblNewLabel_9_2 = new JLabel("");
        lblNewLabel_9_2.setBounds(69, 186, 718, 14);
        frame.getContentPane().add(lblNewLabel_9_2);
        labels.add(lblNewLabel_9_2);

        JLabel lblNewLabel_9_3 = new JLabel("");
        lblNewLabel_9_3.setBounds(69, 211, 718, 14);
        frame.getContentPane().add(lblNewLabel_9_3);
        labels.add(lblNewLabel_9_3);

        JLabel lblNewLabel_9_4 = new JLabel("");
        lblNewLabel_9_4.setBounds(69, 236, 718, 14);
        frame.getContentPane().add(lblNewLabel_9_4);
        labels.add(lblNewLabel_9_4);

        JLabel lblNewLabel_9_5 = new JLabel("");
        lblNewLabel_9_5.setBounds(69, 261, 718, 14);
        frame.getContentPane().add(lblNewLabel_9_5);
        labels.add(lblNewLabel_9_5);

        JLabel lblNewLabel_9_6 = new JLabel("");
        lblNewLabel_9_6.setBounds(69, 286, 718, 14);
        frame.getContentPane().add(lblNewLabel_9_6);
        labels.add(lblNewLabel_9_6);

        JLabel lblNewLabel_9_7 = new JLabel("");
        lblNewLabel_9_7.setBounds(69, 311, 718, 14);
        frame.getContentPane().add(lblNewLabel_9_7);
        labels.add(lblNewLabel_9_7);

        JLabel lblNewLabel_9_8 = new JLabel("");
        lblNewLabel_9_8.setBounds(69, 336, 718, 14);
        frame.getContentPane().add(lblNewLabel_9_8);
        labels.add(lblNewLabel_9_8);

        JLabel lblNewLabel_9_9 = new JLabel("");
        lblNewLabel_9_9.setBounds(69, 361, 718, 14);
        frame.getContentPane().add(lblNewLabel_9_9);
        labels.add(lblNewLabel_9_9);

        JLabel lblNewLabel_9_10 = new JLabel("");
        lblNewLabel_9_10.setBounds(69, 386, 718, 14);
        frame.getContentPane().add(lblNewLabel_9_10);
        labels.add(lblNewLabel_9_10);

        JLabel lblNewLabel_9_11 = new JLabel("");
        lblNewLabel_9_11.setBounds(69, 411, 718, 14);
        frame.getContentPane().add(lblNewLabel_9_11);
        labels.add(lblNewLabel_9_11);

        JLabel lblNewLabel_9_12 = new JLabel("");
        lblNewLabel_9_12.setBounds(69, 436, 718, 14);
        frame.getContentPane().add(lblNewLabel_9_12);
        labels.add(lblNewLabel_9_12);

        JLabel lblNewLabel_9_13 = new JLabel("");
        lblNewLabel_9_13.setBounds(69, 461, 718, 14);
        frame.getContentPane().add(lblNewLabel_9_13);
        labels.add(lblNewLabel_9_13);

        JLabel lblNewLabel_9_14 = new JLabel("");
        lblNewLabel_9_14.setBounds(69, 480, 718, 14);
        frame.getContentPane().add(lblNewLabel_9_14);
        labels.add(lblNewLabel_9_14);

        JLabel lblNewLabel_10 = new JLabel("Average waiting time");
        lblNewLabel_10.setBounds(203, 505, 129, 14);
        frame.getContentPane().add(lblNewLabel_10);

        lblNewLabel_11 = new JLabel("");
        lblNewLabel_11.setBounds(342, 505, 77, 14);
        frame.getContentPane().add(lblNewLabel_11);

        JLabel lblNewLabel_10_1 = new JLabel("Average service time");
        lblNewLabel_10_1.setBounds(429, 505, 129, 14);
        frame.getContentPane().add(lblNewLabel_10_1);

        lblNewLabel_12 = new JLabel("");
        lblNewLabel_12.setBounds(568, 505, 95, 14);
        frame.getContentPane().add(lblNewLabel_12);
    }

    public JFrame getFrame()
    {
        return this.frame;
    }

    public void setLblNewLabel(String s, int i)
    {
        labels.get(i).setText(s);
    }
    public void setTimeLabel(String s) {
        lblNewLabel_6.setText(s);
    }

    public void setClientLabel(String s) {
        lblNewLabel_8.setText(s);
    }

    public void setAverageWaitingLabel(String s) {
        lblNewLabel_11.setText(s);
    }

    public void setAverageServiceLabel(String s) {
        lblNewLabel_12.setText(s);
    }
}
