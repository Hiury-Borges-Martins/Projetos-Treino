package br.com.gemeos.escolacomtdd.modal;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Endereco.class)
public abstract class Endereco_ {

	public static volatile SingularAttribute<Endereco, String> uf;
	public static volatile SingularAttribute<Endereco, String> cidade;
	public static volatile SingularAttribute<Endereco, String> numero;
	public static volatile SingularAttribute<Endereco, Long> idEndereco;
	public static volatile SingularAttribute<Endereco, String> bairro;
	public static volatile SingularAttribute<Endereco, String> rua;
	public static volatile SingularAttribute<Endereco, String> cep;

}

