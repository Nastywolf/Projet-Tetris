package fr.formation;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.formation.tetris_dao.IFaqDAO;
import fr.formation.tetris_model_faq.Faq;

@Controller
@RequestMapping(value = "/faq")
public class FAQController {

	@Autowired
	private IFaqDAO daoFaq;

	@ModelAttribute("page")
	public String page() {
		return "faq";
	}
	@GetMapping("")
	public String liste(Model model) {
		model.addAttribute("faq", daoFaq.findAll());
		return "faq";
	}
	

	@GetMapping("/ajouter")
	public String ajouter(Model model) {
		model.addAttribute("faq", new Faq());
		return "faqedit";
	}

	@PostMapping("/ajouter")
	public String ajouter(@Valid @ModelAttribute("faq") Faq faq,BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "faqedit";
		}
		daoFaq.save(faq);
		
		return "redirect:.";
	}
	
	@GetMapping("/editer")
	public String editer( @RequestParam("id") int id, Model model) {
		model.addAttribute("faq", daoFaq.findById(id).get());
		return "faqedit";
	}
	
	@PostMapping("/editer")
	public String editer( @Valid @ModelAttribute("faq") Faq faq, BindingResult result, @RequestParam("id") int id, Model model) {
		if(result.hasErrors()) {
			System.out.println(result.getAllErrors());
			return "faqedit";
		}

		daoFaq.save(faq);
		
		return "redirect:.";
	}
	
	@GetMapping("/supprimer")
	public String supprimer(@RequestParam("id") int id) {
		daoFaq.deleteById(id);
		
		return "redirect:.";
	}

}
