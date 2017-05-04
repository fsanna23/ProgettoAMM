/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.progetto.Classi;

import java.util.ArrayList;

/**
 *
 * @author sanna
 */
public class UserFactory 
{
    private static UserFactory singleton;
    
    public static UserFactory getInstance()
    {
        if (singleton == null) {
            singleton = new UserFactory();
        }
        return singleton;
    }
    
    private ArrayList<User> listaUtenti = new ArrayList<User>();
    
    private UserFactory() {

        //Paolo Bitta
        User user1 = new User();
        user1.setId(0);
        user1.setNome("Paolo");
        user1.setCognome("Bitta");
        user1.setUsername("bittapaolo10");
        user1.setPhrase("Essere o non essere?");
        user1.setPassword("lucabrutto");
        user1.setProfilePic("img/bitta.png");
        user1.setBirth("15/02/1960");

        //Renato Uno
        User user2 = new User();
        user2.setId(1);
        user2.setNome("Renato");
        user2.setCognome("Uno");
        user2.setUsername("1renato1");
        user2.setPhrase("Non l'avevo considerato");
        user2.setPassword("triangolo");
        user2.setProfilePic("img/zero.jpg");
        user2.setBirth("05/12/1951");

        //Gianna Filata
        User user3 = new User();
        user3.setId(2);
        user3.setNome("Gianna");
        user3.setCognome("Filata");
        user3.setUsername("giannina52");
        user3.setPhrase("Cantare è la mia passione");
        user3.setPassword("bacodaseta");
        user3.setProfilePic("img/gianna.jpg");
        user3.setBirth("22/01/1968");

        listaUtenti.add(user1);
        listaUtenti.add(user2);
        listaUtenti.add(user3);
    }

    public User getUserById(int id) {
        for (User utente : this.listaUtenti) {
            if (utente.getId() == id) {
                return utente;
            }
        }
        return null;
    }
    
    public int getIdUserAndPassword(String user, String password)
    {
        for(User utente : this.listaUtenti)
        {
            if(utente.getNome().equals(user) && utente.getPassword().equals(password))
            {
                return utente.getId();
            }
        }
        return -1;
    }
}
