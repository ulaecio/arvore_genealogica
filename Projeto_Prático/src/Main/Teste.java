
package Main;

import DAO.PessoaDao;
import Model.Pessoa;


public class Teste {
    
    public static void main(String [] args){
        Pessoa p = new Pessoa();
        p.setNome ("Maria Clara");
        p.setDtNascimento("27.02.1995");
        p.setSenha("123asd");
        
        
        PessoaDao dao = new PessoaDao();
        if (dao.update(p)) {
            System.out.println("Cadastrado");
        } else {
            System.out.println("Não cadastrado");
                    
        }
        
        
        
    }
    
}
