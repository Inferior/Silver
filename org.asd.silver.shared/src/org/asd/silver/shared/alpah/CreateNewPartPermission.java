/**
 * 
 */
package org.asd.silver.shared.alpah;

import java.security.BasicPermission;

/**
 * @author AndrewL
 */
public class CreateNewPartPermission extends BasicPermission {

  private static final long serialVersionUID = 1L;

  /**
 * 
 */
  public CreateNewPartPermission() {
    super("CreateNewPart");
  }
}
