package br.com.fiap.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.model.AlbumModel;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AlbumRepository extends JpaRepository<AlbumModel, Long> {
}
