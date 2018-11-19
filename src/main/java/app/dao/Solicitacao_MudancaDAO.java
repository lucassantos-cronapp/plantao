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
@Repository("Solicitacao_MudancaDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface Solicitacao_MudancaDAO extends JpaRepository<Solicitacao_Mudanca, java.lang.String> {

  /**
   * Obtém a instância de Solicitacao_Mudanca utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Solicitacao_Mudanca entity WHERE entity.id = :id")
  public Solicitacao_Mudanca findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Solicitacao_Mudanca utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Solicitacao_Mudanca entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Plantao entity WHERE entity.solicitacao_Mudanca.id = :id")
  public Page<Plantao> findPlantao(@Param(value="id") java.lang.String id, Pageable pageable);
    
  /**
   * ManyToOne Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity.agenda FROM Plantao entity WHERE entity.solicitacao_Mudanca.id = :id AND (:search = :search)")
  public Page<Agenda> listAgendaGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity.agenda FROM Plantao entity WHERE entity.solicitacao_Mudanca.id = :id AND (:dt_agenda_age is null OR entity.agenda.dt_agenda_age = :dt_agenda_age) AND (:cd_status_age is null OR entity.agenda.cd_status_age = :cd_status_age)")
  public Page<Agenda> listAgendaSpecificSearch(@Param(value="id") java.lang.String id, @Param(value="dt_agenda_age") java.util.Date dt_agenda_age, @Param(value="cd_status_age") java.lang.Integer cd_status_age, Pageable pageable);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.agenda FROM Plantao entity WHERE entity.solicitacao_Mudanca.id = :id")
  public Page<Agenda> listAgenda(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Plantao entity WHERE entity.solicitacao_Mudanca.id = :instanceId AND entity.agenda.id = :relationId")
  public int deleteAgenda(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

    
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Solicitacao_Mudanca entity WHERE :search = :search")
  public Page<Solicitacao_Mudanca> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Solicitacao_Mudanca entity WHERE (:dt_solicitao_mud is null OR entity.dt_solicitao_mud = :dt_solicitao_mud) AND (:cd_status_mud is null OR entity.cd_status_mud = :cd_status_mud)")
  public Page<Solicitacao_Mudanca> specificSearch(@Param(value="dt_solicitao_mud") java.util.Date dt_solicitao_mud, @Param(value="cd_status_mud") java.lang.Integer cd_status_mud, Pageable pageable);
  
  /**
   * Foreign Key horario_Escala
   * @generated
   */
  @Query("SELECT entity FROM Solicitacao_Mudanca entity WHERE entity.horario_Escala.id = :id")
  public Page<Solicitacao_Mudanca> findSolicitacao_MudancasByHorario_Escala(@Param(value="id") java.lang.String id, Pageable pageable);

}
