package sum10Numbs;

import javax.swing.JOptionPane;

public class Sum10Numbs {

	public static void main(String[] args) {

		double numeros, suma = 0;
		
		for(int i=1; i<=10; i++) {
			numeros=Double.parseDouble(JOptionPane.showInputDialog("Digita un número"));
			suma+=numeros;
		}
		
		System.out.println("La suma total es: "+suma);
		
	}

}
