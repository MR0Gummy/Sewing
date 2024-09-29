package com.mrgummy.sewing.util;

import net.minecraft.state.property.IntProperty;

public class ModProperties {

	public static final IntProperty GUNPOWDER;
	public static final IntProperty SEWING_NEEDLES;

	static {
		GUNPOWDER = IntProperty.of("gunpowder", 0, 64);
		SEWING_NEEDLES = IntProperty.of("sewing_needles", 0, 2);
	}
}
