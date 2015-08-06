package br.com.fafidev.webteca.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PessoaFisica.class)
public abstract class PessoaFisica_ extends br.com.fafidev.webteca.entidade.Pessoa_ {

	public static volatile SingularAttribute<PessoaFisica, Date> nascimento;
	public static volatile SingularAttribute<PessoaFisica, String> nome;

}

