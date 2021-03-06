/*******************************************************************************
 * Copyright (c) 2004-2010 IBM Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.safe.internal.reporting;

import com.ibm.safe.utils.SafeLogger;

public class LogReporter extends AbstractBasicOutputReporter {

  // --- Interface methods implementation

  public void produceFinalReport() throws Exception {
    // Nothing to do since the messages have been already printed.
  }

  // --- Private code

  protected void errorWrite(final String message) {
    SafeLogger.severe(message);
  }

  protected void write(final String message) {
    SafeLogger.info(message);
  }

}
