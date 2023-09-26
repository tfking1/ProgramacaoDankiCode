package Aula04;

public class Player {
    public int vida = 10;
    public String nome = "Joao";


    public void perderVida() {
        vida-=1;
    }
    public void ganharVida() {
        vida+=1;
    }
}
