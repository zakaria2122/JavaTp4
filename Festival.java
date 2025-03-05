import java.util.ArrayList;
import java.util.List;
public class Festival {
 private String nom;
 private String adresse;
 private List<Concert> concertList;
 private List<Billet> billetList;


 public Festival(String nom, String adresse){
    this.nom = nom;
    this.adresse = adresse;
    this.concertList =new ArrayList<>();
    this.billetList = new ArrayList<>();
 }
 
 public void reserver(Spectateur spectateur, Concert concert,int prix){
    Billet billet = new  Billet( spectateur,  concert , prix );
 }
}

public int nombreBilletConcert(Concert concert){

}

public int nombreConcert(){

}
