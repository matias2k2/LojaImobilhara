package tinario9954.gmail.com.Imobilhara1.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class UsuarioController {

  // @Autowired
  // private UsuarioInt repe;

  @GetMapping("/")
  public String index() {
    return "home/index";
  }
  // Fazer o logim na nossa tela

  @GetMapping("/login")
  public String login() {
    return "login/login";
  }
 
  // Fazer o login



  @GetMapping("/cadastras")
  public String cadastra() {
    return "login/cadastra";
  }


  /*
   * @PostMapping("/logar")
   * public String logar(Model model,Usuario ItemP)
   * {
   * Usuario adm = this.repe.Login(ItemP.getEmail(), ItemP.getSenha());
   * if(adm != null)
   * {
   * return "redirect:/";
   * }
   * model.addAttribute("msg", "mensagem vind direitamente do controller");
   * return "login/login";
   * }
   * //Rota da tela cadastra
   * 
   * 
   * //Valida o nosso cadastro
   * 
   * @PostMapping("/validar")
   * public String cadastraValidar(Model model,Usuario dados,tipoUser pt,String
   * confrim)
   * {
   * if(dados.getSenha().equals(confrim))
   * {
   * Usuario add= this.repe.validar(dados.getNome(), dados.getEmail(),
   * dados.getSenha());
   * tipoUser tpAdd=this.repe.inserirTipoUsuario(pt.getDescricao());
   * if(add != null && tpAdd!= null)
   * {
   * return "redirect:/";
   * }
   * }
   * model.addAttribute("msg", "mensagem vind direitamente do controller");
   * return "login/cadastra";
   * 
   * 
   * }
   */

}
