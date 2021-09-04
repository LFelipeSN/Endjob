/**Classe para objetos do tipo Cadastros, onde serão contidos, valores e métodos para o mesmo.
* @author Luiz Felipe,Tamara Silva,Hanna Gaby
* @version 1.00
* @since Release 01 da aplicação
*/


import java.util.ArrayList;
public class Cadastros {
    
    ArrayList<JavaBean> alunos = new ArrayList();   
    
  /** Método para receber os dados do aluno e cadastrar na array
@param  cad - array do tipo JavaBean com todos os dados do aluno*/  
    
    public void cadastrar(JavaBean cad){
        alunos.add(cad);
    }
    
   /** Método para retornar o numero de alunos cadastrados
@return String - o numero de alunos já convertido em string*/  
    
    public String numeroDeAlunos(){
        return alunos.size() + "";
    }
    
    
   
}
