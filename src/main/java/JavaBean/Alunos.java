package JavaBean;

/**Classe para objetos do tipo JavaBean, onde serão contidos, valores e métodos para o mesmo.
* @author Luiz Felipe,Tamara Silva,Hanna Gaby
* @version 1.00
* @since Release 01 da aplicação
*/
public class Alunos {  
    private String matricula;
    private String nome;
    private String dataN;
    private String telefone;
    private String cpf;
    private int idade;

    /**Construtor com parametros
@param matricula - Numero da Matricula
@param nome - Nome do aluno
@param dataN - Data de nascimento do aluno
@param telefone - Telefone do aluno
@param cpf - cpf do aluno 
@param idade - idade do aluno
*/
    
    public Alunos(String matricula,int idade ,String nome,String dataN, String telefone, String cpf) {
        this.matricula = matricula;
        this.nome = nome;
        this.dataN = dataN;
        this.telefone = telefone;
        this.cpf = cpf;
        this.idade=idade;
    }
    
    public Alunos(){
        
    }
    
/** Método para retorno da matricula do aluno
 * @return String- Numero da matricula*/
    
    public String getMatricula() {
        return matricula;
    }

    /** Método para Alterar o valor da matricula do aluno
* @param  matricula*/ 
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /** Método para retorno do nome do aluno
 * @return String- Nome do aluno*/
    
    public String getNome() {
        return nome;
    }
    
    /** Método para Alterar o nome do aluno
* @param nome*/

    public void setNome(String nome) {
        this.nome = nome;
    }

  /** Método para retorno da data de nascimento do aluno
* @return String - Data de nascimento*/  
    
    public String getDataN() {
        return dataN;
    }

    /** Método para Alterar data de nascimento do aluno
* @param dataN */
    
    public void setDataN(String dataN) {
        this.dataN = dataN;
    }

    /** Método para retorno do numero de telefone  do aluno
* @return String - Numero de Telefone */
    
    public String getTelefone() {
        return telefone;
    }

    /** Método para Alterar numero de telefone  do aluno
* @param telefone*/
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    /** Método para retorno do cpf  do aluno
* @return String - cpf*/

    public String getCpf() {
        return cpf;
    }
    
/** Método para Alterar o cpf do aluno 
* @param cpf */
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /** Método para retorno da idade  do aluno
* @return int - idade */
    public int getIdade() {
        return idade;
    }
    
    /** Método para Alterar a idade do aluno 
* @param idade */

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    /** Método para concatenar e retornar os dados do aluno em forma de string
 * @return String - matricula +" "+ nome+" " + idade + " " +dataN+" "+ telefone +" "+ cpf */
    
    @Override
    public String toString() {
        return matricula +" "+ nome+" "+idade+" "+dataN+" "+ telefone +" "+ cpf; 
    }
    
}