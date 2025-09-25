package pbo;

import javax.swing.JOptionPane;

public class BoxMasukan {
     public static void main(String[] args) {
          String nama = JOptionPane.showInputDialog("Nama anda ?");
          JOptionPane.showMessageDialog(null, "Pa kabar " + nama + " ?");
     }
}
