package com.relacionamento.relacionamento.Controller;

import com.relacionamento.relacionamento.Entity.SolicitacaoReembolsoArquivoEntity;
import com.relacionamento.relacionamento.Entity.SolicitacaoReembolsoDespesaEntity_;
import com.relacionamento.relacionamento.Entity.SolicitacaoReembolsoEntity;
import com.relacionamento.relacionamento.Entity.SolicitacaoReembolsoEntity_;
import com.relacionamento.relacionamento.Repository.SolicitacaoReembolsoArquivoRepository;
import com.relacionamento.relacionamento.Repository.SolicitacaoReembolsoDespesaRepository;
import com.relacionamento.relacionamento.Repository.SolicitacaoReembolsoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("solicitacao-reembolso")
public class SolicitacaoReembolsoController {

    @Autowired
    SolicitacaoReembolsoRepository solicitacaoReembolsoRepository;

    @Autowired
    SolicitacaoReembolsoArquivoRepository solicitacaoReembolsoArquivoRepository;

    @Autowired
    SolicitacaoReembolsoDespesaRepository solicitacaoReembolsoDespesaRepository;

    /*@PostMapping
    public ResponseEntity<SolicitacaoReembolsoEntity> getSolicitacaoReembolso(@RequestBody SolicitacaoReembolsoEntity solicitacaoReembolso) {
        solicitacaoReembolsoRepository.save(solicitacaoReembolso);
        return ResponseEntity.ok().header("mensagem", "Salvo com sucesso").header("result", "true").body(solicitacaoReembolso);
    }*/

    @PostMapping
    public String getSolicitacaoReembolso(@RequestBody SolicitacaoReembolsoEntity solicitacaoReembolso) {

        SolicitacaoReembolsoEntity_ sReembolso = new SolicitacaoReembolsoEntity_();
        sReembolso.setProtocolo(solicitacaoReembolso.getProtocolo());
        sReembolso.setId_operadora(solicitacaoReembolso.getId_operadora());
        sReembolso.setMshash(solicitacaoReembolso.getMshash());
        sReembolso.setMatricula_titular(solicitacaoReembolso.getMatricula_titular());
        sReembolso.setMatricula_beneficiario(solicitacaoReembolso.getMatricula_beneficiario());
        sReembolso.setCpf_titular(solicitacaoReembolso.getCpf_titular());
        sReembolso.setTelefone(solicitacaoReembolso.getTelefone());
        sReembolso.setNome_titular(solicitacaoReembolso.getNome_titular());
        sReembolso.setOperadora_ans(solicitacaoReembolso.getOperadora_ans());
        sReembolso.setUtilizado_matricula(solicitacaoReembolso.getUtilizado_matricula());
        sReembolso.setUtilizador_nome(solicitacaoReembolso.getUtilizador_nome());
        sReembolso.setId_tipo_reembolso(solicitacaoReembolso.getId_tipo_reembolso());
        sReembolso.setPrestador_documento(solicitacaoReembolso.getPrestador_documento());
        sReembolso.setData_despesa(solicitacaoReembolso.getData_despesa());
        sReembolso.setValor_despsa(solicitacaoReembolso.getValor_despsa());
        sReembolso.setUrl(solicitacaoReembolso.getUrl());
        sReembolso.setNome(solicitacaoReembolso.getNome());
        sReembolso.setDiretorio(solicitacaoReembolso.getDiretorio());
        solicitacaoReembolsoRepository.save(sReembolso);

        //salvando arquivos do pai
        saveArquivos(solicitacaoReembolso.getArquivos(),0,sReembolso.getId());

        //salvando despesas
        for (int i = 0; i < solicitacaoReembolso.getDespesas().size(); i++) {
            SolicitacaoReembolsoDespesaEntity_ sRDesp = new SolicitacaoReembolsoDespesaEntity_();
            sRDesp.setUtilizador_matricula(solicitacaoReembolso.getDespesas().get(i).getUtilizador_matricula());
            sRDesp.setUtilizador_nome(solicitacaoReembolso.getDespesas().get(i).getUtilizador_nome());
            sRDesp.setId_tipo_reembolso(solicitacaoReembolso.getDespesas().get(i).getId_tipo_reembolso());
            sRDesp.setPrestador_documento(solicitacaoReembolso.getDespesas().get(i).getPrestador_documento());
            sRDesp.setData_despesa(solicitacaoReembolso.getDespesas().get(i).getData_despesa());
            sRDesp.setValor_despsa(solicitacaoReembolso.getDespesas().get(i).getValor_despsa());
            sRDesp.setCd_solic_reem(sReembolso.getId());
            solicitacaoReembolsoDespesaRepository.save(sRDesp);
            //salvando arquivos das despesas
            saveArquivos(solicitacaoReembolso.getDespesas().get(i).getArquivos(),1,sRDesp.getId());
        }
        return "FOI";
    }

    public void saveArquivos(List<SolicitacaoReembolsoArquivoEntity> listaArquivos, int tipo, Long idPai) {
        // tipo, 0 = pai solicReem, 1 = filho despesa
        for(int i = 0; i < listaArquivos.size(); i++) {
            SolicitacaoReembolsoArquivoEntity sRArq = new SolicitacaoReembolsoArquivoEntity();
            sRArq.setNome(listaArquivos.get(i).getNome());
            sRArq.setUrl(listaArquivos.get(i).getUrl());
            if(tipo == 0) {
                sRArq.setCd_solic_reem(idPai);
            } else {
                sRArq.setCd_solic_reem_desp(idPai);
            }

            solicitacaoReembolsoArquivoRepository.save(sRArq);
        }
    }


    /*@PostMapping
    @RequestMapping("/despesas")
    public ResponseEntity<List<SolicitacaoReembolsoDespesaEntity>> getSolicitacaoReembolsoDespesa(@RequestBody List<SolicitacaoReembolsoDespesaEntity> listaSolicitacaoReembolsoDespesas) {
        for (int i = 0; i < listaSolicitacaoReembolsoDespesas.size(); i++) {
            System.out.println("Quantidade de despesas: " + listaSolicitacaoReembolsoDespesas.size());
            listaSolicitacaoReembolsoDespesas.get(i).setCd_solic_reem(2L);
            solicitacaoReembolsoDespesaRepository.save(listaSolicitacaoReembolsoDespesas.get(i));
            System.out.println("ID despesa: " + listaSolicitacaoReembolsoDespesas.get(i).getId());
            System.out.println("ID reembolso > despesa: " + listaSolicitacaoReembolsoDespesas.get(i).getCd_solic_reem());
        }
        System.out.println("Saiu do for");

        return ResponseEntity.ok().header("mensagem", "Salvo com sucesso").header("result", "true").body(listaSolicitacaoReembolsoDespesas);
    }
    */

    /*
    @PostMapping
    @RequestMapping("/arquivos")
    public ResponseEntity<List<SolicitacaoReembolsoArquivoEntity>> getSolicitacaoReembolsoArquivos(@RequestBody List<SolicitacaoReembolsoArquivoEntity> listaSolicitacaoReembolsoArquivos) {

        for (int i = 0; i < listaSolicitacaoReembolsoArquivos.size(); i++) {
            System.out.println("Quantidade de arquivos: " + listaSolicitacaoReembolsoArquivos.size());
            listaSolicitacaoReembolsoArquivos.get(i).setCd_solic_reem(2L);
            solicitacaoReembolsoArquivoRepository.save(listaSolicitacaoReembolsoArquivos.get(i));
            System.out.println("ID arquivo: " + listaSolicitacaoReembolsoArquivos.get(i).getId());
            System.out.println("ID reembolso > arquivo: " + listaSolicitacaoReembolsoArquivos.get(i).getCd_solic_reem());
        }
        System.out.println("Saiu do for");

        return ResponseEntity.ok().header("mensagem", "Salvo com sucesso").header("result", "true").body(listaSolicitacaoReembolsoArquivos);
    }
*/


}
