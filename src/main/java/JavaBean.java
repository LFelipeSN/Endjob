public class JavaBean {  
    private String matricula;
    private String nome;
    private String dataN;
    private String telefone;
    private String cpf;
    private int idade;

    public JavaBean(String matricula,int idade ,String nome, String dataN, String telefone, String cpf) {
        this.matricula = matricula;
        this.nome = nome;
        this.dataN = dataN;
        this.telefone = telefone;
        this.cpf = cpf;
        this.idade=idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataN() {
        return dataN;
    }

    public void setDataN(String dataN) {
        this.dataN = dataN;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    @Override
    public String toString() {
        return matricula +" "+ nome+" "+idade+" "+dataN+" "+ telefone +" "+ cpf; 
    }
    
}
