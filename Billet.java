import java.util.ArrayList;
import java.util.List;

public class Billet{
    private int prix;
    private List<Concert> concert;
    private List<Spectateur> spectateurs;


    public Billet(int prix, Concert concert, Spectateur spectateurs){
        this.prix = prix;
        this.concert = new ArrayList<>();
        this.spectateurs = new ArrayList<>();
        this.concert.add(concert);
        this.spectateurs.add(spectateurs);
    } 
    public List<Concert> getConcerts(){
            return this.concert;

    }  
    public List<Spectateur> getSpectateur(){
        return this.spectateurs;
    }
}