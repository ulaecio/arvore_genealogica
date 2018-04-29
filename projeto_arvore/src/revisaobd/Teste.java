
package revisaobd;

import DAO.PessoaDao;
import Model.Pessoa;


public class Teste {
    
    public static void main(String [] args){
        Pessoa p = new Pessoa();
        p.setNome ("Sisnando");
        p.setDtNascimento("06.09.1987");
        p.setSenha("dracarys");
        
        PessoaDao dao = new PessoaDao();
        if (dao.add(p)) {
            System.out.println("Cadastrado");
        } else {
            System.out.println("Não cadastrado");
                    
        }
        
        
        
    }
    
}
