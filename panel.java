
import javax.swing.*; 

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color; 





public class panel extends JPanel
{
    private static final long serialVersionUID = 1L;
    

    String text = " "; 


    JLabel className = new JLabel(); 
    


    JButton aplus = new JButton("A+"); 
    JButton a = new JButton("A"); 
    JButton aminus = new JButton("A-"); 
    JButton bplus = new JButton("B+"); 
    JButton b = new JButton("B"); 
    JButton bminus = new JButton("B-"); 
    JButton cplus = new JButton("C+"); 
    JButton c = new JButton("C"); 
    JButton cminus = new JButton("C-"); 
    JButton f = new JButton("F"); 

    JLabel indiGPALabel = new JLabel(); 
    JLabel totalGPALabel = new JLabel();
    
    static double totalGPA = 0; 
    static int counter = 0; 
 

    public void setText(String t){
        text += t; 
        className.setText(text); 
    }

    public panel()
    {
        setBackground(Color.BLUE);
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS)); 


        className.setFont(new Font("Onyx", Font.BOLD, 14));
        className.setForeground(Color.WHITE);

        aplus.setBackground(new Color(45,229,38));
        aplus.setOpaque(true);  

        a.setBackground(new Color(45,229,38)); 
        a.setOpaque(true);  

        aminus.setBackground(new Color(45,229,38)); 
        aminus.setOpaque(true);  


        bplus.setBackground(new Color(191,255,0)); 
        bplus.setOpaque(true);  

        b.setBackground(new Color(191,255,0)); 
        b.setOpaque(true);  

        bminus.setBackground(new Color(191,255,0)); 
        bminus.setOpaque(true);  


        cplus.setBackground(new Color(255,199,0)); 
        cplus.setOpaque(true);  

        c.setBackground(new Color(255,199,0)); 
        c.setOpaque(true);  

        cminus.setBackground(new Color(255,199,0)); 
        cminus.setOpaque(true);  


        f.setBackground(new Color(255,57,37)); 
        f.setOpaque(true);  


        add(className); 
        add(aplus); 
        add(a); 
        add(aminus); 
        add(bplus); 
        add(b); 
        add(bminus); 
        add(cplus); 
        add(c); 
        add(cminus);
        add(f); 
        add(indiGPALabel);
        
        
        actionListener();
    }


    public void actionListener()
    {
        aplus.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                addGPA(4.25); 
                counter++; 

                setVisible(); 
                indiGPALabel.setText("Class GPA: 4.25"); 

                indiGPALabel.setFont(new Font("Onyx", Font.BOLD, 18));
                indiGPALabel.setForeground(new Color(45,229,38));
                GPA(); 

                indiGPALabel.setVisible(true);     
            }
        });
        a.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                addGPA(4.0); 
                counter++; 


                setVisible(); 
                indiGPALabel.setText("Class GPA: 4.0"); 

                indiGPALabel.setFont(new Font("Onyx", Font.BOLD, 18));
                indiGPALabel.setForeground(new Color(45,229,38));
                GPA(); 

                indiGPALabel.setVisible(true); 

            }
        });
        aminus.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                addGPA(3.75); 
                counter++; 



                setVisible(); 
                indiGPALabel.setText("Class GPA: 3.75"); 

                indiGPALabel.setFont(new Font("Onyx", Font.BOLD, 18));
                indiGPALabel.setForeground(new Color(45,229,38));
                GPA(); 

                indiGPALabel.setVisible(true); 
            }
        });
        bplus.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                addGPA(3.50); 
                counter++; 

                setVisible(); 
                indiGPALabel.setText("Class GPA: 3.50"); 

                indiGPALabel.setFont(new Font("Onyx", Font.BOLD, 18));
                indiGPALabel.setForeground(new Color(191,255,0)); 

                GPA(); 

                indiGPALabel.setVisible(true); 
            }
        });
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                addGPA(3.25); 
                counter++; 

                setVisible(); 
                indiGPALabel.setText("Class GPA: 3.25"); 

                indiGPALabel.setFont(new Font("Onyx", Font.BOLD, 18));
                indiGPALabel.setForeground(new Color(191,255,0)); 
                
                GPA(); 


                indiGPALabel.setVisible(true); 

            }
        });
        bminus.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                addGPA(3.00); 
                counter++; 

            
                setVisible(); 
                indiGPALabel.setText("Class GPA: 3.00"); 

                indiGPALabel.setFont(new Font("Onyx", Font.BOLD, 18));
                indiGPALabel.setForeground(new Color(191,255,0)); 

                GPA(); 

                indiGPALabel.setVisible(true); 
            }
        });
        cplus.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                addGPA(2.75); 
                counter++; 

                setVisible(); 
                indiGPALabel.setText("Class GPA: 2.75"); 

                indiGPALabel.setFont(new Font("Onyx", Font.BOLD, 18));
                indiGPALabel.setForeground(new Color(255,199,0));

                GPA(); 

                indiGPALabel.setVisible(true); 
            }
        });
        c.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                addGPA(2.50); 
                counter++; 

                setVisible(); 
                indiGPALabel.setText("Class GPA: 2.50"); 

                indiGPALabel.setFont(new Font("Onyx", Font.BOLD, 18));
                indiGPALabel.setForeground(new Color(255,199,0));

                GPA(); 

                indiGPALabel.setVisible(true); 
            }
        });
        cminus.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                addGPA(2.25); 
                counter++; 

                setVisible(); 
                indiGPALabel.setText("Class GPA: 2.25"); 

                indiGPALabel.setFont(new Font("Onyx", Font.BOLD, 18));
                indiGPALabel.setForeground(new Color(255,199,0));

                GPA(); 

                indiGPALabel.setVisible(true); 
            }
        });
        f.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                addGPA(0.00); 
                counter++; 

                setVisible(); 
                indiGPALabel.setText("Class GPA: 0.00"); 

                indiGPALabel.setFont(new Font("Onyx", Font.BOLD, 18));
                indiGPALabel.setForeground(new Color(255,57,37)); 


                GPA(); 

                indiGPALabel.setVisible(true); 
            }
        });
    }



    public void addGPA(double gpa)
    {
        totalGPA += gpa; 
    }
    public static double getTotalGPA(){
        return totalGPA; 
    }
    public static double getGPA(){
        return getTotalGPA() / 7;
    }

    public void GPA()
    {
        if(counter == 7)
        {
            totalGPALabel.setFont(new Font("Onyx", Font.BOLD, 18));
            String temp = "Final GPA: ";
    
            double gpa = getGPA(); 
            double roundedGPA = Math.round(gpa*10000) / 10000.0; 
    
            temp += String.valueOf(roundedGPA); 
            totalGPALabel.setText(temp);
            add(totalGPALabel);     
        }
        
        
    }
    

    public void setVisible()
    {
        aplus.setVisible(false); 
        a.setVisible(false); 
        aminus.setVisible(false); 
        bplus.setVisible(false); 
        b.setVisible(false); 
        bminus.setVisible(false); 
        cplus.setVisible(false);
        c.setVisible(false); 
        cminus.setVisible(false); 
        f.setVisible(false); 
    }
}