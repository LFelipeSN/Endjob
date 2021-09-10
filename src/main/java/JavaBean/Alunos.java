package JavaBean;

/**Classe para objetos do tipo JavaBean, onde serão contidos, valores e métodos para o mesmo.
* @author Luiz Felipe,Tamara Silva,Hanna Gaby
* @version 1.00
* @since Release 01 da aplicação
*/
public class Alunos {  
    private String matricula;
    private String nome;
    private String dataNascimento;
    private String telefone;
    private String cpf;
    private int idade;

    /**Construtor com parametros
    @param matricula - Numero da Matricula
    @param nome - Nome do aluno
    @param dataNascimento - Data de nascimento do aluno
    @param telefone - Telefone do aluno
    @param cpf - cpf do aluno 
    @param idade - idade do aluno
    */
    
    public Alunos(String matricula,int idade ,String nome,String dataNascimento, String telefone, String cpf) {
        this.matricula = matricula;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.cpf = cpf;
        this.idade=idade;
    }
    /** Construtor vazio
    */
    public Alunos(){
        
    }
    
/** Método para retorno da matricula do aluno
 * @return String- Matricula do aluno*/
    
    public String getMatricula() {
        return matricula;
    }

    /** Método para Alterar o valor da matricula do aluno
    *@param  matricula - Matricula do aluno
*/ 
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /** Método para retorno do nome do aluno
    *@return String- Nome do aluno*/
    
    public String getNome() {
        return nome;
    }
    
    /** Método para Alterar o nome do aluno
    *@param nome - Nome do aluno*/

    public void setNome(String nome) {
        this.nome = nome;
    }

  /** Método para retorno da data de nascimento do aluno
    *@return String - Data de nascimento do aluno*/  
    
    public String getDataN() {
        return dataNascimento;
    }

    /** Método para Alterar data de nascimento do aluno
* @param dataNascimento- Data de nascimento do aluno
*/
    
    public void setDataN(String dataNascimento) {
        this.dataNascimento= dataNascimento;
    }

    /** Método para retorno do numero de telefone  do aluno
* @return String - Telefone do aluno */
    
    public String getTelefone() {
        return telefone;
    }

    /** Método para Alterar numero de telefone  do aluno
* @param telefone - Telefone do aluno*/
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    /** Método para retorno do cpf  do aluno
* @return String - cpf do aluno*/

    public String getCpf() {
        return cpf;
    }
    
/** Método para Alterar o cpf do aluno 
* @param cpf - cpf do aluno*/
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /** Método para retorno da idade  do aluno
* @return int - idade do aluno*/
    public int getIdade() {
        return idade;
    }
    
    /** Método para Alterar a idade do aluno 
* @param idade - idade do aluno*/

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    /** Método para concatenar e retornar os dados do aluno em forma de string
 * @return String - matricula +" "+ nome+" " + idade + " " +dataN+" "+ telefone +" "+ cpf */
    
    @Override
    public String toString() {
        return matricula +" "+ nome+" "+idade+" "+dataNascimento+" "+ telefone +" "+ cpf; 
    }
    
}