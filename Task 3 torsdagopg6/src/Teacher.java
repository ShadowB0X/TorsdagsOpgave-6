import java.util.ArrayList;

public class Teacher extends Person {
    ArrayList<String> currentCourses;
    ArrayList<String> canTeach;

    Teacher(String name, ArrayList<String> canTeach) {

        super(name);
        this.currentCourses = new ArrayList<>();
        this.canTeach = canTeach;

    }

    @Override
    public boolean addCourse(String course) {
        if (canTeach.contains(course)) {
            currentCourses.add(course);
            return true;
        } else {
            display(getName() + " denne lærer passer ikke til faget");
            return false;
        }
    }


    public void display(String msg) {
        System.out.println(msg);

    }
}
