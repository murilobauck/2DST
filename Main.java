//esta é uma class driver

import java.util.ArrayList;
import java.util.List;

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

        int[] numeros = new int[5];
        numeros[0] = 7;

        Aluno aluno5 = new Aluno();

        Aluno[] alunos = new Aluno[5];

        alunos[0] = new Aluno();
        alunos[0].setRm(123);

        List<Aluno> listaAlunos = new ArrayList<Aluno>();

        listaAlunos.add(new Aluno());

        Aluno aluno6 = new Aluno();
        listaAlunos.add(
                aluno6);

        Aluno aluno = listaAlunos.get(0);
    }
}