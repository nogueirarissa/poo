public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //Método Construtor: passa o estado inicial que objeto instanciado terá.
    public ControleRemoto (){
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }

    //Métodos acessores (getters) e modificadores (setters)
    public int getVolume() {
        return volume;
    }

    /*Supondo que eu queira que o usuário altere o volume apenas ao clicar,
    aumentando de 5 em 5 como definido, sem que isso possa ser feito de
    outra maneira, eu posso colocar meu setVolume como privado. E aí eu
    só posso alterar a variável volume através do método maisVolume e
    menosvolume*/
    private void setVolume(int volume) {
        this.volume = volume;
    }
    // em atributos booleanos, o método acessor get pode ser escrito como isNomeDoAtributo
    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    // Implementação dos métodos da Interface Controlador.

    @Override // sobrescreve o método abstrato definido na interface, permitindo que seja programado para a finalidade do controle remoto.
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.isLigado()){
            System.out.println("-------MENU -------");
            System.out.println("Está ligado? " + this.isLigado());
            System.out.println("Está tocando? " + this.isTocando());
            System.out.print("Volume: "+this.getVolume()+ " ");
            for (int i = 0; i<= this.getVolume(); i += 10){
                System.out.print("|");
            }
        } else {
            System.out.println("Ligue o dispositivo para abrir o menu");
        }
    }

    @Override
    public void fecharMenu() {
        if (this.isLigado()) {
            System.out.println("\nFechando Menu...");
        }
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()){
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Impossível aumentar volume");
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()){
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Impossível diminuir volume");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !this.isTocando()){
            this.setTocando(true);
        } else {
            System.out.println("Não consegui reproduzir");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()){
            this.setTocando(false);
        } else {
            System.out.println("Não consegui pausar");
        }
    }
}
