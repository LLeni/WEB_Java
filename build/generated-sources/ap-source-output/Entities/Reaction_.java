package Entities;

import Entities.Profile;
import Entities.Record;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-17T06:43:14")
@StaticMetamodel(Reaction.class)
public class Reaction_ { 

    public static volatile SingularAttribute<Reaction, Profile> idProfile;
    public static volatile SingularAttribute<Reaction, Integer> idReaction;
    public static volatile SingularAttribute<Reaction, Record> idRecord;
    public static volatile SingularAttribute<Reaction, Boolean> isLikeReaction;

}