package CadastrosProject;


public class Cadastros {  
    private String matricula;
    private String nome;
    private String dataN;
    private String telefone;
    private String cpf;

    public Cadastros(String matricula, String nome, String dataN, String telefone, String cpf) {
        this.matricula = matricula;
        this.nome = nome;
        this.dataN = dataN;
        this.telefone = telefone;
        this.cpf = cpf;
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

    @Override
    public String toString() {
        return nome + "" + matricula+ "" +dataN+ "" +""+ telefone +""+ cpf; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
