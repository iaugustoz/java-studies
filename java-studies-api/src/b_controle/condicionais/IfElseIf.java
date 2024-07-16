package b_controle.condicionais;

import javax.swing.*;

public class IfElseIf {

    public static void main(String[] args) {

        String time1 = JOptionPane.showInputDialog(null, "Time 1: ");
        String time2 =  JOptionPane.showInputDialog(null, "Time 2: ");
        
        int golsTime1 = Integer.parseInt(JOptionPane.showInputDialog(null, ("Qt de gols do " + time1 + ": ") ));
        int golsTime2 = Integer.parseInt(JOptionPane.showInputDialog(null, ("Qt de gols do " + time2 + ": ") ));

        if (golsTime1 > golsTime2) {
            System.out.printf("Com %dx%d de placar. O %s venceu o jogo!", golsTime1, golsTime2,time1);
            
        } else if (golsTime2 > golsTime1) {
            System.out.printf("Com %dx%d de placar. O %s venceu o jogo!", golsTime2, golsTime1,time2);
        } else {
            System.out.printf("Com %dx%d de placar. O jogo terminou empatado!", golsTime2, golsTime1,time2);
        }
    }
}
