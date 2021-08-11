/**
 * Author = Pukar Gautam
 * Version 1.0
 * @IslingtonCollege qn3
 */
public class NonAcademicCourse extends Course{
    //variable declaration
    private String instructorName;
    private String startingDate;
    private String completionDate;
    private String examDate;
    private String prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;
    
    public NonAcademicCourse(String courseId, String courseName, int duration, String prerequisite){
        super(courseId, courseName, duration);
        this.prerequisite = prerequisite;
        this.startingDate = "";
        this.completionDate = "";
        this.examDate = "";
        this.isRegistered = false;
        this.isRemoved = false;
    }
    //accessor method -- get'
    public String getInstructorName(){
    
        return this.instructorName;
    }
    public String getStartingDate(){
    
        return this.startingDate;
    }
    public String getCompletionDate(){
    
        return this.completionDate;
    }
    public String getExamDate(){
    
        return this.examDate;
    }
    public String getPrerequisite(){
    
        return this.prerequisite;
    }
    public boolean getisRegistered(){
    
        return this.isRegistered;
    }
    public boolean getisRemoved(){
    
        return this.isRemoved;
    }

    public void setInstructorName(String instructorName){
        if(isRegistered == false){
        
            this.instructorName = instructorName;
            
        }
        else{
            System.out.println("You are not able to change the Instructor Name here : ");
        }
    }
    public void register(String courseLeader, String instructorName, String startingDate, String completionDate, String examDate){//this method is used to register non-academic course
        super.setCourseLeader(courseLeader);
        this.instructorName = instructorName;
        this.startingDate = startingDate;
        this.completionDate = completionDate;
        this.examDate = examDate;
        this.isRegistered = true;
        
    }
    public void remove(){
        if(isRemoved == true){
            System.out.println("The Non-Academic Course Has Already Been Removed");
        }
        else{
            super.setCourseLeader("");
            this.instructorName = "";
            this.startingDate = "";
            this.completionDate = "";
            this.examDate = "";
            this.isRegistered = false;
            this.isRemoved = true;
        }
    
    }
    public void display(){
        super.display();
        if(isRegistered == true){
            System.out.println(this.instructorName+ " " +this.startingDate + " " +this.completionDate + " " +this.examDate);
        }
        else{
            System.out.println("You Haven't Register Yet **!");
        }
    }
}