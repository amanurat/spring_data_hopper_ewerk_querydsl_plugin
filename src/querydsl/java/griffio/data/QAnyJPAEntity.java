package griffio.data;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAnyJPAEntity is a Querydsl query type for AnyJPAEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAnyJPAEntity extends EntityPathBase<AnyJPAEntity> {

    private static final long serialVersionUID = -1182838964L;

    public static final QAnyJPAEntity anyJPAEntity = new QAnyJPAEntity("anyJPAEntity");

    public final NumberPath<Long> counter = createNumber("counter", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QAnyJPAEntity(String variable) {
        super(AnyJPAEntity.class, forVariable(variable));
    }

    public QAnyJPAEntity(Path<? extends AnyJPAEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAnyJPAEntity(PathMetadata metadata) {
        super(AnyJPAEntity.class, metadata);
    }

}

