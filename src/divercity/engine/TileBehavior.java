// This file is part of DiverCity
// DiverCity is based on MicropolisJ
// Copyright (C) 2013 Jason Long
// Portions Copyright (C) 1989-2007 Electronic Arts Inc.
//
// MicropolisJ is free software; you can redistribute it and/or modify
// it under the terms of the GNU GPLv3, with additional terms.
// See the README file, included in this distribution, for details.

package divercity.engine;

import java.util.Random;
import static divercity.engine.TileConstants.*;

public abstract class TileBehavior
{
	protected final DiverCity city;
	protected final Random PRNG;
	int xpos;
	int ypos;
	int tile;
	int rawTile;

	protected TileBehavior(DiverCity city)
	{
		this.city = city;
		this.PRNG = city.PRNG;
	}

	public final void processTile(int xpos, int ypos)
	{
		this.xpos = xpos;
		this.ypos = ypos;
		this.rawTile = city.getTileRaw(xpos, ypos);
		this.tile = rawTile & LOMASK;   //What does this & Operator do? Found something about bitwise operation
		apply();						//but this is really not clear to me...
	}

	/**
	 * Activate the tile identified by xpos and ypos properties.
	 */
	public abstract void apply();
}
