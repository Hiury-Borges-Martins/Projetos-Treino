package br.com.gemeos.escolacomtdd.modal;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Aluno.class)
public abstract class Aluno_ {

	public static volatile SingularAttribute<Aluno, String> telefone;
	public static volatile SingularAttribute<Aluno, Endereco> endereco;
	public static volatile SingularAttribute<Aluno, Long> matricula;
	public static volatile SingularAttribute<Aluno, String> cpf;
	public static volatile SingularAttribute<Aluno, String> nome;
	public static volatile SingularAttribute<Aluno, Date> dataDeNascimento;
	public static volatile SingularAttribute<Aluno, String> email;

}

