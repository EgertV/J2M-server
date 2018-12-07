package J2M.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@Table(name = "user")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class UserModel {

    @Id
    private Long id;
    private String name;
    @OneToMany
    private Collection<CategoryModel> categories;
    @ElementCollection
    private Collection<Long> newcomers;

}
