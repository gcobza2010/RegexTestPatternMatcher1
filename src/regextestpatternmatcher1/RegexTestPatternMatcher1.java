/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regextestpatternmatcher1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author s0600070
 */
public class RegexTestPatternMatcher1 {
   public static final String EXAMPLE_TEST = "Users, User Group, User Activity Log";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count = 0;
        Pattern pattern = Pattern.compile("u");
        
        Matcher matcher = pattern.matcher(EXAMPLE_TEST);
        while(matcher.find()) {
            count++;
        System.out.print(matcher.start() +  " ......" + matcher.group() + "...." 
                + matcher.end());
           }
        System.out.println("Total occurence:" + count);
    }
    
}

