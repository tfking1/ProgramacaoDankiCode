package Aula04;

public class Game {
    public static void main(String[] args) {

        Player player = new Player();

        player.perderVida();
        
        player.perderVida();

        player.ganharVida();

        System.out.println(player.vida);
    
    }
}
