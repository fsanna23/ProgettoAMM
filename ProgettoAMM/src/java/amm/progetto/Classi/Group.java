/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.progetto.Classi;

/**
 *
 * @author sanna
 */
public class Group 
{

    private int id;
    private String nome;
    private String fotoGruppo;
    
    public Group()
    {
        id = 0;
        nome = "";
        fotoGruppo = "";
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the fotoGruppo
     */
    public String getFotoGruppo() {
        return fotoGruppo;
    }

    /**
     * @param fotoGruppo the fotoGruppo to set
     */
    public void setFotoGruppo(String fotoGruppo) {
        this.fotoGruppo = fotoGruppo;
    }
}
