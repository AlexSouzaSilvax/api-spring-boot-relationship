package com.relacionamento.relacionamento.Controller;

import com.relacionamento.relacionamento.Entity.*;
import com.relacionamento.relacionamento.Repository.ReembolsoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("solicitacao-reembolso")
public class SolicitacaoReembolsoController {

    @Autowired
    ReembolsoRepository reembolsoRepository;

    @PostMapping
    public ResponseEntity<Object> getSolicitacaoReembolso(@RequestBody @Valid Reembolso reembolso) {
        try {
            reembolsoRepository.save(reembolso);
            return ResponseEntity.ok().body(new ReembolsoRetornoSucesso(reembolso));
        } catch(Exception e) {
            return ResponseEntity.ok().body(new ReembolsoRetornoErro(reembolso));
        }
    }
}
