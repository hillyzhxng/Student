package students;

public class Student 
{
    private String studentID;
    private String studentName;

    public Student(String studentID, String studentName) 
    {//start of constructor
        this.studentID = studentID; //refers to current object to call them which is why it uses this only if they have same name
        this.studentName = studentName;
    }//end of constructor 
    
    public String getStudentID() 
    {
        return studentID;
    }

    public void setStudentID(String studentID) 
    {
        
        this.studentID = studentID;
    }
      

    public String getStudentName() 
    {
        return studentName;
    }

    public void setStudentName(String studentName) 
    {
        this.studentName = studentName;
    }
       
}
