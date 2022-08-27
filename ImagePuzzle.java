import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ImagePuzzle implements ActionListener{

//    Creating a Frame for game and selector where the user gets to select which pic puzzle they wanna play

    JFrame game= new JFrame("Lucky's Pic Puzzle Game");

//    Frame which is used to select the game the user wants to play




    Icon star;

//Creating an icon for all the  images which needs to inserted to play the game

        Icon ic0 = new ImageIcon("photo1/star.jpg");
        Icon ic10 = new ImageIcon("photo2/star.jpg");
        Icon ic20 = new ImageIcon("photo3/star.jpg");
        Icon sample1=new ImageIcon("photo1/main.jpg");
    Icon sample2=new ImageIcon("photo2/main.jpg");
    Icon sample3=new ImageIcon("photo3/main.jpg");
    Icon ic1=new ImageIcon("photo1/1.jpg");
    Icon ic2=new ImageIcon("photo1/2.jpg");
    Icon ic3=new ImageIcon("photo1/3.jpg");
    Icon ic4=new ImageIcon("photo1/4.jpg");
    Icon ic5=new ImageIcon("photo1/5.jpg");
    Icon ic6=new ImageIcon("photo1/6.jpg");
    Icon ic7=new ImageIcon("photo1/7.jpg");
    Icon ic8=new ImageIcon("photo1/8.jpg");
    Icon ic9=new ImageIcon("photo1/9.jpg");

    Icon ic11=new ImageIcon("photo2/1.jpg");
    Icon ic12=new ImageIcon("photo2/2.jpg");
    Icon ic13=new ImageIcon("photo2/3.jpg");
    Icon ic14=new ImageIcon("photo2/4.jpg");
    Icon ic15=new ImageIcon("photo2/5.jpg");
    Icon ic16=new ImageIcon("photo2/6.jpg");
    Icon ic17=new ImageIcon("photo2/7.jpg");
    Icon ic18=new ImageIcon("photo2/8.jpg");
    Icon ic19=new ImageIcon("photo2/9.jpg");

    Icon ic21=new ImageIcon("photo3/1.jpg");
    Icon ic22=new ImageIcon("photo3/2.jpg");
    Icon ic23=new ImageIcon("photo3/3.jpg");
    Icon ic24=new ImageIcon("photo3/4.jpg");
    Icon ic25=new ImageIcon("photo3/5.jpg");
    Icon ic26=new ImageIcon("photo3/6.jpg");
    Icon ic27=new ImageIcon("photo3/7.jpg");
    Icon ic28=new ImageIcon("photo3/8.jpg");
    Icon ic29=new ImageIcon("photo3/9.jpg");

//    Creating Buttons where we will insert the images
    JButton b1= new JButton(ic1);
    JButton b2= new JButton(ic2);
    JButton b3= new JButton(ic3);
    JButton b4= new JButton(ic4);
    JButton b5= new JButton(ic5);
    JButton b6= new JButton(ic6);
    JButton b7= new JButton(ic7);
    JButton b8= new JButton(ic8);
    JButton b9= new JButton(ic9);
    JButton sample= new JButton(sample1);

    JButton powerPicture=new JButton(ic0);

//    Adding all the Buttons required to be Displayed on the puzzle frame
    JLabel l1 = new JLabel("Sample");
    JLabel l2 = new JLabel("NOTE::This picture has power to swap between neighbour icon==>");
    JLabel l3 = new JLabel("Click Sample to Load new Puzzle ");

    public void designFrame(){
//        Designing the frame
        game.setSize(600,500);
        game.setLayout(null);
        game.getContentPane().setBackground(new Color(195, 255, 153));
        game.setResizable(false);
        game.setLocationRelativeTo(null);
        game.setVisible(true);
        game.addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                });
    }

    public void addComponents(){
//        Adding all the required components like Button and labels that has to be displayed on the frame
        b1.setBounds(10,80,100,100);
        game.add(b1);
        b2.setBounds(110,80,100,100);
        game.add(b2);
        b3.setBounds(210,80,100,100);
        game.add(b3);
        b4.setBounds(10,180,100,100);
        game.add(b4);
        b5.setBounds(110,180,100,100);
        game.add(b5);
        b6.setBounds(210,180,100,100);
        game.add(b6);
        b7.setBounds(10,280,100,100);
        game.add(b7);
        b8.setBounds(110,280,100,100);
        game.add(b8);
        b9.setBounds(210,280,100,100);
        game.add(b9);
        sample.setBounds(380,100,200,200);
        game.add(sample);

        powerPicture.setBounds(405,5,50,50);
        game.add(powerPicture);
//        Creating a new icon called star so that we can change the icon later when the user changes the sample picture
         star=b5.getIcon();

        l1.setBounds(330,200,70,20);
        l1.setFont(new Font("Arial",Font.BOLD,9));
        game.add(l1);
        l2.setBounds(5,15,500,20);
        l2.setFont(new Font("Arial",Font.BOLD,12));
        game.add(l2);

        l3.setBounds(370,320,200,20);
        l3.setFont(new Font("Arial",Font.BOLD,11));
        l3.setForeground(new Color(255, 74, 74));
        game.add(l3);



    }

    void ActionPerformed(){
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        sample.addActionListener(this);
    }

    ImagePuzzle(){
        ActionPerformed();
        designFrame();
        addComponents();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        Object Source= e.getSource();
        if(Source==b1){
            Icon s1=b1.getIcon();
            if(b2.getIcon()==star){
                b2.setIcon(s1);
                b1.setIcon(star);
            }
             if(b4.getIcon()==star){
                b4.setIcon(s1);
                b1.setIcon(star);
            }
        }

        if(Source==b2){
            Icon s1=b2.getIcon();
            if(b1.getIcon()==star){
                b1.setIcon(s1);
                b2.setIcon(star);
            } else if(b5.getIcon()==star){
                b5.setIcon(s1);
                b2.setIcon(star);
            }
            else if(b3.getIcon()==star){
                b3.setIcon(s1);
                b2.setIcon(star);
            }
        }


        if(Source==b3){
            Icon s1=b3.getIcon();
            if(b2.getIcon()==star){
                b2.setIcon(s1);
                b3.setIcon(star);
            } else if(b6.getIcon()==star){
                b6.setIcon(s1);
                b3.setIcon(star);
            }
        }

        if(Source==b4){
            Icon s1=b4.getIcon();
            if(b1.getIcon()==star){
                b1.setIcon(s1);
                b4.setIcon(star);
            } else if(b5.getIcon()==star){
                b5.setIcon(s1);
                b4.setIcon(star);
            }
            else if(b7.getIcon()==star){
                b7.setIcon(s1);
                b4.setIcon(star);
            }
        }

        if(Source==b5){
            Icon s1=b5.getIcon();
            if(b2.getIcon()==star){
                b2.setIcon(s1);
                b5.setIcon(star);
            } else if(b4.getIcon()==star){
                b4.setIcon(s1);
                b5.setIcon(star);
            }
            else if(b6.getIcon()==star){
                b6.setIcon(s1);
                b5.setIcon(star);
            }
            else if(b8.getIcon()==star){
                b8.setIcon(s1);
                b5.setIcon(star);
            }
        }

        if(Source==b6){
            Icon s1=b6.getIcon();
            if(b3.getIcon()==star){
                b3.setIcon(s1);
                b6.setIcon(star);
            } else if(b5.getIcon()==star){
                b5.setIcon(s1);
                b6.setIcon(star);
            }
            else if(b9.getIcon()==star){
                b9.setIcon(s1);
                b6.setIcon(star);
            }
        }

        if(Source==b7){
            Icon s1=b7.getIcon();
            if(b4.getIcon()==star){
                b4.setIcon(s1);
                b7.setIcon(star);
            } else if(b8.getIcon()==star){
                b8.setIcon(s1);
                b7.setIcon(star);
            }
        }

        if(Source==b8){
            Icon s1=b8.getIcon();
            if(b7.getIcon()==star){
                b7.setIcon(s1);
                b8.setIcon(star);
            } else if(b5.getIcon()==star){
                b5.setIcon(s1);
                b8.setIcon(star);
            }
            else if(b9.getIcon()==star){
                b9.setIcon(s1);
                b8.setIcon(star);
            }

        }

        if(Source==b9){
            Icon s1=b9.getIcon();
            if(b8.getIcon()==star){
                b8.setIcon(s1);
                b9.setIcon(star);
            } else if(b6.getIcon()==star){
                b6.setIcon(s1);
                b9.setIcon(star);
            }
        }

        if(Source==sample){
            Icon s1=sample.getIcon();
            if(s1==sample3){
                game.getContentPane().setBackground(new Color(195, 255, 153));
                sample.setIcon(sample1);
                b1.setIcon(ic1);
                b2.setIcon(ic2);
                b3.setIcon(ic3);
                b4.setIcon(ic4);
                b5.setIcon(ic5);
                b6.setIcon(ic6);
                b7.setIcon(ic7);
                b8.setIcon(ic8);
                b9.setIcon(ic9);
                star=b5.getIcon();
                powerPicture.setIcon(ic0);
            }
            else if(s1==sample1){
                game.getContentPane().setBackground(new Color(247, 246, 220));
                sample.setIcon(sample2);
                b1.setIcon(ic11);
                b2.setIcon(ic12);
                b3.setIcon(ic13);
                b4.setIcon(ic14);
                b5.setIcon(ic15);
                b6.setIcon(ic16);
                b7.setIcon(ic17);
                b8.setIcon(ic18);
                b9.setIcon(ic19);
                star=b5.getIcon();
                powerPicture.setIcon(ic10);
            }
            else{
                game.getContentPane().setBackground(new Color(255, 192, 144));
                sample.setIcon(sample3);
                b1.setIcon(ic21);
                b2.setIcon(ic22);
                b3.setIcon(ic23);
                b4.setIcon(ic24);
                b5.setIcon(ic25);
                b6.setIcon(ic26);
                b7.setIcon(ic27);
                b8.setIcon(ic28);
                b9.setIcon(ic29);
                star=b5.getIcon();
                powerPicture.setIcon(ic20);
            }

        }
        else if((b1.getIcon().equals(ic9)&&b2.getIcon().equals(ic8)&&b3.getIcon().equals(ic7)&&b4.getIcon().equals(ic6)
                &&b5.getIcon().equals(ic5)&&b6.getIcon().equals(ic4)&&b7.getIcon().equals(ic3)&&b8.getIcon().equals(ic2)
                &&b9.getIcon().equals(ic1))||(b1.getIcon().equals(ic19)&&b2.getIcon().equals(ic18)&&b3.getIcon().equals(ic17)
                &&b4.getIcon().equals(ic16)&&b5.getIcon().equals(ic15)
                &&b6.getIcon().equals(ic14)&&b7.getIcon().equals(ic13)&&b8.getIcon().equals(ic12)&&b9.getIcon().equals(ic11))||(
                        b1.getIcon().equals(ic29)&&b2.getIcon().equals(ic28)&&b3.getIcon().equals(ic27)
                &&b4.getIcon().equals(ic26)&&b5.getIcon().equals(ic25)
                &&b6.getIcon().equals(ic24)&&b7.getIcon().equals(ic23)&&b8.getIcon().equals(ic22)&&b9.getIcon().equals(ic21))){
            JOptionPane.showMessageDialog(game,"Congrats You won Hooray ");
        }

    }

    public static void main(String[] args) {
        ImagePuzzle newgame= new ImagePuzzle();
    }
}