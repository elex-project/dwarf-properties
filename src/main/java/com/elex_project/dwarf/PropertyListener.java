/*
 * Project Dwarf
 *
 * Copyright (c) 2017-2021. Elex. All Rights Reserved.
 * https://www.elex-project.com/
 */

package com.elex_project.dwarf;

import java.io.Serializable;
import java.util.EventListener;

/**
 * Property value change listener
 * @param <T> type of a value
 *
 * @author Elex
 */
public interface PropertyListener<T> extends EventListener, Serializable {

	/**
	 * Triggered when a property value has changed.
	 * @param oldValue before
	 * @param newValue after
	 */
	public void onValueChanged(final T oldValue, final T newValue);
}
