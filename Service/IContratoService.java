package Service;

public interface IContratoService {
    String salvar();
    String buscar(int id);
    void excluir(int id);
    void atualizar(int id, String novoValor);
}
