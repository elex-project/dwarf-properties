/*
 * Project Dwarf
 *
 * Copyright (c) 2021. Elex. All Rights Reserved.
 * https://www.elex-project.com/
 */

package com.elex_project.dwarf.primitive;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public final class PrimitiveByteProperty implements PrimitiveProperty {
	private final List<BytePropertyListener> listeners;
	private byte value;

	public PrimitiveByteProperty(final byte value) {
		this.value = value;
		this.listeners = new ArrayList<>();
	}

	public PrimitiveByteProperty() {
		this((byte) 0);
	}

	public void set(final byte value) {
		if (this.value != value) {
			final byte oldValue = this.value;
			this.value = value;

			for (final BytePropertyListener listener : listeners) {
				if (null != listener) listener.onValueChanged(oldValue, this.value);
			}

		}
	}

	public byte get() {
		return value;
	}

	public void addListener(final BytePropertyListener listener) {
		listeners.add(listener);
	}

	public void removeListener(final BytePropertyListener listener) {
		listeners.remove(listener);
	}

	public void removeAllListeners() {
		listeners.clear();
	}
}
