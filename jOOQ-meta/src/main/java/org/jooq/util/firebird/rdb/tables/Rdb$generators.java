/**
 * This class is generated by jOOQ
 */
package org.jooq.util.firebird.rdb.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.5.0"},
                            comments = "This class is generated by jOOQ")
public class Rdb$generators extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 152901621;

	/**
	 * The singleton instance of RDB$GENERATORS
	 */
	public static final org.jooq.util.firebird.rdb.tables.Rdb$generators RDB$GENERATORS = new org.jooq.util.firebird.rdb.tables.Rdb$generators();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The table column <code>RDB$GENERATORS.RDB$GENERATOR_NAME</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$GENERATOR_NAME = createField("RDB$GENERATOR_NAME", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The table column <code>RDB$GENERATORS.RDB$GENERATOR_ID</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$GENERATOR_ID = createField("RDB$GENERATOR_ID", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>RDB$GENERATORS.RDB$SYSTEM_FLAG</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$SYSTEM_FLAG = createField("RDB$SYSTEM_FLAG", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>RDB$GENERATORS.RDB$DESCRIPTION</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$DESCRIPTION = createField("RDB$DESCRIPTION", org.jooq.impl.SQLDataType.CLOB, this);

	public Rdb$generators() {
		super("RDB$GENERATORS");
	}

	public Rdb$generators(java.lang.String alias) {
		super(alias, null, org.jooq.util.firebird.rdb.tables.Rdb$generators.RDB$GENERATORS);
	}

	@Override
	public org.jooq.util.firebird.rdb.tables.Rdb$generators as(java.lang.String alias) {
		return new org.jooq.util.firebird.rdb.tables.Rdb$generators(alias);
	}
}
