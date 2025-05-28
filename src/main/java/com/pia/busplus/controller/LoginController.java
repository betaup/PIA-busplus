package com.pia.busplus.controller;

import com.pia.busplus.model.Usuario;
import com.pia.busplus.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession; // o javax.servlet...

@Controller
public class LoginController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/login")
    public String login() {
        return "login";  // tu vista login.html
    }

    @GetMapping("/loginSuccess")
    public String loginSuccess(HttpSession session, Authentication authentication) {
        Usuario usuario = usuarioRepository.findByNombreUsuario(authentication.getName()).orElse(null);
        if (usuario != null && usuario.getEmpleado() != null && usuario.getEmpleado().getPuesto() != null) {
            session.setAttribute("usuario", usuario);
        } else {
            // Puedes redirigir a un error mas controlado
            return "redirect:/error";
        }
        return "redirect:/inicio";
    }

}
