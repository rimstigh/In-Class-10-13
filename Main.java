import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Student student1 = new Student("Prof Webb", 3.7, "Computer Science");
    Student student2 = new Student();
    Student student3 = new Student("Information Systems");

    Course course1 = new Course("IS4010", "001", "Maria Webb", "OBAIS", "Application Development with Java", 3);

    System.out.println(student3.getGPA());

    student3.setCourse(course1);

    //let's get the courses ArrayList for student3
    ArrayList<Course> temp = student3.getCourse();
    System.out.println(temp.get(0).getCourseNumber());
  }
  static double avgGPA(ArrayList<Student> students) {
    double sum = 0.0;
    
    for(int i=0; i<students.size(); i++){
      sum += students.get(i).getGPA();
    } 
    return sum / students.size();
  }
}
