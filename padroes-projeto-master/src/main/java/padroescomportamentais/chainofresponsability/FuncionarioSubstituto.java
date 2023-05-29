package padroescomportamentais.chainofresponsability;

public class FuncionarioSubstituto extends Funcionario {

    public FuncionarioSubstituto(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoRegistro.getTipoDocumentoRegistro());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Substituto";
    }

}
