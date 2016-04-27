package br.com.cidade.lazystack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Classe de controle de rotas das views
 * Route-view management class
 * @author ramoncidade
 *
 */
@Controller
public class PageRouterController {
	
	/**
	 * Hack for default view
	 * @return index view
	 */
	@RequestMapping("/")
	public String getIndex(){
		return "index";
	}
}
