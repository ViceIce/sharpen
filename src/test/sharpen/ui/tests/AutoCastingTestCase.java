/* Copyright (C) 2004 - 2008  Versant Inc.  http://www.db4o.com

This file is part of the sharpen open source java to c# translator.

sharpen is free software; you can redistribute it and/or modify it under
the terms of version 2 of the GNU General Public License as published
by the Free Software Foundation and as clarified by db4objects' GPL 
interpretation policy, available at
http://www.db4o.com/about/company/legalpolicies/gplinterpretation/
Alternatively you can write to db4objects, Inc., 1900 S Norfolk Street,
Suite 350, San Mateo, CA 94403, USA.

sharpen is distributed in the hope that it will be useful, but WITHOUT ANY
WARRANTY; without even the implied warranty of MERCHANTABILITY or
FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
for more details.

You should have received a copy of the GNU General Public License along
with this program; if not, write to the Free Software Foundation, Inc.,
59 Temple Place - Suite 330, Boston, MA  02111-1307, USA. */

/* Copyright (C) 2004 - 2006 Versant Inc. http://www.db4o.com */

package sharpen.ui.tests;
import org.junit.Test;
import sharpen.core.Configuration;

public class AutoCastingTestCase extends AbstractConversionTestCase {

	@Override
	protected Configuration getConfiguration() {
		final Configuration config = super.getConfiguration();
		config.mapType("java.lang.Double", "double?");
		config.mapType("java.lang.Integer", "int?");
		config.mapType("java.lang.Long", "long?");
		config.mapType("java.lang.Float", "float?");
		config.mapType("java.lang.Boolean", "bool?");
		config.mapType("java.util.Date", "System.DateTime?");
		return config;
	}

	@Test
	public void testChar() throws Throwable {
		runResourceTestCase("autocasting/Char");
	}
	
	@Test
	public void testHex() throws Throwable {
		runResourceTestCase("autocasting/Hex");
	}

	@Test
	public void testDouble() throws Throwable {
		runResourceTestCase("autocasting/Double");
	}

	@Test
	public void testInteger() throws Throwable {
		runResourceTestCase("autocasting/Integer");
	}

	@Test
	public void testLong() throws Throwable {
		runResourceTestCase("autocasting/Long");
	}

	@Test
	public void testFloat() throws Throwable {
		runResourceTestCase("autocasting/Float");
	}

	@Test
	public void testBoolean() throws Throwable {
		runResourceTestCase("autocasting/Boolean");
	}
}