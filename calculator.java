import javax.swing.*; 
import javax.swing.border.LineBorder;


import java.awt.BorderLayout; 
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class calculator extends JPanel{

    JFrame frame = new JFrame(); 

    private static final long serialVersionUID = 1L;
    JPanel northPanel = new JPanel();
    JLabel northLabel = new JLabel("Welcome to Lincoln High School's GPA Calculator"); 
    



    JPanel southPanel = new JPanel(); 
    JTextField periodA = new JTextField("Enter Class"); 
    JTextField periodB = new JTextField("Enter Class"); 
    JTextField periodC = new JTextField("Enter Class"); 
    JTextField periodD = new JTextField("Enter Class"); 
    JTextField periodE = new JTextField("Enter Class"); 
    JTextField periodF = new JTextField("Enter Class"); 
    JTextField periodG = new JTextField("Enter Class"); 
    

    JButton buttonA = new JButton("Enter");
    JButton buttonB = new JButton("Enter");
    JButton buttonC = new JButton("Enter");
    JButton buttonD = new JButton("Enter");
    JButton buttonE = new JButton("Enter");
    JButton buttonF = new JButton("Enter");
    JButton buttonG = new JButton("Enter");

    JLabel labelA = new JLabel(); 
    JLabel labelB = new JLabel(); 
    JLabel labelC = new JLabel(); 
    JLabel labelD = new JLabel(); 
    JLabel labelE = new JLabel(); 
    JLabel labelF = new JLabel(); 
    JLabel labelG = new JLabel(); 


    JPanel centerPanel = new JPanel(); 

   
    JLabel gpa = new JLabel("GPA: "); 
    JLabel gpaLabel = new JLabel("0.0"); 

    static int southCounter = 0; 



    public calculator(){
        frame.setSize(1200,450); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout()); 
        frame.getRootPane().setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.WHITE)); 
        frame.setTitle("GPA Calculator"); 

        northPanel.setBackground(Color.RED); 
        northLabel.setFont(new Font("Onyx", Font.BOLD, 20));
        northPanel.add(northLabel); 
        northPanel.setBorder(new LineBorder(Color.YELLOW,3)); 

        frame.add(northPanel, BorderLayout.NORTH); 

        southPanel.setLayout(new GridLayout(2,7)); 
        southPanel.setBorder(new LineBorder(Color.YELLOW,3)); 



        southPanel.add(periodA); 
        southPanel.add(periodB); 
        southPanel.add(periodC); 
        southPanel.add(periodD);
        southPanel.add(periodE); 
        southPanel.add(periodF); 
        southPanel.add(periodG); 

        southPanel.add(buttonA); 
        southPanel.add(buttonB); 
        southPanel.add(buttonC); 
        southPanel.add(buttonD); 
        southPanel.add(buttonE); 
        southPanel.add(buttonF); 
        southPanel.add(buttonG); 


        southPanel.setBackground(Color.RED); 
        frame.add(southPanel, BorderLayout.SOUTH); 
        actionListenerCalc(); 


        
        centerPanel.setBackground(Color.BLUE); 
        centerPanel.setBorder(new LineBorder(Color.YELLOW,3)); 

        centerPanel.setLayout(new GridLayout(0,7)); 
        frame.add(centerPanel, BorderLayout.CENTER); 

        
        frame.setVisible(true); 
    }


    public static void main(String[] args) {
        new calculator(); 
    }


    public void actionListenerCalc()
    {
        buttonA.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                labelA.setText(periodA.getText()); 
                periodA.setVisible(false); 
                buttonA.setVisible(false);

                panel A = new panel(); 
                A.setText(periodA.getText());

                southCounter++; 
                
                centerPanel.add(A); 


            }
        });

        buttonB.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                labelB.setText(periodB.getText()); 
                periodB.setVisible(false); 
                buttonB.setVisible(false); 

                panel B = new panel(); 
                B.setText(periodB.getText());
                
                southCounter++; 
                

                centerPanel.add(B); 

            }
        });

        buttonC.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                labelC.setText(periodC.getText());
                periodC.setVisible(false); 
                buttonC.setVisible(false); 

                panel C = new panel(); 
                C.setText(periodC.getText());

                southCounter++; 
                
                
                centerPanel.add(C); 

            }
        });


        buttonD.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                labelD.setText(periodD.getText()); 
                periodD.setVisible(false); 
                buttonD.setVisible(false); 

                panel D = new panel(); 
                D.setText(periodD.getText()); 

                southCounter++; 
                


                centerPanel.add(D); 

            }
        });


        buttonE.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                labelE.setText(periodE.getText()); 
                periodE.setVisible(false); 
                buttonE.setVisible(false); 

                panel E = new panel(); 
                E.setText(periodE.getText());
                
                southCounter++; 

                centerPanel.add(E); 

            }
        });


        buttonF.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                labelF.setText(periodF.getText());    
                periodF.setVisible(false); 
                buttonF.setVisible(false); 

                panel F = new panel(); 
                F.setText(periodF.getText()); 
                southCounter++; 
                centerPanel.add(F); 

            }
        });


        buttonG.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                labelG.setText(periodG.getText()); 
                periodG.setVisible(false); 
                buttonG.setVisible(false); 

                panel G = new panel(); 
                G.setText(periodG.getText()); 

                southCounter++;
                centerPanel.add(G); 

            }
        });
    }
}