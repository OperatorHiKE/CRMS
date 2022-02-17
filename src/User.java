import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class User {
    private int user_id;
    private String user_name;

    public User(int user_id, String user_name) {
    }
}
