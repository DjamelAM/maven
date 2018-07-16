package dev;
import com.github.lalyos.jfiglet.FigletFont;
import java.util.ResourceBundle;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String titre = ResourceBundle.getBundle("application").getString("titre");
    	String asciiArt = FigletFont.convertOneLine(titre);
        System.out.println(asciiArt);
        
    	String environnement = ResourceBundle.getBundle("application").getString(
    			"environnement");
    	String str = "";
    	if( environnement.equals("DEV"))
    	{
    		str = "Bonjour oui";
    	}
    	else
    	{
    		str= "Aurevoir oui";
    	}
    	String asciiArt1 = FigletFont.convertOneLine(str);
    	
    			System.out.println(asciiArt1);
    }
}
