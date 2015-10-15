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
		"jOOQ version:3.7.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuthorDao extends DAOImpl<RAuthorRecord, Author, Long> {

	/**
	 * Create a new AuthorDao without any configuration
	 */
	public AuthorDao() {
		super(TAuthor.AUTHOR, Author.class);
	}

	/**
	 * Create a new AuthorDao with an attached configuration
	 */
	public AuthorDao(Configuration configuration) {
		super(TAuthor.AUTHOR, Author.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Long getId(Author object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public List<Author> fetchByTId(Long... values) {
		return fetch(TAuthor.AUTHOR.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	public Author fetchOneByTId(Long value) {
		return fetchOne(TAuthor.AUTHOR.ID, value);
	}

	/**
	 * Fetch records that have <code>NAME IN (values)</code>
	 */
	public List<Author> fetchByTName(String... values) {
		return fetch(TAuthor.AUTHOR.NAME, values);
	}
}