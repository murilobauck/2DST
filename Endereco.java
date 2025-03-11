public class Endereco {
    private String cep;
    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;

    public Endereco(String cep, String numero) {
        // consumir uma API
        if (!cep.isEmpty()) {
            // atribuir outros valores
            this.numero = numero;
        } else {
            this.cep = "";
            this.logradouro = "";
            this.numero = "";
            this.bairro = "";
            this.cidade = "";
        }
    }

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

}
