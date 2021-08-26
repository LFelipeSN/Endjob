package newpackage;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner; 
        
public class NewClass {
    private int matricula;
    private String nome;
    private int idade;
    private Date dataNascimento;;
    private String telefone;
    private String cpf; 
    
    
    public NewClass(){
        super();
   }


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

   public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
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
    public String toString(){
        return nome + "  " + dataNascimento;
    }
    
    
    
    public static void main(String[]args){
        
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date data = null;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira a data de nascimento");
        String dataNascimento = input.nextLine();
        
        try {
            data = formatter.parse(dataNascimento);
        } catch (ParseException e) {
            e.printStackTrace();
        }
       
      
        
        System.out.println(dataNascimento);
    }; 

  
}