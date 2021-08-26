package CadastrosProject;

import java.util.ArrayList;


public class Dados {
    
    ArrayList<Cadastros> alunos = new ArrayList();
    
    public void cadastrar(Cadastros cadastro){
        alunos.add(cadastro);
    }
    
    public String numeroDeAlunos(){
        return alunos.size() + "";
    }
}
