public class Lutador implements Classificacao{
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Método Construtor
    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    //Métodos de acesso (getter) e modificadores (setter)

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {

        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if(this.peso <=120.2) {
            this.categoria = "Pesado";
        } else  {
            this.categoria = "Inválido";
    }
}

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    //Implementação dos métodos da Interface Classificacao.

    @Override
    public void apresentar() {
        System.out.printf("\nCHEGOU A HORA!! Apresentamos o lutador: %s vindo diretamente da (o) %s com %d anos, tem %.2f " +
                        "\nmetros de altura, pesando %.2f Kg, com um saldo de %d " +
                        "\nvitória(s), %d derrota(s) e %d empate(s).\n", getNome(),getNacionalidade(),
                getIdade(), getAltura(), getPeso(), getVitorias(), getDerrotas(),getEmpates());
    }

    @Override
    public void status() {
        System.out.printf("\n%s, lutador da categoria de peso %s, \ncom %d vitória(s), " +
                        "%d derrota(s) e %d empate(s).\n",getNome(), getCategoria(),getVitorias(),
                getDerrotas(), getEmpates());
    }


    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() - 1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
}
