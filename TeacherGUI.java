import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

 class TeacherGUI 
{
   ArrayList<Teacher>TeacherDetails = new ArrayList<>();
   public void Gui()
   {
       
       JFrame Frame = new JFrame(" Teacher GUI");
       Frame.setVisible(true);
       Frame.setSize(2000,2000);
       Frame.setLayout(null);
       
       // Font Customization 
       Font font = new Font("Times New Roman",Font.BOLD,50);
       Font font1 = new Font("Times New Roman",Font.BOLD,30);
       Font font2 = new Font("Bahnschrift SemiBold",Font.BOLD,16);
       
       //Main Heading
       
       JLabel Heading = new JLabel("TEACHER GUI");
       Heading.setFont(font);
       Heading. setBounds(780,10,360,40);
       Frame.add(Heading);
       
       
       
       // Adding label to Teacher
       
       JLabel Heading1 = new JLabel("TEACHER");
       Heading1.setFont(font1);
       Heading1. setBounds(100,80,300,80);
       Frame.add(Heading1);
       
       // Attributes of Teacher
       // Teacher ID Label
       
       JLabel TeacherID = new JLabel ("Teacher ID : ");
       TeacherID.setFont(font2);
       TeacherID.setBounds(100,160,150,30);
       Frame.add(TeacherID);
       
       // Teacher ID TextField
       
       JTextField TeacherId = new JTextField();
       TeacherId.setFont(font2);
       TeacherId.setBounds(350,160,200,30);
       Frame.add(TeacherId);
    
       
       //
       // Teacher Name (Label)
       
       JLabel TeacherName = new JLabel ("Teacher Name : ");
       TeacherName.setFont(font2);
       TeacherName.setBounds(100,200,150,30);
       Frame.add(TeacherName);
       
       // Teacher Name (TextField)
       
       JTextField TeacherN = new JTextField();
       TeacherN.setFont(font2);
       TeacherN.setBounds(350,200,200,30);
       Frame.add(TeacherN);
       
       //
       // Teacher Address (Label)
       
       JLabel TeacherAddress = new JLabel ("Address : ");
       TeacherAddress.setFont(font2);
       TeacherAddress.setBounds(100,240,150,30);
       Frame.add(TeacherAddress);
       
       
       // Teacher Address (TextField)
       
       JTextField TeacherA = new JTextField();
       TeacherA.setFont(font2);
       TeacherA.setBounds(350,240,200,30);
       Frame.add(TeacherA);
       
       //
       // Teacher Working Type (Label)
       
       JLabel TeacherWorkingType  = new JLabel ("Working Type  : ");
       TeacherWorkingType .setFont(font2);
       TeacherWorkingType .setBounds(100,280,150,30);
       Frame.add(TeacherWorkingType);
       
       // Teacher Working Type (TextField)
       
       JTextField TeacherWt = new JTextField();
       TeacherWt.setFont(font2);
       TeacherWt.setBounds(350,280,200,30);
       Frame.add(TeacherWt);
       
       //
       // Teacher Employment Status (Label)
       
       JLabel TeacherEmploymentStatus = new JLabel ("Employment Status : ");
       TeacherEmploymentStatus.setFont(font2);
       TeacherEmploymentStatus.setBounds(100,320,180,30);
       Frame.add(TeacherEmploymentStatus);
       
       // Teacher Employment Status (TextField)
       
       JTextField TeacherEs = new JTextField();
       TeacherEs.setFont(font2);
       TeacherEs.setBounds(350,320,200,30);
       Frame.add(TeacherEs);
       
       //
       // Buttons
       //Button for Display
       
       JButton Display = new JButton("Display");
       Display.setFont(font2);
       Display.setBackground(Color.GRAY);
       Display.setBounds(100,380,100,30);
       Frame.add(Display);
       
       
       // Button For Clear
       
       JButton Clear = new JButton("Clear");
       Clear.setFont(font2);
       Clear.setBackground(Color.GRAY);
       Clear.setBounds(350,380,100,30);
       Frame.add(Clear);
       
       
       //
       // Button Action
       // Action Of Button Display
       
        Display.addActionListener(new ActionListener() 
       {
            public void actionPerformed(ActionEvent Display) 
            {
                for (Teacher teacher : TeacherDetails) {
                    if (teacher instanceof Tutor) 
                    {
                        Tutor tutor = (Tutor) teacher;
                        String tutorInfo = "Teacher ID: " + tutor.getTeacherId() +
                                   "\nTeacher Name: " + tutor.getTeacherName() +
                                   "\nTeacher Address: " + tutor.getAddress() +
                                   "\nWorking Type: " + tutor.getWorkingType() +
                                   "\nEmployment Status: " + tutor.getEmploymentStatus() +
                                   "\nWorking Hours: " + tutor.getWorkingHours() +
                                   "\nSalary: " + tutor.getSalary() +
                                   "\nSpecialization: " + tutor.getSpecialization() +
                                   "\nAcademic Qualification: " + tutor.getAcademicQualifications() +
                                   "\nPerformance Index: " + tutor.getPerformanceIndex();
                        tutor.displayDetails();
                        JOptionPane.showMessageDialog(null, tutorInfo, "Tutor Information", JOptionPane.INFORMATION_MESSAGE);
                        

                    } 
                    else if (teacher instanceof Lecturer) 
                    {
                        Lecturer lecturer = (Lecturer) teacher;
                        String lecturerInfo = "Teacher ID: " + lecturer.getTeacherId() +
                                      "\nTeacher Name: " + lecturer.getTeacherName() +
                                      "\nTeacher Address: " + lecturer.getAddress() +
                                      "\nWorking Type: " + lecturer.getWorkingType() +
                                      "\nEmployment Status: " + lecturer.getEmploymentStatus() +
                                      "\nDepartment: " + lecturer.getDepartment() +
                                      "\nYears of Experience: " + lecturer.getYearsOfExperience() +
                                      "\nWorking Hours: " + lecturer.getWorkingHours();
                        lecturer.display();
                        JOptionPane.showMessageDialog(null, lecturerInfo, "Lecturer Information", JOptionPane.INFORMATION_MESSAGE);
                    }            
                }
                
                
            }
        });
        
       
       
          
       // 
       // Adding Tutor
       // Adding label  Tutor
       
       JLabel Heading2 = new JLabel("TUTOR");
       Heading2.setFont(font1);
       Heading2. setBounds(650,80,300,80);
       Frame.add(Heading2);
       
       
       // Attributes of Tutor
       
       //
       // Tutor Working Hours Label
       
       JLabel WorkingHours = new JLabel ("Working Hours : ");
       WorkingHours.setFont(font2);
       WorkingHours.setBounds(650,160,180,30);
       Frame.add(WorkingHours);
       
       // Tutor Working Hours TextField
       
       JTextField WorkingHoursTfT = new JTextField();
       WorkingHoursTfT.setFont(font2);
       WorkingHoursTfT.setBounds(900,160,200,30);
       Frame.add(WorkingHoursTfT);
       
       
        
        //
       // Tutor Salary Label
       
       JLabel Salary = new JLabel ("Salary : ");
       Salary.setFont(font2);
       Salary.setBounds(650,200,180,30);
       Frame.add(Salary);
       
       // Tutor Salary TextField
       
       JTextField SalaryTf = new JTextField();
       SalaryTf.setFont(font2);
       SalaryTf.setBounds(900,200,200,30);
       Frame.add(SalaryTf);
       
       //
       // Tutor Specialization Label
       
       JLabel Specialization = new JLabel ("Specialization : ");
       Specialization.setFont(font2);
       Specialization.setBounds(650,240,180,30);
       Frame.add(Specialization);
       
       // Tutor Specialization Text Field
       
       JTextField SpecializationTf = new JTextField();
       SpecializationTf.setFont(font2);
       SpecializationTf.setBounds(900,240,200,30);
       Frame.add(SpecializationTf);
       
       
       //
       // Tutor Academic Qualification Label
       
       JLabel AcademicQualification = new JLabel ("Academic Qualification : ");
       AcademicQualification.setFont(font2);
       AcademicQualification.setBounds(650,280,200,30);
       Frame.add(AcademicQualification);
       
       // Tutor Academic Qualification Text Field
       
       JTextField AcademicQualificationTf = new JTextField();
       AcademicQualificationTf.setFont(font2);
       AcademicQualificationTf.setBounds(900,280,200,30);
       Frame.add(AcademicQualificationTf);
       
       
       //
       // Tutor Performance Index Label
       
       JLabel PerformanceIndex = new JLabel ("Performance Index : ");
       PerformanceIndex.setFont(font2);
       PerformanceIndex.setBounds(650,320,180,30);
       Frame.add(PerformanceIndex);
       
       // Tutor Performance Index TextField
       
       JTextField PerformanceIndexTf = new JTextField();
       PerformanceIndexTf.setFont(font2);
       PerformanceIndexTf.setBounds(900,320,200,30);
       Frame.add(PerformanceIndexTf);
       
       //
       // Buttons for Tutor.
       // Button for Add Tutor.
       
       
       JButton AddTutor = new JButton("Add Tutor");
       AddTutor.setFont(font2);
       AddTutor.setBackground(Color.GRAY);
       AddTutor.setBounds(650,380,150,30);
       Frame.add(AddTutor);
       
       
       
       //
       // Action Button Of Add Tutor
       
       AddTutor.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent AddTutor)
           {
              try 
              {
                if (WorkingHoursTfT.getText().isEmpty() || SalaryTf.getText().isEmpty() || PerformanceIndexTf.getText().isEmpty()
                    || TeacherId.getText().isEmpty()) 
                    {
                        throw new NumberFormatException("Please Enter a Number for Working Hours, Salary, and Performance Index, and Teacher ID");
                    }
                if (TeacherN.getText().isEmpty() || TeacherA.getText().isEmpty() || TeacherWt.getText().isEmpty()
                    || TeacherEs.getText().isEmpty() || SpecializationTf.getText().isEmpty() || AcademicQualificationTf.getText().isEmpty())
                    {
                         throw new Exception("Please Enter Text for Name, Address, Working Type, Employment Status, Specialization and Academic Qualification ");
                    }
                    
                    
                int TeacherID = Integer.parseInt(TeacherId.getText()); 
                String TeacherName = TeacherN.getText();
                String TeacherAddress = TeacherA.getText();
                String TeacherWorkingType  = TeacherWt.getText();
                String TeacherEmploymentStatus = TeacherEs.getText();
                int WorkingHours = Integer.parseInt(WorkingHoursTfT.getText());
                double Salary = Double.parseDouble(SalaryTf.getText());
                String Specialization = SpecializationTf.getText();
                String AcademicQualification = AcademicQualificationTf.getText();
                int PerformanceIndex = Integer.parseInt(PerformanceIndexTf.getText());
                
                Tutor TutorValue = new Tutor(TeacherID, TeacherName, TeacherAddress, TeacherWorkingType, TeacherEmploymentStatus, WorkingHours,
                Salary, Specialization, AcademicQualification,PerformanceIndex );
                
                TeacherDetails.add(TutorValue);
                
                
                JOptionPane.showMessageDialog(null, "Successfully! Added Tutor");
            }
            catch (NumberFormatException e)
              {
                  JOptionPane.showMessageDialog(null,"EMPTY FIELDS!! Please Kindly fill all the fields");
                  
                  
              }
            catch (Exception e)
            {
               JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE); 
            }
              
             
           }
       }
       );
       
       
       //
       //  Lecturer 
       
       // Adding label to Lecturer
       
       JLabel Heading3 = new JLabel("LECTURER");
       Heading3.setFont(font1);
       Heading3. setBounds(1200,80,300,80);
       Frame.add(Heading3);
       
       // Attributes of Lecturer
       
       // Department Label
       
       JLabel Department = new JLabel ("Department : ");
       Department.setFont(font2);
       Department.setBounds(1200,160,120,30);
       Frame.add(Department);
       
       // Department TextField
       
       JTextField DepartmentTf = new JTextField();
       DepartmentTf.setFont(font2);
       DepartmentTf.setBounds(1400,160,200,30);
       Frame.add(DepartmentTf);
       
        // Years of Experience Label
       
       JLabel YearsOfExperience = new JLabel ("Years of Experience : ");
       YearsOfExperience.setFont(font2);
       YearsOfExperience.setBounds(1200,200,180,30);
       Frame.add(YearsOfExperience);
       
       // Years of Experience TextField
       
       JTextField YearsOfExperienceTf = new JTextField();
       YearsOfExperienceTf.setFont(font2);
       YearsOfExperienceTf.setBounds(1400,200,200,30);
       Frame.add(YearsOfExperienceTf);
       
       
        // Working Hours Label
       
       JLabel WorkingHour = new JLabel ("Working Hours : ");
       WorkingHour.setFont(font2);
       WorkingHour.setBounds(1200,240,150,30);
       Frame.add(WorkingHour);
       
       // Working Hours TextField
       
       JTextField WorkingHourTf = new JTextField();
       WorkingHourTf.setFont(font2);
       WorkingHourTf.setBounds(1400,240,200,30);
       Frame.add(WorkingHourTf);
       

       
        //
       // Buttons
       //Buttons for Add Lecturer
       
       JButton AddLecturer = new JButton("Add Lecturer");
       AddLecturer.setFont(font2);
       AddLecturer.setBackground(Color.GRAY);
       AddLecturer.setBounds(1200,380,150,30);
       Frame.add(AddLecturer);
       
       
        
       //
       // Action OF Button of Add Lecturer
       
       AddLecturer.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent AddLecturer)
           {
             try 
              {
                String Department = DepartmentTf.getText();
                int YearsOfExperience = Integer.parseInt(YearsOfExperienceTf.getText());
                int TeacherID = Integer.parseInt(TeacherId.getText()); 
                String TeacherName = TeacherN.getText();
                String TeacherAddress = TeacherA.getText();
                String TeacherWorkingType  = TeacherWt.getText();
                String TeacherEmploymentStatus = TeacherEs.getText();
                int WorkingHours = Integer.parseInt(WorkingHourTf.getText());
                
                Lecturer Lect = new Lecturer(Department,YearsOfExperience,TeacherID,TeacherName,TeacherAddress,TeacherWorkingType,TeacherEmploymentStatus, WorkingHours);
                
                TeacherDetails.add(Lect);
                
                
                if (WorkingHourTf.getText().isEmpty() || YearsOfExperienceTf.getText().isEmpty() || TeacherId.getText().isEmpty()) 
                    {
                        throw new NumberFormatException("Please Enter a Number for Working Hours, Salary, and Performance Index, and Teacher ID");
                    }
                if (DepartmentTf.getText().isEmpty() || TeacherN.getText().isEmpty() || TeacherA.getText().isEmpty() || TeacherWt.getText().isEmpty() || TeacherEs.getText().isEmpty() )
                    {
                         throw new Exception("Please Enter Text for Name, Address, Working Type, Employment Status and Department  ");
                    }
                
                JOptionPane.showMessageDialog(null, "Successfully! Added Lecturer");
              } 
                
            catch (NumberFormatException e)
              {
                  JOptionPane.showMessageDialog(null,  "EMPTY FIELDS!! Please Kindly fill all the fields");
              }
            catch (Exception e)
            {
               JOptionPane.showMessageDialog(null, e.getMessage(), "Empty Field", JOptionPane.ERROR_MESSAGE); 
            }

           }
       }
       );
       
          
       // 
       // Adding Salary
       // Adding label Salary
       
       JLabel Heading4 = new JLabel("SALARY");
       Heading4.setFont(font1);
       Heading4. setBounds(100,480,150,30);
       Frame.add(Heading4);
       
       
       // Attributes of Salary
       
       //
       // Salary Teacher ID Label
       
       JLabel TeacherIdd = new JLabel ("Teacher ID : ");
       TeacherIdd.setFont(font2);
       TeacherIdd.setBounds(100,540,100,30);
       Frame.add(TeacherIdd);
       
       // Salary Teacher ID Label
       
       JTextField TeacherIddTf = new JTextField();
       TeacherIddTf.setFont(font2);
       TeacherIddTf.setBounds(350,540,200,30);
       Frame.add(TeacherIddTf);
       
              //
       // Salary New Salary Label
       
       JLabel NewSalary = new JLabel ("New Salary : ");
       NewSalary.setFont(font2);
       NewSalary.setBounds(100,580,150,30);
       Frame.add(NewSalary);
       
       // Salary New Salary TextField
       
       JTextField NewSalaryTf = new JTextField();
       NewSalaryTf.setFont(font2);
       NewSalaryTf.setBounds(350,580,200,30);
       Frame.add(NewSalaryTf);

       
       //
       // Salary New Performance Index Label
       
       JLabel NewPerformanceIndex = new JLabel ("New Performance Index : ");
       NewPerformanceIndex.setFont(font2);
       NewPerformanceIndex.setBounds(100,620,200,30);
       Frame.add(NewPerformanceIndex);
       
       // Salary New Performance Index TextField
       
       JTextField NewPerformanceIndexTf = new JTextField();
       NewPerformanceIndexTf.setFont(font2);
       NewPerformanceIndexTf.setBounds(350,620,200,30);
       Frame.add(NewPerformanceIndexTf);
       
       
       //
       // Buttons for Salary.
       // Button for Set Salary.
       
       
       JButton SetSalary = new JButton("Set Salary");
       SetSalary.setFont(font2);
       SetSalary.setBackground(Color.GRAY);
       SetSalary.setBounds(100,720,150,30);
       Frame.add(SetSalary);
       
       
       
       //
       // Action OF Button Set Salary
       
       SetSalary.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent SetSalary)
           {
                try 
                {
                    int teacherId = Integer.parseInt(TeacherIddTf.getText());
                    double newSalary = Double.parseDouble(NewSalaryTf.getText());
                    int newPerformanceIndex = Integer.parseInt(NewPerformanceIndexTf.getText());

                            // Find the tutor object with matching teacher ID
                    Tutor tutorToUpdate = null;
                        for (Teacher teacher : TeacherDetails) 
                            {
                                if (teacher instanceof Tutor && teacher.getTeacherId() == teacherId) 
                                {
                                    tutorToUpdate = (Tutor) teacher;
                                    break;
                                }
                            }

                        if (tutorToUpdate == null) 
                        {
                            JOptionPane.showMessageDialog(null, "Invalid Teacher ID! No matching Tutor found.");
                            return;
                        }

                        // Update salary and performance index
                         tutorToUpdate.setSalary(newSalary,newPerformanceIndex);
                         

                    JOptionPane.showMessageDialog(null, "Salary and Performance Index updated successfully!");
                    
                } 
                catch (NumberFormatException e) 
                {
                    JOptionPane.showMessageDialog(null, "Empty Fields!! Please Kindly FILL all the ");
                } 
                catch (Exception e) 
                {
                    JOptionPane.showMessageDialog(null,e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
           }
       }
       );
       

       
       // 
       // Adding Grade Assignments 
       // Adding label Grade Assignments 
       
       JLabel Heading5 = new JLabel("Grade Assignments ");
       Heading5.setFont(font1);
       Heading5. setBounds(650,480,300,30);
       Frame.add(Heading5);
       
       
       // Attributes of Grade Assignments 
       
       //
       // Grade Assignments Teacher ID Label   
       
       JLabel TeacherIdGa = new JLabel ("Teacher ID : ");
       TeacherIdGa.setFont(font2);
       TeacherIdGa.setBounds(650,540,100,30);
       Frame.add(TeacherIdGa);
       
       // Grade Assignments Teacher ID Label
       
       JTextField TeacherIdGaTf = new JTextField();
       TeacherIdGaTf.setFont(font2);
       TeacherIdGaTf.setBounds(900,540,200,30);
       Frame.add(TeacherIdGaTf);
       
       
              //
       // Grade Assignments Graded Score Label   
       
       JLabel GradedScore  = new JLabel ("Graded Score  : ");
       GradedScore.setFont(font2);
       GradedScore.setBounds(650,580,150,30);
       Frame.add(GradedScore);
       
       // Grade Assignments Teacher ID Label
       
       JTextField GradedScoreTf = new JTextField();
       GradedScoreTf.setFont(font2);
       GradedScoreTf.setBounds(900,580,200,30);
       Frame.add(GradedScoreTf);
       
       
              //
       // Grade Assignments Teacher ID Label   
       
       JLabel DepartmentGa = new JLabel ("Department : ");
       DepartmentGa.setFont(font2);
       DepartmentGa.setBounds(650,620,120,30);
       Frame.add(DepartmentGa);
       
       // Grade Assignments Teacher ID TextField
       
       JTextField DepartmentGaTf = new JTextField();
       DepartmentGaTf.setFont(font2);
       DepartmentGaTf.setBounds(900,620,200,30);
       Frame.add(DepartmentGaTf);
       
       
              //
       // Grade Assignments Years Of Experience Label   
       
       JLabel YearsOfExperienceGa = new JLabel ("Years Of Experience : ");
       YearsOfExperienceGa.setFont(font2);
       YearsOfExperienceGa.setBounds(650,660,200,30);
       Frame.add(YearsOfExperienceGa);
       
       // Grade Assignments Years Of Experience TextField
       
       JTextField YearsOfExperienceGaTf = new JTextField();
       YearsOfExperienceGaTf.setFont(font2);
       YearsOfExperienceGaTf.setBounds(900,660,200,30);
       Frame.add(YearsOfExperienceGaTf);
       
       
       //
       // Button for Grade Assignments.
       
       JButton GradeAssignments = new JButton("GradeAssignments");
       GradeAssignments.setFont(font2);
       GradeAssignments.setBackground(Color.GRAY);
       GradeAssignments.setBounds(650,720,180,30);
       Frame.add(GradeAssignments);

       
 
       
       //
       // Action OF Button Grade Assignments
       
       GradeAssignments.addActionListener(new ActionListener() 
       {
            public void actionPerformed(ActionEvent GradeAssignments) 
            {
                try 
                {
                    int teacherId = Integer.parseInt(TeacherIdGaTf.getText());
                    int gradedScore = Integer.parseInt(GradedScoreTf.getText());
                    String department = DepartmentGaTf.getText();
                    int yearsOfExperience = Integer.parseInt(YearsOfExperienceGaTf.getText());

                    // Find the lecturer object with matching teacher ID
                    Lecturer lecturerToUpdate = null;
                    for (Teacher teacher : TeacherDetails) 
                    {
                        if (teacher instanceof Lecturer && teacher.getTeacherId() == teacherId) 
                        {
                            lecturerToUpdate = (Lecturer) teacher;
                            lecturerToUpdate .GradeAssignment(gradedScore,department, yearsOfExperience);
                            break;
                        }
                        }

                    if (lecturerToUpdate == null) 
                    {
                        JOptionPane.showMessageDialog(null, "Invalid Teacher ID! No matching Lecturer found.");
                        return;
                    }

                    // Check if the department and years of experience match
                    if (!lecturerToUpdate.getDepartment().equals(department))
                    {
                        JOptionPane.showMessageDialog(null, "Department or Years of Experience do not match the Lecturer's details.");
                        return;
                    }   

                          

                    JOptionPane.showMessageDialog(null, "Graded Score updated successfully!");
                    } 
                catch (NumberFormatException e) 
                {
                    JOptionPane.showMessageDialog(null,"EMPTY FIELDS!! Please Kindly fill all the fields");
                } 
                catch (Exception e) 
                {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
       

        //
        // Adding Remove Tutor
       
       // Adding Label Remove Tutor
       
       
       JLabel Heading6 = new JLabel("REMOVE TUTOR");
       Heading6.setFont(font1);
       Heading6. setBounds(100,800,300,80);
       Frame.add(Heading6);
       
       
       
       // Remove Tutor Teacher ID Label
       
       JLabel TeacherIdRt = new JLabel ("Teacher ID : ");
       TeacherIdRt.setFont(font2);
       TeacherIdRt.setBounds(100,880,180,30);
       Frame.add(TeacherIdRt);
       
       
       // Remove Tutor Teacher ID TextField
       
       JTextField TeacherIdRtTf = new JTextField();
       TeacherIdRtTf.setFont(font2);
       TeacherIdRtTf.setBounds(350,880,200,30);
       Frame.add(TeacherIdRtTf);


        //
       // Buttons for Remove Tutor.
       // Button for Remove Tutor.
       
       
       JButton RemoveTutor = new JButton("Remove Tutor");
       RemoveTutor.setFont(font2);
       RemoveTutor.setBackground(Color.GRAY);
       RemoveTutor.setBounds(100,940,180,30);
       Frame.add(RemoveTutor);



        
       //
       // Action OF Button RemoveTutor
       
       RemoveTutor.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent RemoveTutor) 
            {
                try 
                {
                int teacherId = Integer.parseInt(TeacherIdRtTf.getText());

                // Find the tutor object with matching teacher ID
                    Tutor tutorToRemove = null;
                for (Teacher teacher : TeacherDetails) 
                {
                if (teacher instanceof Tutor && teacher.getTeacherId() == teacherId) 
                {
                    tutorToRemove = (Tutor) teacher;
                    break;
                }
                }

                if (tutorToRemove == null)
                {
                JOptionPane.showMessageDialog(null, "Invalid Teacher ID! No matching Tutor found.");
                return;
                }

                // Remove the tutor from the TeacherDetails list
                TeacherDetails.remove(tutorToRemove);

                JOptionPane.showMessageDialog(null, "Tutor removed successfully!");
                }        
                catch (NumberFormatException e) 
                {
                    JOptionPane.showMessageDialog(null, "EMPTY FIELDS!! Please Kindly fill all the fields");
                } 
                catch (Exception e) 
                {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            
            });
       
        
        //
       // Action OF Button Clear
        Clear.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent clear)
           {
            TeacherId.setText("");
            TeacherN.setText("");
            TeacherA.setText("");
            TeacherWt.setText("");
            TeacherEs.setText("");
            WorkingHoursTfT.setText("");
            SalaryTf.setText("");
            SpecializationTf.setText("");
            AcademicQualificationTf.setText("");
            PerformanceIndexTf.setText("");
            DepartmentTf.setText("");
            YearsOfExperienceTf.setText("");
            WorkingHourTf.setText("");
            TeacherIddTf.setText("");
            NewSalaryTf.setText("");
            NewPerformanceIndexTf.setText("");
            TeacherIdGaTf.setText("");
            GradedScoreTf.setText("");
            DepartmentGaTf.setText("");
            YearsOfExperienceGaTf.setText("");
            TeacherIdRtTf.setText("");
            JOptionPane.showMessageDialog(null, "All Fields are CLEARED");
           }
       }
       );
   }
   public static void main(String[] args) 
   {
        // Create an instance of TeacherGUI
        TeacherGUI teachersGui = new TeacherGUI();

        // Calling the gui() method
        teachersGui.Gui();
   }
}
