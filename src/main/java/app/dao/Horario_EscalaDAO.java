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
@Repository("Horario_EscalaDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface Horario_EscalaDAO extends JpaRepository<Horario_Escala, java.lang.String> {

  /**
   * Obtém a instância de Horario_Escala utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Horario_Escala entity WHERE entity.id = :id")
  public Horario_Escala findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Horario_Escala utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Horario_Escala entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);


      
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Agenda entity WHERE entity.horario_Escala.id = :id AND (:search = :search)")
  public Page<Agenda> findAgendaGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Agenda entity WHERE entity.horario_Escala.id = :id AND (:dt_agenda_age is null OR entity.dt_agenda_age = :dt_agenda_age) AND (:cd_status_age is null OR entity.cd_status_age = :cd_status_age)")
  public Page<Agenda> findAgendaSpecificSearch(@Param(value="id") java.lang.String id, @Param(value="dt_agenda_age") java.util.Date dt_agenda_age, @Param(value="cd_status_age") java.lang.Integer cd_status_age, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Agenda entity WHERE entity.horario_Escala.id = :id")
  public Page<Agenda> findAgenda(@Param(value="id") java.lang.String id, Pageable pageable);
      
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Solicitacao_Mudanca entity WHERE entity.horario_Escala.id = :id AND (:search = :search)")
  public Page<Solicitacao_Mudanca> findSolicitacao_MudancaGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Solicitacao_Mudanca entity WHERE entity.horario_Escala.id = :id AND (:dt_solicitao_mud is null OR entity.dt_solicitao_mud = :dt_solicitao_mud) AND (:cd_status_mud is null OR entity.cd_status_mud = :cd_status_mud)")
  public Page<Solicitacao_Mudanca> findSolicitacao_MudancaSpecificSearch(@Param(value="id") java.lang.String id, @Param(value="dt_solicitao_mud") java.util.Date dt_solicitao_mud, @Param(value="cd_status_mud") java.lang.Integer cd_status_mud, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Solicitacao_Mudanca entity WHERE entity.horario_Escala.id = :id")
  public Page<Solicitacao_Mudanca> findSolicitacao_Mudanca(@Param(value="id") java.lang.String id, Pageable pageable);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Horario_Escala entity WHERE entity.nm_horario_hre like concat('%',coalesce(:search,''),'%') OR entity.qt_horas_hre like concat('%',coalesce(:search,''),'%')")
  public Page<Horario_Escala> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Horario_Escala entity WHERE (:nm_horario_hre is null OR entity.nm_horario_hre like concat('%',:nm_horario_hre,'%')) AND (:qt_horas_hre is null OR entity.qt_horas_hre like concat('%',:qt_horas_hre,'%'))")
  public Page<Horario_Escala> specificSearch(@Param(value="nm_horario_hre") java.lang.String nm_horario_hre, @Param(value="qt_horas_hre") java.lang.String qt_horas_hre, Pageable pageable);
  
}
