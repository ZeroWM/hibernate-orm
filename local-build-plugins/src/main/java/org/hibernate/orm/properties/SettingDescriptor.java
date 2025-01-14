/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html.
 */
package org.hibernate.orm.properties;

import java.util.Comparator;

import static java.util.Comparator.comparing;

/**
 * @author Steve Ebersole
 */
public class SettingDescriptor {
	public static final Comparator<SettingDescriptor> BY_NAME = comparing( SettingDescriptor::getName );

	private final String name;
	private final String settingsClassName;
	private final String settingFieldName;
	private final String javadoc;
	private final boolean deprecated;
	private final boolean incubating;

	public SettingDescriptor(
			String name,
			String settingsClassName,
			String settingFieldName,
			String javadoc,
			boolean deprecated,
			boolean incubating) {
		this.name = name;
		this.settingsClassName = settingsClassName;
		this.settingFieldName = settingFieldName;
		this.javadoc = javadoc;
		this.deprecated = deprecated;
		this.incubating = incubating;
	}

	/**
	 * The name of the setting
	 */
	public String getName() {
		return name;
	}

	/**
	 * The Javadoc content
	 */
	public String getJavadoc() {
		return javadoc;
	}

	public String getSettingsClassName() {
		return settingsClassName;
	}

	public String getSettingFieldName() {
		return settingFieldName;
	}

	public boolean isDeprecated() {
		return deprecated;
	}

	public boolean isIncubating() {
		return incubating;
	}
}
