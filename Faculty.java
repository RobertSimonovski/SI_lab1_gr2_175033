import java.util.List;

public class Faculty {
    List<Student> studentList;
    String name;
    public double averageGrade(){
        int sum=0, count=0;
        for (Student student : studentList) {
            for (Integer grade : student.grades) {
                sum+=grade;
                count++;
            }
        }
        return (sum*1.0)/count;
    }
}
