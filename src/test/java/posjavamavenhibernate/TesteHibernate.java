package posjavamavenhibernate;

import org.junit.Test;

import dao.DaoGeneric;
import model.UsuarioPessoa;

public class TesteHibernate {
	
	
	@Test
	public void testeHibernteUtil() {
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		
		UsuarioPessoa pessoa = new UsuarioPessoa();
		pessoa.setIdade(37);
		pessoa.setLogin("Maximiliano");
		pessoa.setSenha("max");
		pessoa.setSobrenome("caetano");
		pessoa.setEmail("maximili@g.co");
		
		daoGeneric.salvar(pessoa);
	}
		

}
