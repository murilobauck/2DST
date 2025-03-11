// classe de objeto obs nao precisa de public static void main
public class Aluno {

    // caracteristicas / atributos / prorpiedades
    private int rm;
    private String nome;
    private String email;
    private Endereco endereco;

    // métodos / funções construtores
    /*
     * visibilidade tipo_de_retorno nome_função([parametros]) {
     * 
     * }
     * 
     * public double somar(double a, double b) {
     * 
     * }
     */
    public Aluno() {
    }

    public Aluno(int rm, String nome, String email) {
        this.rm = rm;
        this.nome = nome;
        this.email = email;
    }

    public Aluno(int rm, String nome) {
        this.rm = rm;
        this.nome = nome;
    }

    public Aluno(String email, int rm) {
        this.email = email;
        this.rm = rm;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    // métodos de funcionabilidade
    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public String getNome() {
        return nome;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public int getRm() {
        return rm;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;

    }

    public String obterDados() {
        return "Aluno Rm: " + rm +
                "\nNome: " + nome +
                "\nEmail: " + email;
    }

}
