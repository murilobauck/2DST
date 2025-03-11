public class Professor {
    private int rm;
    private String nome;
    private String email;
    private String telefone;
    private String endereco;

    public Professor() {
    }

    public Professor(int rm, String nome, String email, String telefone, String endereco) {
        this.rm = rm;
        this.nome = nome.toUpperCase();
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}