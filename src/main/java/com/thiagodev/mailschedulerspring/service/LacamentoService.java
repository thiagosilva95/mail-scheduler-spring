package com.thiagodev.mailschedulerspring.service;

import com.thiagodev.mailschedulerspring.repository.LancamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class LacamentoService {

    @Autowired
    private LancamentoRepository lancamentoRepository;

    @Scheduled(cron = "0 0 6 * * *")
    public void avisarSobreLancamentosVencidos() {
        System.out.println(">>>>>>>>>>>>>>>>>>> Método sendo executado");
    }
}
