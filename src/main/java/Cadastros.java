import java.util.ArrayList;
import java.util.Iterator;
public class Cadastros {
    
    ArrayList<JavaBean> alunos = new ArrayList();
    
    
    
    public void cadastrar(JavaBean cad){
        alunos.add(cad);
    }
    
    public String numeroDeAlunos(){
        return alunos.size() + "";
    }
            
    
    /*
    public boolean equals(Object o) {
      Aluno a = (Aluno) o;
    return this.nome.equals(a.getNome());
  }*/
}
