package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela SOLICITACAO_MUDANCA
 * @generated
 */
@Entity
@Table(name = "\"SOLICITACAO_MUDANCA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Solicitacao_Mudanca")
public class Solicitacao_Mudanca implements Serializable {

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
  @ManyToOne
  @JoinColumn(name="fk_horario_Escala", nullable = false, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Horario_Escala horario_Escala;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "dt_solicitao_mud", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.util.Date dt_solicitao_mud = new Date();

  /**
  * @generated
  */
  @Column(name = "cd_status_mud", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer cd_status_mud;

  /**
   * Construtor
   * @generated
   */
  public Solicitacao_Mudanca(){
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
  public Solicitacao_Mudanca setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém horario_Escala
   * return horario_Escala
   * @generated
   */
  
  public Horario_Escala getHorario_Escala(){
    return this.horario_Escala;
  }

  /**
   * Define horario_Escala
   * @param horario_Escala horario_Escala
   * @generated
   */
  public Solicitacao_Mudanca setHorario_Escala(Horario_Escala horario_Escala){
    this.horario_Escala = horario_Escala;
    return this;
  }

  /**
   * Obtém dt_solicitao_mud
   * return dt_solicitao_mud
   * @generated
   */
  
  public java.util.Date getDt_solicitao_mud(){
    return this.dt_solicitao_mud;
  }

  /**
   * Define dt_solicitao_mud
   * @param dt_solicitao_mud dt_solicitao_mud
   * @generated
   */
  public Solicitacao_Mudanca setDt_solicitao_mud(java.util.Date dt_solicitao_mud){
    this.dt_solicitao_mud = dt_solicitao_mud;
    return this;
  }

  /**
   * Obtém cd_status_mud
   * return cd_status_mud
   * @generated
   */
  
  public java.lang.Integer getCd_status_mud(){
    return this.cd_status_mud;
  }

  /**
   * Define cd_status_mud
   * @param cd_status_mud cd_status_mud
   * @generated
   */
  public Solicitacao_Mudanca setCd_status_mud(java.lang.Integer cd_status_mud){
    this.cd_status_mud = cd_status_mud;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Solicitacao_Mudanca object = (Solicitacao_Mudanca)obj;
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
