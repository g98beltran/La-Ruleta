
public class Apostar {
	
	public void ApostarNumero(int diners,int pasta,String q1,int aposta,int aleatorio){
		UI u = new UI();
		//si avans ha apostat a numero
		//Apostar al numero
		if(aposta == aleatorio){//win
			diners = diners + (pasta*36);
			q1 = aleatorio+"\nHas guanyat ->"+ pasta*36 +"$\nTens->"+diners+"$";
			u.show(q1);						
		}else{//los
			diners = diners - pasta;
			q1 = aleatorio+"\nHas perdut\nTens->"+diners+"$";
			u.show(q1);
			}
		}
	public void ApostarColor(String q1,int aleatorio,int diners,int pastacolor,int triacolor){
		UI u = new UI();
		//si avanç has apostat a color
		if(aleatorio == 0){//excluim primer el 0
			diners = diners - pastacolor;
			q1 ="No ha ixit color\nTens->"+diners+"$";
			u.show(q1);
		}else{
		if((aleatorio % 2) == 0){//si es parell es roig
		u.show(q1);
		if(triacolor == 0){//win
		diners = diners + (pastacolor * 2);
		q1 = "Has guanyat es Roig\nTens->"+diners+"$";
		u.show(q1);
		}else{//lose
		diners = diners - pastacolor;
		q1 = "Has perdut es Roig\nTens->"+diners+"$";
		u.show(q1);
		}
		}else{//si no es roig ni 0 es negre
		u.show(q1);
		if(triacolor == 1){//win
		diners = diners + (pastacolor * 2);
		q1 = "Has guanyat es Negre\nTens->"+diners+"$";
		u.show(q1);
		}else{//lose
		diners = diners - pastacolor;
		q1 = "Has perdut es Negre\nTens->"+diners+"$";
		u.show(q1);
		     }			
	       }
		}
	  }
	}