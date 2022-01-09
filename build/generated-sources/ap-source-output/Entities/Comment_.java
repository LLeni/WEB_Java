package Entities;

import Entities.Profile;
import Entities.Record;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-17T06:43:14")
@StaticMetamodel(Comment.class)
public class Comment_ { 

    public static volatile SingularAttribute<Comment, Profile> idProfile;
    public static volatile SingularAttribute<Comment, Integer> idComment;
    public static volatile SingularAttribute<Comment, String> textComment;
    public static volatile SingularAttribute<Comment, Record> idRecord;

}