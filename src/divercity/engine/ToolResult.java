// This file is part of DiverCity
// DiverCity is based on MicropolisJ
// Copyright (C) 2013 Jason Long
// Portions Copyright (C) 1989-2007 Electronic Arts Inc.
//
// MicropolisJ is free software; you can redistribute it and/or modify
// it under the terms of the GNU GPLv3, with additional terms.
// See the README file, included in this distribution, for details.

package divercity.engine;

/**
 * Lists the various results that may occur when applying a tool.
 */
public enum ToolResult
{
	SUCCESS, // 1
	NONE,    // 0
	UH_OH,   // -1; invalid position
    INSUFFICIENT_FUNDS,   // -2
    INSUFFICIENT_POPULATION,
    RESEARCH_REQUIRED,
    NO_MORE_CITYHALLS,
    NEED_A_SCHOOL;
}
