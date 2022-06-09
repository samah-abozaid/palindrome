
package com.poe.demotestunitaire.palindrome;


public class Palindrome {
     public boolean isPalindrome(String phrase){
        
        phrase = phrase.toLowerCase();
        phrase = phrase.replaceAll(" ", "");
        phrase = StringUtils.stripAccents(phrase);
        
        int debut = 0;
        int fin = phrase.length()-1;
        while(debut < fin){
            if(phrase.charAt(debut) != phrase.charAt(fin))
                return false;
            fin--;
            debut++;
        }
        
        return true;
    }
    
}
