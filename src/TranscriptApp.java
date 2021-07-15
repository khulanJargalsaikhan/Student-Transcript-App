import java.util.Locale;
import java.util.Scanner;

public class TranscriptApp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Transcript transcript = new Transcript();
        String response;


        System.out.println("Welcome to the transcript application.");

        System.out.print("Enter Student ID number: ");
        transcript.setId(input.nextInt());
        input.nextLine();
        System.out.print("Enter Student's first name: ");
        transcript.setFname(input.nextLine());
        System.out.print("Enter Student's last name: ");
        transcript.setLname(input.nextLine());

        do{
            Course course = new Course();
            transcript.setCourse(course);
            transcript.addCourse(course);
            System.out.print("Enter course: ");
            course.setCourseName(input.nextLine());
            System.out.print("Enter credits: ");
            course.setCredit(input.nextInt());
            input.nextLine();
            System.out.print("Enter grade: ");
            course.setGrade(input.nextLine());

            System.out.print("Another course? (y/n) ");
            response = input.nextLine().toLowerCase(Locale.ROOT);
            course.getQualityPoints(course.getGrade());

        }while(response.charAt(0) == 'y');
        System.out.println();
        transcript.displayContent();

        int courseListSize = transcript.courseList.size();
        System.out.print(   "\nCource\t\tCredits\t\tGrade\t\tQuality Points\n" +
                            "------\t\t-------\t\t------\t\t------------\n");
        for (int i=0; i<courseListSize; i++)
            System.out.printf("%s\t\t%d\t\t\t%s\t\t\t%.2f\n",
                        transcript.courseList.get(i).getCourseName(),
                        transcript.courseList.get(i).getCredit(),
                        transcript.courseList.get(i).getGrade(),
                        transcript.courseList.get(i).getQualityPoints(transcript.courseList.get(i).getGrade()));




        System.out.println(transcript.getFormattedGPA());








    }
}
