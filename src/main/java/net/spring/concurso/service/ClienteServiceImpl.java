package net.spring.concurso.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.spring.concurso.dao.ClienteDAO;
import net.spring.concurso.entity.Cliente;

@Service
public class ClienteServiceImpl implements  ClienteService{
	
	@Autowired
	private  ClienteDAO  clienteDAO;
	
	@Override
	public List< Cliente> listAll() {
		return clienteDAO.listAll();
	}

	@Override
	public Cliente loginCliente(String email, String pass) {
		return clienteDAO.loginCliente(email, pass);
	}

	@Override
	public void save(Cliente bean) {
		clienteDAO.save(bean);
	}

	@Override
	public void update(Cliente bean) {
		clienteDAO.update(bean);	
	}

	@Override
	public void delete(int cod) {
		clienteDAO.delete(cod);
	}


}
