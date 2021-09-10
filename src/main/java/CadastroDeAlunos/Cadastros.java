package CadastroDeAlunos;

import JavaBean.Alunos;
import java.util.ArrayList;

/**Classe para objetos do tipo Cadastros, onde serão contidos, valores e métodos para o mesmo.
* @author Luiz Felipe,Tamara Silva,Hanna Gaby
* @version 1.00
* @since Release 01 da aplicação
*/
public class Cadastros {
    
    ArrayList<Alunos> alunosArray = new ArrayList();   
    
    /** Método para receber os dados do aluno e cadastrar na array
    @param  cad - array do tipo Alunos com todos os dados do aluno*/  
    
    public void cadastrar(Alunos cad){
        alunosArray.add(cad);
    }
    
    /** Método para retornar o numero de alunos cadastrados
    @return String - o numero de alunos já convertido em string*/  
    
    public String numeroDeAlunos(){
        return alunosArray.size() + "";
    }
    /**Método para formatar a data inserida e dd/mm/yyyy
     * @param data - Data de nascimento do aluno
     * @return String - a data já formatada
     */
    
    public String formataData(String data) {
        if(data.length() == 8){
            return String.format("%s%c%s%c%s", data.substring(0, 2), '/'
                , data.substring(2, 4), '/', data.substring(4));
        }else if(data.length() == 10 && data.charAt(2) == '/' && data.charAt(5) == '/'){
            return data;
        } else {
            return null;
        }
    }
    /**Método para formatar o cpf para XXX.XXX.XXX.XX
     * @param cpf - cpf do aluno
     * @return String - cpf já formatado
     */
    
    public String formataCpf(String cpf) {
        if(cpf.length() == 11){
            return String.format("%s%c%s%c%s%c%s", cpf.substring(0, 3), '.'
                , cpf.substring(3, 6), '.', cpf.substring(6, 9), '.', cpf.substring(9));
        }else if(cpf.length() == 14 && cpf.charAt(3) == '.' 
                && cpf.charAt(7) == '.' && cpf.charAt(11) == '.'){
            return cpf;
        } else {
            return null;
        }
    }    
    
    /**Método para formatar o cpf para XXX.XXX.XXX.XX
     * @param telefone - telefone do aluno
     * @return String - telefone já formatado
     */
    public String formataTelefone(String telefone) {
        if(telefone.length() == 13){
            return String.format("%c%s%c%s%c%s%c%s", '+', telefone.substring(0, 2), '('
                , telefone.substring(2, 4), ')', telefone.substring(4, 9), '-', telefone.substring(9));
        }else if(telefone.length() == 17 && telefone.charAt(0) == '+' && telefone.charAt(3) == '(' 
                && telefone.charAt(6) == ')' && telefone.charAt(12) == '-'){
            return telefone;
        } else {
            return null;
        }
    }
   
}
