import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;


    //Métodos da Classe Luta
    //verificar se ele deu problema de equals l1.getCategoria().equals(l2.getCategoria)
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria() == l2.getCategoria() && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar() {
        if (this.isAprovada()){
            this.getDesafiante().apresentar();
            this.getDesafiado().apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); //gera os numeros de 0 a 2.

            System.out.println("\n#-------- FIGHT!! -------- #");

            switch(vencedor){
                case 0:
                    System.out.println("Empate");
                    getDesafiado().empatarLuta();
                    getDesafiante().empatarLuta();
                    break;
                case 1:
                    System.out.println("Vitória da(o) "+getDesafiado().getNome());
                    getDesafiado().ganharLuta();
                    getDesafiante().perderLuta();
                    break;
                case 2:
                    System.out.println("Vitória da(o) "+getDesafiante().getNome());
                    getDesafiado().perderLuta();
                    getDesafiante().ganharLuta();
                    break;
            }
            System.out.println("#-------------------------- #");
        }else {
            System.out.println("\nA luta não foi aprovada.");
        }
    }


    //Métodos de acesso e modificadores
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
