package Ex1_TD2;

public class Client {
	 public static void main(String[] argv)
	    {
	        ProgramFactory f = new ProgramFactory(); 
	        ProgramInterface p1 = f.createProgram(1); 
	        ProgramInterface p2 = f.createProgram(2);
	        ProgramInterface p3 = f.createProgram(3);
	        ProgramInterface p4 = f.createProgram(4);
	        
	        p1.go();
	        p2.go();
	        p3.go();
	        p4.go();
	    }
}
