package padroescomportamentais.chainofresponsability;

public class FuncionarioEscrevente extends Funcionario {
    
    public FuncionarioEscrevente(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoCertidao.getTipoDocumentoCertidao());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Escrevente";
    }
}
