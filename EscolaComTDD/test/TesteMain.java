
import br.com.gemeos.escolacomtdd.util.CrudAluno;
import br.com.gemeos.escolacomtdd.util.CrudProfessor;
import java.io.IOException;
import java.text.ParseException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pessoal
 */
public class TesteMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ParseException, Exception {

        CrudAluno cruda = new CrudAluno();
        CrudProfessor crudp = new CrudProfessor();
        TesteTDD tdd = new TesteTDD();
        while (true) {
//            crudp.professorEmExecucao();
        cruda.alunoEmExecucao();
        }

    }

}
