package model;

import java.util.Date;

import javax.validation.constraints.Future;

/**
 *
 * @author Ciro C. Trindade
 */
public class Reserva {
	private String nome;
    private String email;
    @Future
    private Date entrada;
    private int noites;
    private int hospedes;
    private double valor;

    public Reserva() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public int getNoites() {
        return noites;
    }

    public void setNoites(int noites) {
        this.noites = noites;
    }

    public int getHospedes() {
        return hospedes;
    }

    public void setHospedes(int hospedes) {
        this.hospedes = hospedes;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
