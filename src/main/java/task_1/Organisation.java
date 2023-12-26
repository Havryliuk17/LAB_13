package task_1;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Organisation {
    private String webDomain;
    private String info;
    private String emblem;

    @Override
    public String toString() {
        return "Organization{" +
                "webDomain='" + webDomain + '\'' +
                ", info='" + info + '\'' +
                ", emblem='" + emblem + '\'' +
                '}';
    }
}
