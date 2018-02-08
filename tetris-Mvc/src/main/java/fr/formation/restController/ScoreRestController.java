package fr.formation.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.tetris_dao.IPartieDAO;

@RestController
@CrossOrigin("*")
@RequestMapping("/score")
@Transactional
public class ScoreRestController {
    @Autowired
    private IPartieDAO daoPartie;

    
    @GetMapping("/{id}")
    public int findById(@PathVariable("id") int id){
        return this.daoPartie.findById(id).get().getScore();
    }
}