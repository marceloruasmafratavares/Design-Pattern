package dio.padroes_projeto_spring.service;

import dio.padroes_projeto_spring.model.Cliente;

public interface ClienteService {
    
    Iterable<Cliente> buscarTodos();
    
    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(long id, Cliente cliente);
    
    void deletar(Long id);
}
