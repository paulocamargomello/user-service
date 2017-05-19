/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.stefanini.database.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author stefanini
 */
@Data
@Entity
@Table
public class User implements Serializable {
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO) private int id;
    @Column private String login;
    @Column private String name;
    @Column private String password;
}
