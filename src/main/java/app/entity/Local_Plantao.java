package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela LOCAL_PLANTAO
 * @generated
 */
@Entity
@Table(name = "\"LOCAL_PLANTAO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Local_Plantao")
public class Local_Plantao implements Serializable {

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
  private java.lang.String cd_codigo_lpl = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "nm_local_lpl", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String nm_local_lpl;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_hospitais", nullable = true, referencedColumnName = "cd_codigo_hsp", insertable=true, updatable=true)
  
  private Hospitais hospitais;

  /**
   * Construtor
   * @generated
   */
  public Local_Plantao(){
  }


  /**
   * Obtém cd_codigo_lpl
   * return cd_codigo_lpl
   * @generated
   */
  
  public java.lang.String getCd_codigo_lpl(){
    return this.cd_codigo_lpl;
  }

  /**
   * Define cd_codigo_lpl
   * @param cd_codigo_lpl cd_codigo_lpl
   * @generated
   */
  public Local_Plantao setCd_codigo_lpl(java.lang.String cd_codigo_lpl){
    this.cd_codigo_lpl = cd_codigo_lpl;
    return this;
  }

  /**
   * Obtém nm_local_lpl
   * return nm_local_lpl
   * @generated
   */
  
  public java.lang.String getNm_local_lpl(){
    return this.nm_local_lpl;
  }

  /**
   * Define nm_local_lpl
   * @param nm_local_lpl nm_local_lpl
   * @generated
   */
  public Local_Plantao setNm_local_lpl(java.lang.String nm_local_lpl){
    this.nm_local_lpl = nm_local_lpl;
    return this;
  }

  /**
   * Obtém hospitais
   * return hospitais
   * @generated
   */
  
  public Hospitais getHospitais(){
    return this.hospitais;
  }

  /**
   * Define hospitais
   * @param hospitais hospitais
   * @generated
   */
  public Local_Plantao setHospitais(Hospitais hospitais){
    this.hospitais = hospitais;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Local_Plantao object = (Local_Plantao)obj;
    if (cd_codigo_lpl != null ? !cd_codigo_lpl.equals(object.cd_codigo_lpl) : object.cd_codigo_lpl != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((cd_codigo_lpl == null) ? 0 : cd_codigo_lpl.hashCode());
    return result;
  }

}
