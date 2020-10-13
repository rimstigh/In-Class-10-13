import java.util.ArrayList;
class Student {
  private String name;
  private double gpa;
  private String major;
  private ArrayList<Course> courses;

  Student() {
    name = "";
    gpa = 0.0;
    major = "";
    courses = new ArrayList<Course>();
  }
  Student(String aName, double aGPA, String aMajor) {
    name = aName;
    gpa = aGPA;
    major = aMajor;
    courses = new ArrayList<Course>();
  }
    Student(String aMajor) {
    name = "";
    gpa = 0.0;
    major = aMajor;
    courses = new ArrayList<Course>();
  }
  String getName() {
    return name;
  }
  double getGPA() {
    return gpa;
  }
  String getMajor() {
    return major;
  }
  ArrayList<Course> getCourse() {
    return courses;
  }
  void setName(String theName) {
    name = theName;
  }
  void setGPA(double theGPA) {
    gpa = theGPA;
  }
  void setMajor(String theMajor) {
    major = theMajor;
  }
  void setCourse(Course theCourse) {
    courses.add(theCourse);
  }

  void print() {
    System.out.println();
    System.out.println("The student's name is " + name);
    System.out.println("The student's GPA is " + gpa);
    System.out.println("The student's major is " + major);
    }
  }
