package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela PLANTAO
 * @generated
 */
@Entity
@Table(name = "\"PLANTAO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Plantao")
public class Plantao implements Serializable {

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
  * @generated
  */
  @Column(name = "semana", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String semana;

  /**
  * @generated
  */
  @Column(name = "cor_semana", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer cor_semana;

  /**
   * Construtor
   * @generated
   */
  public Plantao(){
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
  public Plantao setId(java.lang.String id){
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
  public Plantao setDia(java.lang.String dia){
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
  public Plantao setMes(java.lang.String mes){
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
  public Plantao setAno(java.lang.String ano){
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
  public Plantao setAgenda(Agenda agenda){
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
  public Plantao setSolicitacao_Mudanca(Solicitacao_Mudanca solicitacao_Mudanca){
    this.solicitacao_Mudanca = solicitacao_Mudanca;
    return this;
  }

  /**
   * Obtém semana
   * return semana
   * @generated
   */
  
  public java.lang.String getSemana(){
    return this.semana;
  }

  /**
   * Define semana
   * @param semana semana
   * @generated
   */
  public Plantao setSemana(java.lang.String semana){
    this.semana = semana;
    return this;
  }

  /**
   * Obtém cor_semana
   * return cor_semana
   * @generated
   */
  
  public java.lang.Integer getCor_semana(){
    return this.cor_semana;
  }

  /**
   * Define cor_semana
   * @param cor_semana cor_semana
   * @generated
   */
  public Plantao setCor_semana(java.lang.Integer cor_semana){
    this.cor_semana = cor_semana;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Plantao object = (Plantao)obj;
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
