package be.Bajeux.personnage;
import be.Bajeux.mecanisme.Utile;

public abstract class Personnage {
    private int stamina;
    private int strenght;
    private int hp;
    private boolean isDead ;

    public Personnage(int stamina,int strenght) {

        this.stamina = stamina;
        this.strenght = strenght;
        this.hp = Utile.modificateur(this.stamina);
        this.isDead = false;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void frapper(Personnage p1,Personnage p2){

        p2.hp -=  Utile.lancerDe(4,1,1 + Utile.modificateur(p1.strenght));
    }

    public void combat (Personnage heros,Personnage monstre){

        while (!heros.isDead || !monstre.isDead){
            heros.frapper(heros,monstre);
            monstre.frapper(monstre,heros);
            if (heros.hp == 0){
                heros.isDead = true;
            }else if (monstre.hp == 0){
                monstre.isDead = true;

            }
        }


    }
}
