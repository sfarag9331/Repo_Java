package Class3;

public class Homework10 {

    /**
     * Variable which will store values like:
     * school name
     * student name
     * student id
     * student enrolled course name
     * courses offered by school
     * total number of students
     * student fee-balance
     * student address
     */
    static String schoolName = "ABC School";
    static String[] offeredCourses = {"QA", "Web", "PM"};
    static double[] feesCourses = {1000, 2000, 3000};
    static int totalStudents = 0;

    String studentName = "N/A";
    String studentEnrolledCourse;
    int studentId;
    String studentAddress;
    double studentFeeBalance;
    double depositAmount;
    String newCourse = "";

    public void enrollStudent(String name, String addr, String course) {
        /*
            if course is available in school, we should inform student the fees-balance
            increase the total number of students
            we should student the studentId
         */
        boolean isCourseAvailable = false;
        for (int i=0 ; i<offeredCourses.length ; i++) {
            if (offeredCourses[i].equalsIgnoreCase(course)) {
                totalStudents++;
                studentId = totalStudents;
                isCourseAvailable = true;
                studentName = name;
                studentEnrolledCourse = offeredCourses[i];
                studentFeeBalance = feesCourses[i];
                studentAddress = addr;
                break;
            }
        }
        if (isCourseAvailable) {
            System.out.println("Enrollment done successfully. Student id -> " + studentId);
        } else {
            System.out.println("Requested course " + course + " is not available in the school");
        }

    }

    /**
     * Method to display student profile
     * Id
     * Name
     * Course
     *
     *
     * name: displayStudentProfile
     * Input: N/A
     * Return Type: String/void
     *
     */
    public void  displayStudentProfile() {
        System.out.println("Student profile " +
                "\nStudent id: " + studentId +
                "\nStudent name: " + studentName +
                "\nStudent course: " + studentEnrolledCourse + "\n\n");
    }

    /**
     * Method to fee deposit
     *
     * name: feeDeposit
     * Input: double
     * return: double
     */
    public double feeDeposit(double depositAmount) {
        double balance = 0;
        if (depositAmount > 0) {
            balance = balance + depositAmount;
        } else {
            System.out.println("Invalid deposit amount entered -> " + depositAmount);
        }
        return balance;
    }


    /**
     * Method to make deposit
     * name: makeDeposit
     * input: 1 (double)
     * return type: double
     *
     */
    public double makeDeposit(double depositAmt) {
        if (depositAmt > 0) {
            studentFeeBalance = studentFeeBalance + depositAmt;
        } else {
            System.out.println("Invalid deposit amount entered -> " + depositAmt);
        }
        return studentFeeBalance;
    }

    /**
     * Student to change course
     * Req:
     * 1. earlier deposited fees should be subtracted from new course fees
     * 2. Show error (saying, Same course entered) if student enter enrolled course as new course
     * 3. Show error (saying, Invalid course entered) if student enter a course not offered by school
     *
     * name: changeCourse
     * input: 2 (String , Double)
     *
     */
    public void courseChange (String newCourse){
        boolean isCourseAvailable = false;
        for (int i=0 ; i<offeredCourses.length ; i++) {
            if (offeredCourses[i].equalsIgnoreCase(newCourse)) {
                isCourseAvailable = true;
                studentEnrolledCourse = offeredCourses[i];
                studentFeeBalance = feesCourses[i] - depositAmount;
                break;
            }
        }
        if (studentEnrolledCourse.equalsIgnoreCase(newCourse)) {
            System.out.println("Same course entered");
        } else {
            System.out.println("Invalid course entered");
        }
    }

    /**
     * static Method to display school summary:
     * School Name
     * Courses Offered
     * Total number of student
     */
    public static void displaySchoolSummary() {
        System.out.println("School Name : " + schoolName +
                "\nCourses Offered : " + offeredCourses +
                "\nTotal number of student : " + totalStudents);
    }

}
