
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Random;

public class Main{
	/*
	 * La Ruleta 
	 * así pots apostar a numero color 
	 * el nombre ix aleatoriament amb l'objecte random
	 */		
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	//variables
	int diners = 30,aposta = 0,pasta = 0,pastacolor = 0;
	boolean apostar = false,numero = false,color = false;
	int triacolor = 2, trianumero = 2 ;
	String q1 = "";					
	//instancies
	Random rand = new Random(System.nanoTime());
	UI u = new UI();
	Apostar a = new Apostar();
	//inici
	q1 = "Ruleta\nEls diners q tens son: "+diners;
	u.show(q1);//missatge per a informarete dels teus diners
	
	//pre joc
	while(diners > 0){
	int aleatorio = rand.nextInt(36);
	String[] n = new String[] {"Si","No"};
	trianumero = u.option("Vols Apostar a numero", "numero", n);//Si = 0 no = 1
	if(trianumero == -1){
		System.exit(0);
	}
	if(trianumero == 0){
		numero = true;
	}
	if(numero){
		q1 ="Quin Nº?";
		aposta = u.inputInteger(q1);//numero
		q1 ="Quants Dines?";
		pasta = u.inputInteger(q1);//dines
	}
	String[] c = new String[] {"Roig","Negre","No"};
	triacolor = u.option("A quin color apostes?", "Color", c);//color roig o negre
	if(triacolor == -1){
		System.exit(0);
	}
	if(triacolor == 0 || triacolor == 1){
		color = true;
	}
	if(color){
		q1 = "Quants dines?";
		pastacolor = u.inputInteger(q1);//dines
	}
	if(color || numero){
		apostar = true;
	}								
	//Joc	
	while(apostar){
		apostar = false;
		q1 = "Ha ixit ->"+aleatorio;
		u.show(q1);//num que ha ixit		
		if(numero){
			a.ApostarNumero(diners, pasta, q1, aposta, aleatorio);
		}
		numero = false;
		if(color){
			a.ApostarColor(q1, aleatorio, diners, pastacolor, triacolor);
		}
		color = false;
	}		
}
	q1 = "Programed by Gerard & Isma";
	u.show(q1);
	//The End..
 }
}