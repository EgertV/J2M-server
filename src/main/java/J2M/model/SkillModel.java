package J2M.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "skill")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class SkillModel {

    @Id
    private Long id;
    private Boolean completed;
    @Lob
    private String learningOutcomes;
    @Lob
    private String data;


}
