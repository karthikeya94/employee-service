@Entity
@Table(name="employees")
public class OfficeEntity implements Serializable{
    @Transient
    private static final long serialVersionUID=1l;
    @Id
    @Column(name="employeenumber")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer employeeNumber;
    
}