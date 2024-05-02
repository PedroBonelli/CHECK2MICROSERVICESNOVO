package br.com.fiap.repository;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.model.AlbumModel;
import br.com.fiap.model.BandaModel;

@Repository
public interface BandaRepository extends JpaRepository<BandaModel, Long> {
	
}
