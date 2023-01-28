package src;//src.Main from scratch

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Main extends JPanel{
    //initialize the 3x3 matrix
    static int[][] matrix = new int[3][3];
    static int turn=1;
    static int winfreeze=0;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //two lines
        g.drawString("player 1: (O)",150,60);
        g.drawString("player 2: (X)",150,110);

        //the structure
        g.drawString("-----------------------------------",600, 120);
        g.drawString("-----------------------------------",600, 175);
        for(int i=70;i<230;i++) {
            g.drawString("|",640, i);
        }
        for(int i=70;i<230;i++) {
            g.drawString("|",690, i);
        }
        //print 0 and x
        int x=600;
        int y=100;
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                if(matrix[i][j]==0) {
                g.drawString(" ",x,y);
                }
                else if(matrix[i][j]==1) {
                g.drawString("x",x,y);
                }
                else if(matrix[i][j]==2) {
                g.drawString("o",x,y);
                }
                x+=60;

            }y+=55;x=600;
        }
        int c=eval();

        //the if part does not work
        if(c==1) {
            winfreeze=1;
            int winner=(turn);
            winner++;// 0 becomes 1 and 1 becomes 2
            if(winner==1) {
                g.drawString("player :"+k+" wins",440,250);
            }
            else {
                g.drawString("player :"+l+" wins",440,250);
            }

        }


    }

    public static void main(String arg[]) {

        for(int i =0;i<3;i++) {
            for(int j=0;j<3;j++) {
                matrix[i][j] = 0;
            }
        }
        
        Main m = new Main();
        JFrame f=new JFrame("Tic-Tac-Toe");
        JButton b11 = new JButton("*");
        JButton b12 = new JButton("*");
        JButton b13 = new JButton("*");
        JButton b21 = new JButton("*");
        JButton b22 = new JButton("*");
        JButton b23 = new JButton("*");
        JButton b31 = new JButton("*");
        JButton b32 = new JButton("*");
        JButton b33 = new JButton("*");

        JButton reset = new JButton("Reset");

        JTextField t1= new JTextField();
        JTextField t2 = new JTextField();

        f.add(t1);
        f.add(t2);

        t1.setBounds(150,70,110,20);
        t2.setBounds(150,120,110,20);




        f.add(b11);
        f.add(b12);
        f.add(b13);
        f.add(b21);
        f.add(b22);
        f.add(b23);
        f.add(b31);
        f.add(b32);
        f.add(b33);

        f.add(reset);

        f.add(m);



        b11.setBounds(300,50,50,50);
        b12.setBounds(360,50,50,50);
        b13.setBounds(420,50,50,50);
        b21.setBounds(300,110,50,50);
        b22.setBounds(360,110,50,50);
        b23.setBounds(420,110,50,50);
        b31.setBounds(300,170,50,50);
        b32.setBounds(360,170,50,50);
        b33.setBounds(420,170,50,50);

        reset.setBounds(150,150,70,30);

        f.setSize(1000,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        b11.addActionListener(new ActionListener() {
//            @Override
            public void actionPerformed(ActionEvent e) {
                getwinner1(t1.getText());
                getwinner2(t2.getText());
               if(turn==0) {
                matrix[0][0]=1;
               }
               else {
                matrix[0][0]=2;
               }
               //call that method here
               f.repaint();turn=1-turn;
            }
        });
        b12.addActionListener(new ActionListener() {
//            @Override
            public void actionPerformed(ActionEvent e) {
                getwinner1(t1.getText());
                getwinner2(t2.getText());
//                if(winfreeze!=1) {
                if(turn==0) {
                    matrix[0][1]=1;
                   }
                   else {
                    matrix[0][1]=2;
                   }

               //call that method here
               f.repaint();turn=1-turn; //}
            }
        });
        b13.addActionListener(new ActionListener() {
//            @Override
            public void actionPerformed(ActionEvent e) {
                getwinner1(t1.getText());
                getwinner2(t2.getText());
                if(turn==0) {
                    matrix[0][2]=1;
                   }
                   else {
                    matrix[0][2]=2;
                   }

               //call that method here
               f.repaint();turn=1-turn;
            }
        });
        b21.addActionListener(new ActionListener() {
//            @Override
            public void actionPerformed(ActionEvent e) {
                getwinner1(t1.getText());
                getwinner2(t2.getText());
                if(turn==0) {
                    matrix[1][0]=1;
                   }
                   else {
                    matrix[1][0]=2;
                   }

               //call that method here
               f.repaint();turn=1-turn;
            }
        });
        b22.addActionListener(new ActionListener() {
//            @Override
            public void actionPerformed(ActionEvent e) {
                getwinner1(t1.getText());
                getwinner2(t2.getText());
                if(turn==0) {
                    matrix[1][1]=1;
                   }
                   else {
                    matrix[1][1]=2;
                   }

               //call that method here
               f.repaint();turn=1-turn;
            }
        });
        b23.addActionListener(new ActionListener() {
//            @Override
            public void actionPerformed(ActionEvent e) {
                getwinner1(t1.getText());
                getwinner2(t2.getText());
                if(turn==0) {
                    matrix[1][2]=1;
                   }
                   else {
                    matrix[1][2]=2;
                   }

               //call that method here
               f.repaint();turn=1-turn;
            }
        });
        b31.addActionListener(new ActionListener() {
//            @Override
            public void actionPerformed(ActionEvent e) {
                getwinner1(t1.getText());
                getwinner2(t2.getText());
                if(turn==0) {
                    matrix[2][0]=1;
                   }
                   else {
                    matrix[2][0]=2;
                   }

               //call that method here
               f.repaint();turn=1-turn;
            }
        });
        b32.addActionListener(new ActionListener() {
//            @Override
            public void actionPerformed(ActionEvent e) {
                getwinner1(t1.getText());
                getwinner2(t2.getText());
                if(turn==0) {
                    matrix[2][1]=1;
                   }
                   else {
                    matrix[2][1]=2;
                   }

               //call that method here
               f.repaint();turn=1-turn;
            }
        });
        b33.addActionListener(new ActionListener() {
//            @Override
            public void actionPerformed(ActionEvent e) {
                getwinner1(t1.getText());
                getwinner2(t2.getText());
                if(turn==0) {
                    matrix[2][2]=1;
                   }
                   else {
                    matrix[2][2]=2;
                   }

               //call that method here
               f.repaint();turn=1-turn;
            }
        });
        reset.addActionListener(new ActionListener() {
            //            @Override
            public void actionPerformed(ActionEvent e) {
                resetfn();

                //call that method here
                f.repaint();
            }
        });






    }
    static int eval() {
int c=0;


//check horizontal
        for(int i=0;i<3;i++) {
            if((matrix[i][0]==matrix[i][1])&&(matrix[i][0]==matrix[i][2])) {
                if((matrix[i][0]!=0))
                c=1;
            }
        }

        //check vertical
        for(int i=0;i<3;i++) {
            if((matrix[0][i]==matrix[1][i])&&((matrix[0][i]==matrix[2][i]))) {
                if(matrix[0][i]!=0)
//                c=0;
//                else
                c=1;
            }
        }

        //check slanding 1

            if((matrix[0][0]==matrix[1][1])&&(matrix[0][0]==matrix[2][2])) {
                if(matrix[0][0]!=0)
//                c=0;
//                else
                c=1;

            }
            if((matrix[0][2]==matrix[1][1])&&(matrix[0][2]==matrix[2][0])) {
                if(matrix[0][2]!=0)
//                c=0;
//                else
                c=1;
            }
        
//print matrix (debugging)
//        for(int i=0;i<3;i++) {
//            for(int j=0;j<3;j++) {
//                System.out.print(matrix[i][j]+" ");
//            }System.out.println("");
//        }
return c;


}
static String k,l;
static void  getwinner1(String q) {
k=q;
}
static void  getwinner2(String r) {
        l=r;
    }
static void resetfn() {
    turn = 1;
    for(int i =0;i<3;i++) {
        for(int j=0;j<3;j++) {
            matrix[i][j] = 0;
        }
    }

}
}
