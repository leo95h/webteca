package br.com.fafidev.webteca.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PessoaJuridica.class)
public abstract class PessoaJuridica_ extends br.com.fafidev.webteca.entidade.Pessoa_ {

	public static volatile SingularAttribute<PessoaJuridica, Date> fundacao;
	public static volatile SingularAttribute<PessoaJuridica, String> nomeFantasia;
	public static volatile SingularAttribute<PessoaJuridica, String> razaoSocial;

}

