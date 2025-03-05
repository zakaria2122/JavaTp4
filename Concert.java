
import java.util.List;
import java.util.ArrayList;


public class Concert {
        private String nomConcert;
       private String nomGroup;
       private List<Billet> billets;

       public Concert(String nomConcert, String nomGroup ){
        this.nomConcert = nomConcert;
        this.nomGroup = nomGroup;
        this.billets = new ArrayList<>();}

        public String getNomConcert() {
            return nomConcert;
        }
    
        // Getter pour le nom du groupe
        public String getNomGroup() {
            return nomGroup;
        }
    
        // Getter pour la liste des billets
        public List<Billet> getBillets() {
            return billets;
        }
    
        // Méthode pour ajouter un billet au concert
        public void ajouterBillet(Billet billet) {
            this.billets.add(billet);
        }

       }

