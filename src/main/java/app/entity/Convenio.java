package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela CONVENIO
 * @generated
 */
@Entity
@Table(name = "\"CONVENIO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Convenio")
public class Convenio implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "cd_convenio_cnv", nullable = false, insertable=true, updatable=true)
  private java.lang.String cd_convenio_cnv = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "nm_convenio_cnv", nullable = false, unique = false, length=80, insertable=true, updatable=true)
  
  private java.lang.String nm_convenio_cnv;

  /**
  * @generated
  */
  @Column(name = "qt_mesespagto_cnv", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer qt_mesespagto_cnv;

  /**
   * Construtor
   * @generated
   */
  public Convenio(){
  }


  /**
   * Obtém cd_convenio_cnv
   * return cd_convenio_cnv
   * @generated
   */
  
  public java.lang.String getCd_convenio_cnv(){
    return this.cd_convenio_cnv;
  }

  /**
   * Define cd_convenio_cnv
   * @param cd_convenio_cnv cd_convenio_cnv
   * @generated
   */
  public Convenio setCd_convenio_cnv(java.lang.String cd_convenio_cnv){
    this.cd_convenio_cnv = cd_convenio_cnv;
    return this;
  }

  /**
   * Obtém nm_convenio_cnv
   * return nm_convenio_cnv
   * @generated
   */
  
  public java.lang.String getNm_convenio_cnv(){
    return this.nm_convenio_cnv;
  }

  /**
   * Define nm_convenio_cnv
   * @param nm_convenio_cnv nm_convenio_cnv
   * @generated
   */
  public Convenio setNm_convenio_cnv(java.lang.String nm_convenio_cnv){
    this.nm_convenio_cnv = nm_convenio_cnv;
    return this;
  }

  /**
   * Obtém qt_mesespagto_cnv
   * return qt_mesespagto_cnv
   * @generated
   */
  
  public java.lang.Integer getQt_mesespagto_cnv(){
    return this.qt_mesespagto_cnv;
  }

  /**
   * Define qt_mesespagto_cnv
   * @param qt_mesespagto_cnv qt_mesespagto_cnv
   * @generated
   */
  public Convenio setQt_mesespagto_cnv(java.lang.Integer qt_mesespagto_cnv){
    this.qt_mesespagto_cnv = qt_mesespagto_cnv;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Convenio object = (Convenio)obj;
    if (cd_convenio_cnv != null ? !cd_convenio_cnv.equals(object.cd_convenio_cnv) : object.cd_convenio_cnv != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((cd_convenio_cnv == null) ? 0 : cd_convenio_cnv.hashCode());
    return result;
  }

}
