/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matthew
 */
public class DemoStartup {
    public static void main(String[] args) {
        Song song1 = new Song("1", "First Song Ever", "Nick Cage", "Rock");
        Song song2 = new Song("2", "Second Song", "Bill Clinton", "Jazz");
        Song song3 = new Song("3", "Third Song", "Nobody Important", "Classical");
        Song song4 = new Song("4", "Fourth Song", "Justin Case", "Pop");
        Song song5 = new Song("1", "First Song Ever", "Nick Cage", "Rock");
        
        List test = new ArrayList();
            test.add(song1);
            test.add(song2);
            test.add(song3);
            test.add(song4);
            test.add(song5);
        
        for(int i = 0; i < test.size(); i++){
            System.out.println(test.get(i));
        }
        
        if(song1.getId().equals(song5.getId())){
            System.out.println("They are equal in this test!");
        }else{
            System.out.println("This test Failed!");
        }
    }
}
