/**
 * 
 */
package org.asd.silver.shared.alpah;

import java.security.BasicPermission;

/**
 * @author AndrewL
 */
public class ReadNewPartPermission extends BasicPermission {

  private static final long serialVersionUID = 1L;

  /**
 * 
 */
  public ReadNewPartPermission() {
    super("ReadNewPart");
  }
}
