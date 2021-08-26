package lista.alunos;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
    public class ListaDeAlunos  {

            public static void main(String[] args){
                  ArrayList<Aluno> alunos =  new ArrayList <>();
                 Aluno aluno= new Aluno();
                DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                Date data = null;
        
              
                String dataNascimento;
                dataNascimento = ("21/02/2001");
        
                try {
                    data = formatter.parse(dataNascimento);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                
                
                   
                    aluno.setNome("Arlindo");
                    aluno.setDataNascimento(data);
                    
                    
                    alunos.add(aluno);
                    
                    for(Aluno a: alunos){
                        System.out.println(a.getNome());
                         System.out.println(a.getDataNascimento());
                    }
            }
        }
