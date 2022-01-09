package Entities;

import Entities.Comment;
import Entities.Reaction;
import Entities.Record;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-17T06:43:14")
@StaticMetamodel(Profile.class)
public class Profile_ { 

    public static volatile SingularAttribute<Profile, Integer> idProfile;
    public static volatile ListAttribute<Profile, Comment> commentList;
    public static volatile SingularAttribute<Profile, String> loginProfile;
    public static volatile ListAttribute<Profile, Reaction> reactionList;
    public static volatile ListAttribute<Profile, Record> recordList;
    public static volatile SingularAttribute<Profile, String> aboutProfile;
    public static volatile SingularAttribute<Profile, String> encryptPasswordProfile;
    public static volatile SingularAttribute<Profile, Date> dateRegistrationProfile;

}