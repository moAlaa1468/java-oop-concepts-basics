import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int id;
    private float grad;

    public Student(String name, int id, float grad) {
        this.name = name;
        this.id = id;
        this.grad = grad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getGrad() {
        return grad;
    }

    public void setGrad(float grad) {
        this.grad = grad;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", grad=" + grad +
                '}';
    }
}
