package br.com.letscode.aula3.model;

import javax.persistence.Entity;

@Entity
public record User(String name, String email){}
