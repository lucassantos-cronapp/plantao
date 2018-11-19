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
@Repository("ConvenioDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface ConvenioDAO extends JpaRepository<Convenio, java.lang.String> {

  /**
   * Obtém a instância de Convenio utilizando os identificadores
   * 
   * @param cd_convenio_cnv
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Convenio entity WHERE entity.cd_convenio_cnv = :cd_convenio_cnv")
  public Convenio findOne(@Param(value="cd_convenio_cnv") java.lang.String cd_convenio_cnv);

  /**
   * Remove a instância de Convenio utilizando os identificadores
   * 
   * @param cd_convenio_cnv
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Convenio entity WHERE entity.cd_convenio_cnv = :cd_convenio_cnv")
  public void delete(@Param(value="cd_convenio_cnv") java.lang.String cd_convenio_cnv);



  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Convenio entity WHERE entity.nm_convenio_cnv like concat('%',coalesce(:search,''),'%')")
  public Page<Convenio> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Convenio entity WHERE (:nm_convenio_cnv is null OR entity.nm_convenio_cnv like concat('%',:nm_convenio_cnv,'%')) AND (:qt_mesespagto_cnv is null OR entity.qt_mesespagto_cnv = :qt_mesespagto_cnv)")
  public Page<Convenio> specificSearch(@Param(value="nm_convenio_cnv") java.lang.String nm_convenio_cnv, @Param(value="qt_mesespagto_cnv") java.lang.Integer qt_mesespagto_cnv, Pageable pageable);
  
}
