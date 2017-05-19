/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.stefanini.database.service;

import br.com.stefanini.database.domain.User;
import br.com.stefanini.database.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author stefanini
 */
@RestController
public class UserService {
    
    @Autowired private UserRepository dao;
    
    @RequestMapping("/info")
    public String info() {
        return "Serviço para consumo de informações do usuário";
    }
    
    @RequestMapping("/user")
    public List<User> getAll() {
        return dao.findAll();
    }
    
    @RequestMapping("/user/find")
    public ResponseEntity<User> getByLoginAndPassword(
            @RequestParam(name = "login", required = true) String login,
            @RequestParam(name = "password", required = true) String password) {
        
        User found = dao.findOneByLoginAndPassword(login, password);
        if (found == null)
            return ResponseEntity.notFound().build();
        
        return ResponseEntity.ok(found);
    }
}
