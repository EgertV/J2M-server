package J2M.repository;

import J2M.model.SkillModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<SkillModel, Long> {

    @Modifying
    @Query("update SkillModel s set s.completed = true where s.id = ?1")
    int setCompleted(Long id);

}
