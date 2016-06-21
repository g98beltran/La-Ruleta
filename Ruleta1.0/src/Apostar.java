
public class Apostar {
	
	public void ApostarNumero(boolean numero,int diners,int pasta,String q1,int aposta,int aleatorio){
		UI u = new UI();
		while(numero){//si avanç ha apostat a numero
		numero = false;
		q1 = "Pel que fa de la teva aposta al numero";
		u.show(q1);
		//Apostar al numero
		if(aposta == aleatorio){//win
			diners = diners + (pasta*36);
			q1 = "Win!!! Has guanyat: "+ pasta*36 +"\nEls dines totals q tens son: "+diners;
			u.show(q1);						
		}else{//los
			diners = diners - pasta;
			q1 = "Loser.\nEls diners totals q tens es: "+diners;
			u.show(q1);
			}
		}
	}
	public void ApostarColor(boolean color,String q1,int aleatorio,int diners,int pastacolor,int triacolor){
		UI u = new UI();
		while(color){//si avanç has apostat a color
		color = false;
		q1 = "Pel que fa a la teva aposta a color";
		u.show(q1);
		if(aleatorio == 0){//excluim primer el 0
			q1 = "Ha ixit 0 per tant no ha ixit color...";
			u.show(q1);
			diners = diners - pastacolor;
			q1 ="Lose...\nEls diners totals q tens es: "+diners;
			u.show(q1);
		}else{
		if((aleatorio % 2) == 0){//si es parell es roig
		q1 = "El color es roig!";
		u.show(q1);
		if(triacolor == 1){//win
		diners = diners + (pastacolor * 2);
		q1 = "Win!\nEls diners totals q tens es: "+diners;
		u.show(q1);
		}else{//lose
		diners = diners - pastacolor;
		q1 = "Lose.\nEls diners totals q tens es: "+diners;
		u.show(q1);
		}
		}else{//si no es roig ni 0 es negre
		q1 = "El color es negre!";
		u.show(q1);
		if(triacolor == 2){//win
		diners = diners + (pastacolor * 2);
		q1 = "Win!\nEls diners totals q tens es: "+diners;
		u.show(q1);
		}else{//lose
		diners = diners - pastacolor;
		q1 = "Lose.\nEls diners totals q tens es: "+diners;
		u.show(q1);
		     }			
	       }
		}
	  }
	}

}
