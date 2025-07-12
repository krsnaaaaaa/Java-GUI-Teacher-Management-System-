
//Creating Another Subclass/Childclass:

public class Tutor extends Teacher 
{
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;

    // Constructor Assinged  for the followings attributes:

    public Tutor(int teacherId, String teacherName, String address, String workingType,
                String employmentStatus, int workingHours, double salary, String specialization,
                String academicQualifications, int performanceIndex) 
    {
        super(teacherId, teacherName, address, workingType, employmentStatus);
        super.setWorkingHours(workingHours);
        this.salary = salary;
        this.specialization = specialization;
        this.academicQualifications = academicQualifications;
        this.performanceIndex = performanceIndex;
        this.isCertified = false;
    }

    // Method for Assigned Corresponding Getters:


    public double getSalary() 
    {
        return salary;
    }

    public String getSpecialization() 
    {
        return specialization;
    }

    public String getAcademicQualifications() 
    {
        return academicQualifications;
    }

    public int getPerformanceIndex() 
    {
        return performanceIndex;
    }

    public boolean getIsCertified() 
    {
        return isCertified;
    }
    
    //  Method for Assigned Corresponding Setters:

     public void setSalary(double salary, int performanceIndex)
     {
         //this.salary =salary;
         this.performanceIndex = performanceIndex;
        if (performanceIndex > 5 && getWorkingHours () > 20) 
        {
            double appraisalPercentage;
            if (performanceIndex >= 8) 
            {
                appraisalPercentage = 0.1;
            } 
            
            else if (performanceIndex >= 5) 
            {
                appraisalPercentage = 0.05;
            } 
            
            else if (performanceIndex == 10)
            {
                appraisalPercentage = 0.2;
            }
            
            else 
            {
                appraisalPercentage = 0;
            }             
            this.salary = salary + (appraisalPercentage * salary);
            this.isCertified = true;
        } 
        else if(isCertified==false)
        {
            System.out.println("Salary cannot be approved. Tutor is not certified yet.");
        }
    }
    

    // Method  Assigned to remove tutor:

    public void removeTutor() 
    {
        if (isCertified == false) 
        {
            salary = 0;
            specialization = "";
            academicQualifications = "";
            performanceIndex = 0;
            System.out.println("Tutor removed successfully.");
        }
        
        else 
        {
            System.out.println("Cannot remove a certified tutor.");
        }
    }
    
    
     //Method  Assigned to Display sutaible messages :
    
     public void displayDetails() {
        if (isCertified)
        {
            super.display();
            System.out.println("Salary: " + salary);
            System.out.println("Specialization: " + specialization);
            System.out.println("Academic Qualifications: " + academicQualifications);
            System.out.println("Performance Index: " + performanceIndex);
        }
    }
}