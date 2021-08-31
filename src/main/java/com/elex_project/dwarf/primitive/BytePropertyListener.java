/*
 * Project Dwarf
 *
 * Copyright (c) 2021. Elex. All Rights Reserved.
 * https://www.elex-project.com/
 */

package com.elex_project.dwarf.primitive;

public interface BytePropertyListener extends PrimitivePropertyListener {
	public void onValueChanged(final byte oldValue, final byte newValue);
}
