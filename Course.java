/**
 * Author: Pukar Gautam
 * Version : 1.0
 * @islingtoncollege Programming QN1
 */

public class Course{ 
    
    
    private String courseId; 
    private String courseName;
    private String courseLeader;
    private int duration;
    
    

    public Course(String courseId, String courseName, int duration){//this is a constructor with parameters{ 
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseLeader = "";
        this.duration = duration;
        
    }

    
    
    //accessor method
    public String getCourseId(){
    
        return this.courseId;
    }
    public String getCourseName(){
   
        return this.courseName;
    }
    public String getCourseLeader(){
    
    
        return this.courseLeader;
    }
    public int getDuration(){
    
    
        return this.duration;
    }
    //mutator methods
    
    public void setCourseLeader(String courseLeader){
    
        this.courseLeader = courseLeader;
    }
    
    public void display(){ //the display method is used to print all the required arguments
    
        System.out.println("Course Id is " +this.courseId);
        System.out.println("Course Name is " +this.courseName);
        if(!this.courseLeader.equals("")){
        System.out.println("Course Leader is " +this.courseLeader);
    }
    else{
    
        System.out.println("Course Leader has not assigned");
    }
        System.out.println("Duration of course is" +this.duration);


    }
    
    
}


