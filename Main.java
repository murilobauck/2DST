//esta é uma class driver

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setRm(20240453);
        aluno1.setNome("MuRilo");
        aluno1.setEmail("murilobauck@gmail.com");

        Aluno aluno2 = new Aluno(20240453, "MuRilo", "murilobauck@gmail.com");
        System.out.println(aluno2.getRm());
        System.out.println(aluno2.getNome());

        System.out.println(aluno1.obterDados());

        Aluno aluno3 = new Aluno();
        aluno3.setNome("murilo");
        Endereco endereco = new Endereco("111111", "123");
        aluno3.setEndereco(endereco);

        aluno3.setEndereco(new Endereco("123123", "123"));
        System.out.println(
                aluno3.getEndereco().getLogradouro());
    }
}