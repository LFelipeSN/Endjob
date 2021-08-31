import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CSVFile {
    private Reader reader = null;
    private FileWriter writer = null;
    
    public CSVFile(String path){
        try {
            reader = new BufferedReader(new FileReader(path));
//            writer = new FileWriter(path);
        } catch (IOException ex) {
            Logger.getLogger(CSVFile.class.getName()).log(Level.SEVERE, "Falha ao acessar os dados", ex);
        }
    }
    
    public List<Aluno> toList() throws ParseException, IOException{
        List<Aluno> list = new ArrayList();
        BufferedReader br = new BufferedReader(reader);
        String linha;
        
        br.readLine();
        while((linha = br.readLine()) != null){
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String[] values= linha.split(",");
            Aluno a = new Aluno();
            a.setMatricula(values[0]);
            a.setNome(values[1]);
            a.setIdade(Integer.parseInt(values[2]));
            a.setDataNascimento(formatter.parse(values[3]));
            a.setTelefone(values[4]);
            a.setCpf(values[5]);
            list.add(a);
        }
        return list;
    }
    
    public void writeLine(Aluno a){
        try {
            writer.append(a.getMatricula())
                    .append(",").append(a.getNome())
                    .append(",").append(Integer.toString(a.getIdade()))
                    .append(",").append((a.getDataNascimento()).toString())
                    .append(",").append(a.getTelefone())
                    .append(",").append(a.getCpf()).append("\n");
            
        } catch (IOException ex) {
            Logger.getLogger(CSVFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void close() {
        try {
            reader.close();
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(CSVFile.class.getName()).log(Level.SEVERE, "Falha ao fechar arquivo de dados", ex);
        }
    }
}