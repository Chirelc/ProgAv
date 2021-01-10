package progav;

public class Etudiants extends Utilisateur {
String groupe;
int age ;
record  Point(int x, int y) {
	Point
};

Promo promotion;
public Etudiants(int id, String nom, String email, Situation situation,int  dateS,int dateP,String groupe,Promo promotion,int age ) {
super(id,nom,email,situation,dateS,dateP);
this.groupe= groupe;
this.age=age;
this.promotion=promotion;
}


}
