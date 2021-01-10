package progav;

public class Utilisateur {
int id;
String nom;
String email;
Situation situation;
int  dateS;
int dateP;
public Utilisateur (int id, String nom, String email, Situation situation,
int  dateS,int dateP) {
	this.id=id;
	this.nom=nom;
	this.email=email;
	this.situation=situation;
	this.dateP=dateP;
	this.dateS=dateS;
}

}
