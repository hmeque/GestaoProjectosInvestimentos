package ugen.gestao.projectos.investimentos.controlador;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ugen.gestao.projectos.investimentos.dao.projectoDao;
import ugen.gestao.projectos.investimentos.modelos.Projecto;
import ugen.gestao.projectos.investimentos.modelos.projectoRepositorio;

@Transactional
@Controller
//@RequestMapping("/Projecto")
public class projectoControler {

	@Autowired
	projectoDao dao;
	
	@Autowired //don't forget the setter
    projectoRepositorio rp;

	
	@PostMapping("/Projecto")
	public String salvar(Projecto pr) {
		
		this.rp.save(pr);
		return "redirect:/Projecto";
	}
	
	@GetMapping("/Add")
	public ModelAndView Salvar() {
	ModelAndView modelAndView = new ModelAndView("saveProjecto");
	modelAndView.addObject("Projecto", rp.findAll());
	modelAndView.addObject(new Projecto());
	return modelAndView;
	}

	@GetMapping("/Projecto")
	public ModelAndView listar() {
	ModelAndView modelAndView = new ModelAndView("listaProjectos");
	modelAndView.addObject("Projecto", rp.findAll());
	modelAndView.addObject(new Projecto());
	return modelAndView;
	}
	
	@RequestMapping("novoProjecto")
	public String form() {
		return "projecto/formulario";
	}

		@RequestMapping("listaProjecto")
	public String lista(Model model) {
		model.addAttribute("Projecto", dao.lista());
		return "Projecto/lista";
		
	}


	@RequestMapping("removeProjecto")
	public String remove(Projecto pr) {
		dao.remove(pr);
		return "redirect:listaProjecto";
	}

	@RequestMapping("mostraProjecto")
	public String mostra(Long id, Model model) {
		model.addAttribute("Projecto", dao.buscaPorId(id));
		return "projecto/mostra";
	}

	@RequestMapping("alteraProjecto")
	public String altera(Projecto pr) {
		dao.altera(pr);
		return "redirect:listaProjecto";
	}

	@RequestMapping("finalizaProjecto")
	public String finaliza(Long id, Model model) {
		dao.finaliza(id);
		model.addAttribute("Projecto", dao.buscaPorId(id));
		return "tarefa/finalizada";
	}
	

}
