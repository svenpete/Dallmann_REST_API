/** PrimaryKey
 * <p>
 *     Version 1
 * </p>
 * Änderungsdatum 11.05.2020
 */

package REST_API.JDBC;

public class PrimaryKey extends Attribut {
    public PrimaryKey(String name, Type type) {
        super(name, type);
    }

    public String createPrimaryKey(String sqlStatementPrimaryKey) {
        return sqlStatementPrimaryKey.isEmpty() ? name : sqlStatementPrimaryKey + ", name";
    }



}
