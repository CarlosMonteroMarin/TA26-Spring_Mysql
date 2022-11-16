// Generated with g9.

package basedatos;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="suministra")
public class Suministra implements Serializable {

    /** Primary key. */
    protected static final String PK = "id";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private int id;
    private int precio;
    @ManyToOne
    @JoinColumn(name="pieza")
    private Pieza pieza;
    @ManyToOne
    @JoinColumn(name="proveedor")
    private Proveedor proveedor;

    /** Default constructor. */
    public Suministra() {
        super();
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(int aId) {
        id = aId;
    }

    /**
     * Access method for precio.
     *
     * @return the current value of precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Setter method for precio.
     *
     * @param aPrecio the new value for precio
     */
    public void setPrecio(int aPrecio) {
        precio = aPrecio;
    }

    /**
     * Access method for pieza.
     *
     * @return the current value of pieza
     */
    public Pieza getPieza() {
        return pieza;
    }

    /**
     * Setter method for pieza.
     *
     * @param aPieza the new value for pieza
     */
    public void setPieza(Pieza aPieza) {
        pieza = aPieza;
    }

    /**
     * Access method for proveedor.
     *
     * @return the current value of proveedor
     */
    public Proveedor getProveedor() {
        return proveedor;
    }

    /**
     * Setter method for proveedor.
     *
     * @param aProveedor the new value for proveedor
     */
    public void setProveedor(Proveedor aProveedor) {
        proveedor = aProveedor;
    }

    /**
     * Compares the key for this instance with another Suministra.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Suministra and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Suministra)) {
            return false;
        }
        Suministra that = (Suministra) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Suministra.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Suministra)) return false;
        return this.equalKeys(other) && ((Suministra)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getId();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Suministra |");
        sb.append(" id=").append(getId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("id", Integer.valueOf(getId()));
        return ret;
    }

}
