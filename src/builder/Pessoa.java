package builder;

public class Pessoa {
    private String nome;
    private String email;
    private String apelido;

    private Pessoa(String nome, String email, String apelido) {
        this.nome = nome;
        this.email = email;
        this.apelido = apelido;
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

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", apelido='" + apelido + '\'' +
                '}';
    }

    public static class PessoaBuilder{
        private String nome;
        private String email;
        private String apelido;

        public PessoaBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public PessoaBuilder email(String email) {
            this.email = email;
            return this;
        }

        public PessoaBuilder apelido(String apelido) {
            this.apelido = apelido;
            return this;
        }

        public Pessoa builder(){
            return new Pessoa(nome, email, apelido);
        }
    }

}
