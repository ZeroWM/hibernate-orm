/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.dialect;

/**
 * An SQL dialect for Postgres 10 and later.
 *
 *  @deprecated use {@code PostgreSQLDialect(1000)}
 */
@Deprecated
public class PostgreSQL10Dialect extends PostgreSQLDialect {

	public PostgreSQL10Dialect() {
		super( DatabaseVersion.make( 10 ) );
	}

}

