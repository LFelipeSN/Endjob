package CadastrosProject;

import java.util.ArrayList;

public class ListaDeCadastros {
    
    public static void main(String[] args) {
        ArrayList<Cadastros> alunos = new ArrayList();
       
        Cadastros cad = new Cadastros("1","2","3","4","5");
        
        alunos.add(cad);
        
        for(Cadastros c : alunos){
             System.out.println(c);
        }
        System.out.println("Total de alunos cadastrados: "+alunos.size());
        
        //System.out.prinln(alunos.contains());//contains verifica se a variavel faz parte da lista e retorna true or false
    }
    
}
