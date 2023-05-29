package padroescomportamentais.chainofresponsability;

public class FuncionarioRecepcao extends Funcionario {
    
    public FuncionarioRecepcao(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoEntrada.getTipoDocumentoEntrada());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Recepcao";
    }

}
