package padroescomportamentais.chainofresponsability;

public class FuncionarioOficial extends Funcionario {

    public FuncionarioOficial(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoOficio.getTipoDocumentoOficio());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Oficial";
    }

}
