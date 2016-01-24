/**
 * This class is generated by jOOQ
 */
package demo.dom.tables.daos;


import demo.dom.tables.TAuthor;
import demo.dom.tables.pojos.Author;
import demo.dom.tables.records.RAuthorRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class AuthorDao extends DAOImpl<demo.dom.tables.records.RAuthorRecord, demo.dom.tables.pojos.Author, Long> {

	/**
	 * Create a new AuthorDao without any configuration
	 */
	public AuthorDao() {
		super(demo.dom.tables.TAuthor.AUTHOR, demo.dom.tables.pojos.Author.class);
	}

	/**
	 * Create a new AuthorDao with an attached configuration
	 */
	public AuthorDao(Configuration configuration) {
		super(demo.dom.tables.TAuthor.AUTHOR, demo.dom.tables.pojos.Author.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Long getId(demo.dom.tables.pojos.Author object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public List<demo.dom.tables.pojos.Author> fetchByTId(Long... values) {
		return fetch(demo.dom.tables.TAuthor.AUTHOR.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	public demo.dom.tables.pojos.Author fetchOneByTId(Long value) {
		return fetchOne(demo.dom.tables.TAuthor.AUTHOR.ID, value);
	}

	/**
	 * Fetch records that have <code>NAME IN (values)</code>
	 */
	public List<demo.dom.tables.pojos.Author> fetchByTName(String... values) {
		return fetch(demo.dom.tables.TAuthor.AUTHOR.NAME, values);
	}
}
