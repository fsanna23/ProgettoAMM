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
        
        Post post2 = new Post();
        post2.setContenuto("Ho mangiato un tramezzino da Ghiani. Era quadrato.");
        post2.setId(1);
        post2.setUtente(userFactory.getUserById(1));
        
        Post post3 = new Post();
        post3.setContenuto("img/tramezzino.jpg");
        post3.setId(2);
        post3.setUtente(userFactory.getUserById(1));
        post2.setPostType(Post.Type.IMAGE);
        
        Post post4 = new Post();
        post4.setContenuto("Se ascoltate le canzoni di Gigi D'Alessio siete brutti.");
        post4.setId(3);
        post4.setUtente(userFactory.getUserById(2));
        
        Post post5 = new Post();
        post5.setContenuto("https://www.youtube.com");
        post5.setId(4);
        post5.setUtente(userFactory.getUserById(2));
        
        listaPost.add(post1);
        listaPost.add(post2);
        listaPost.add(post3);
        listaPost.add(post4);
        listaPost.add(post5);
     
    }
    
    public Post getPostById(int id)
    {
        for (Post post : this.listaPost) {
            if (post.getId() == id) {
                return post;
            }
        }
        return null;
    }
    
    public List getPostList(User utente)
    {

        List<Post> listaPost = new ArrayList<Post>();

        for (Post post : this.listaPost)
        {
            if (post.getUtente().equals(utente))
            {
                listaPost.add(post);
            }
        }
        return listaPost;
    }
    
    public List getPostList(Group gruppo)
    {
        List<Post> listaPost = new ArrayList<Post>();
        
        for (Post post : this.listaPost)
        {
            if (post.getGruppo().equals(gruppo))
            {
                listaPost.add(post);
            }
        }
        return listaPost;
    }
    
}
