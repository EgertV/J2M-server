package J2M.controller;


import J2M.model.SkillModel;
import J2M.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/skill")
public class SkillController {

    @Autowired
    SkillRepository skillRepository;

    @GetMapping
    public SkillModel getSkill() {
        return skillRepository.getOne(0L);
    }

    @RequestMapping(value = "/complete/{id}", method = RequestMethod.PUT)
    public boolean completeSkill(@PathVariable("id") long id) {
        skillRepository.setCompleted(id);
        return true;
    }
}
