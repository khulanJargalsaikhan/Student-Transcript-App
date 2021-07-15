import java.util.ArrayList;

public class Transcript {
    private int id;
    private String fname;
    private String lname;
    private Course course;
    ArrayList<Course> courseList = new ArrayList<>();

    public Transcript(){
        this.course = new Course();
        //this.courseList = new ArrayList<>();
    }

    public void addCourse(Course course){
        courseList.add(course);
    }

    public ArrayList getCourses(){
        return courseList;
    }

    public double getOverallGPA(){
        double totalPoints = 0;
        for(int i=0; i<courseList.size(); i++){
            totalPoints = totalPoints + courseList.get(i).getQualityPoints(courseList.get(i).getGrade());
        }
        double gpa = totalPoints / courseList.size();
        return gpa;
    }

    public String getFormattedGPA(){
        return "\nGPA: " + getOverallGPA();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    public Course getCourse() {
        return course;
    }


    public void displayContent(){
        System.out.printf("%s %s\nStudent ID: %d\n", fname,lname,id);
    }




}
