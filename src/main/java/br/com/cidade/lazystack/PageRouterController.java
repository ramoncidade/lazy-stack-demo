package br.com.cidade.lazystack;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cidade.lazystack.repository.PostRepository;
/**
 * Classe de controle de rotas das views
 * Route-view management class
 * @author ramoncidade
 *
 */
@Controller
public class PageRouterController {
	
	PostRepository postRepository;
	
	@Autowired
	public PageRouterController(PostRepository postRepository) {
		this.postRepository = postRepository;
	}
	
	/**
	 * Hack for default view
	 * @return index view
	 */
	@RequestMapping("/")
	public String getIndex(Map<String, Object> model){
		model.put("posts", postRepository.findAll());
		return "index";
	}
}
