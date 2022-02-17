import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Student extends User{
    private String student_group;
    private String student_name;

    public Student() {
        String student_name;
        String student_group;
    }
}
