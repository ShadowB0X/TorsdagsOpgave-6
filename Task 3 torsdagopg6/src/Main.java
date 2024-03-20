import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        ArrayList<String> passedCourses = new ArrayList<>();
        passedCourses.add("Data science");
        passedCourses.add("Datalogi");
        passedCourses.add("Matematik");

        Student s1 = new Student("Zana",passedCourses );
        Student s2 = new Student("Lal", passedCourses);

        ArrayList<String> teachers = new ArrayList<>();

        teachers.add("Matematik");
        teachers.add("Datalogi");
        teachers.add("Data science");

        Teacher t1 = new Teacher("Tess", teachers);
        Teacher t2 = new Teacher("Signe", new ArrayList<>());

        persons.add(s1);
        persons.add(s2);
        persons.add(t1);
        persons.add(t2);

        String c2 = "Data Science";

        for (Person p1 : persons){
            if (!p1.addCourse(c2)){
                if (p1 instanceof Student){
                    System.out.println(p1.getName() + " har bestået" );
                } else if (p1 instanceof Teacher) {
                    System.out.println(p1.getName() +" læreren kan dsv ikke undervise i dette fag.." + teachers);

                }
            }
        }


    }


}