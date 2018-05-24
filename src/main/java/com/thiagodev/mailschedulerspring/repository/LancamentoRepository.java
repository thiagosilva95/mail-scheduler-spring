package com.thiagodev.mailschedulerspring.repository;

import com.thiagodev.mailschedulerspring.model.Lancamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {
}
