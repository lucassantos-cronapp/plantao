package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela HORARIO_ESCALA
 * @generated
 */
@Entity
@Table(name = "\"HORARIO_ESCALA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Horario_Escala")
public class Horario_Escala implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "nm_horario_hre", nullable = false, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String nm_horario_hre;

  /**
  * @generated
  */
  @Column(name = "qt_horas_hre", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String qt_horas_hre;

  /**
   * Construtor
   * @generated
   */
  public Horario_Escala(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Horario_Escala setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nm_horario_hre
   * return nm_horario_hre
   * @generated
   */
  
  public java.lang.String getNm_horario_hre(){
    return this.nm_horario_hre;
  }

  /**
   * Define nm_horario_hre
   * @param nm_horario_hre nm_horario_hre
   * @generated
   */
  public Horario_Escala setNm_horario_hre(java.lang.String nm_horario_hre){
    this.nm_horario_hre = nm_horario_hre;
    return this;
  }

  /**
   * Obtém qt_horas_hre
   * return qt_horas_hre
   * @generated
   */
  
  public java.lang.String getQt_horas_hre(){
    return this.qt_horas_hre;
  }

  /**
   * Define qt_horas_hre
   * @param qt_horas_hre qt_horas_hre
   * @generated
   */
  public Horario_Escala setQt_horas_hre(java.lang.String qt_horas_hre){
    this.qt_horas_hre = qt_horas_hre;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Horario_Escala object = (Horario_Escala)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
