package Entities;

import Entities.Comment;
import Entities.Profile;
import Entities.Reaction;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-17T06:43:14")
@StaticMetamodel(Record.class)
public class Record_ { 

    public static volatile SingularAttribute<Record, Profile> idProfile;
    public static volatile ListAttribute<Record, Comment> commentList;
    public static volatile ListAttribute<Record, Reaction> reactionList;
    public static volatile SingularAttribute<Record, String> linkDemoRecord;
    public static volatile SingularAttribute<Record, String> additionalInformationRecord;
    public static volatile SingularAttribute<Record, Date> dateRecord;
    public static volatile SingularAttribute<Record, Integer> idRecord;
    public static volatile SingularAttribute<Record, Integer> countViewsRecord;
    public static volatile SingularAttribute<Record, Date> timeRunRecord;

}