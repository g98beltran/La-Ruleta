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
	int diners = 30,aposta = 0,pasta = 0;
	boolean apostar = false,numero = false,color = false;
	int triacolor, trianumero ,pastacolor = 0;
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
	q1 ="Introdueix \n- 1 per apostar a numero\n- 0 si no vols";// apostar a un numero 0,1,2,..36
	trianumero = u.inputInteger(q1);
	if(trianumero == 1){
		numero = true;
	}
	if(numero){
		q1 ="Introdueix el nº al que apostes: ";
		aposta = u.inputInteger(q1);//numero
		q1 ="Introdueix el dines q apostes";
		pasta = u.inputInteger(q1);//dines
	}					
	q1 = "Introdueix\n- 1 per apostar al roig\n- 2 per apostar al negre\n- 0 si no....";
	triacolor = u.inputInteger(q1);//color roig o negre
	if(triacolor == 1 || triacolor ==2){
		color = true;
	}
	if(color){
		q1 = "Quant vols apostar al color: ";
		pastacolor = u.inputInteger(q1);//dines
	}
	if(color || numero){
		apostar = true;
	}								
	//Joc	
	while(apostar){
		q1 = "El nº q ha ixit es: "+aleatorio;
		u.show(q1);//num que ha ixit
		apostar = false;
		a.ApostarNumero(numero, diners, pastacolor, q1, aposta, aleatorio);
		a.ApostarColor(color, q1, aleatorio, diners, pastacolor, triacolor);
		}		
	}
	q1 = "Programed by Gerard & Isma";
	u.show(q1);
	//The End..
  }
}