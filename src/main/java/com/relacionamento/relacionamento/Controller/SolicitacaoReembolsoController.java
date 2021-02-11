package com.relacionamento.relacionamento.Controller;

import com.relacionamento.relacionamento.Entity.*;
import com.relacionamento.relacionamento.Repository.ReembolsoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("solicitacao-reembolso")
public class SolicitacaoReembolsoController {

    @Autowired
    ReembolsoRepository reembolsoRepository;

    @PostMapping
    public String getSolicitacaoReembolso(@RequestBody Reembolso reembolso) {
        System.out.println(reembolso.getDespesas().size());
        reembolsoRepository.save(reembolso);
        return "foi";
    }
}
