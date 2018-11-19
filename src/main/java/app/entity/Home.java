package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela HOME
 * @generated
 */
@Entity
@Table(name = "\"HOME\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Home")
public class Home implements Serializable {

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
  @Column(name = "dia", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String dia;

  /**
  * @generated
  */
  @Column(name = "mes", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String mes;

  /**
  * @generated
  */
  @Column(name = "ano", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String ano;

  /**
  * @generated
  */
  @OneToOne
  @JoinColumn(name="fk_agenda", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Agenda agenda;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_solicitacao_Mudanca", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Solicitacao_Mudanca solicitacao_Mudanca;

  /**
   * Construtor
   * @generated
   */
  public Home(){
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
  public Home setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém dia
   * return dia
   * @generated
   */
  
  public java.lang.String getDia(){
    return this.dia;
  }

  /**
   * Define dia
   * @param dia dia
   * @generated
   */
  public Home setDia(java.lang.String dia){
    this.dia = dia;
    return this;
  }

  /**
   * Obtém mes
   * return mes
   * @generated
   */
  
  public java.lang.String getMes(){
    return this.mes;
  }

  /**
   * Define mes
   * @param mes mes
   * @generated
   */
  public Home setMes(java.lang.String mes){
    this.mes = mes;
    return this;
  }

  /**
   * Obtém ano
   * return ano
   * @generated
   */
  
  public java.lang.String getAno(){
    return this.ano;
  }

  /**
   * Define ano
   * @param ano ano
   * @generated
   */
  public Home setAno(java.lang.String ano){
    this.ano = ano;
    return this;
  }

  /**
   * Obtém agenda
   * return agenda
   * @generated
   */
  
  public Agenda getAgenda(){
    return this.agenda;
  }

  /**
   * Define agenda
   * @param agenda agenda
   * @generated
   */
  public Home setAgenda(Agenda agenda){
    this.agenda = agenda;
    return this;
  }

  /**
   * Obtém solicitacao_Mudanca
   * return solicitacao_Mudanca
   * @generated
   */
  
  public Solicitacao_Mudanca getSolicitacao_Mudanca(){
    return this.solicitacao_Mudanca;
  }

  /**
   * Define solicitacao_Mudanca
   * @param solicitacao_Mudanca solicitacao_Mudanca
   * @generated
   */
  public Home setSolicitacao_Mudanca(Solicitacao_Mudanca solicitacao_Mudanca){
    this.solicitacao_Mudanca = solicitacao_Mudanca;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Home object = (Home)obj;
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
