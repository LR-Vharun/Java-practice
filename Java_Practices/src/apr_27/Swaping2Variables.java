package apr_27;
import java.util.*;
public class Swaping2Variables {
	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in);
//		String p="help",q="ME!";
//		p=p+q;
//		q=p.substring(0, p.length()-q.length());
//		
//		p=p.substring( p.length()-q.length());
//		System.out.println("p = "+p);
//		System.out.println("q = "+q);
//		
		String p = "help", q = "ME!";
		int qorignal=q.length();
		p = p + q; // p becomes "helpME!"
		q = p.substring(0, p.length() - q.length()); // q becomes "help"
		p = p.substring(p.length() - qorignal); // p becomes "ME!"
		System.out.println("p = " + p); // Outputs: p = ME!
		System.out.println("q = " + q); // Outputs: q = help
	}

}
