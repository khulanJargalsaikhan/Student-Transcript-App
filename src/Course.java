import java.util.Locale;

public class Course {
    private String courseName;
    private int credit;
    private String grade;


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getQualityPoints(String grade){
        grade.toUpperCase(Locale.ROOT);
        char g = grade.charAt(0);
        double points = 0.0;
        switch (g){
            case 'A':
                points = 4.0;
                break;
            case 'B':
                points = 3.0;
                break;
            case 'C':
                points = 2.0;
                break;
            case 'D':
                points = 1.0;
                break;
            case 'F':
                points = 0.0;
                break;
            default:
                System.out.println("Invalid grade. Try again!");
        }
        return points;
    }

//    public void displayCourseContent(){
//        System.out.printf( "\nCource\t\tCredits\t\tGrade\t\tQuality Points\n" +
//                            "------\t\t-------\t\t------\t\t------------\n" +
//                            "%s\t\t%d\t\t\t%s\t\t\t%.2f\n", getCourseName(), getCredit(), getGrade(),getQualityPoints(getGrade()));
//    }

}
