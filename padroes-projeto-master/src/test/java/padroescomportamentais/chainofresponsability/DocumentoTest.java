package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DocumentoTest {

    FuncionarioOficial oficial;
    FuncionarioSubstituto substituto;
    FuncionarioEscrevente escrevente;
    FuncionarioRecepcao recepcao;

    @BeforeEach
    void setUp() {
        oficial = new FuncionarioOficial(null);
        substituto = new FuncionarioSubstituto(oficial);
        escrevente = new FuncionarioEscrevente(substituto);
        recepcao = new FuncionarioRecepcao(escrevente);
    }

    @Test
    void deveRetornarRecepcaoParaAssinaturaEntrada() {
        assertEquals("Recepcao", recepcao.assinarDocumento(new Documento(TipoDocumentoEntrada.getTipoDocumentoEntrada())));
    }

    @Test
    void deveRetornarEscreventeParaAssinaturaCertidao() {
        assertEquals("Escrevente", recepcao.assinarDocumento(new Documento(TipoDocumentoCertidao.getTipoDocumentoCertidao())));
    }

    @Test
    void deveRetornarSubstitutoParaAssinaturaRegistro() {
        assertEquals("Substituto", recepcao.assinarDocumento(new Documento(TipoDocumentoRegistro.getTipoDocumentoRegistro())));
    }

    @Test
    void deveRetornarOficialParaAssinaturaOficio() {
        assertEquals("Oficial", recepcao.assinarDocumento(new Documento(TipoDocumentoOficio.getTipoDocumentoOficio())));
    }

    @Test
    void deveRetornarSemAssinaturaParaAssinaturaTFJ() {
        assertEquals("Sem assinatura", recepcao.assinarDocumento(new Documento(TipoDocumentoTFJ.getTipoDocumentoBoleto())));
    }

}