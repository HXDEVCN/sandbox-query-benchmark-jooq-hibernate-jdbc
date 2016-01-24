/**
 * This class is generated by jOOQ
 */
package demo.dom.tables;


import demo.dom.Keys;
import demo.dom.TPublic;
import demo.dom.tables.records.RBookRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBook extends TableImpl<demo.dom.tables.records.RBookRecord> {

	private static final long serialVersionUID = 740000032;

	/**
	 * The reference instance of <code>PUBLIC.BOOK</code>
	 */
	public static final TBook BOOK = new TBook();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<demo.dom.tables.records.RBookRecord> getRecordType() {
		return demo.dom.tables.records.RBookRecord.class;
	}

	/**
	 * The column <code>PUBLIC.BOOK.ID</code>.
	 */
	public final TableField<demo.dom.tables.records.RBookRecord, Long> ID = createField("ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>PUBLIC.BOOK.TITLE</code>.
	 */
	public final TableField<demo.dom.tables.records.RBookRecord, String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

	/**
	 * The column <code>PUBLIC.BOOK.AUTHOR_ID</code>.
	 */
	public final TableField<demo.dom.tables.records.RBookRecord, Long> AUTHOR_ID = createField("AUTHOR_ID", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>PUBLIC.BOOK</code> table reference
	 */
	public TBook() {
		this("BOOK", null);
	}

	/**
	 * Create an aliased <code>PUBLIC.BOOK</code> table reference
	 */
	public TBook(String alias) {
		this(alias, BOOK);
	}

	private TBook(String alias, Table<demo.dom.tables.records.RBookRecord> aliased) {
		this(alias, aliased, null);
	}

	private TBook(String alias, Table<demo.dom.tables.records.RBookRecord> aliased, Field<?>[] parameters) {
		super(alias, demo.dom.TPublic.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<demo.dom.tables.records.RBookRecord, Long> getIdentity() {
		return demo.dom.Keys.IDENTITY_BOOK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<demo.dom.tables.records.RBookRecord> getPrimaryKey() {
		return demo.dom.Keys.PK_BOOK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<demo.dom.tables.records.RBookRecord>> getKeys() {
		return Arrays.<UniqueKey<demo.dom.tables.records.RBookRecord>>asList(demo.dom.Keys.PK_BOOK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBook as(String alias) {
		return new TBook(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TBook rename(String name) {
		return new TBook(name, null);
	}
}
