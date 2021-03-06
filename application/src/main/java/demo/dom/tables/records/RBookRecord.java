/**
 * This class is generated by jOOQ
 */
package demo.dom.tables.records;


import demo.dom.tables.TBook;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RBookRecord extends UpdatableRecordImpl<RBookRecord> implements Record3<Long, String, Long> {

	private static final long serialVersionUID = 1605783074;

	/**
	 * Setter for <code>PUBLIC.BOOK.ID</code>.
	 */
	public void setId(Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>PUBLIC.BOOK.ID</code>.
	 */
	public Long getId() {
		return (Long) getValue(0);
	}

	/**
	 * Setter for <code>PUBLIC.BOOK.TITLE</code>.
	 */
	public void setTitle(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>PUBLIC.BOOK.TITLE</code>.
	 */
	public String getTitle() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>PUBLIC.BOOK.AUTHOR_ID</code>.
	 */
	public void setAuthorId(Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>PUBLIC.BOOK.AUTHOR_ID</code>.
	 */
	public Long getAuthorId() {
		return (Long) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Long> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Long, String, Long> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Long, String, Long> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return TBook.BOOK.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return TBook.BOOK.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field3() {
		return TBook.BOOK.AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value3() {
		return getAuthorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RBookRecord value1(Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RBookRecord value2(String value) {
		setTitle(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RBookRecord value3(Long value) {
		setAuthorId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RBookRecord values(Long value1, String value2, Long value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached RBookRecord
	 */
	public RBookRecord() {
		super(TBook.BOOK);
	}

	/**
	 * Create a detached, initialised RBookRecord
	 */
	public RBookRecord(Long id, String title, Long authorId) {
		super(TBook.BOOK);

		setValue(0, id);
		setValue(1, title);
		setValue(2, authorId);
	}
}
