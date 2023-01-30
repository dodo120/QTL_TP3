
public class Calculatrice {
	
	public Calculatrice() {}
	
	public int addition(int a, int b) {
		return a+b;
	}
	
	public int soustraction(int a, int b) {
		return a-b;
	}
	
	public double multiplication(int a, int b) {
		return a*b;
	}
	
	public double division(int a, int b) {
		return a/b;
	}
	
	public double calcul(int a, int b, String operateur) {
		double resultat = 0;
		
		switch(operateur) {
		case "+":
			resultat = a+b;
			break;
		case "-":
			resultat = a-b;
			break;
		case "*":
			resultat = a*b;
			break;
		case "/":
			resultat = a/b;
			break;
		}
		
		return resultat;
	}
	
	public static int factorielleRecursive(int n) {
	    if (n == 0) {
	        return 1;
	    } else {
	        return n * factorielleRecursive(n-1);
	    }
	}
	
	public static int factorielleIterative(int n) {
	    int result = 1;
	    for (int i = 1; i <= n; i++) {
	        result *= i;
	    }
	    return result;
	}
	
	
	public boolean wait(int time) {
		try {
			Thread.sleep(time*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

}
