/*
 * Copyright (c) 2003 Rick Mugridge, University of Auckland, New Zealand.
 * Released under the terms of the GNU General Public License version 2 or later.
*/
package fitLibrary.exception;

import fit.exception.FitFailureException;

public class MissingCellsFailureException extends FitFailureException
{
  public MissingCellsFailureException()
  {
    super("Missing table cells");
  }
}