package griffio.data;

import java.io.Serializable;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class AnyMongoDocument implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private ObjectId id;

  private Long counter;

  public ObjectId getId() {
    return id;
  }

  public void setId(ObjectId id) {
    this.id = id;
  }

  public Long getCounter() {
    return counter;
  }

  public void setCounter(Long counter) {
    this.counter = counter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    final AnyMongoDocument that = (AnyMongoDocument) o;
    return id.equals(that.id);
  }

  @Override
  public int hashCode() {
    return id.hashCode();
  }

  @Override public String toString() {
    return String.format("AnyMongoDocument{id=%s, counter=%s}", id, counter);
  }
}
