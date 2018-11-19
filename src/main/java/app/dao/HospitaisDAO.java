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
@Repository("HospitaisDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface HospitaisDAO extends JpaRepository<Hospitais, java.lang.String> {

  /**
   * Obtém a instância de Hospitais utilizando os identificadores
   * 
   * @param cd_codigo_hsp
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Hospitais entity WHERE entity.cd_codigo_hsp = :cd_codigo_hsp")
  public Hospitais findOne(@Param(value="cd_codigo_hsp") java.lang.String cd_codigo_hsp);

  /**
   * Remove a instância de Hospitais utilizando os identificadores
   * 
   * @param cd_codigo_hsp
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Hospitais entity WHERE entity.cd_codigo_hsp = :cd_codigo_hsp")
  public void delete(@Param(value="cd_codigo_hsp") java.lang.String cd_codigo_hsp);


    
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Local_Plantao entity WHERE entity.hospitais.cd_codigo_hsp = :cd_codigo_hsp AND (entity.nm_local_lpl like concat('%',coalesce(:search,''),'%'))")
  public Page<Local_Plantao> findLocal_PlantaoGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="cd_codigo_hsp") java.lang.String cd_codigo_hsp, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Local_Plantao entity WHERE entity.hospitais.cd_codigo_hsp = :cd_codigo_hsp AND (:nm_local_lpl is null OR entity.nm_local_lpl like concat('%',:nm_local_lpl,'%'))")
  public Page<Local_Plantao> findLocal_PlantaoSpecificSearch(@Param(value="cd_codigo_hsp") java.lang.String cd_codigo_hsp, @Param(value="nm_local_lpl") java.lang.String nm_local_lpl, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Local_Plantao entity WHERE entity.hospitais.cd_codigo_hsp = :cd_codigo_hsp")
  public Page<Local_Plantao> findLocal_Plantao(@Param(value="cd_codigo_hsp") java.lang.String cd_codigo_hsp, Pageable pageable);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Hospitais entity WHERE entity.nm_hospital_hsp like concat('%',coalesce(:search,''),'%')")
  public Page<Hospitais> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Hospitais entity WHERE (:nm_hospital_hsp is null OR entity.nm_hospital_hsp like concat('%',:nm_hospital_hsp,'%'))")
  public Page<Hospitais> specificSearch(@Param(value="nm_hospital_hsp") java.lang.String nm_hospital_hsp, Pageable pageable);
  
}
