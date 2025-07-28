package com.ubtechinc.Datatype;
import java.util.ArrayList;

public class AbstractDataTypeCourse {


    public class Course implements java.io.Serializable {
        //将各类数据封装入这个datatype当中
        private String courseName;
        private String courseId;
        private int maxStudents;
        private int currentStudents;
        private ArrayList<Student> registeredStudents;
        private String instructor;
        private int sectionNumber;
        private String location;
        private ArrayList<String> listOfNames;

        //构造方法
        public Course(String courseName, String courseId, int maxStudents, String instructor,
                      int sectionNumber, String location, ArrayList<String> listOfNames) {
            this.courseName = courseName;
            this.courseId = courseId;
            this.maxStudents = maxStudents;
            this.currentStudents = 0;
            this.registeredStudents = new ArrayList<>();
            this.listOfNames = listOfNames; // null
            this.instructor = instructor;
            this.sectionNumber = sectionNumber;
            this.location = location;
        }

        // Getters and setters
        public String getCourseName() {
            return courseName;
        }

        public String getCourseId() {
            return courseId;
        }

        public int getMaxStudents() {
            return maxStudents;
        }

        public int getCurrentStudents() {
            return currentStudents;
        }

        public ArrayList<Student> getRegisteredStudents() {
            return registeredStudents;
        }

        public String getInstructor() {
            return instructor;
        }

        public int getSectionNumber() {
            return sectionNumber;
        }

        public String getLocation() {
            return location;
        }

        public ArrayList<String> getListOfNames() {
            return listOfNames;
        }

        public void setInstructor(String instructor) {
            this.instructor = instructor;
        }

        public void setMaxStudents(int maxStudents) {
            this.maxStudents = maxStudents;
        }

        public void setSectionNumber(int sectionNumber) {
            this.sectionNumber = sectionNumber;
        }

        public void setLocation(String location) {
            this.location = location;
        }


        //这个好像不符合java的代码规范，码一下
        public boolean isFull() {
            return currentStudents >= maxStudents;
        }
        //一些其他的方法
        //因为course里面存的信息就是student相关的信息，所以它无法不与student联动，进行一些student信息的删减

        public boolean registerStudent(Student student) {
            if (!isFull()) {
                registeredStudents.add(student);
                listOfNames.add(student.getFirstName() + " " + student.getLastName());
                currentStudents++;
                return true;
            }
            return false;
        }

        public boolean withdrawStudent(Student student) {
            if (registeredStudents.remove(student)) {
                currentStudents--;
                listOfNames.remove(student.getFirstName() + " " + student.getLastName());
                return true;
            }
            return false;
        }

        @Override
        public String toString() {
            return "Course: " + courseName + " (ID: " + courseId + ")\n"
                    + "Section: " + sectionNumber + "\n"
                    + "Instructor: " + instructor + "\n"
                    + "Location: " + location + "\n"
                    + "Students: " + currentStudents + "/" + maxStudents + "\n"
                    + "List of Names: " + listOfNames;
        }
        


    }

}
