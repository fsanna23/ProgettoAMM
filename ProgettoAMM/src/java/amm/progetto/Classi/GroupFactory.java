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
public class GroupFactory 
{
    private static GroupFactory singleton;
    
    public static GroupFactory getInstance()
    {
        if (singleton == null) {
            singleton = new GroupFactory();
        }
        return singleton;
    }
    
    private ArrayList<Group> listaGruppi = new ArrayList<Group>();
    
    private GroupFactory()
    {
        GroupFactory groupFactory = GroupFactory.getInstance();
        
        Group group1 = new Group();
        group1.setId(0);
        group1.setNome("Musica");
        group1.setFotoGruppo("img/music.png");
        
        Group group2 = new Group();
        group2.setId(1);
        group2.setNome("I Lettori");
        group2.setFotoGruppo("img/glasses.png");
        
        listaGruppi.add(group1);
        listaGruppi.add(group2);
                
    }
    
    public Group getGroupById(int id)
    {
        for (Group group : this.listaGruppi) {
            if (group.getId() == id) {
                return group;
            }
        }
        return null;
    }
 
}
