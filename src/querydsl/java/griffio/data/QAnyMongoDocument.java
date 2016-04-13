package griffio.data;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAnyMongoDocument is a Querydsl query type for AnyMongoDocument
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAnyMongoDocument extends EntityPathBase<AnyMongoDocument> {

    private static final long serialVersionUID = -774303011L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAnyMongoDocument anyMongoDocument = new QAnyMongoDocument("anyMongoDocument");

    public final NumberPath<Long> counter = createNumber("counter", Long.class);

    public final org.bson.types.QObjectId id;

    public QAnyMongoDocument(String variable) {
        this(AnyMongoDocument.class, forVariable(variable), INITS);
    }

    public QAnyMongoDocument(Path<? extends AnyMongoDocument> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QAnyMongoDocument(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QAnyMongoDocument(PathMetadata metadata, PathInits inits) {
        this(AnyMongoDocument.class, metadata, inits);
    }

    public QAnyMongoDocument(Class<? extends AnyMongoDocument> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new org.bson.types.QObjectId(forProperty("id")) : null;
    }

}

