package sistema.hotel.repository;

import java.time.LocalDate;

public class Hospedes {
	
	private Long id;
	private String nome;
	private String sobrenome;
	private LocalDate dataNascimento;
	private String nascionalidade;
	private Long telefone;
	private Long id_reserva;
	
	
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
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNascionalidade() {
		return nascionalidade;
	}
	public void setNascionalidade(String nascionalidade) {
		this.nascionalidade = nascionalidade;
	}
	public Long getTelefone() {
		return telefone;
	}
	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}
	public Long getId_reserva() {
		return id_reserva;
	}
	public void setId_reserva(Long id_reserva) {
		this.id_reserva = id_reserva;
	}
	
	
}
