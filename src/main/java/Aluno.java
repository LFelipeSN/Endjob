import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
        
public class Aluno {
    public String matricula;
    public String nome;
    public int idade;
    public Date dataNascimento;
    public String telefone;
    public String cpf; 
    
    public static void main(String[]args){
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date data = null;
        Scanner input = new Scanner(System.in);
        
        System.out.println("CAQUITAAAAAAA");
        String dataStr = input.nextLine();
        
        try {
            data = formatter.parse(dataStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
       
        System.out.println(dataStr);
    }
}