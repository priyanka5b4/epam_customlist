/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package custom_list;

/**
 *
 * @author nanda
 */
public class Mianclass {
   
    public static void main(String[] args) 
    {
        Custom_list<Integer> list = new Custom_list<>();
 
        //Add elements
        list.add(10);
        list.add(20);
        list.add(30);
       
         
        //Remove elements from index
        list.remove(2);
       
         
        //Get element with index
        System.out.println( list.Get_element(0) );
        System.out.println( list.Get_element(1) );
 
        //List Size
        System.out.println(list.get_size());
    }
}

