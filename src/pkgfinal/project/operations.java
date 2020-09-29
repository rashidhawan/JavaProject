/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgfinal.project;

import java.awt.print.Book;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author Rashi Dhawan
 */
public class operations {
	 HashMap<Integer,Book> map=new HashMap<Integer,Book>();
         
         
         
	public Book search(int bid) {
		return map.get(bid);
	}

	public Book insert(Book b) {
		Set<Integer> keySet = map.keySet();
		Integer max = 1;
		if(!keySet.isEmpty())
			max = Collections.max(keySet);
		b.setBid(max+1);
		
		map.put(max+1,b);
		
		b.setBid(max+1);
		
		map.put(max+1,b);
		return b;	
	}
	public Book delete(Book b) {
		map.remove(b.getBid());
		return b;
	
	}
        
        public static void main(String[] args)
        {
        
       
    System.out.println("********************Welcome to the Student Library!********************");
    System.out.println("              Please Select From The Following Options:               ");
System.out.println("**********************************************************************");
        
        operations obj = new operations();
        obj.insert();
        obj.search();
        obj.delete();
        
        
        }
}

 