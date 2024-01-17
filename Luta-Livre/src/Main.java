public class Main {
    public static void main(String[] args) {
        Lutador [] lutador  = new Lutador [3];

        lutador [0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1);
        lutador [1] = new Lutador ("Pyhscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        lutador [2] = new Lutador("DeadCode", "Egito", 28, 1.93, 81.6, 13, 0, 2);

        Luta Combate01 = new Luta();

        Combate01.marcarLuta(lutador[0], lutador[2]);
        Combate01.lutar();
        lutador[0].status();
        lutador[1].status();



    }

}
