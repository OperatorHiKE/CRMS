import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Instructor extends User{

    private String instructor_name;

    public Instructor() {
        String instructor_name;
    }
}
