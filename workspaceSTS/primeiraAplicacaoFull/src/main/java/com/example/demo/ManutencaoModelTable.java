package com.example.demo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

	@Entity
	//@Table(name="tb_manutencao2")
	public class ManutencaoModelTable {
		@Id
		@Column
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
		@Column
		private String nome;
		@Column
		private String categoria;
	    @Column
		@JsonFormat(pattern="yyyy-mm-dd")
		private Date data;

	    //getters e setters
		public Date getData() {
			return data;
		}

		public void setData(Date data) {
			this.data = data;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCategoria() {
			return categoria;
		}

		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}
		
		

}
