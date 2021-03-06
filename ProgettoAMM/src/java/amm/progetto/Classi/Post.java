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
public class Post 
{

    public enum Type
    {
        TEXT, IMAGE, LINK
    };
    
    private int id;
    private User utente;
    private Group gruppo;
    private String contenuto;
    private Type postType;
    
    public Post()
    {
        id = 0;
        utente = null;
        contenuto = "";
        postType = Type.TEXT;
        gruppo = null;
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
     * @return the utente
     */
    public User getUtente() {
        return utente;
    }

    /**
     * @param utente the utente to set
     */
    public void setUtente(User utente) {
        this.utente = utente;
    }

    /**
     * @return the contenuto
     */
    public String getContenuto() {
        return contenuto;
    }

    /**
     * @param contenuto the contenuto to set
     */
    public void setContenuto(String contenuto) {
        this.contenuto = contenuto;
    }

    /**
     * @return the postType
     */
    public Type getPostType() {
        return postType;
    }

    /**
     * @param postType the postType to set
     */
    public void setPostType(Type postType) {
        this.postType = postType;
    }
    
    /**
     * @return the gruppo
     */
    public Group getGruppo() {
        return gruppo;
    }

    /**
     * @param gruppo the gruppo to set
     */
    public void setGruppo(Group gruppo) {
        this.gruppo = gruppo;
    }
    
}
