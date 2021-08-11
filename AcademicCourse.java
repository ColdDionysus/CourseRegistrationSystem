/**
 * Author Pukar Gautam
 * Version 1.0
 * @islingtoncollege Qn2
 */

public class AcademicCourse extends Course{
    //variable declaration
        
    private String lecturerName;
    private String level;
    private String credit;
    private String startingDate;
    private String completionDate;
    private int numberOfAssessments;
    private boolean isRegistered;
    
    public AcademicCourse(String courseId, String courseName, int duration, String level, String credit, int numberOfAssessments){ //here AcademicCourse is a constructor passing parameters
        super(courseId, courseName, duration);
        this.lecturerName = "";
        this.level = level;
        this.credit = credit;
        this.startingDate = "";
        this.completionDate = "";
        this.isRegistered = false;
        this.numberOfAssessments = numberOfAssessments;
    
    
    }
    //accessor method ..get'
    public String getLecturerName(){
        return this.lecturerName;
    }
    public String getLevel(){
        return this.level;
    }
    public String getCredit(){
        
        return this.credit;
    }
    public String getStartingDate(){
        
        return this.startingDate;
    }
    public String getCompletionDate(){
        
        return this.completionDate;
    }
    public int getNumberOfAssessments(){
        
        return this.numberOfAssessments;
    }
    public boolean getIsRegistered(){
        
        return this.isRegistered;
    }
    //mutator methods
    public void setLecturerName(String lecturerName){
        this.lecturerName = lecturerName;
    }
    public void setNumberOfAssessments(int numberOfAssessments){
    
        this.numberOfAssessments = numberOfAssessments;
    }

    public void register(String courseLeader, String lecturerName, String startingDate, String completionDate){ //register method is used to register academic course with parameters or arguments
        if(isRegistered == false){
            super.setCourseLeader(courseLeader);
            this.lecturerName = lecturerName;
            this.startingDate = startingDate;
            this.completionDate = completionDate;
            this.isRegistered = true;
        }
        else{
            System.out.println(this.lecturerName+ " " +this.startingDate +"" +this.completionDate);
            
        }
    
    }
    public void display(){ //this method is used to print all arguments
        super.display();
        if(isRegistered == true){
           System.out.println("The Lecturer Name is" +this.lecturerName);
           System.out.println("The level is " +this.level);
           System.out.println("credit is " +this.credit);
           System.out.println("Starting Date is "+this.startingDate);
           System.out.println("Completion Date is " +this.completionDate);
           System.out.println("Number Of Assessments is " +this.numberOfAssessments);
        }
        else{
            System.out.println("You Havenot Registered Yet!!!!");
        }
    }
    
}