package griffio.data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AnyJPAEntity implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private Long id;

  @Column
  private Long counter;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
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

    final AnyJPAEntity that = (AnyJPAEntity) o;
    return id.equals(that.id);
  }

  @Override
  public int hashCode() {
    return id.hashCode();
  }

  @Override public String toString() {
    return String.format("AnyEntity{id=%s, counter=%s}", id, counter);
  }
}
