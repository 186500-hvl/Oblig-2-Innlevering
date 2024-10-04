package no.hvl.dat100.tabeller;

public class Tabeller {
	// a)
	public static void skrivUt(int[] tabell) {
			
			System.out.print("(");
		
		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i]+" ");
		}
		System.out.print("(");
	}
	
	
	// b)
	public static String tilStreng(int[] tabell) {
		 {
		    if (tabell == null || tabell.length == 0) {
		        return "[]";
		    }
		    StringBuilder sb = new StringBuilder();
		    sb.append("[");
		    for (int i = 0; i < tabell.length; i++) {
		        sb.append(tabell[i]);
		        if (i < tabell.length - 1) {
		            sb.append(",");
		        }
		    }
		    sb.append("]");
		    return sb.toString();
		    }
		
	}
	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
	   
	    for (int tall : tabell) {
	        sum += tall;
	    }
	    return sum;
	}
	
	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		for (int element : tabell) {
	        if (element == tall) {  
	            return true;        
	        }
	    }
	    return false;
	}
	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++) {
	        if (tabell[i] == tall) {
	            return i;
	        }
	    }
	    return -1;
	}
	// f)
	public static int[] reverser(int[] tabell) {
		 int lengde = tabell.length;
		    int[] reversertTabell = new int[lengde];
		    for (int i = 0; i < lengde; i++) {
		        reversertTabell[i] = tabell[lengde - 1 - i];
		    }
		    return reversertTabell;
	}
	// g)
	public static boolean erSortert(int[] tabell) {
		for (int i = 1; i < tabell.length; i++) {
	     
	        if (tabell[i] < tabell[i - 1]) {
           return false;
	        }
		}
			return true;
	}
	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		
	    int nyLengde = tabell1.length + tabell2.length;
	
	    int[] nyTabell = new int[nyLengde];
	  
	    for (int i = 0; i < tabell1.length; i++) {
	        nyTabell[i] = tabell1[i];
	    }
	
	    for (int i = 0; i < tabell2.length; i++) {
	        nyTabell[i + tabell1.length] = tabell2[i];
	    }
	  
	    return nyTabell;
		
	}
	public static void main(String[] args) {
   
   int[] tabell1 = {42,67,89};
   int[] tabell2 = {5, 15, 25, 35, 45};
  
   skrivUt(tabell1);
   System.out.println("\n" + tilStreng(tabell1));
   System.out.println(summer(tabell1));
   System.out.println(finnesTall(tabell1, 30));
   System.out.println(posisjonTall(tabell1, 40));
   skrivUt(reverser(tabell1));
   System.out.println("\n" + erSortert(tabell1));
   skrivUt(settSammen(tabell1, tabell2));
}
}
