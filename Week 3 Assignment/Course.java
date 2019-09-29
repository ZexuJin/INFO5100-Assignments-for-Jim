
package Assignment3;

import java.util.Arrays;

//Q1. Write a Java class named 'Course'
//        It should have following members
//        courseId
//        courseName
//        maxCapacity
//        professorId
//        credits
//        int[] studentIds


public class Course {
    private int courseId;
    private String courseName;
    private int maxCapacity;
    private int professorId;
    private int credits;
    private int[] studentIds;

    //get course ID;
    public int getCourseId(){
        return courseId;
    }

    //set course ID;
    public void setCourseId(int newCourseId){
        if(newCourseId > 0){
            this.courseId = newCourseId;
        }
        else{
            System.out.println("You're putting a wrong Id number! The number should not be negative or 0! ");
        }
    }

    //get course name;
    public String getCourseName(){
        return courseName;
    }

    //set course name
    public void setCourseName(String newCourseName){
        int length = newCourseName.length();
        if( length >= 10 && length <= 60){
            this.courseName = newCourseName;
        }
        else{
            System.out.println("You're putting a wrong name, either it's too short or too long! Please check out!");
        }
    }

    //get the max capacity of the class;
    public int getMaxCapacity(){
        return maxCapacity;
    }

    //set the max capacity of the class;
    public void setMaxCapacity( int newMaxCapacity){
        if(newMaxCapacity >= 10 && newMaxCapacity <= 100){
            this.maxCapacity = newMaxCapacity;
        }
        else{
            System.out.println("You're putting a wrong number here, the capacity should be between 10 to 100!");
        }
    }

    //get the professorId of the class;
    public int getProfessorId(){
        return professorId;
    }

    //set professor for the class(set professorId to the class);
    public void setProfessorId( int newProfessorId){
        String Id = String.valueOf(newProfessorId);
        if(Id.length() == 6){
            this.professorId = newProfessorId;
        }
        else{
            System.out.println("You're putting in a wrong ID! The ID should be a 6-digit number.");
        }
    }

    //get the credits of the class;
    public int getCredits(){
        return credits;
    }

    //set the credits of the class;
    public void setCredits(int newCredits){
        String credits = String.valueOf(newCredits);
        if(credits.length() == 1 && newCredits > 0){
            this.credits = newCredits;
        }
        else{
            System.out.println("You're putting a wrong credit number. It should be a one digit number that's between 1-9.");
        }
    }

    boolean isCourseAvailable(int currentStudentNumber){
        getMaxCapacity();
        if(currentStudentNumber < maxCapacity) {
            return true;
        }
    }


    //public void registerStudent(int studentId)
    public void registerStudent(int studentId){
        studentIds = Arrays.copyOf(studentIds, studentIds.length + 1);
        studentIds[studentIds.length-1] = studentId;
    }



    //public int[] removeDuplicates(int[] studentIds)
    public int[] removeDuplicates(int[] studentIds){
        int[] tempArray = new int[];
        int t = 0;
        for (int i = 0; i < studentIds.length; i++){
            boolean isTrue = true;
            for (int j = i + 1; j < studentIds.length; j++){
                if (studentIds[i] == studentIds[j]){
                    isTrue = false;
                    break;
                }
            }
            if(isTrue){
                tempArray[t] = studentIds[i];
            }
            t++;
        }
        return tempArray;
    }


    //public int groupsOfStudents(int[] studentIds)
    public int groupsOfStudents(int[] studentIds){
        int count = 0;
        for(int i = 0 ; i < studentIds.length ; i++){
           for(int j = i + 1; j < studentIds.length ; j++){
               if ((studentIds[i]+studentIds[j])%2 == 0){
                   count ++;
               }
           }
        }
        return count;
    }


}
