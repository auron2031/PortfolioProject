package com.mas.forum.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(WikiPost.class)
public abstract class WikiPost_ {

	public static volatile SingularAttribute<WikiPost, Integer> wikipostid;
	public static volatile SingularAttribute<WikiPost, String> title;
	public static volatile SingularAttribute<WikiPost, String> category;
	public static volatile SingularAttribute<WikiPost, String> content;

}

