 
//Creating Superclass/Parentclass:

public class Teacher 
{
    int teacherId;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private int workingHours;
    
    //Constructor assinged  for the followings attributes:
    
    Teacher( int teacherId,String teacherName, String address,
    String workingType, String employmentStatus)
    {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.address = address;
        this.workingType = workingType;
        this.employmentStatus = employmentStatus;
    }
    
    //Method for assigned Corresponding getters:
    
    public int getTeacherId()
    {
        return this.teacherId;
    }
    
    public String getTeacherName()
    {
        return this.teacherName;
    }
    
    public String getAddress()
    {
        return this.address;
    }
    
    public String getWorkingType()
    {
        return this.workingType;
    }
    
    public String getEmploymentStatus()
    {
        return this.employmentStatus;
    }
    
    public int getWorkingHours()
    {
        return this.workingHours;
    }
    
    // Method for Assigned Corresponding Setters:
    
    public void setWorkingHours(int workingHours)
    {
        this.workingHours = workingHours;   
    }
    
    //Method  Assigned to Display sutaible messages :
    
    public void display()
    {
        System.out.println("Teacher ID: " + this.teacherId);
        System.out.println("Teacher Name: " + this.teacherName);
        System.out.println("Address:" + this.address);
        System.out.println("Working Type: "+ this.workingType);
        System.out.println("Employment Status: "+ this.employmentStatus);
        
        if (workingHours == 0 ) 
        {
            System.out.println(" Alert!! Working hour is Invalid");
        }
        else
        {
            System.out.println("Great!! Your working hours is : " + workingHours);
        }
        
    }    
}
 


    

    
    
