package tinario9954.gmail.com.Imobilhara1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import tinario9954.gmail.com.Imobilhara1.model.Usuario;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Controller {


    //Pagina Principal
    //Essa requisicao e que chama a nossa pagina html 
    @RequestMapping("/")
    public ModelAndView index()
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home/Index");
        mv.addObject("msg", "mensagem vind direitamente do controller");
        return mv;
        
    }
    

    @GetMapping("/BoasVindas/{nome}")
    public String boasVindas(@PathVariable String nome)
    {
        return "Seja bem vindo (a) "+nome;
    }
    
    @PostMapping("/Usuario")
    public Usuario testeUsuario(@RequestBody Usuario p)
    {
        return p;
    }

}
