
//Creating Subclass/Childclass:

public class Lecturer extends Teacher
{
    private  String department;
    private   int yearsOfExperience;
    private   int gradedScore;
    private   boolean hasGraded;
     

    // Constructor for the followings attributes:
    
    Lecturer(String department, int yearsOfExperience,int teacherId,String teacherName, String address,
        String workingType, String employmentStatus, int workingHours)
     {  
         super( teacherId, teacherName,address,workingType, employmentStatus);
         super.setWorkingHours(workingHours);
         this.department = department;
         this.yearsOfExperience = yearsOfExperience;
         this.gradedScore = 0;
         this.hasGraded = false;
     }
     
    // Method for Assigned Corresponding Getters:
    
    public String getDepartment()
    {
        return this.department;
    }
    
    public int getYearsOfExperience()
     {
         return this.yearsOfExperience;
     }
     
    public boolean HasGraded()
     {
         return this.hasGraded;
     }
     
    
    //Method for Assigned Corresponding Mutator:


    public void  setGradedScore()
     {
         this.gradedScore = gradedScore;
     }
     
    // Method for Assigned GradeAssignment:


    public void GradeAssignment(int gradedScore, String department, int yearsOfExperience) 
    {   
        this.yearsOfExperience = yearsOfExperience ;
        if (yearsOfExperience >= 5 && this.department.equalsIgnoreCase(department)) 
        {
            if (gradedScore >= 70) 
            {
                this.gradedScore = gradedScore;
                System.out.println("Congratulations! You got Grade: A");
            } 
            else if (gradedScore >= 60) 
            {
                this.gradedScore = gradedScore;
                System.out.println("Congratulations! You got Grade: B");
            } 
            else if (gradedScore >= 50) 
            {
                this.gradedScore = gradedScore;
                System.out.println("Congratulations! You got Grade: C");
            } 
            else if (gradedScore >= 40) 
            {
                this.gradedScore = gradedScore;
                System.out.println("Congratulations! You got Grade: D");
            } 
            else 
            {
                this.gradedScore = gradedScore;
                System.out.println("Congratulations! You got Grade: E");
            }
            this.hasGraded = true;
        }
        else 
        {
            System.out.println("Lecturer is not eligible to grade this assignment.");
        }
    }
    
     //Method  Assigned to Display sutaible messages :
    
        public void display(){
            super.display();
            System.out.println("Department : " + department);
            System.out.println("Years of Experience : " + yearsOfExperience);
            if(hasGraded){
                System.out.println("Graded Score : " + gradedScore);
            }
                else{
            System.out.println("Assignment has not been graded yet.");
            }
    }
}
