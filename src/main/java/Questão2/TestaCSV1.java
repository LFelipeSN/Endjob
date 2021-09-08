package Questão2;

import JavaBean.Alunos;
import java.io.IOException;
//import java.text.DateFormat;
import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestaCSV1 {
    /*
    * Nessa classe de teste foram salvos dois objetos na lista e uma remoção.
    * Os nomes foram impressos depois de carregar a lista e das alterações.
    */
    public static void main(String[] args) throws IOException, ParseException {
        List<Alunos> list = new ArrayList <>();
        // Obs.: arquivo movido para outra pasta e aparentemente o path completo não era necessário.
        CSVFile1 file = new CSVFile1("src\\csvAlunos.csv");
        //DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        
        list = file.toList();
        
        /*
        * Iterator:
        *   Faz uma 'cópia' dos elementos da lista e enquanto houver um próximo elemento ele será impresso.
        *   Quando o next é utilizado o elemento é removido do iterator, para imprimir outros atributos é
        *   preciso salvar o Objeto em uma variável auxiliar.
        */
        Iterator<Alunos> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("Aluno: "+iterator.next().getNome());
        }
        System.out.println("");
        
        Alunos a1 = new Alunos();
        a1.setMatricula("3");
        a1.setNome("Aluno adicionado1");
        a1.setIdade(23);
        a1.setDataN("26/07/1998");
        a1.setTelefone("(99)1234-5678");
        a1.setCpf("333.333.333-33");
        
        list.add(a1);
        file.update(list);
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("Aluno: "+iterator.next().getNome());
        }
        System.out.println("");
        
        Alunos a2 = new Alunos();
        a2.setMatricula("4");
        a2.setNome("Aluno adicionado2");
        a2.setIdade(22);
        a2.setDataN("28/04/1999");
        a2.setTelefone("(99)9876-5432");
        a2.setCpf("444.444.444-44");
        
        list.add(a2);
        file.update(list);
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("Aluno: "+iterator.next().getNome());
        }
        System.out.println("");
        
        list.remove(1);
        file.update(list);
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("Aluno: "+iterator.next().getNome());
        }
    }
}
