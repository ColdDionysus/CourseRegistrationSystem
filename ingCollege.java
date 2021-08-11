import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.*;

import javax.swing.border.*;

public class ingCollege{
    //Component of home 
    JLabel welcomeText;
    JLabel poweredby;
    
    //Component of academic Course
    JLabel academicCourse;
    JLabel courseId;
    JLabel Duration;
    JLabel courseName;
    JLabel level;
    JLabel credit;
    JLabel numberOfAssessments;
    JLabel lecturerName;
    JLabel startingDate;
    JLabel completionDate;
    
    
    JTextField id;
    JTextField lecturer;
    JTextField dur;
    JTextField cName;
    JTextField lev;
    JTextField cred;
    JTextField noc;
    JTextField starting;
    JTextField completion;
    
    JButton Add;
    JButton Register;
    JButton NonAcademic;
    JButton register;
    JButton display;
    JButton clear;
    //Components of academicCourse class ends here
    //Components of nonacademic course class starts her
    
    JLabel nonAcademicCourse;
    JLabel courseId1;
    JLabel Duration1;
    JLabel courseName1;
    JLabel level1;
    JLabel credit1;
    JLabel numberOfAssessments1;
    JLabel lecturerName1;
    JLabel startingDate1;
    JLabel completionDate1;
    
    
    JTextField id1;
    JTextField lecturer1;
    JTextField dur1;
    JTextField cName1;
    JTextField lev1;
    JTextField cred1;
    JTextField noc1;
    JTextField starting1;
    JTextField completion1;
    
    JButton Add1;
    JButton register1;
    JButton display1;
    JButton clear1;

    public ingCollege(){
        ArrayList<AcademicCourse> ac = new ArrayList<AcademicCourse>();
        ArrayList<NonAcademicCourse> nac = new ArrayList<NonAcademicCourse>();
        JFrame mainFrame = new JFrame("Course Registration");
        Image icon = Toolkit.getDefaultToolkit().getImage("./ing.png"); 
            mainFrame.setIconImage(icon);
        
            
       
        
        
        JPanel fixPanel = new JPanel();
            fixPanel.setBounds(0,0,350,900);
            fixPanel.setBackground(new Color(240,255,240));
            fixPanel.setLayout(null);
            
        JPanel homepanel = new JPanel();
            homepanel.setBounds(352,2,630,757);
            homepanel.setBackground(new Color(20,33,61));
            homepanel.setLayout(null);
            homepanel.setVisible(true);
            mainFrame.add(homepanel);
        
        
        JPanel academicPanel = new JPanel();
            academicPanel.setBounds(352,2,630,757);
            academicPanel.setBackground(new Color(20, 33, 61));
            academicPanel.setLayout(null);
            academicPanel.setVisible(false);
            mainFrame.add(academicPanel);
            
        JPanel nonAcademicPanel = new JPanel();
            nonAcademicPanel.setBounds(352,2,630,757);
            nonAcademicPanel.setBackground(new Color(20, 33, 61));
            nonAcademicPanel.setLayout(null);
            nonAcademicPanel.setVisible(false);
            mainFrame.add(nonAcademicPanel);
            
        try
        {
            BufferedImage logo = ImageIO.read(new File("./ing.png"));
            JLabel logoLabel = new JLabel(new ImageIcon(logo));
                logoLabel.setBounds(40,15,200,150);
                fixPanel.add(logoLabel);
        }
        catch (java.io.IOException ioe)
        {
            ioe.printStackTrace();
        }
        
        try
        {
            BufferedImage homeLogo = ImageIO.read(new File("./logo.png"));
            JLabel homeLogoLabel = new JLabel(new ImageIcon(homeLogo));
                homeLogoLabel.setBounds(150,200,300,200);
                homepanel.add(homeLogoLabel);
        }
        catch (java.io.IOException ioe)
        {
            ioe.printStackTrace();
        }
        
        Font f = new Font("Algerian", Font.BOLD, 18);  
        Font f1 = new Font("Algerian", Font.BOLD, 24);
        JLabel ing = new JLabel("ING Course Registration System");
            fixPanel.add(ing);
            ing.setBounds(7,150,350,50);
            
            ing.setFont(f);
        
            ing.setForeground(Color.BLACK);
            
            
        poweredby = new JLabel("Powered By: Pukar Gautam");
            poweredby.setBounds(75, 700, 350, 50);
            poweredby.setForeground(Color.BLACK);
            fixPanel.add(poweredby);
            
            
            
        welcomeText = new JLabel("Welcome to Course Registration System");  
            welcomeText.setBackground(Color.WHITE);
            welcomeText.setBounds(45,450,600,50);
            welcomeText.setForeground(Color.WHITE);
            welcomeText.setFont(f1);
            homepanel.add(welcomeText);
        
        
        JButton home = new JButton("Home");
            home.setFont(f);
            home.setBounds(0, 250, 350, 50);
            home.setForeground(Color.WHITE);
            home.setBackground(new Color(50,205,50));
            home.setFocusable(false);
            
            fixPanel.add(home);
            
            
        Border emptyBorder = BorderFactory.createEmptyBorder();
            home.setBorder(emptyBorder);
        
        JButton academicBtn = new JButton("Academic Course");
            academicBtn.setFont(f);
            academicBtn.setBounds(0, 350, 350, 50);
            academicBtn.setForeground(Color.WHITE);
            academicBtn.setBackground(new Color(20, 33, 61));
            academicBtn.setBorder(emptyBorder);
            academicBtn.setFocusable(false);
            fixPanel.add(academicBtn);
            
            
        JButton nonAcademicBtn = new JButton("Non Academic Course");
            nonAcademicBtn.setFont(f);
            nonAcademicBtn.setBounds(0, 450, 350, 50);
            nonAcademicBtn.setForeground(Color.WHITE);
            nonAcademicBtn.setBackground(new Color(20, 33, 61));
            nonAcademicBtn.setBorder(emptyBorder);
            nonAcademicBtn.setFocusable(false);
            fixPanel.add(nonAcademicBtn);    
        
        
            academicBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                home.setBackground(new Color(20, 33, 61));
                academicBtn.setBackground(new Color(50,205,50));
                academicBtn.setForeground(Color.WHITE);
                nonAcademicBtn.setBackground(new Color(20, 33, 61));
                nonAcademicBtn.setForeground(Color.WHITE);
                home.setForeground(Color.WHITE);
                homepanel.setVisible(false);
                academicPanel.setVisible(true);
                nonAcademicPanel.setVisible(false);
            
            }
            
            
            
            });
            
            home.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                    home.setBackground(new Color(50,205,50));
                    academicBtn.setBackground(new Color(20, 33, 61));
                    academicBtn.setForeground(Color.WHITE);
                    home.setForeground(Color.WHITE);
                    nonAcademicBtn.setBackground(new Color(20, 33, 61));
                    nonAcademicBtn.setForeground(Color.WHITE);
                    homepanel.setVisible(true);
                    academicPanel.setVisible(false);
                    nonAcademicPanel.setVisible(false);
            
                }});
        
            
        nonAcademicBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            
                homepanel.setVisible(false);
                academicPanel.setVisible(false);
                nonAcademicPanel.setVisible(true);
                home.setBackground(new Color(20, 33, 61));
                home.setForeground(Color.WHITE);
                
                nonAcademicBtn.setBackground(new Color(50,205,50));
                nonAcademicBtn.setForeground(Color.WHITE);
                academicBtn.setBackground(new Color(20, 33, 61));
                academicBtn.setForeground(Color.WHITE);
                
            
            
            }
        
        
        
        });    
            
        JButton exit = new JButton("Exit");
            exit.setFont(f);
            exit.setBounds(0, 550, 350, 50);
            exit.setForeground(Color.WHITE);
            exit.setBackground(new Color(20, 33, 61));
            exit.setBorder(emptyBorder);
            exit.setFocusable(false);
            fixPanel.add(exit);
            exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            
                mainFrame.dispose();
            
            }});
        //Aademic Course Starts Here
            
        academicCourse = new JLabel("Academic Course");
            academicCourse.setBounds(200, 0, 300, 100);
            academicCourse.setFont(new Font("ALGERIAN", Font.BOLD, 28));
            academicCourse.setForeground(Color.WHITE);
            academicPanel.add(academicCourse);
        
        courseId = new JLabel("Course Id: ");
            courseId.setFont(new Font("Arial", Font.PLAIN, 20));
            courseId.setForeground(Color.WHITE);
            academicPanel.add(courseId);
            courseId.setBounds(15, 100, 125, 100);
            
        Duration = new JLabel("Duration: ");
            Duration.setFont(new Font("Arial", Font.PLAIN, 20));
            Duration.setForeground(Color.WHITE);
            academicPanel.add(Duration);
            Duration.setBounds(15, 200, 125, 100);
            
        courseName = new JLabel("Course Name: ");
            courseName.setForeground(Color.WHITE);
            courseName.setFont(new Font("Arial", Font.PLAIN, 20));
            academicPanel.add(courseName);
            courseName.setBounds(350, 100, 160, 100);
            
        level = new JLabel("Level: ");
            level.setForeground(Color.WHITE);
            level.setFont(new Font("Arial", Font.PLAIN, 20));
            level.setBounds(350,200, 125, 100);
            academicPanel.add(level);
            
        credit = new JLabel("Credit: ");
            credit.setForeground(Color.WHITE);
            credit.setFont(new Font("Arial", Font.PLAIN, 20));
            credit.setBounds(15, 300, 125, 100);
            academicPanel.add(credit);
            
        numberOfAssessments = new JLabel("Number of Assessments: ");
            numberOfAssessments.setFont(new Font("Arial", Font.PLAIN, 20));
            numberOfAssessments.setForeground(Color.WHITE);
            numberOfAssessments.setBounds(260, 300, 300, 100);
            academicPanel.add(numberOfAssessments); 
            
            
        lecturerName = new JLabel("Lecturer Name: ");
            lecturerName.setForeground(Color.WHITE);
            lecturerName.setFont(new Font("Arial", Font.PLAIN, 20));
            lecturerName.setBounds(15, 400, 150, 100);
            academicPanel.add(lecturerName);
        
       startingDate = new JLabel("Starting Date: ");
            startingDate.setForeground(Color.WHITE);
            startingDate.setFont(new Font("Arial", Font.PLAIN, 20));
            startingDate.setBounds(350, 400, 150, 100);
            academicPanel.add(startingDate);
       completionDate = new JLabel("Completion Date: ");
            completionDate.setForeground(Color.WHITE);
            completionDate.setFont(new Font("Arial", Font.PLAIN, 20));
            completionDate.setBounds(15, 500, 180, 100);
            academicPanel.add(completionDate);
            
        id = new JTextField();
            academicPanel.add(id);
            id.setBounds(125, 135, 125, 25);
            
        dur = new JTextField();
            dur.setBounds(120, 235, 125, 25);
            academicPanel.add(dur);
            
        cName = new JTextField();
            academicPanel.add(cName);
            cName.setBounds(500, 135, 125, 25);
            
        lev = new JTextField();
            lev.setBounds(425, 235, 125, 25);
            academicPanel.add(lev);
            
        cred = new JTextField();

            academicPanel.add(cred);
            cred.setBounds(100, 335, 125, 25);
            
        noc = new JTextField();
            academicPanel.add(noc);
            noc.setBounds(500, 335, 125, 25);
            
          
        Add = new JButton("Add");
            Add.setFont(new Font("Castellar", Font.BOLD, 20));
            Add.setBounds(400, 530, 175,40);
            Add.setBorder(emptyBorder);
            Add.setForeground(Color.BLACK);
            Add.setBackground(new Color(240,255,240));
            Add.setFocusable(false);
            
            academicPanel.add(Add);
        
       
       lecturer = new JTextField();
            academicPanel.add(lecturer);
            lecturer.setBounds(165, 435, 125, 25);
            
            
       starting = new JTextField();
           academicPanel.add(starting);
            starting.setBounds(500, 435, 125, 25);
            
            
       completion = new JTextField();
           academicPanel.add(completion);
           completion.setBounds(175, 535, 125, 25);
            
        register = new JButton("Register");
            register.setFont(new Font("Castellar", Font.BOLD, 20));
            register.setBounds(15, 650, 175, 40);
            register.setBorder(emptyBorder);
            register.setForeground(Color.BLACK);
            register.setBackground(new Color(240,255,240));
            register.setFocusable(false);
            
            academicPanel.add(register);    
            
            
            
       clear = new JButton("Clear");
            clear.setFont(new Font("Castellar", Font.BOLD, 20));
            clear.setBounds(210, 650, 175, 40);
            clear.setBorder(emptyBorder);
            clear.setForeground(Color.BLACK);
            clear.setBackground(new Color(240,255,240));
            clear.setFocusable(false);
            
            academicPanel.add(clear);
            clear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                id.setText("");
                cName.setText("");
                dur.setText("");
                lev.setText("");
                cred.setText("");
                noc.setText("");
                lecturer.setText("");
                starting.setText("");
                completion.setText("");
            
            
            }});
            
            
       display = new JButton("Display");
            display.setFont(new Font("Castellar", Font.BOLD, 20));
            display.setBounds(410, 650, 175, 40);
            display.setBorder(emptyBorder);
            display.setForeground(Color.BLACK);
            display.setBackground(new Color(240,255,240));
            display.setFocusable(false);
            
            academicPanel.add(display); 
            
            
            
        
        //nonAcademicPanel handling starts here:::
        
        
        nonAcademicCourse = new JLabel("Non Academic Course");
            nonAcademicCourse.setBounds(175, 0, 350, 100);
            nonAcademicCourse.setFont(new Font("ALGERIAN", Font.BOLD, 28));
            nonAcademicCourse.setForeground(Color.WHITE);
            nonAcademicPanel.add(nonAcademicCourse);
        
        courseId1 = new JLabel("Course Id: ");
            courseId1.setFont(new Font("Arial", Font.PLAIN, 20));
            courseId1.setForeground(Color.WHITE);
            nonAcademicPanel.add(courseId1);
            courseId1.setBounds(15, 100, 125, 100);
            
        Duration1 = new JLabel("Duration: ");
            Duration1.setFont(new Font("Arial", Font.PLAIN, 20));
            Duration1.setForeground(Color.WHITE);
            nonAcademicPanel.add(Duration1);
            Duration1.setBounds(15, 200, 125, 100);
            
        courseName1 = new JLabel("Course Name: ");
            courseName1.setForeground(Color.WHITE);
            courseName1.setFont(new Font("Arial", Font.PLAIN, 20));
            nonAcademicPanel.add(courseName1);
            courseName1.setBounds(350, 100, 160, 100);
            
        level1 = new JLabel("Level: ");
            level1.setForeground(Color.WHITE);
            level1.setFont(new Font("Arial", Font.PLAIN, 20));
            level1.setBounds(350,200, 125, 100);
            nonAcademicPanel.add(level1);
            
        credit1 = new JLabel("Credit: ");
            credit1.setForeground(Color.WHITE);
            credit1.setFont(new Font("Arial", Font.PLAIN, 20));
            credit1.setBounds(15, 300, 125, 100);
            nonAcademicPanel.add(credit1);
            
        numberOfAssessments1 = new JLabel("Number of Assessments: ");
            numberOfAssessments1.setFont(new Font("Arial", Font.PLAIN, 20));
            numberOfAssessments1.setForeground(Color.WHITE);
            numberOfAssessments1.setBounds(260, 300, 300, 100);
            nonAcademicPanel.add(numberOfAssessments1); 
            
            
        lecturerName1 = new JLabel("Lecturer Name: ");
            lecturerName1.setForeground(Color.WHITE);
            lecturerName1.setFont(new Font("Arial", Font.PLAIN, 20));
            lecturerName1.setBounds(15, 400, 150, 100);
            nonAcademicPanel.add(lecturerName1);
        
       startingDate1 = new JLabel("Starting Date: ");
            startingDate1.setForeground(Color.WHITE);
            startingDate1.setFont(new Font("Arial", Font.PLAIN, 20));
            startingDate1.setBounds(350, 400, 150, 100);
            nonAcademicPanel.add(startingDate1);
       completionDate1 = new JLabel("Completion Date: ");
            completionDate1.setForeground(Color.WHITE);
            completionDate1.setFont(new Font("Arial", Font.PLAIN, 20));
            completionDate1.setBounds(15, 500, 180, 100);
            nonAcademicPanel.add(completionDate1);
            
        id1 = new JTextField();
            nonAcademicPanel.add(id1);
            id1.setBounds(125, 135, 125, 25);
            
        dur1 = new JTextField();
            dur1.setBounds(120, 235, 125, 25);
            nonAcademicPanel.add(dur1);
            
        cName1 = new JTextField();
            nonAcademicPanel.add(cName1);
            cName1.setBounds(500, 135, 125, 25);
            
        lev1 = new JTextField();
            lev1.setBounds(425, 235, 125, 25);
            nonAcademicPanel.add(lev1);
            
        cred1 = new JTextField();

            nonAcademicPanel.add(cred1);
            cred1.setBounds(100, 335, 125, 25);
            
        noc1 = new JTextField();
            nonAcademicPanel.add(noc1);
            noc1.setBounds(500, 335, 125, 25);
            
          
        Add1 = new JButton("Add");
            Add1.setFont(new Font("Castellar", Font.BOLD, 20));
            Add1.setBounds(400, 530, 175,40);
            Add1.setBorder(emptyBorder);
            Add1.setForeground(Color.BLACK);
            Add1.setBackground(new Color(240,255,240));
            Add1.setFocusable(false);
            
            nonAcademicPanel.add(Add1);
            Add1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            if (id1.getText().equals("") || cName1.getText().equals("") || dur1.getText().equals("") || lev1.getText().equals("") || cred1.getText().equals("") || noc1.getText().equals("")){
            
                JOptionPane.showMessageDialog(mainFrame,"Please enter in all fields.");              
            
            
            }
            else{
            
                JOptionPane.showMessageDialog(mainFrame, "All fields are filled properly.");
            }
            
            
            
            
            }
            
            
            });
       
       lecturer1 = new JTextField();
            nonAcademicPanel.add(lecturer1);
            lecturer1.setBounds(165, 435, 125, 25);
            
            
       starting1 = new JTextField();
           nonAcademicPanel.add(starting1);
            starting1.setBounds(500, 435, 125, 25);
            
            
       completion1 = new JTextField();
           nonAcademicPanel.add(completion1);
           completion1.setBounds(175, 535, 125, 25);
            
        register1 = new JButton("Register");
            register1.setFont(new Font("Castellar", Font.BOLD, 20));
            register1.setBounds(15, 650, 175, 40);
            register1.setBorder(emptyBorder);
            register1.setForeground(Color.BLACK);
            register1.setBackground(new Color(240,255,240));
            register1.setFocusable(false);
            
            nonAcademicPanel.add(register1);    
            
            
            
       clear1 = new JButton("Clear");
            clear1.setFont(new Font("Castellar", Font.BOLD, 20));
            clear1.setBounds(210, 650, 175, 40);
            clear1.setBorder(emptyBorder);
            clear1.setForeground(Color.BLACK);
            clear1.setBackground(new Color(240,255,240));
            clear1.setFocusable(false);
            
            nonAcademicPanel.add(clear1);  
            clear1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                id1.setText("");
                cName1.setText("");
                dur1.setText("");
                lev1.setText("");
                cred1.setText("");
                noc1.setText("");
                lecturer1.setText("");
                starting1.setText("");
                completion1.setText("");
            
            
            }
            
            
            
            
            });
        

            
            
       display1 = new JButton("Display");
            display1.setFont(new Font("Castellar", Font.BOLD, 20));
            display1.setBounds(410, 650, 175, 40);
            display1.setBorder(emptyBorder);
            display1.setForeground(Color.BLACK);
            display1.setBackground(new Color(240,255,240));
            display1.setFocusable(false);
            
            nonAcademicPanel.add(display1); 
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        
        
        
        
        
        //Frame adjustment are here
        mainFrame.add(fixPanel);
        
        mainFrame.setBounds(25,25,1000,800);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        mainFrame.setLayout(null);
        mainFrame.getContentPane().setBackground(new Color(0,20,40));
        mainFrame.setVisible(true);
        
    }
    

    public static void main(String[] args){
    
    
        new ingCollege();
    
    }




}