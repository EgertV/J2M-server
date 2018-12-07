package J2M.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "assignment")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class AssignmentModel {

    @Id
    private Long id;
    private Boolean completed;
    @Lob
    private String data;
}
