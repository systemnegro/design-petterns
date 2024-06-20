package builder;

public class TesteBuilder {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa.PessoaBuilder()
                .nome("irineu")
                .email("irineudasilvasauro@gmail.com")
                .apelido("irineu")
                .builder();

        System.out.println(pessoa);
    }
}
