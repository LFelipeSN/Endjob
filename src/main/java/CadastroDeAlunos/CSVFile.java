package CadastroDeAlunos;

import JavaBean.Alunos;
import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**Classe para gerar o arquivo CSV, onde serão contidos, valores e métodos para o mesmo.
* @author Luiz Felipe,Tamara Silva,Hanna Gaby
* @version 1.00
* @since Release 01 da aplicação
*/

public class CSVFile {
    private final String path;//endereço do arquivo
    
    public CSVFile(String path){
        this.path = path;
    }
    
    /*
    * toList
    * Objetivo: Retornar um arquivo csv como ArrayList de Aluno.
    * Funcionamento:
    *   Inicializa um BufferedReader que possibilita a leitura do arquivo (pode ser substituido por um Scanner),
    *   o try with resources fecha o reader assim que o bloco try é executado então o close() não é necessário.
    *   A primeira linha não é salva, pois é o cabeçalho do arquivo.
    *   O while percorre linha por linha e salva as informações em um array de Strings, o que é feito pelo
    *   método split que divide a linha onde há uma virgula, formando um array com 6 posições que são as 
    *   colunas do arquivo.
    *   Fazendo as conversões necessárias como String para int(Integer.parseInt()) e String para Date, exemplo:
    *   20/05/1996 -> Mon May 20 00:00:00 BRT 1996, os dados são salvos em um objeto do tipo aluno que é então
    *   adicionado a lista.
    */
    public List<Alunos> toList() throws ParseException{
        List<Alunos> list = new ArrayList();
        String linha;
        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            reader.readLine();
            while((linha = reader.readLine()) != null){
                String[] values= linha.split(",");
                Alunos a = new Alunos();
                a.setMatricula(values[0]);
                a.setNome(values[1]);
                a.setIdade(Integer.parseInt(values[2]));
                a.setDataN(values[3]);
                a.setTelefone(values[4]);
                a.setCpf(values[5]);
                list.add(a);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CSVFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CSVFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    /*
    * update
    * Objetivo: Atualizar o arquivo csv após uma remoção ou adição de um aluno no ArrayList.
    * Funcionamento:
    *   Cria e inicializa um FileWriter sobrescrevendo o arquivo existente, foi utilizado o 
    *   construtor sem append pois guardando o conteúdo existente seria necessário utilizar 
    *   outra lógica para remover uma linha.
    *   Um foreach percorre a lista e acrescenta todos os objetos no arquivo utilizando o append() 
    *   e fazendo as conversões necessárias como int para String(Integer.toString()) e Date 
    *   para String, exemplo: Mon May 20 00:00:00 BRT 1996 -> 20/05/1996.
    */
    public void update(List<Alunos> list) {
        try(FileWriter writer = new FileWriter(path)){
            writer.write("matricula,nome,idade,dataNascimento,telefone,cpf\n");
            for(Alunos a: list){
                writer.append(a.getMatricula())
                        .append(",").append(a.getNome())
                        .append(",").append(Integer.toString(a.getIdade()))
                        .append(",").append(a.getDataN())
                        .append(",").append(a.getTelefone())
                        .append(",").append(a.getCpf()).append("\n");
            
            }
        } catch (IOException ex) {
            Logger.getLogger(CSVFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}