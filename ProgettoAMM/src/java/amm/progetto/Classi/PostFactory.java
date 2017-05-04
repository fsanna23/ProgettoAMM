/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.progetto.Classi;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author sanna
 */
public class PostFactory {
    
    private static PostFactory singleton;
    
    public static PostFactory getInstance()
    {
        if (singleton == null) {
            singleton = new PostFactory();
        }
        return singleton;
    }
    
    private ArrayList<Post> listaPost = new ArrayList<Post>();
    
    private PostFactory() {
        
        UserFactory userFactory = UserFactory.getInstance();

        Post post1 = new Post();
        post1.setContenuto("Stasera vado al cinema a dormire, buonanotte!");
        post1.setId(0);
        post1.setUtente(userFactory.getUserById(0));

        
    }
    
}
