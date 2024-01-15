public interface Controlador {
    void ligar (); // por padrão os métodos na interface são públicos e abstratos, logo não é necessário declar o public abstract o início do método.
    void desligar ();
    void abrirMenu();
    void fecharMenu();
    void maisVolume();
    void menosVolume();
    void ligarMudo();
    void desligarMudo();
    void play();
    void pause ();
}
