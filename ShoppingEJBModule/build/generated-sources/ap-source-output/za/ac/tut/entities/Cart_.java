package za.ac.tut.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.ac.tut.entities.Item;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-05-01T03:40:38")
@StaticMetamodel(Cart.class)
public class Cart_ { 

    public static volatile ListAttribute<Cart, Item> item;
    public static volatile SingularAttribute<Cart, Double> total;
    public static volatile SingularAttribute<Cart, Long> id;
    public static volatile SingularAttribute<Cart, Date> creationDate;

}