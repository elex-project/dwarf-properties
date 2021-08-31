/*
 * Project Dwarf
 *
 * Copyright (c) 2017-2021. Elex. All Rights Reserved.
 * https://www.elex-project.com/
 */

package com.elex_project.dwarf;

import java.util.Optional;

/**
 * Property has a value,
 * and notify to listeners when the value is changed.
 *
 * @param <T> type of the value
 *
 * @author Elex
 */
public interface Property<T> {
	/**
	 * set a value
	 *
	 * @param value value
	 */
	public void set(final T value);

	/**
	 * get a value
	 *
	 * @return value
	 */
	public T get();

	public Optional<T> optional();

	/**
	 * Add a listener
	 *
	 * @param listener a listener to listen value change events
	 */
	public void addListener(final PropertyListener<T> listener);

	/**
	 * Remoce a listener
	 *
	 * @param listener listener
	 */
	public void removeListener(final PropertyListener<T> listener);

	/**
	 * Remoce all listeners
	 */
	public void removeAllListeners();
}
