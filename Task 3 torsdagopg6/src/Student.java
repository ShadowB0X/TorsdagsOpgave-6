import java.util.ArrayList;

public class Student extends Person {

    ArrayList<String> currentCourses;
    ArrayList<String> passedCourses;

    Student(String name, ArrayList<String> passedCourses) {
        super(name);
        this.passedCourses = passedCourses;
        this.currentCourses = new ArrayList<>();

    }


    @Override
    public boolean addCourse(String course) {
        if (passedCourses.contains(course)) {
            display(getName()+ " Du har alleredet bestået kurset" + course);
            return false;
        } else {
            currentCourses.add(course);
            return true;
        }

    }

    public void display(String msg) {
        System.out.println(msg);
    }

}
