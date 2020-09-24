import java.util.ArrayList;
import java.util.List;

public class StudentService {
   static List<Student> students;
    static {
        students = new ArrayList<>();
        students.add(new Student("nam",20,"HN"));
        students.add(new Student("ChiNam",23,"HN"));
        students.add(new Student("EmNam",14,"HN"));
        students.add(new Student("OngNam",90,"HN"));

    }

}
