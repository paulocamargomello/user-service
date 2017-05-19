/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.stefanini.database.repository;

import br.com.stefanini.database.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author stefanini
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {
    
    /**
     * Encontra um usuário de acordo com os parâmetros encontrados.
     * @param login O login pesquisado.
     * @param password A senha do login.
     * @return O usuário encontrado.
     */
    User findOneByLoginAndPassword(String login, String password);
}
