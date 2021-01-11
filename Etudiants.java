public class Etudiants extends Utilisateur {
String groupe;
int age ;
 

Promo promotion;
public Etudiants(int id, String nom, String email, Situation situation,int  dateS,int dateP,String groupe,Promo promotion,int age ) {
super(id,nom,email,situation,dateS,dateP);
this.groupe= groupe;
this.age=age;
this.promotion=promotion;
}
/**on définit les variables constantes d'un étudiant **/
record RecEtudiant(String name, int age, boolean  sexe , String NumEt,  ) {}

}
