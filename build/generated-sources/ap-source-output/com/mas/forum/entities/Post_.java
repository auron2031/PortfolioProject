package com.mas.forum.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Post.class)
public abstract class Post_ {

	public static volatile SingularAttribute<Post, User> postuser;
	public static volatile SingularAttribute<Post, Integer> postid;
	public static volatile SingularAttribute<Post, String> title;
	public static volatile SingularAttribute<Post, String> message;
	public static volatile SingularAttribute<Post, Short> parentpost;
	public static volatile SingularAttribute<Post, Date> createdtime;

}

