/*
 * Project Dwarf
 *
 * Copyright (c) 2021. Elex. All Rights Reserved.
 * https://www.elex-project.com/
 */

package com.elex_project.dwarf.primitive;

public interface IntegerPropertyListener extends PrimitivePropertyListener {
	public void onValueChanged(final int oldValue, final int newValue);
}
