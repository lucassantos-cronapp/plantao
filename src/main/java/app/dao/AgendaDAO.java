package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("AgendaDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface AgendaDAO extends JpaRepository<Agenda, java.lang.String> {

  /**
   * Obtém a instância de Agenda utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Agenda entity WHERE entity.id = :id")
  public Agenda findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Agenda utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Agenda entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



    
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Agenda entity WHERE :search = :search")
  public Page<Agenda> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Agenda entity WHERE (:dt_agenda_age is null OR entity.dt_agenda_age = :dt_agenda_age) AND (:cd_status_age is null OR entity.cd_status_age = :cd_status_age)")
  public Page<Agenda> specificSearch(@Param(value="dt_agenda_age") java.util.Date dt_agenda_age, @Param(value="cd_status_age") java.lang.Integer cd_status_age, Pageable pageable);
  
  /**
   * Foreign Key horario_Escala
   * @generated
   */
  @Query("SELECT entity FROM Agenda entity WHERE entity.horario_Escala.id = :id")
  public Page<Agenda> findAgendasByHorario_Escala(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key local_Plantao
   * @generated
   */
  @Query("SELECT entity FROM Agenda entity WHERE entity.local_Plantao.cd_codigo_lpl = :cd_codigo_lpl")
  public Page<Agenda> findAgendasByLocal_Plantao(@Param(value="cd_codigo_lpl") java.lang.String cd_codigo_lpl, Pageable pageable);

  /**
   * Foreign Key medico
   * @generated
   */
  @Query("SELECT entity FROM Agenda entity WHERE entity.medico.cd_codigo_med = :cd_codigo_med")
  public Page<Agenda> findAgendasByMedico(@Param(value="cd_codigo_med") java.lang.String cd_codigo_med, Pageable pageable);

}
