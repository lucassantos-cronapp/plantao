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
@Repository("Local_PlantaoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface Local_PlantaoDAO extends JpaRepository<Local_Plantao, java.lang.String> {

  /**
   * Obtém a instância de Local_Plantao utilizando os identificadores
   * 
   * @param cd_codigo_lpl
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Local_Plantao entity WHERE entity.cd_codigo_lpl = :cd_codigo_lpl")
  public Local_Plantao findOne(@Param(value="cd_codigo_lpl") java.lang.String cd_codigo_lpl);

  /**
   * Remove a instância de Local_Plantao utilizando os identificadores
   * 
   * @param cd_codigo_lpl
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Local_Plantao entity WHERE entity.cd_codigo_lpl = :cd_codigo_lpl")
  public void delete(@Param(value="cd_codigo_lpl") java.lang.String cd_codigo_lpl);


      
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Agenda entity WHERE entity.local_Plantao.cd_codigo_lpl = :cd_codigo_lpl AND (:search = :search)")
  public Page<Agenda> findAgendaGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="cd_codigo_lpl") java.lang.String cd_codigo_lpl, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Agenda entity WHERE entity.local_Plantao.cd_codigo_lpl = :cd_codigo_lpl AND (:dt_agenda_age is null OR entity.dt_agenda_age = :dt_agenda_age) AND (:cd_status_age is null OR entity.cd_status_age = :cd_status_age)")
  public Page<Agenda> findAgendaSpecificSearch(@Param(value="cd_codigo_lpl") java.lang.String cd_codigo_lpl, @Param(value="dt_agenda_age") java.util.Date dt_agenda_age, @Param(value="cd_status_age") java.lang.Integer cd_status_age, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Agenda entity WHERE entity.local_Plantao.cd_codigo_lpl = :cd_codigo_lpl")
  public Page<Agenda> findAgenda(@Param(value="cd_codigo_lpl") java.lang.String cd_codigo_lpl, Pageable pageable);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Local_Plantao entity WHERE entity.nm_local_lpl like concat('%',coalesce(:search,''),'%')")
  public Page<Local_Plantao> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Local_Plantao entity WHERE (:nm_local_lpl is null OR entity.nm_local_lpl like concat('%',:nm_local_lpl,'%'))")
  public Page<Local_Plantao> specificSearch(@Param(value="nm_local_lpl") java.lang.String nm_local_lpl, Pageable pageable);
  
  /**
   * Foreign Key hospitais
   * @generated
   */
  @Query("SELECT entity FROM Local_Plantao entity WHERE entity.hospitais.cd_codigo_hsp = :cd_codigo_hsp")
  public Page<Local_Plantao> findLocal_PlantaosByHospitais(@Param(value="cd_codigo_hsp") java.lang.String cd_codigo_hsp, Pageable pageable);

}
