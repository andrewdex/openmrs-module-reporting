/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.reporting.query.person.definition;

import org.openmrs.Person;
import org.openmrs.module.reporting.query.BaseSqlQuery;

/**
 * SQL-based Person Query
 */
public class SqlPersonQuery extends BaseSqlQuery<Person> implements PersonQuery {

    public static final long serialVersionUID = 1L;
	
	//***** CONSTRUCTORS *****

	/**
	 * Default Constructor
	 */
	public SqlPersonQuery() {
		super();
	}
	
	/**
	 * 
	 * @param query the query to execute
	 */
	public SqlPersonQuery(String query) { 
		super(query);
	}
}
