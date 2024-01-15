public class Main {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        //c.setVolume(80); //se meu método set estiver público, poerei atribuir
        // a ele um valor direto, nesse caso o volume iria para 80.
        c.maisVolume();
        c.menosVolume();
        c.play();
        c.abrirMenu();
        c.fecharMenu();
    }
}
