package telas;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestaCSV {
    public static void main(String[] args) throws IOException, ParseException {
        List<Aluno> list = new ArrayList();
        CSVFile file = new CSVFile("C:\\workspace\\Java\\NetBeansProjects\\RascunhoTrabalho\\src\\main\\java\\com\\mycompany\\rascunhotrabalho\\csvAlunos.csv");
        
        list = file.toList();
        
        Iterator<Aluno> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("Aluno: "+iterator.next().getNome());
        }
    }
}
