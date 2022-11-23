package com.fandev.demonstration.entities;

import java.io.Serializable;
import java.util.Objects;


public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String name;
	private String email;
	private String nome;
	private String password;
	
	public User(){
		
	}

	public User(long id, String name, String email, String nome, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.nome = nome;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return id == other.id;
	}
	
}
