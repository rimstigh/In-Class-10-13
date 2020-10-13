// course number, section number, professor name, depatment / subject, description / summary
class Course {
  private String courseNumber; //i.e. IS4010
  private String sectionNumber; //i.e. 001
  private String professorName; //i.e. Maria Webb
  private String department; //i.e. OBAIS
  private String description; //i.e. App development with Java
  private int credits; //i.e. 3

  //constructor has no return type
  //name of constructor matches exactly with class name
  Course(String aCourseNumber, String aSectionNumber, String aProfessorName, String aDepartment, String aDescription, int aCredits) {
    courseNumber = aCourseNumber;
    sectionNumber = aSectionNumber;
    professorName = aProfessorName;
    department = aDepartment;
    description = aDescription;
    credits = aCredits;
  }

  // mutator & accessor
  // 6 mutator methods, 6 accessor methods
  //accessor always matches variable we're returning
  String getCourseNumber() {
    return courseNumber;
  }

  int getCredits() {
    return credits;
  }

  // mutator is always void
  void setCourseNumber(String aCourseNumber) {
    courseNumber = aCourseNumber;
  }

  //assign professorName to a course number
  void setProfessorName(String aProfessorName) {
    professorName = aProfessorName;
  }
}