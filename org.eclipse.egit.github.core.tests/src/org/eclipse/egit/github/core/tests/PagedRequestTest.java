/******************************************************************************
 *  Copyright (c) 2011 GitHub Inc.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *
 *  SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *    Kevin Sawicki (GitHub Inc.) - initial API and implementation
 *****************************************************************************/
package org.eclipse.egit.github.core.tests;

import static org.junit.Assert.assertTrue;

import org.eclipse.egit.github.core.client.PagedRequest;
import org.junit.Test;

/**
 * Unit tests of {@link PagedRequest}
 */
public class PagedRequestTest {

	/**
	 * Test default state of paged request
	 */
	@Test
	public void defaultState() {
		PagedRequest<String> request = new PagedRequest<String>();
		assertTrue(request.getPage() > 0);
		assertTrue(request.getPageSize() > 0);
	}
}
