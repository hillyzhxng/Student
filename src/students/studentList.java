package students;

public class studentList 
{//start class
    public static void main (String[] args)
    {//start main
        //Student s1 = new Student ("s1", "Hillary");
        Student[] studentList = new Student [3];
        studentList[0] = new Student ("s1", "Hillary");
        studentList[1] = new Student ("s2", "John");
        studentList[2] = new Student ("s3", "Rachel");
        
        for (int i = 0; i < studentList.length; i++){
            System.out.println(studentList[i].getStudentName());
        
        }
    }//end of main
}//end of class
