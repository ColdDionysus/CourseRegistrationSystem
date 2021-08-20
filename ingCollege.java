import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.*;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javax.swing.border.*;

public class INGCollege {
    ArrayList<Course> academicCourseList = new ArrayList<Course>();
    ArrayList<Course> nonAcademicCourseList = new ArrayList<Course>();
    // Component of home
    private JLabel welcomeText;
    private JLabel poweredby;

    // Component of academic Course
    private JLabel academicCourse;
    // for adding starts here
    private JLabel courseId;
    private JLabel Duration;
    private JLabel courseName;
    private JLabel level;
    private JLabel credit;
    private JLabel numberOfAssessments;
    // for adding stops here
    private JLabel courseLeader;
    private JLabel lecturerName;
    private JLabel startingDate;
    private JLabel completionDate;
    // text field of academic class starts here
    private JTextField id;
    private JTextField lecturer;
    private JTextField dur;
    private JTextField cName;
    private JTextField lev;
    private JTextField cred;

    private JTextField noc;
    private JTextField starting;
    private JTextField completion;
    private JTextField courseTxt;
    // buttons of academic course class starts here
    private JButton Add;
    private JButton Register;
    private JButton NonAcademic;
    private JButton register;
    private JButton display;
    private  JButton clear;
    // Components of academicCourse class ends here
    // Components of nonacademic course class starts her

    private JLabel nonAcademicCourse;
    // add buttton
    private JLabel courseId1;
    private JLabel Duration1;
    private JLabel courseName1;
    private JLabel preRequisite;

    // regiter button
    private JLabel instructorName1;
    private JLabel startingDate1;
    private JLabel courseLeader1;
    private JLabel completionDate1;
    private JLabel examDate;

    private JTextField id1;
    private JTextField instructor1;
    private JTextField dur1;
    private JTextField cName1;
    private JTextField exam1;
    private JTextField courseTxt1;
    private JTextField pre;
    private JTextField starting1;
    private JTextField completion1;

    private JButton Add1;
    private JButton register1;
    private JButton display1;
    private JButton clear1;

    public INGCollege() {
        

        JFrame mainFrame = new JFrame("Course Registration");
        Image icon = Toolkit.getDefaultToolkit().getImage("./ing.png");
        mainFrame.setIconImage(icon);

        JPanel fixPanel = new JPanel();
        fixPanel.setBounds(0, 0, 350, 900);
        fixPanel.setBackground(new Color(240, 255, 240));
        fixPanel.setLayout(null);

        JPanel homepanel = new JPanel();
        homepanel.setBounds(352, 2, 1050, 857);
        homepanel.setBackground(new Color(20, 33, 61));
        homepanel.setLayout(null);
        homepanel.setVisible(true);
        mainFrame.add(homepanel);

        JPanel academicPanel = new JPanel();
        academicPanel.setBounds(352, 2, 1050, 857);
        academicPanel.setBackground(new Color(20, 33, 61));
        academicPanel.setLayout(null);
        academicPanel.setVisible(false);
        mainFrame.add(academicPanel);

        JPanel nonAcademicPanel = new JPanel();
        nonAcademicPanel.setBounds(352, 2, 1050, 857);
        nonAcademicPanel.setBackground(new Color(20, 33, 61));
        nonAcademicPanel.setLayout(null);
        nonAcademicPanel.setVisible(false);
        mainFrame.add(nonAcademicPanel);

        try {
            BufferedImage logo = ImageIO.read(new File("./ing.png"));
            JLabel logoLabel = new JLabel(new ImageIcon(logo));
            logoLabel.setBounds(40, 15, 200, 150);
            fixPanel.add(logoLabel);
        } catch (Exception ioe) {
            ioe.printStackTrace();
        }

        try {
            BufferedImage homeLogo = ImageIO.read(new File("./logo.png"));
            JLabel homeLogoLabel = new JLabel(new ImageIcon(homeLogo));
            homeLogoLabel.setBounds(250, 200, 300, 200);
            homepanel.add(homeLogoLabel);
        } catch (Exception ioe) {
            ioe.printStackTrace();
        }

        Font f = new Font("Algerian", Font.BOLD, 18);
        Font f1 = new Font("Algerian", Font.BOLD, 24);
        JLabel ing = new JLabel("ING Course Registration System");
        fixPanel.add(ing);
        ing.setBounds(7, 150, 350, 50);

        ing.setFont(f);

        ing.setForeground(Color.BLACK);

        poweredby = new JLabel("Powered By: Pukar Gautam");
        poweredby.setBounds(75, 700, 350, 50);
        poweredby.setForeground(Color.BLACK);
        fixPanel.add(poweredby);

        welcomeText = new JLabel("Welcome to Course Registration System");
        welcomeText.setBackground(Color.WHITE);
        welcomeText.setBounds(155, 450, 600, 50);
        welcomeText.setForeground(Color.WHITE);
        welcomeText.setFont(f1);
        homepanel.add(welcomeText);

        JButton home = new JButton("Home");
        home.setFont(f);
        home.setBounds(0, 250, 350, 50);
        home.setForeground(Color.WHITE);
        home.setBackground(new Color(50, 205, 50));
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

        academicBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    home.setBackground(new Color(20, 33, 61));
                    academicBtn.setBackground(new Color(50, 205, 50));
                    academicBtn.setForeground(Color.WHITE);
                    nonAcademicBtn.setBackground(new Color(20, 33, 61));
                    nonAcademicBtn.setForeground(Color.WHITE);
                    home.setForeground(Color.WHITE);
                    homepanel.setVisible(false);
                    academicPanel.setVisible(true);
                    nonAcademicPanel.setVisible(false);

                }

            });

        home.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    home.setBackground(new Color(50, 205, 50));
                    academicBtn.setBackground(new Color(20, 33, 61));
                    academicBtn.setForeground(Color.WHITE);
                    home.setForeground(Color.WHITE);
                    nonAcademicBtn.setBackground(new Color(20, 33, 61));
                    nonAcademicBtn.setForeground(Color.WHITE);
                    homepanel.setVisible(true);
                    academicPanel.setVisible(false);
                    nonAcademicPanel.setVisible(false);

                }
            });

        nonAcademicBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    homepanel.setVisible(false);
                    academicPanel.setVisible(false);
                    nonAcademicPanel.setVisible(true);
                    home.setBackground(new Color(20, 33, 61));
                    home.setForeground(Color.WHITE);

                    nonAcademicBtn.setBackground(new Color(50, 205, 50));
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
        exit.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    mainFrame.dispose();

                }
            });
        // Aademic Course Starts Here

        academicCourse = new JLabel("Academic Course");
        academicCourse.setBounds(400, 0, 300, 100);
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
        Duration.setBounds(715, 100, 125, 100);

        courseName = new JLabel("Course Name: ");
        courseName.setForeground(Color.WHITE);
        courseName.setFont(new Font("Arial", Font.PLAIN, 20));
        academicPanel.add(courseName);
        courseName.setBounds(350, 100, 160, 100);

        level = new JLabel("Level: ");
        level.setForeground(Color.WHITE);
        level.setFont(new Font("Arial", Font.PLAIN, 20));
        level.setBounds(15, 200, 125, 100);
        academicPanel.add(level);

        credit = new JLabel("Credit: ");
        credit.setForeground(Color.WHITE);
        credit.setFont(new Font("Arial", Font.PLAIN, 20));
        credit.setBounds(350, 200, 125, 100);
        academicPanel.add(credit);

        numberOfAssessments = new JLabel("Number of Assessments: ");
        numberOfAssessments.setFont(new Font("Arial", Font.PLAIN, 20));
        numberOfAssessments.setForeground(Color.WHITE);
        numberOfAssessments.setBounds(15, 300, 300, 100);
        academicPanel.add(numberOfAssessments);

        lecturerName = new JLabel("Lecturer Name: ");
        lecturerName.setForeground(Color.WHITE);
        lecturerName.setFont(new Font("Arial", Font.PLAIN, 20));
        lecturerName.setBounds(15, 400, 150, 100);
        academicPanel.add(lecturerName);

        startingDate = new JLabel("Starting Date: ");
        startingDate.setForeground(Color.WHITE);
        startingDate.setFont(new Font("Arial", Font.PLAIN, 20));
        startingDate.setBounds(715, 400, 150, 100);
        academicPanel.add(startingDate);

        completionDate = new JLabel("Completion Date: ");
        completionDate.setForeground(Color.WHITE);
        completionDate.setFont(new Font("Arial", Font.PLAIN, 20));
        completionDate.setBounds(15, 500, 180, 100);
        academicPanel.add(completionDate);

        courseLeader = new JLabel("Course Leader:");
        courseLeader.setForeground(Color.WHITE);
        courseLeader.setFont(new Font("Arial", Font.PLAIN, 20));
        courseLeader.setBounds(715,500,150,100);
        academicPanel.add(courseLeader);

        id = new JTextField();
        academicPanel.add(id);
        id.setBounds(125, 135, 125, 25);

        dur = new JTextField();
        dur.setBounds(850, 135, 125, 25);
        academicPanel.add(dur);

        cName = new JTextField();
        academicPanel.add(cName);
        cName.setBounds(500, 135, 125, 25);

        lev = new JTextField();
        lev.setBounds(125, 235, 125, 25);
        academicPanel.add(lev);

        cred = new JTextField();

        academicPanel.add(cred);
        cred.setBounds(500, 235, 125, 25);

        noc = new JTextField();
        academicPanel.add(noc);
        noc.setBounds(250, 335, 125, 25);

        Add = new JButton("Add");
        Add.setFont(new Font("Castellar", Font.BOLD, 20));
        Add.setBounds(675, 325, 275, 40);
        Add.setBorder(emptyBorder);
        Add.setForeground(Color.BLACK);
        Add.setBackground(new Color(240, 255, 240));
        Add.setFocusable(false);
        Add.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    if (id.getText().equals("") || cName.getText().equals("") || dur.getText().equals("") || lev.getText().equals("") || cred.getText().equals("") || noc.getText().equals("")){
                        JOptionPane.showMessageDialog(mainFrame, "Please fill all the fields.");

                    }
                    else{
                        int duration_int = 0;
                        int numberOfAssessments_int = 0;

                        String cId = id.getText();
                        String courseName_str = cName.getText();
                        try{
                            duration_int = Integer.parseInt(dur.getText());
                        }
                        catch(Exception ae){
                            JOptionPane.showMessageDialog(mainFrame, "Invalid Input");
                            return;
                        }

                        try{
                            numberOfAssessments_int = Integer.parseInt(noc.getText());
                        }
                        catch(Exception ae){
                            JOptionPane.showMessageDialog(mainFrame, "Invalid Input");
                            return;
                        }

                        String level_str = lev.getText();
                        String credit_str = cred.getText();

                        for(int i=0; i<academicCourseList.size(); i++){
                            if(academicCourseList.get(i).getCourseId().equals(cId)){
                                JOptionPane.showMessageDialog(mainFrame, "Id" +cId + "has been already added Please enter again");
                                return;
                            }

                        }

                        AcademicCourse obj = new AcademicCourse(cId, courseName_str, duration_int, level_str, credit_str, numberOfAssessments_int);
                        academicCourseList.add(obj);
                        JOptionPane.showMessageDialog(mainFrame, "Course Id has been added successfully");

                    }
                }
            });
        academicPanel.add(Add);

        lecturer = new JTextField();
        academicPanel.add(lecturer);
        lecturer.setBounds(165, 435, 125, 25);

        starting = new JTextField();
        academicPanel.add(starting);
        starting.setBounds(850, 435, 125, 25);

        completion = new JTextField();
        academicPanel.add(completion);
        completion.setBounds(175, 535, 125, 25);

        courseTxt = new JTextField();
        academicPanel.add(courseTxt);
        courseTxt.setBounds(850,535,125,25);

        register = new JButton("Register");
        register.setFont(new Font("Castellar", Font.BOLD, 20));
        register.setBounds(15, 650, 275, 40);
        register.setBorder(emptyBorder);
        register.setForeground(Color.BLACK);
        register.setBackground(new Color(240, 255, 240));
        register.setFocusable(false);

        academicPanel.add(register);
        register.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    if(lecturer.getText().equals("") || starting.getText().equals("") || completion.getText().equals("") || courseTxt.getText().equals("")){

                        JOptionPane.showMessageDialog(mainFrame, "Please enter in all fields to continue!");

                    }
                    String starting_str = starting.getText();
                    String completion_str = completion.getText();
                    String courseLeader_str = courseTxt.getText();
                    String lecturer_str = lecturer.getText();
                    for(int i =0; i<academicCourseList.size();i++){

                        if((academicCourseList.get(i).getCourseId()).equals(id.getText())){

                            AcademicCourse ac = (AcademicCourse)(academicCourseList.get(i));
                            if(!ac.getIsRegistered()){

                                ac.register(courseLeader_str, lecturer_str, starting_str, completion_str);
                                JOptionPane.showMessageDialog(mainFrame, "Course has been successfully registered");

                                return;
                            }else{
                                JOptionPane.showMessageDialog(mainFrame, "This course is already registered");
                                return;
                            }

                        }
                    }

                }
            });

        clear = new JButton("Clear");
        clear.setFont(new Font("Castellar", Font.BOLD, 20));
        clear.setBounds(400, 650, 275, 40);
        clear.setBorder(emptyBorder);
        clear.setForeground(Color.BLACK);
        clear.setBackground(new Color(240, 255, 240));
        clear.setFocusable(false);

        academicPanel.add(clear);
        clear.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    lecturer.setText("");
                    id.setText("");
                    cName.setText("");
                    dur.setText("");
                    cName.setText("");
                    lev.setText("");
                    cred.setText("");
                    noc.setText("");
                    starting.setText("");
                    completion.setText("");
                    courseTxt.setText("");

                }
            });

        display = new JButton("Display");
        display.setFont(new Font("Castellar", Font.BOLD, 20));
        display.setBounds(750, 650, 275, 40);
        display.setBorder(emptyBorder);
        display.setForeground(Color.BLACK);
        display.setBackground(new Color(240, 255, 240));
        display.setFocusable(false);

        academicPanel.add(display);
        display.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    mainFrame.dispose();
                    JFrame frame = new JFrame("Display");
                    JScrollPane jsp = new JScrollPane();
                    jsp.setBounds(0,0,1400,100);
                    frame.add(jsp);

                    JTable table = new JTable();
                    table.setModel(new DefaultTableModel(new Object[][] {}, new String[]{"Course Id", "CourseName","Duration","Level", "Credit", "Number Of Assessments", "Course Leader", "Starting Date", "Completion Date", "Lecturer Name"}));
                    
                    jsp.setViewportView(table);

                    DefaultTableModel table_mod = (DefaultTableModel)table.getModel();

                    for(int i=0; i<academicCourseList.size(); i++){
                        AcademicCourse ac1 = (AcademicCourse)(academicCourseList.get(i));
                        String cId_str1 = ac1.getCourseId();
                        String courseName_str1 = ac1.getCourseName();
                        int dur_int1 = ac1.getDuration();
                        String lev_str = ac1.getLevel();
                        String cred_str = ac1.getCredit();
                        int noc_int = ac1.getNumberOfAssessments();
                        String courseTxt_str = ac1.getCourseLeader();
                        String starting_str = ac1.getStartingDate();
                        String completion_str = ac1.getCompletionDate();
                        String lecturer_str = ac1.getLecturerName();
                        

                        Object table_row[] = {cId_str1, courseName_str1, dur_int1, lev_str, cred_str, noc_int, courseTxt_str, starting_str, completion_str, lecturer_str};
                        table_mod.addRow(table_row);

                         
                    }
                    
                    frame.setResizable(false);
                    frame.setBounds(250,250,1400,300);
                    frame.getContentPane().setBackground(Color.WHITE);
                    frame.setLayout(null);
                    frame.setVisible(true);

                }
            });
        // nonAcademicPanel handling starts here:::
        nonAcademicCourse = new JLabel("Non Academic Course");
        nonAcademicCourse.setBounds(400, 0, 350, 100);
        nonAcademicCourse.setFont(new Font("ALGERIAN", Font.BOLD, 28));
        nonAcademicCourse.setForeground(Color.WHITE);
        nonAcademicPanel.add(nonAcademicCourse);

        courseId1 = new JLabel("Course Id: ");
        courseId1.setFont(new 
            Font("Arial", Font.PLAIN, 20));
        courseId1.setForeground(Color.WHITE);
        nonAcademicPanel.add(courseId1);
        courseId1.setBounds(15, 100, 125, 100);

        Duration1 = new JLabel("Duration: ");
        Duration1.setFont(new 
            Font("Arial", Font.PLAIN, 20));
        Duration1.setForeground(Color.WHITE);
        nonAcademicPanel.add(Duration1);
        Duration1.setBounds(15,200,125,100);

        courseName1 = new JLabel("Course Name: ");
        courseName1.setForeground(Color.WHITE);
        courseName1.setFont(new Font("Arial", Font.PLAIN, 20));
        nonAcademicPanel.add(courseName1);
        courseName1.setBounds(715, 100, 150, 100);

        instructorName1 = new JLabel("Instructor Name: ");
        instructorName1.setForeground(Color.WHITE);
        instructorName1.setFont(new Font("Arial", Font.PLAIN, 20));
        instructorName1.setBounds(715, 500, 175, 100);
        nonAcademicPanel.add(instructorName1);

        courseLeader1 = new JLabel("Course Leader: ");
        courseLeader1.setForeground(Color.WHITE);
        courseLeader1.setFont(new Font("Arial", Font.PLAIN, 20));
        courseLeader1.setBounds(15, 400, 150, 100);
        nonAcademicPanel.add(courseLeader1);

        preRequisite = new JLabel("PreRequisite: ");
        preRequisite.setFont(new 
            Font("Arial", Font.PLAIN, 20));
        preRequisite.setForeground(Color.WHITE);

        preRequisite.setBounds(715, 200, 150, 100);
        nonAcademicPanel.add(preRequisite);

        examDate = new JLabel("Exam Date ");
        examDate.setForeground(Color.WHITE);
        examDate.setFont(new Font("Arial", Font.PLAIN, 20));
        examDate.setBounds(715, 400, 150, 100);
        nonAcademicPanel.add(examDate);

        startingDate1 = new JLabel("Starting Date: ");
        startingDate1.setForeground(Color.WHITE);
        startingDate1.setFont(new Font("Arial", Font.PLAIN, 20));
        startingDate1.setBounds(350, 500, 150, 100);
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
        cName1.setBounds(850, 135, 125, 25);

        courseTxt1 = new JTextField();
        courseTxt1.setBounds(155, 436, 125, 25);
        nonAcademicPanel.add(courseTxt1);

        instructor1 = new JTextField();
        nonAcademicPanel.add(instructor1);
        instructor1.setBounds(865, 535, 125, 25);

        pre = new JTextField();
        nonAcademicPanel.add(pre);
        pre.setBounds(850, 235, 125, 25);

        exam1 = new JTextField();
        exam1.setBounds(850, 435, 125, 25);
        nonAcademicPanel.add(exam1);

        completion1 = new JTextField();
        completion1.setBounds(170, 536, 125, 25);
        nonAcademicPanel.add(completion1);

        Add1 = new JButton("Add");
        Add1.setFont(new 
            Font("Castellar", Font.BOLD, 20));
        Add1.setBounds(375, 325, 275, 40);
        Add1.setBorder(emptyBorder);
        Add1.setForeground(Color.BLACK);
        Add1.setBackground(new Color(240, 255, 240));
        Add1.setFocusable(false);

        nonAcademicPanel.add(Add1);
        Add1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if(id1.getText().equals("") || cName1.getText().equals("") || dur1.getText().equals("") || pre.getText().equals("")){

                        JOptionPane.showMessageDialog(mainFrame, "Please fill all the field.");
                        return;

                    }
                    else{
                        int dur_int = 0;
                        try{

                            dur_int = Integer.parseInt(dur1.getText());
                        }
                        catch(Exception ae){
                            JOptionPane.showMessageDialog(mainFrame, "Invalid Input");
                            return;

                        }
                        String id1_str = id1.getText();
                        String cName_str = cName1.getText();
                        String pre_str = pre.getText();

                        for(int i = 0; i<nonAcademicCourseList.size(); i++){
                            if(nonAcademicCourseList.get(i).getCourseId().equals(id1_str)){

                                JOptionPane.showMessageDialog(mainFrame, "Course Id " +id1_str+ "has been already added");
                                return;

                            }
                        }
                        NonAcademicCourse nac = new NonAcademicCourse(id1_str, cName_str, dur_int, pre_str);
                        nonAcademicCourseList.add(nac);
                        JOptionPane.showMessageDialog(mainFrame, "Course Has been successfully added");

                    }
                }

            });

        starting1 = new JTextField();
        nonAcademicPanel.add(starting1);
        starting1.setBounds(500, 535, 125, 25);

        register1 = new JButton("Register");
        register1.setFont(new Font("Castellar", Font.BOLD, 20));
        register1.setBounds(15, 650, 275, 40);
        register1.setBorder(emptyBorder);
        register1.setForeground(Color.BLACK);
        register1.setBackground(new Color(240, 255, 240));
        register1.setFocusable(false);

        nonAcademicPanel.add(register1);
        register1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if(id1.getText().equals("") || courseTxt1.getText().equals("") || instructor1.getText().equals("") || exam1.getText().equals("") || starting1.getText().equals("") || completion1.getText().equals("")){

                        JOptionPane.showMessageDialog(mainFrame, "Please fill all the fields");
                        return;

                    }
                    else{
                        String id1_str = id1.getText();
                        String courseTxt_str = courseTxt1.getText();
                        String instructor1_str = instructor1.getText();
                        String exam_str = exam1.getText();
                        String completion_str = completion1.getText();
                        String start_str = starting1.getText();

                        for(int i = 0; i<nonAcademicCourseList.size(); i++){

                            if(nonAcademicCourseList.get(i).getCourseId().equals(id1_str)){
                                NonAcademicCourse nacl = (NonAcademicCourse)(nonAcademicCourseList.get(i));
                                if(!nacl.getisRegistered()){
                                    nacl.register(courseTxt_str, instructor1_str, start_str, completion_str, exam_str);
                                    JOptionPane.showMessageDialog(mainFrame, "Non Academic Course has been registered Successfully");
                                    return;
                                }
                                else{

                                    JOptionPane.showMessageDialog(mainFrame, "Non Academic Course is already registered. Please register here!!!");
                                    return;
                                }
                            }

                        }

                    }
                }

            });

        clear1 = new JButton("Clear");
        clear1.setFont(new Font("Castellar", Font.BOLD, 20));
        clear1.setBounds(400, 650, 275, 40);
        clear1.setBorder(emptyBorder);
        clear1.setForeground(Color.BLACK);
        clear1.setBackground(new Color(240, 255, 240));
        clear1.setFocusable(false);

        nonAcademicPanel.add(clear1);
        clear1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    id1.setText("");
                    instructor1.setText("");
                    dur1.setText("");
                    cName1.setText("");
                    exam1.setText("");
                    courseTxt1.setText("");
                    pre.setText("");
                    starting1.setText("");
                    completion.setText("");
                }

            });

        display1 = new JButton("Display");
        display1.setFont(new Font("Castellar", Font.BOLD, 20));
        display1.setBounds(750, 650, 275, 40);
        display1.setBorder(emptyBorder);
        display1.setForeground(Color.BLACK);
        display1.setBackground(new Color(240, 255, 240));
        display1.setFocusable(false);

        nonAcademicPanel.add(display1);
        display1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    mainFrame.dispose();
                    JFrame frame1 = new JFrame("Display");
                    JScrollPane jsp1 = new JScrollPane();
                    jsp1.setBounds(0,0,1400,100);
                    frame1.add(jsp1);

                    JTable table = new JTable();
                    table.setModel(new DefaultTableModel(new Object[][] {}, new String[]{"Course Id","Instructor Name","Duration","Course Name","Exam Date","Course Leader","Prerequisite","Starting Date","Completion Date"}));
                    
                    jsp1.setViewportView(table);

                    DefaultTableModel table_mod = (DefaultTableModel)table.getModel();

                    for(int i=0; i<nonAcademicCourseList.size(); i++){
                       NonAcademicCourse nac1 = (NonAcademicCourse)(nonAcademicCourseList.get(i));
                        String id1_str = nac1.getCourseId();
                        String instructor1_str = nac1.getInstructorName();
                        int dur1_int = nac1.getDuration();
                        String cName1_str = nac1.getCourseName();
                        String exam1_str = nac1.getExamDate();
                        String courseTxt_str = nac1.getCourseLeader();
                        String pre_str = nac1.getPrerequisite();
                        String starting1_str = nac1.getStartingDate();
                        String completion1_str = nac1.getCompletionDate();
                        

                        Object table_row[] = {id1_str, instructor1_str, dur1_int, cName1_str, exam1_str, courseTxt_str, pre_str, starting1_str, completion1_str};
                        table_mod.addRow(table_row);

                         
                    }
                    
                    frame1.setResizable(false);
                    frame1.setBounds(250,250,1400,300);
                    frame1.getContentPane().setBackground(Color.WHITE);
                    frame1.setLayout(null);
                    frame1.setVisible(true);

                }
            });
        // Frame adjustment are here
        mainFrame.add(fixPanel);

        mainFrame.setBounds(25, 25, 1400, 800);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        mainFrame.setLayout(null);
        mainFrame.getContentPane().setBackground(new Color(0, 20, 40));
        mainFrame.setVisible(true);

    }

    public static void main(String[] args) {

        new INGCollege();

    }

}